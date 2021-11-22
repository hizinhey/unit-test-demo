/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.server;

/**
 *
 * @author nghia
 */
public class Server {

    public static void main(String[] args) {
        // Http
//                try {
//            Server servers = new Server(http_port);
//         
//            ServletContextHandler handler = new ServletContextHandler();
//            
//            PermissionHandler permissionHandler = new PermissionHandler();
//            permissionHandler.setHandler(handler);
//
//            handler.addServlet(UserHandler.class, API_VERSION_PATH + "/users");
//
//            //page
//            handler.addServlet(HomeHandler.class, "/");
//            handler.addServlet(ErrorHandler.class, "/error");
//            handler.addServlet(LoginHandler.class, "/login");
//            handler.addServlet(RegisterHandler.class, "/signup");
//            handler.addServlet(LogoutHandler.class, "/logout");
//
//            //static
//            ContextHandler ctxHandler = new ContextHandler("/stc");
//            ctxHandler.setResourceBase("./stc");
//            ctxHandler.setHandler(new ResourceHandler());
//
//            HandlerList handlers = new HandlerList();
//            handlers.setHandlers(new Handler[]{ctxHandler, permissionHandler});
////            servers.setup(handlers);
////            ResourceHandler resource_handler = new ResourceHandler();
////            resource_handler.setDirectoriesListed(false);
////            resource_handler.setResourceBase("./public");
////            resource_handler.setWelcomeFiles(new String[]{"index.html"});
////            HandlerList handlers = new HandlerList();
////            handlers.setHandlers(new Handler[]{resource_handler, handler});
////
//            servers.setHandler(handlers);
//            servers.start();
//
//            System.out.println("Starting the http server..." + http_port);
//        } catch (Exception ex) {
////            LOGGER.error(ex.getMessage(), ex);
//        }
//        
        
        // Thrift
    }
}
