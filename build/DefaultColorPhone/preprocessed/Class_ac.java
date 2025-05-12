
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_ac implements Runnable {
    private final int a;
    private final int b;
    private final int c;
 
    Class_ac(Code var1, int var2, int var3, int var4) {
       this.a = var2;
       this.b = var3;
       this.c = var4;
    }
 
    public final void run() {
       GameScr.h(41);
       Service.getInstance().openMenu(41);
 
       for(int var1 = 0; var1 < this.a; ++var1) {
          Service.getInstance().menu(41, this.b, this.c);
 
          try {
             Thread.sleep(20L);
          } catch (InterruptedException var2) {
          }
       }
 
    }
 }
 