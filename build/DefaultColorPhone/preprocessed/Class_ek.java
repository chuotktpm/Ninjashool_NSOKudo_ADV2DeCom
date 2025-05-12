
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_ek implements Runnable {
    private GameScr a;
 
    Class_ek(GameScr var1) {
       this.a = var1;
    }
 
    public final void run() {
       ChatPopup.a("Diệt ma", Char.getMyChar());
 
       for(int var1 = 0; var1 < 6; ++var1) {
          try {
             Thread.sleep(1000L);
          } catch (InterruptedException var5) {
             var5.printStackTrace();
          }
 
          int var2;
          if (this.a.fi[var1 * 10 + 120] >>> 24 != 0) {
             var2 = 2;
          } else {
             var2 = 0;
             int var3 = 0;
 
             int var4;
             for(var4 = 0; var4 < 10; ++var4) {
                if (this.a.fi[var1 * 10 + var4] >>> 24 != 0) {
                   ++var3;
                }
             }
 
             for(var4 = 0; var4 < 10; ++var4) {
                if (this.a.fi[var1 * 10 + var4 * 60] >>> 24 != 0) {
                   ++var2;
                }
             }
 
             if (var3 < var2) {
                var2 = 1;
             } else {
                var2 = 0;
             }
          }
 
          ChatPopup.a("Diệt ma: " + this.a.fh[var2], Char.getMyChar());
          GameScr.a(this.a, (byte)var2);
       }
 
    }
 }
 