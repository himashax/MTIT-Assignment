package newsentertainment_servicepublisher;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import mail_service.IMailService;
import movie_service.IMovieService;
import movie_service.MovieServiceImpl;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;


	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Start");
		
		IMovieService movieService = new MovieServiceImpl();
		publishServiceRegistration = bundleContext.registerService(
				IMovieService.class.getName(), 
				movieService, 
				null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
