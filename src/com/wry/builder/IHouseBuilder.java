package com.wry.builder;
import	java.security.KeyStore.Builder;

public interface IHouseBuilder {
   void buildBasic();
   void buildWalls();
   void buildRoofed();

   House getHours();

}
