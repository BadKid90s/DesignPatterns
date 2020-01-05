package com.wry.practise.springmvc;

import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet {
    private List<HandlerAdapter> handlerAdapters;

    public DispatcherServlet() {
        this.handlerAdapters = new ArrayList<>();
        this.handlerAdapters.add(new HttpRequestHandlerAdapter());
        this.handlerAdapters.add(new SimpleServletHandlerAdapter());
        this.handlerAdapters.add(new HandleFanctionrAdapter());
    }

    public void doDispatch(Controller controller) {
        HandlerAdapter handlerAdapter = this.getHandlerAdapter(controller);
        handlerAdapter.handle(controller);

    }

    private HandlerAdapter getHandlerAdapter(Controller handler) {
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supports(handler)) {
                return handlerAdapter;
            }
        }
        return null;
    }
}
