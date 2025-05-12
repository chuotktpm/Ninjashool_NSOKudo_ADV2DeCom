
// Source code is decompiled from a .class file using FernFlower decompiler.
public class MainObject {
    public MyVector a = new MyVector();
 
    public MainObject() {
    }
 
    public final void a(mGraphics var1, int var2, int var3, int var4) {
       for(var4 = 0; var4 < this.a.size(); ++var4) {
          Class_bk var5;
          if ((var5 = (Class_bk)this.a.elementAt(var4)) != null) {
             var5.a(var1, var2, var3);
          }
       }
 
    }
 
    public final void b(mGraphics var1, int var2, int var3, int var4) {
       for(var4 = 0; var4 < this.a.size(); ++var4) {
          Class_bk var5;
          if ((var5 = (Class_bk)this.a.elementAt(var4)) != null) {
             var5.b(var1, var2, var3);
          }
       }
 
    }
 
    public final void a(byte var1, int var2) {
       for(int var3 = 0; var3 < this.a.size(); ++var3) {
          Class_bk var4;
          if ((var4 = (Class_bk)this.a.elementAt(var3)) != null) {
             var4.a();
             if (var4.i) {
                this.a.removeElement(var4);
             }
          }
       }
 
       if (var1 == 0 && var2 == 14) {
          this.a.removeAllElements();
       }
 
       if (var1 == 1 && var2 == 0) {
          this.a.removeAllElements();
       }
 
    }
 }
 