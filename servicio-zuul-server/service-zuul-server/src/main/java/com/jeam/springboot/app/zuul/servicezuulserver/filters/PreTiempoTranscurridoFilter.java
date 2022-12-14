package com.jeam.springboot.app.zuul.servicezuulserver.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Component
public class PreTiempoTranscurridoFilter extends ZuulFilter {

    private static final Logger Log = (Logger) LoggerFactory.getLogger(PreTiempoTranscurridoFilter.class);


    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        Log.info(String.format("%s request enrutado app %s",request.getMethod(),request.getRequestURL().toString()));
        Long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return null;
    }
}
