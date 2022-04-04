package taxi.service;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.exception.AuthenticationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && validationPassword(driver.get().getPassword(), password)) {
            logger.info("Driver authorized successfully, driver_id = {}", driver.get().getId());
            return driver.get();
        }
        logger.error("Driver failed to authorize with login = {}", login);
        throw new AuthenticationException("Login or password are incorrect");
    }

    public boolean validationPassword(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}
