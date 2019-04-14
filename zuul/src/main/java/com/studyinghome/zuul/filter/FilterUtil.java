package com.studyinghome.zuul.filter;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;


/**
 * ${DESCRIPTION}
 *
 * @author Leslie
 * @email panxiang_work@163.com
 * @create 2019-04-14 15:58
 */
@Component
public class FilterUtil extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(FilterUtil.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            log.info("输出拦截日志");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(403);
            try {
                HttpServletResponse response = ctx.getResponse();
                response.setCharacterEncoding("GB2312");
                ctx.getResponse().getWriter().write("token不能为空");
            } catch (Exception e) {
            }
            return null;
        }
        log.info("没有拦截");
        return null;
    }
}
