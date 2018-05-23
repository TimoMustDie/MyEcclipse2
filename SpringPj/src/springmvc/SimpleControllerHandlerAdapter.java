package springmvc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class SimpleControllerHandlerAdapter implements HandlerAdapter{
	@Override
	public boolean supports(Object handler) {
		// TODO Auto-generated method stub
		return (handler instanceof Controller);
	}
	@Override
	public ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		return ((Controller)handler).handleRequest(request, response);
	}
	@Override
	public long getLastModified(HttpServletRequest request, Object handler) {
		// TODO Auto-generated method stub
		return 0;
	}
}
