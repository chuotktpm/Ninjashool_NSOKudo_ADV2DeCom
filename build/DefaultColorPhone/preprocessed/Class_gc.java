
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_gc extends mScreen {
    public static int a;
 
    public Class_gc() {
    }
 
    public final void c() {
       if (a++ > 5) {
          if (RMS.d("indLanguage") >= 0) {
             GameCanvas.d();
             GameCanvas.af.update();
             return;
          }
 
          GameCanvas.d();
          GameCanvas.ah.update();
       }
 
    }
 }
 