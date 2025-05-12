
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_fe implements Runnable {
    private final int a;
 
    Class_fe(int var1) {
       this.a = var1;
    }
 
    public final void run() {
       try {
          TileMap.k(this.a);
       } catch (Exception var2) {
          var2.printStackTrace();
       }
 
       System.gc();
       if (Session_ME.getInstance().connected) {
          GameScr.getInstance().update();
       }
 
       GameCanvas.setMaxTextLenght();
       GameCanvas.e = false;
    }
 }
 