package itis.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



/**
 * 02.06.2017
 *
 * @author Shaikhutdinov Artur (First Software Engineering Platform)
 * @version v1.0
 */

    public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[]{AppConfig.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{AppConfig.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};
        }


    }


