
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_bq {
    public int a = 0;
    public int b;
    public int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Char j;
    private Arrowpaint k = null;
    private static byte[] l = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
    private static int[] m = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
    private static int[] n = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
 
    public Class_bq(Char var1, Arrowpaint var2) {
       this.j = var1;
       this.k = var2;
    }
 
    public final void a() {
       if (this.j.mobFocus != null || this.j.charFocus != null) {
          if (this.j.mobFocus != null) {
             this.d = this.j.mobFocus.e;
             this.e = this.j.mobFocus.f - this.j.mobFocus.l / 4;
          } else if (this.j.charFocus != null) {
             this.d = this.j.charFocus.cx;
             this.e = this.j.charFocus.cy - this.j.charFocus.bj / 4;
          }
 
          int var1 = this.d - this.b;
          int var2 = this.e - this.c;
          int var3 = 4;
          if (var1 + var2 < 60) {
             var3 = 3;
          } else if (var1 + var2 < 30) {
             var3 = 2;
          }
 
          if (this.b != this.d) {
             if (var1 > 0 && var1 < 5) {
                this.b = this.d;
             } else if (var1 < 0 && var1 > -5) {
                this.b = this.d;
             } else {
                this.f = this.d - this.b << 2;
                this.h += this.f;
                this.b += this.h >> var3;
                this.h &= 15;
             }
          }
 
          if (this.c != this.e) {
             if (var2 > 0 && var2 < 5) {
                this.c = this.e;
             } else if (var2 < 0 && var2 > -5) {
                this.c = this.e;
             } else {
                this.g = this.e - this.c << 2;
                this.i += this.g;
                this.c += this.i >> var3;
                this.i &= 15;
             }
          }
 
          var1 = 0;
          var2 = 0;
          var3 = 0;
          int var4 = 0;
          if (this.j.mobFocus != null) {
             var1 = this.d - this.j.mobFocus.k / 4;
             var3 = this.d + this.j.mobFocus.k / 4;
             var2 = this.e - this.j.mobFocus.l / 4;
             var4 = this.e + this.j.mobFocus.l / 4;
          } else if (this.j.charFocus != null) {
             var1 = this.d - this.j.charFocus.bi / 4;
             var3 = this.d + this.j.charFocus.bi / 4;
             var2 = this.e - this.j.charFocus.bj / 4;
             var4 = this.e + this.j.charFocus.bj / 4;
          }
 
          if (this.a > 0) {
             --this.a;
          }
 
          if (this.a != 0 && (this.b < var1 || this.b > var3 || this.c < var2 || this.c > var4)) {
             return;
          }
       }
 
       this.j.gb = null;
       this.b = this.c = this.d = this.e = this.f = this.g = this.h = this.i = 0;
       this.j.r();
       if (this.j.bl) {
          this.j.m();
       }
 
    }
 
    public final void a(mGraphics var1) {
       int var2 = this.d - this.b;
       int var3 = this.e - this.c;
       var2 = Class_fa.a(var2, -var3);
       var3 = 0;
 
       while(true) {
          if (var3 >= m.length - 1) {
             var2 = 0;
             break;
          }
 
          if (var2 >= m[var3] && var2 <= m[var3 + 1]) {
             var2 = var3 >= 16 ? 0 : var3;
             break;
          }
 
          ++var3;
       }
 
       var2 = var2;
 
       try {
          SmallImage.paintImage(var1, this.k.a[l[var2]], this.b, this.c, n[var2], 3);
       } catch (Exception var4) {
       }
    }
 }
 