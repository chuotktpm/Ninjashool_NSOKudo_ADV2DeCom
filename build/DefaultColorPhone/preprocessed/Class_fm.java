
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_fm implements Runnable {
    public static long a;
    public static boolean b;
 
    public Class_fm() {
    }
 
    public final void run() {
       while(true) {
          if (b) {
             if (System.currentTimeMillis() - a >= Class_fk.b && !Class_af.b().equals("")) {
                Service.getInstance().l(" " + Class_af.b() + " , " + TileMap.mapNames[TileMap.mapID] + " , khu: " + TileMap.zoneID + ", ch\u00e1t hd \u0111\u1ec3 xem h\u01b0\u1edbng d\u1eabn ! ");
                a = System.currentTimeMillis();
                continue;
             }
 
             if (!Class_af.b().equals("")) {
                continue;
             }
 
             GameScr.chatPopup("Ch\u01b0a c\u00e0i \u0111\u1eb7t mua b\u00e1n");
             b = false;
          }
 
          return;
       }
    }
 }
 