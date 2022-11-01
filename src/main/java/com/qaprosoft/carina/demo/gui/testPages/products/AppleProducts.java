package com.qaprosoft.carina.demo.gui.testPages.products;

public enum AppleProducts {
    APPLE_WATCH("AppleWatch"),
    IPHONE("Iphone"),
    IPAD("Ipad"),
    MACBOOK("MacBook");

    private String name;
    AppleProducts(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
