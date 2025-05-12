
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_bu {
    public MyVector a = new MyVector();
    private static Class_bu h;
    public int b = 0;
    public static boolean c;
    public static boolean d;
    public static boolean e;
    public static boolean f;
    public MyVector g = new MyVector();
 
    public final void a() {
       ++this.b;
       if (this.b > this.a.size() - 1) {
          this.b = 0;
       }
 
    }
 
    public final void b() {
       --this.b;
       if (this.b < 0) {
          this.b = this.a.size() - 1;
       }
 
    }
 
    public final void a(int var1) {
       this.b = var1;
    }
 
    public final void a(Class_bt var1) {
       this.b = this.a.indexOf(var1);
    }
 
    public final void c() {
       this.b = this.a.size() - 1;
    }
 
    public static Class_bu d() {
       return h == null ? (h = new Class_bu()) : h;
    }
 
    public Class_bu() {
       this.a.addElement(new Class_bt(mResources.on[0], 0));
       this.a.addElement(new Class_bt(mResources.oo[0], 1));
       this.a.addElement(new Class_bt(mResources.op[0], 3));
       this.a.addElement(new Class_bt(mResources.oq[0], 4));
       Class_bt var1;
       (var1 = this.a(mResources.op[0])).a("c8" + mResources.op[1]);
       var1.a("c8" + mResources.op[2]);
       var1.a("c8" + mResources.op[3]);
       this.a(mResources.oo[0]).a("c8" + mResources.oo[1]);
       this.a(mResources.oq[0]).a("c8" + mResources.oq[1]);
       this.a(mResources.on[0]).a("c8" + mResources.on[1]);
    }
 
    public final Class_bt a(String var1) {
       for(int var2 = 0; var2 < this.a.size(); ++var2) {
          Class_bt var3;
          if ((var3 = (Class_bt)this.a.elementAt(var2)).b.equals(var1)) {
             return var3;
          }
       }
 
       return null;
    }
 
    public final void a(String var1, String var2, String var3) {
       Class_bt var4;
       if ((var4 = this.a(var1)) == null) {
          var4 = this.b(var1);
       }
 
       var4.a(var2, var3);
    }
 
    public final Class_bt e() {
       return (Class_bt)this.a.elementAt(this.b);
    }
 
    public final Class_bt b(String var1) {
       Class_bt var2 = new Class_bt(var1, 2);
       if (!GameCanvas.isTouch) {
          var2.a("c2" + mResources.om);
       }
 
       this.a.addElement(var2);
       return var2;
    }
 
    public final void c(String var1) {
       for(int var2 = 0; var2 < this.g.size(); ++var2) {
          if (((String)this.g.elementAt(var2)).equals(var1)) {
             return;
          }
       }
 
       this.g.addElement(var1);
    }
 
    public final boolean d(String var1) {
       for(int var2 = 0; var2 < this.g.size(); ++var2) {
          if (((String)this.g.elementAt(var2)).equals(var1)) {
             return true;
          }
       }
 
       return false;
    }
 
    public final void e(String var1) {
       for(int var2 = 0; var2 < this.g.size(); ++var2) {
          if (((String)this.g.elementAt(var2)).equals(var1)) {
             this.g.removeElementAt(var2);
             return;
          }
       }
 
    }
 
    public static void f() {
       h = null;
    }
 }
 