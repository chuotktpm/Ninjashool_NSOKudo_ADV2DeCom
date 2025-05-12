
// Source code is decompiled from a .class file using FernFlower decompiler.
public final class Class_ed extends mScreen implements IActionListener {
    private static Class_ed l;
    private int m = 48;
    private int n = 85;
    private int o;
    private int p;
    private int q;
    public int a;
    public int[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[] f;
    public String[] g;
    public String[] h;
    public byte[] i;
    private Command r;
    private int s;
    public boolean j = true;
    public static String k = "";
 
    public static Class_ed a() {
       if (l == null) {
          l = new Class_ed();
       }
 
       return l;
    }
 
    public Class_ed() {
       if (GameCanvas.width < 160) {
          this.m = 32;
       }
 
       this.o = 7;
       this.p = (GameCanvas.width - 3 * this.m >> 1) - 5;
       this.q = GameCanvas.ac - (this.n >> 1) + 10;
       if (GameCanvas.isTouch && GameCanvas.width > 200) {
          this.m = 74;
          this.o = 25;
          this.n = 110;
          this.p = (GameCanvas.width - 3 * this.m >> 1) - 20;
          this.q = GameCanvas.ac - (this.n >> 1);
          if (GameCanvas.width < 320) {
             this.o = 6;
             this.p = (GameCanvas.width - 3 * this.m >> 1) - 6;
          }
       }
 
       super.left = null;
       this.r = new Command(mResources.chon, this, 1000, (Object)null);
       super.center = new Command("", this, 1000, (Object)null);
       super.right = new Command(mResources.exit, this, 1001, (Object)null);
       super.left = this.r;
       if (GameCanvas.isTouch) {
          super.center = null;
          super.left = null;
       }
 
       if (GameCanvas.isTouch && GameCanvas.width >= 320) {
          super.right.x = GameCanvas.width / 2 + 88;
          super.right.y = GameCanvas.height - 26;
       }
 
    }
 
    private void e() {
       if (this.g[this.a] != null) {
          k = this.g[this.a];
          Service.getInstance().b(this.g[this.a]);
          GameCanvas.showDialogWait(mResources.textLoading);
          GameCanvas.e = true;
       } else {
          Class_ee.a().update();
       }
    }
 
    public final void b() {
       super.b();
       if (GameCanvas.keyPressedz[6]) {
          ++this.a;
          if (this.a >= 3) {
             this.a = 0;
          }
       }
 
       if (GameCanvas.keyPressedz[4]) {
          --this.a;
          if (this.a < 0) {
             this.a = 2;
          }
       }
 
       if (GameCanvas.m && GameCanvas.b(this.p, this.q, 3 * (this.m + this.o), this.n)) {
          int var1;
          if ((var1 = (GameCanvas.p - this.p) / (this.m + this.o)) > 2) {
             var1 = 2;
          }
 
          if (var1 < 0) {
             var1 = 0;
          }
 
          this.a = var1;
       }
 
       if (GameCanvas.isPointerJustRelease) {
          if (GameCanvas.b(this.p, this.q, 3 * (this.m + this.o), this.n)) {
             this.s = 5;
          } else {
             this.a = -1;
          }
       }
 
       GameCanvas.l();
       GameCanvas.k();
    }
 
    public final void c() {
       if (++GameScr.i > GameCanvas.width * 3 + 100) {
          GameScr.i = 100;
       }
 
       if (this.s > 0) {
          --this.s;
          if (this.s == 0 && this.a >= 0) {
             this.e();
          }
       }
 
    }
 
    public final void update() {
       TileMap.c();
       System.gc();
       super.update();
 
       for(int var1 = 0; var1 < this.g.length; ++var1) {
          if (this.g[var1] != null) {
             this.j = false;
             break;
          }
       }
 
       if (this.j) {
          Class_ee.a().update();
       }
 
    }
 
    public final void paint(mGraphics var1) {
       GameCanvas.paint(var1);
 
       int var2;
       for(var2 = 0; var2 < 3; ++var2) {
          if (this.a == var2) {
             Paint.d(this.p + var2 * (this.m + this.o), this.q, this.m, this.n, var1);
          } else {
             Paint.c(this.p + var2 * (this.m + this.o), this.q, this.m, this.n, var1);
          }
 
          Paint.b(this.p + var2 * (this.m + this.o), this.q, this.m, this.n, var1);
       }
 
       for(var2 = 0; var2 < 3; ++var2) {
          if (this.g[var2] != null) {
             Part var3 = GameScr.parts[this.b[var2]];
             Part var4 = GameScr.parts[this.c[var2]];
             Part var5 = GameScr.parts[this.d[var2]];
             Part var6 = GameScr.parts[this.e[var2]];
             int var7;
             if (var3.a != null && var3.a.length >= 8) {
                for(var7 = 0; var7 < var3.a.length; ++var7) {
                   if (var3.a[var7] == null || !SmallImage.a(var3.a[var7].a)) {
                      Char.getMyChar();
                      var3 = Char.b(this.i[var2]);
                      break;
                   }
                }
             } else {
                Char.getMyChar();
                var3 = Char.b(this.i[var2]);
             }
 
             var7 = this.p + var2 * (this.m + this.o) + this.m / 2;
             int var8;
             if (!GameCanvas.isTouch) {
                var8 = this.q + this.n / 2 + 16;
                SmallImage.paintImage(var1, var6.a[Char.fe[0][3][0]].a, var7 + Char.fe[0][3][1] + var6.a[Char.fe[0][3][0]].b, var8 - Char.fe[0][3][2] + var6.a[Char.fe[0][3][0]].c, 0, 0);
                SmallImage.paintImage(var1, var3.a[Char.fe[0][0][0]].a, var7 + Char.fe[0][0][1] + var3.a[Char.fe[0][0][0]].b, var8 - Char.fe[0][0][2] + var3.a[Char.fe[0][0][0]].c, 0, 0);
                SmallImage.paintImage(var1, var4.a[Char.fe[0][1][0]].a, var7 + Char.fe[0][1][1] + var4.a[Char.fe[0][1][0]].b, var8 - Char.fe[0][1][2] + var4.a[Char.fe[0][1][0]].c, 0, 0);
                SmallImage.paintImage(var1, var5.a[Char.fe[0][2][0]].a, var7 + Char.fe[0][2][1] + var5.a[Char.fe[0][2][0]].b, var8 - Char.fe[0][2][2] + var5.a[Char.fe[0][2][0]].c, 0, 0);
                if (this.a == var2) {
                   mFont.tahoma_8b.writeText(var1, mResources.mv[0] + ": " + this.g[var2], GameCanvas.ab, this.q - 45, 2);
                   mFont.tahoma_7b_white.writeText(var1, mResources.mv[1] + ": " + this.f[var2], GameCanvas.ab, this.q - 28, 2, mFont.tahoma_7b_blue);
                   mFont.tahoma_7b_white.writeText(var1, this.h[var2], GameCanvas.ab, this.q - 16, 2, mFont.tahoma_7b_blue);
                }
             } else {
                var8 = this.q + this.n / 2 - 5;
                SmallImage.paintImage(var1, var6.a[Char.fe[0][3][0]].a, var7 + Char.fe[0][3][1] + var6.a[Char.fe[0][3][0]].b, var8 - Char.fe[0][3][2] + var6.a[Char.fe[0][3][0]].c, 0, 0);
                SmallImage.paintImage(var1, var3.a[Char.fe[0][0][0]].a, var7 + Char.fe[0][0][1] + var3.a[Char.fe[0][0][0]].b, var8 - Char.fe[0][0][2] + var3.a[Char.fe[0][0][0]].c, 0, 0);
                SmallImage.paintImage(var1, var4.a[Char.fe[0][1][0]].a, var7 + Char.fe[0][1][1] + var4.a[Char.fe[0][1][0]].b, var8 - Char.fe[0][1][2] + var4.a[Char.fe[0][1][0]].c, 0, 0);
                SmallImage.paintImage(var1, var5.a[Char.fe[0][2][0]].a, var7 + Char.fe[0][2][1] + var5.a[Char.fe[0][2][0]].b, var8 - Char.fe[0][2][2] + var5.a[Char.fe[0][2][0]].c, 0, 0);
                mFont.tahoma_8b.writeText(var1, this.g[var2], var7, this.q + this.n / 2 + 5, 2);
                mFont.tahoma_7b_white.writeText(var1, mResources.mv[1] + ": " + this.f[var2], var7, this.q + this.n / 2 + 22, 2);
                if (GameCanvas.width > 200) {
                   mFont.tahoma_7b_white.writeText(var1, this.h[var2], var7, this.q + this.n / 2 + 34, 2);
                }
             }
          }
       }
 
       super.paint(var1);
    }
 
    public final void perform(int var1, Object var2) {
       switch (var1) {
          case 1000:
             this.e();
             return;
          case 1001:
             Session_ME.getInstance().b();
             GameCanvas.instance.q();
          default:
       }
    }
 }
 