
// Source code is decompiled from idEf .class file using FernFlower decompiler.
public final class Class_bj extends Class_bc {
    private EffectCharPaint a;
    private int b;
    private int g;
    private int h;
    private int i = 1;
    private Char j;
    private short k = 0;
    private long l = 0L;
 
    public Class_bj() {
    }
 
    public static void a(int var0, int var1, int var2, int var3) {
       Class_bj var4;
       (var4 = new Class_bj()).a = GameScr.efs[var0];
       var4.g = var1;
       var4.h = var2;
       var4.k = (short)var3;
       Class_bc.c.addElement(var4);
    }
 
    public static void a(int var0, int var1, int var2, int var3, byte var4) {
       Class_bj var5;
       (var5 = new Class_bj()).a = GameScr.efs[var0];
       var5.g = var1;
       var5.h = var2;
       var5.k = (short)var3;
       var5.i = var4;
       Class_bc.c.addElement(var5);
    }
 
    public static void a(int var0, Char var1, int var2) {
       Class_bj var3;
       (var3 = new Class_bj()).a = GameScr.efs[var0];
       var3.j = var1;
       var3.k = (short)var2;
       Class_bc.c.addElement(var3);
    }
 
    public static void b(int var0, Char var1, int var2) {
       Class_bj var3;
       (var3 = new Class_bj()).a = GameScr.efs[var0];
       var3.j = var1;
       var3.l = System.currentTimeMillis() + (long)(var2 * 1000);
       Class_bc.c.addElement(var3);
    }
 
    public final void a(mGraphics var1) {
       if (this.j != null) {
          this.g = this.j.cx;
          this.h = this.j.cy;
       }
 
       int var2 = this.g + this.a.arrEfInfo[this.b].a * this.i;
       int var3 = this.h + this.a.arrEfInfo[this.b].b;
       if (GameCanvas.e(var2, var3)) {
          SmallImage.paintImage(var1, this.a.arrEfInfo[this.b].c, var2, var3, this.i == 1 ? 0 : 2, 3);
       }
 
    }
 
    public final void a() {
       if (this.l != 0L) {
          ++this.b;
          if (this.b >= this.a.arrEfInfo.length) {
             this.b = 0;
          }
 
          if (System.currentTimeMillis() - this.l > 0L) {
             if (this.a.idEf == 120) {
                GameCanvas.d = false;
             }
 
             Class_bc.c.removeElement(this);
          }
       } else {
          ++this.b;
          if (this.b >= this.a.arrEfInfo.length) {
             --this.k;
             if (this.k <= 0) {
                if (this.a.idEf == 120) {
                   GameCanvas.d = false;
                }
 
                Class_bc.c.removeElement(this);
             } else {
                this.b = 0;
             }
          }
       }
 
       if (GameCanvas.gameTick % 11 == 0 && this.j != null && this.j != Char.getMyChar() && !GameScr.vCharInMap.contains(this.j)) {
          Class_bc.c.removeElement(this);
       }
 
    }
 }
 