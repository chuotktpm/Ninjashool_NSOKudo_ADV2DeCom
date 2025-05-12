
// Source code is decompiled from a .class file using FernFlower decompiler.
final class Class_fu implements Runnable {
    private Class_fx a;
 
    Class_fu(Class_fx var1) {
       this.a = var1;
    }
 
    public final void run() {
       try {
          Thread.sleep(20000L);
       } catch (InterruptedException var3) {
       }
 
       try {
          if (this.a.a.g) {
             Session_ME.a(this.a.a).interrupt();
             return;
          }
       } catch (Exception var2) {
       }
 
    }
 }
 