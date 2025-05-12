
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_fy implements Runnable {
    public static long a = 10L;
    public final int b;
    public static int c;
    public static int d;
 
    Class_fy(int var1) {
       this.b = var1;
    }
 
    public final void run() {
       if (TileMap.mapID != 72) {
          GameScr.chatPopup(String.valueOf(d));
       } else {
          int var1 = 0;
          GameScr.PickNpc(30, 0, 0);
 
          do {
             ++var1;
             Service.getInstance().ah();
             GameCanvas.pleaseWait();
 
             try {
                Thread.sleep(a);
             } catch (InterruptedException var3) {
                var3.printStackTrace();
             }
          } while(var1 <= this.b);
 
       }
    }
 }
 