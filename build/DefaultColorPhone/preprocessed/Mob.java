
// Source code is decompiled from a .class file using FernFlower decompiler.
import javax.microedition.lcdui.Image;

public final class Mob extends MainObject {
   public static Class_cx[] b;
   public int c;
   public int d;
   public int e;
   public int f;
   private int ae;
   public int g = 1;
   private int af = 1;
   public int h;
   private int ag;
   private int ah;
   private int ai;
   public int i;
   public int j;
   public int k;
   public int l;
   private int aj;
   public short m;
   public boolean n;
   public boolean o;
   public boolean p;
   public boolean q;
   public boolean r;
   private MyVector ak = new MyVector();
   public int s;
   private Char al;
   private Class_by am;
   public int t;
   public int u;
   public int v;
   private int an;
   public short w;
   public short x;
   public boolean y;
   private long ao = 0L;
   private int ap = 0;
   public static Char z;
   public static MyVector aa = new MyVector();
   private static Class_eg aq;
   private static long ar;
   private boolean as;
   public boolean ab = true;
   private long at;
   public Char ac;
   public boolean ad = false;
   private Mob au;
   private Char av;
   private short aw;
   private byte ax;
   private byte ay;
   private byte az = -1;
   private static byte[][] ba = new byte[][]{{3, 4, 5, 6}, new byte[1], {2, 2, 2, 2, 3, 3, 3, 3}, {0, 1}, {0, 1}, {3, 4, 5}, new byte[1], {3, 3, 4, 4, 5, 5}, new byte[1], {3, 4, 5}, {0, 1, 2, 3, 4}, {3, 4, 5}, {4, 5, 6}, new byte[1], {0, 1}, {0, 1}, {3, 3, 4, 4, 5, 5}, {0, 1, 2}, {0, 1, 2}, {5, 6, 7, 8}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {3, 4, 5, 6}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, new byte[1], new byte[1], new byte[1], new byte[1], {0, 1, 2}, new byte[1], new byte[1], {0, 0, 1, 1, 2, 2}, {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 1}, {0, 1}};
   private static byte[][] bb = new byte[][]{{0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, new byte[1]};
   private static byte[][] bc = new byte[][]{{5, 4, 3, 2, 1}, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], {5, 4, 3, 2, 1}, {5, 4, 3, 2, 1}, {5, 4, 3, 2, 1}, new byte[0], {5, 4, 3, 2, 1}, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, new byte[1]};

   public Mob(short var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, int var7, int var8, int var9, int var10, int var11, short var12, short var13, byte var14, byte var15, boolean var16, boolean var17) {
      this.n = var2;
      this.o = var3;
      this.p = var4;
      this.q = var5;
      this.r = var6;
      this.v = var8;
      this.m = var1;
      this.s = var7;
      this.c = var9;
      this.x = (short)var10;
      this.i = this.e = var12;
      this.j = this.f = var13;
      if (var7 != 168 && var7 != 179 && var7 != 175 && var7 != 177 && var7 != 202) {
         this.h = var14;
      } else {
         this.h = 8;
      }

      this.d = var11;
      this.w = var15;
      this.y = var16;
      if (var7 == 202) {
         aq = new Class_eg(this.i, this.j - 100);
         aa.addElement(aq);
         Class_eg.f = this;
      }

      if (b[var7].h == null) {
         b[var7].h = new Image[0];
         Service.getInstance().a(var7);
      }

      ar = (long)Class_fa.b(2000, 3500);
      this.as = var17;
   }

   public final void a() {
      if (this.c > 0) {
         this.aj = 4;
         this.h = 7;
      }

   }

   public final void a(Char var1) {
      label78: {
         this.ab = true;
         this.al = var1;
         this.ag = 0;
         this.ah = 0;
         this.h = 3;
         if (this.s != 209 && this.s != 210) {
            label77: {
               if (this.s != 168 && this.s != 176 && this.s != 177 && this.s != 179) {
                  if (this.s != 169 && this.s != 171 && this.s != 172 && this.s != 182) {
                     if (this.s == 175) {
                        this.ap = 7;
                        break label78;
                     }

                     if (this.s != 181 && this.s != 185 && this.s != 188 && this.s != 194 && this.s != 192) {
                        if (this.s != 183 && this.s != 170 && this.s != 193) {
                           if (this.s != 187 && this.s != 168 && this.s != 175 && this.s != 176 && this.s != 179 && this.s != 174) {
                              break label77;
                           }

                           this.ap = this.d(GameCanvas.gameTick);
                           break label78;
                        }

                        this.ap = 4;
                        break label78;
                     }

                     this.ap = 3;
                     break label78;
                  }

                  this.ap = 2;
                  break label78;
               }

               this.ap = 6;
               break label78;
            }
         }

         this.ap = 0;
      }

      this.an = 0;
   }

   public final void a(Class_by var1) {
      this.am = var1;
      this.ag = 0;
      this.ah = 0;
      this.h = 3;
      this.an = 1;
   }

   private void h() {
      if (!Code.ad) {
         this.ae = this.y ? (this.b().e == 204 ? 9 : (this.b().e == 203 ? 9 : (this.b().e == 139 ? 4 : (this.b().e == 160 ? 12 : 10)))) : 2;
         if (this.b().e != 209 && this.b().e != 210) {
            if (this.b().e == 141) {
               this.ae = 13;
            } else if (this.b().e != 169 && this.b().e != 170 && this.b().e != 171 && this.b().e != 172 && this.b().e != 182) {
               if (this.b().e != 168 && this.b().e != 176 && this.b().e != 177 && this.b().e != 179 && this.b().e != 180) {
                  if (this.b().e != 173 && this.b().e != 184) {
                     if (this.b().e != 181 && this.b().e != 178 && this.b().e != 185 && this.b().e != 202) {
                        if (this.b().e == 174) {
                           this.ae = 10;
                        } else if (this.b().e == 183) {
                           this.ae = 5;
                        } else if (this.b().e == 175) {
                           this.ae = 8;
                        }
                     } else {
                        this.ae = 4;
                     }
                  } else {
                     this.ae = 6;
                  }
               } else {
                  this.ae = 7;
               }
            } else {
               this.ae = 3;
            }
         } else {
            this.ae = 3;
         }

         --this.aj;
         if (this.aj > 0) {
            if (b[this.s].c != 0) {
               int var1 = -this.ac.s << 1;
               if (this.e > this.i - b[this.s].a && this.e < this.i + b[this.s].a) {
                  this.e -= var1;
                  return;
               }
            }
         } else {
            if ((this.ac == null || !this.ad) && this.c != 0) {
               this.h = 5;
               if (this.ac != null) {
                  this.g = -this.ac.s;
                  if (Class_fa.e(this.e - this.ac.cx) < 24) {
                     this.h = 2;
                  }
               }

               this.ag = this.ah = this.ai = 0;
               this.aj = 0;
            } else {
               this.h = 1;
               this.ah = this.ac.s << 3;
               this.ag = -5;
               this.ai = 0;
            }

            this.ac = null;
         }

      }
   }

   private void i() {
      try {
         if (Code.ad) {
            return;
         }

         if (this.ad) {
            this.h = 1;
            this.ah = this.ac.s << 3;
            this.ag = -5;
            this.ai = 0;
         }

         if (!this.q) {
            if (!this.o && !this.r) {
               byte var1;
               switch (b[this.s].c) {
                  case 0:
                     if (this.s == 176) {
                        this.h = 9;
                     }

                     this.ae = 0;
                     return;
                  case 1:
                  case 2:
                  case 3:
                     var1 = b[this.s].b;
                     if (b[this.s].b == 1) {
                        if (GameCanvas.gameTick % 2 == 1) {
                           return;
                        }
                     } else if (var1 > 2) {
                        var1 = (byte)(var1 + this.m % 2);
                     } else if (GameCanvas.gameTick % 2 == 1) {
                        --var1;
                     }

                     this.e += var1 * this.g;
                     if (Class_fa.b(0, b[this.s].a) == b[this.s].a / 3) {
                        this.h = 2;
                        this.at = System.currentTimeMillis();
                     }

                     if (this.e > this.i + b[this.s].a) {
                        this.g = -1;
                        if (this.s == 168 || this.s == 177) {
                           this.h = 9;
                           this.ag = 0;
                        }
                     } else if (this.e < this.i - b[this.s].a) {
                        this.g = 1;
                        if (this.s == 168 || this.s == 177) {
                           this.h = 9;
                           this.ag = 0;
                        }
                     }

                     if (!this.y) {
                        if (this.s < 168) {
                           this.ae = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                           return;
                        }

                        this.ae = this.c(GameCanvas.gameTick);
                        return;
                     }

                     this.ae = b[this.s].k[this.ap];
                     return;
                  case 4:
                     var1 = (byte)(b[this.s].b + this.m % 2);
                     this.e += var1 * this.g;
                     if (GameCanvas.gameTick % 10 > 2 && this.s != 205 && this.s != 206 && this.s != 207 && this.s != 208) {
                        this.az = -1;
                        this.f += var1 * this.af;
                     }

                     if (this.e > this.i + b[this.s].a) {
                        this.g = -1;
                        if (this.s == 179 || this.s == 175) {
                           this.h = 9;
                        }

                        this.ag = 0;
                     } else if (this.e < this.i - b[this.s].a) {
                        this.g = 1;
                        if (this.s == 179 || this.s == 175) {
                           this.h = 9;
                        }

                        this.ag = 0;
                     }

                     if (this.f > this.j + 24) {
                        this.af = -1;
                     } else if (this.f < this.j - (20 + GameCanvas.gameTick % 10)) {
                        this.af = 1;
                     }

                     if (!this.y) {
                        if (this.s < 168) {
                           this.ae = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                           return;
                        }

                        this.ae = this.c(GameCanvas.gameTick);
                        return;
                     }

                     this.ae = b[this.s].k[this.ap];
                     return;
                  case 5:
                     var1 = (byte)(b[this.s].b + this.m % 2);
                     this.e += var1 * this.g;
                     var1 = (byte)(var1 + (GameCanvas.gameTick + this.m) % 2);
                     if (GameCanvas.gameTick % 10 > 2) {
                        this.f += var1 * this.af;
                     }

                     if (this.e > this.i + b[this.s].a) {
                        this.g = -1;
                        if (this.s != 179 && this.s != 175) {
                           this.h = 2;
                        } else {
                           this.h = 9;
                        }

                        this.ag = 0;
                     } else if (this.e < this.i - b[this.s].a) {
                        this.g = 1;
                        if (this.s != 179 && this.s != 175) {
                           this.h = 2;
                        } else {
                           this.h = 9;
                        }

                        this.ag = 0;
                     }

                     if (this.f > this.j + 24) {
                        this.af = -1;
                     } else if (this.f < this.j - (20 + GameCanvas.gameTick % 10)) {
                        this.af = 1;
                     }

                     if (TileMap.a(this.e, this.f, 2)) {
                        if (GameCanvas.gameTick % 10 > 5) {
                           this.f = TileMap.b(this.f);
                           this.h = 4;
                           this.ag = 0;
                        }

                        this.af = -1;
                     }

                     if (!this.y) {
                        if (this.s < 168) {
                           this.ae = GameCanvas.gameTick % 4 > 1 ? 3 : 1;
                           return;
                        }

                        this.ae = this.c(GameCanvas.gameTick);
                        return;
                     }

                     this.ae = b[this.s].k[this.ap];
                  default:
                     return;
               }
            }

            this.ae = 0;
            return;
         }
      } catch (Exception var2) {
      }

   }

   public final Class_cx b() {
      return b[this.s];
   }

   public final boolean c() {
      if (this.e < GameScr.i) {
         return false;
      } else if (this.e > GameScr.i + GameScr.b) {
         return false;
      } else if (this.f < GameScr.j) {
         return false;
      } else if (this.f > GameScr.j + GameScr.c + 30) {
         return false;
      } else if (b[this.s] == null) {
         return false;
      } else {
         if (!this.y) {
            if (this.ae >= b[this.s].h.length) {
               return false;
            }

            if (b[this.s].h[this.ae] == null) {
               return false;
            }

            if (this.s != 179 && this.s != 175 && this.s != 202) {
               if (this.s == 176 && (this.ae == 1 || this.ae == 0)) {
                  return false;
               }
            } else if (this.h == 8) {
               return false;
            }
         }

         return this.h != 0;
      }
   }

   public final void a(mGraphics var1) {
      if (this.c()) {
         int var2 = this.f;
         if (this.s == 205 || this.s == 206 || this.s == 207 || this.s == 208) {
            ++this.az;
            if (this.az > Char.fs.length - 1) {
               this.az = 0;
            }
         }

         if (this.az >= 0) {
            var2 += Char.fs[this.az];
         }

         Class_cx var3 = b[this.s];
         if (!this.y) {
            if (this.k == 0) {
               this.k = mGraphics.getWidth(var3.h[0]);
            }

            if (this.l == 0) {
               this.l = mGraphics.getHeight(var3.h[0]);
            }
         } else {
            this.k = 40;
            this.l = 40;
         }

         this.b(var1, this.e, var2, 0);

         int var4;
         byte var5;
         int var9;
         try {
            var4 = this.g > 0 ? 0 : 2;
            if (this.s == 219) {
               var4 = 0;
            }

            if ((this.s == 98 || this.s == 99) && this.h == 1) {
               long var11;
               if ((var11 = System.currentTimeMillis()) - this.ao < 400L) {
                  var1.drawRegion(var3.h[this.ae], 0, 0, mGraphics.getWidth(var3.h[this.ae]), mGraphics.getHeight(var3.h[this.ae]), var4, this.e, var2, Class_fc.d);
               } else if (var11 - this.ao < 800L) {
                  var1.drawRegion(var3.h[this.ae], 0, 0, mGraphics.getWidth(var3.h[this.ae]), 3 * mGraphics.getHeight(var3.h[this.ae]) / 5, var4, this.e, var2, Class_fc.d);
               } else if (var11 - this.ao < 1200L) {
                  var1.drawRegion(var3.h[this.ae], 0, 0, mGraphics.getWidth(var3.h[this.ae]), mGraphics.getHeight(var3.h[this.ae]) / 3, var4, this.e, var2, Class_fc.d);
               }

               if (GameCanvas.gameTick % 8 < 2) {
                  SmallImage.paintImage(var1, 457, this.e, var2, 0, Class_fc.d);
               } else if (GameCanvas.gameTick % 8 < 4) {
                  SmallImage.paintImage(var1, 458, this.e, var2, 0, Class_fc.d);
               } else if (GameCanvas.gameTick % 8 < 6) {
                  SmallImage.paintImage(var1, 459, this.e, var2, 0, Class_fc.d);
               }
            } else if (this.y) {
               if (this.b().j != null) {
                  Class_bf var6 = this.b().j[this.ae];

                  for(var9 = 0; var9 < var6.a.length; ++var9) {
                     Class_cx var7 = this.b();
                     var5 = var6.c[var9];
                     Class_bg var10 = var7.i[var5];
                     if (this.g > 0) {
                        var1.drawRegion(this.b().h[0], var10.a, var10.b, var10.c, var10.d, 0, this.e + var6.a[var9], var2 + var6.b[var9] - 1, 20);
                     } else {
                        var1.drawRegion(this.b().h[0], var10.a, var10.b, var10.c, var10.d, 2, this.e - var6.a[var9], var2 + var6.b[var9] - 1, 24);
                     }
                  }
               }
            } else {
               if (this.s == 168) {
                  int var10000 = this.h;
                  boolean var10001 = true;
               }

               var1.drawRegion(var3.h[this.ae], 0, 0, mGraphics.getWidth(var3.h[this.ae]), mGraphics.getHeight(var3.h[this.ae]), var4, this.e, var2, Class_fc.d);
            }

            this.a(var1, this.e, var2, 0);
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         var4 = var2;
         int var12;
         if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.equals(this) && this.h != 1) {
            int var13;
            if (this.y) {
               var12 = this.d;
               if (this.d < this.c) {
                  var12 = this.c;
               }

               var9 = (int)((long)this.c * 100L / (long)var12);
               var13 = this.k;
               var5 = 4;
               if (this.w == 1 || this.w == 2 || this.w == 3 || this.y) {
                  var5 = 6;
                  var13 += var13 / 2;
               }

               var13 += 2;
               if ((var9 = var13 * var9 / 100) < 2) {
                  var9 = 2;
               }

               if (this.s == 140 || this.s == 160) {
                  var4 = var2 - 20;
               }

               if (this.s != 142 && this.s != 143) {
                  var1.setColor(16777215);
                  var1.fillRect(this.e - var13 / 2 - 1, var4 - this.l - 12, var13, var5);
                  var1.setColor(this.d());
                  var1.fillRect(this.e - var13 / 2 - 1, var4 - this.l - 12, var9, var5);
                  var1.setColor(0);
                  var1.drawRect(this.e - var13 / 2 - 1, var4 - this.l - 12, var13, var5);
               } else {
                  SmallImage.paintImage(var1, 988, this.e, var4 - this.l, 0, 33);
               }
            } else {
               var12 = this.d;
               if (this.d < this.c) {
                  var12 = this.c;
               }

               var9 = (int)((long)this.c * 100L / (long)var12);
               var13 = this.k;
               if (this.s > 167) {
                  var13 = this.k / 2;
               }

               var5 = 4;
               if (this.w == 1 || this.w == 2 || this.w == 3 || this.y) {
                  var5 = 6;
                  var13 += var13 / 2;
               }

               var13 += 2;
               if ((var9 = var13 * var9 / 100) < 2) {
                  var9 = 2;
               }

               if (this.s == 140 || this.s == 160) {
                  var4 = var2 - 20;
               }

               if (this.s != 142 && this.s != 143) {
                  var1.setColor(16777215);
                  var1.fillRect(this.e - var13 / 2 - 1, var4 - this.l - 12, var13, var5);
                  var1.setColor(this.d());
                  var1.fillRect(this.e - var13 / 2 - 1, var4 - this.l - 12, var9, var5);
                  var1.setColor(0);
                  var1.drawRect(this.e - var13 / 2 - 1, var4 - this.l - 12, var13, var5);
               } else {
                  SmallImage.paintImage(var1, 988, this.e, var4 - this.l, 0, 33);
               }
            }

            if (this.w > 0) {
               if (this.w == 1) {
                  mFont.tahoma_7_yellow.writeText(var1, mResources.je[this.w], this.e, var4 - this.l - 26, 2, mFont.tahoma_7_grey);
               } else if (this.w == 2) {
                  mFont.tahoma_7_yellow.writeText(var1, mResources.je[this.w], this.e, var4 - this.l - 26, 2, mFont.tahoma_7_grey);
               } else if (this.w == 3) {
                  mFont.tahoma_7_blue1.writeText(var1, mResources.je[this.w], this.e, var4 - this.l - 26, 2, mFont.tahoma_7_grey);
               }

               if (this.n) {
                  SmallImage.paintImage(var1, 494, this.e, var4 - this.l - 28, 0, 33);
               }
            } else if (this.n) {
               SmallImage.paintImage(var1, 494, this.e, var4 - this.l - 15, 0, 33);
            }
         } else if (this.w > 0) {
            if (this.w == 1) {
               mFont.tahoma_7_yellow.writeText(var1, mResources.je[this.w], this.e, var2 - this.l - 20, 2, mFont.tahoma_7_grey);
            } else if (this.w == 2) {
               mFont.tahoma_7_yellow.writeText(var1, mResources.je[this.w], this.e, var2 - this.l - 20, 2, mFont.tahoma_7_grey);
            } else if (this.w == 3) {
               mFont.tahoma_7_blue1.writeText(var1, mResources.je[this.w], this.e, var2 - this.l - 20, 2, mFont.tahoma_7_grey);
            }

            if (this.n) {
               SmallImage.paintImage(var1, 494, this.e, var2 - this.l - 22, 0, 33);
            }
         } else if (this.n) {
            SmallImage.paintImage(var1, 494, this.e, var2 - this.l - 5, 0, 33);
         }

         if (this.o) {
            if (GameCanvas.gameTick % 2 == 0) {
               SmallImage.paintImage(var1, 1082, this.e, var2 - this.l / 2, 0, 3);
            } else {
               SmallImage.paintImage(var1, 1084, this.e, var2 - this.l / 2, 0, 3);
            }
         }

         if (this.q) {
            SmallImage.paintImage(var1, 290, this.e, var2, 0, 33);
         }

         if (this.r) {
            if ((var12 = GameCanvas.gameTick % 6) != 0 && var12 != 1) {
               if (var12 != 2 && var12 != 3) {
                  if (var12 == 4 || var12 == 5) {
                     SmallImage.paintImage(var1, 1000, this.e, var2 - this.l - 5, 0, 3);
                  }
               } else {
                  SmallImage.paintImage(var1, 999, this.e, var2 - this.l - 5, 0, 3);
               }
            } else {
               SmallImage.paintImage(var1, 998, this.e, var2 - this.l - 5, 0, 3);
            }
         }

         if (this.p) {
            if ((var12 = GameCanvas.gameTick % 16) == 0) {
               SmallImage.paintImage(var1, 1013, this.e - this.k / 2, var2 - this.l + this.l / 4, 0, 3);
               return;
            }

            if (var12 == 1) {
               SmallImage.paintImage(var1, 1014, this.e - this.k / 2, var2 - this.l + this.l / 4, 0, 3);
               return;
            }

            if (var12 == 2) {
               SmallImage.paintImage(var1, 1015, this.e - this.k / 2, var2 - this.l + this.l / 4, 0, 3);
               return;
            }

            if (var12 == 3) {
               SmallImage.paintImage(var1, 1016, this.e - this.k / 2, var2 - this.l + this.l / 4, 0, 3);
               return;
            }

            if (var12 == 4) {
               SmallImage.paintImage(var1, 1013, this.e + this.k / 2, var2 - this.l, 0, 3);
               return;
            }

            if (var12 == 5) {
               SmallImage.paintImage(var1, 1014, this.e + this.k / 2, var2 - this.l, 0, 3);
               return;
            }

            if (var12 == 6) {
               SmallImage.paintImage(var1, 1015, this.e + this.k / 2, var2 - this.l, 0, 3);
               return;
            }

            if (var12 == 7) {
               SmallImage.paintImage(var1, 1016, this.e + this.k / 2, var2 - this.l, 0, 3);
               return;
            }

            if (var12 == 8) {
               SmallImage.paintImage(var1, 1013, this.e - this.k / 2, var2, 0, 3);
               return;
            }

            if (var12 == 9) {
               SmallImage.paintImage(var1, 1014, this.e - this.k / 2, var2, 0, 3);
               return;
            }

            if (var12 == 10) {
               SmallImage.paintImage(var1, 1015, this.e - this.k / 2, var2, 0, 3);
               return;
            }

            if (var12 == 11) {
               SmallImage.paintImage(var1, 1016, this.e - this.k / 2, var2, 0, 3);
               return;
            }

            if (var12 == 12) {
               SmallImage.paintImage(var1, 1013, this.e + this.k / 2, var2 - this.l / 4, 0, 3);
               return;
            }

            if (var12 == 13) {
               SmallImage.paintImage(var1, 1014, this.e + this.k / 2, var2 - this.l / 4, 0, 3);
               return;
            }

            if (var12 == 14) {
               SmallImage.paintImage(var1, 1015, this.e + this.k / 2, var2 - this.l / 4, 0, 3);
               return;
            }

            if (var12 == 15) {
               SmallImage.paintImage(var1, 1016, this.e + this.k / 2, var2 - this.l / 4, 0, 3);
            }
         }
      }

   }

   public final int d() {
      if (this.v > 1) {
         if (this.v == 2) {
            return 33023;
         }

         if (this.v == 3) {
            return 7443811;
         }
      }

      return 16711680;
   }

   public final void e() {
      this.c = 0;
      this.ao = System.currentTimeMillis();
      if (this.ac != null) {
         this.ad = true;
      } else {
         this.ad = true;
         this.c = 0;
         this.h = 1;
         this.ag = -5;
         this.ah = -this.g << 2;
         this.ai = 0;
      }
   }

   public final void a(Mob var1) {
      this.au = var1;
   }

   public final void b(Char var1) {
      this.av = var1;
   }

   private void j() {
      int var1;
      int var2;
      if (this.au != null) {
         if (this.y) {
            this.h = 3;
         } else {
            var1 = this.au.e - this.e;
            var2 = this.au.f - this.f;
            this.e += var1 / 4;
            this.f += var2 / 4;
            this.g = this.e >= this.au.e ? 0 : 1;
            if (this.au.h == 1 || this.au.h == 0 || Class_fa.e(var1) < 20 && Class_fa.e(var2) < 20) {
               if (this.ay == 0) {
                  Class_bj.a(this.aw == -1 ? 59 : this.aw, this.au.e, this.au.f, this.g == 0 ? -1 : 1);
               } else if (this.ay == 1 && this.aw >= 0) {
                  Class_ba.a(this.aw, this.au.e, this.au.f, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
               }

               this.au = null;
            }
         }
      }

      if (this.av != null) {
         if (this.y) {
            this.h = 3;
            return;
         }

         var1 = this.av.cx - this.e;
         var2 = this.av.cy - this.f;
         this.e += var1 / 4;
         this.f += var2 / 4;
         this.g = this.e >= this.av.cx ? 0 : 1;
         if (this.av.r == 5 || this.av.r == 14 || Class_fa.e(var1) < 20 && Class_fa.e(var2) < 20) {
            if (this.ay == 0) {
               Class_bj.a(this.aw == -1 ? 59 : this.aw, this.av.cx, this.av.cy, this.g == 0 ? -1 : 1);
            } else if (this.ay == 1 && this.aw >= 0) {
               Class_ba.a(this.aw, this.av.cx, this.av.cy, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
            }

            this.av = null;
         }
      }

   }

   public final void a(short var1, byte var2, byte var3) {
      this.aw = var1;
      this.ax = var2;
      this.ay = var3;
   }

   public final void f() {
      if (this.s == 116) {
         Class_bj.a(84, Char.getMyChar(), 1);
      } else if (this.s == 115) {
         Class_bj.a(81, Char.getMyChar(), 1);
      } else if (this.s == 138) {
         Class_bj.a(90, Char.getMyChar(), 1);
      } else if (this.s == 139) {
         Class_bj.a(91, Char.getMyChar(), 1);
      } else {
         if (this.s != 140 && this.s != 161) {
            if (this.s == 141 || this.s == 162) {
               Class_bj.a(121, Char.getMyChar(), 1);
               return;
            }

            if (this.s == 144 || this.s == 163) {
               Class_bj.a(121, Char.getMyChar(), 1);
               return;
            }

            if (this.s == 160) {
               Class_bj.a(124, Char.getMyChar(), 1);
               return;
            }

            if (this.s == 164 || this.s == 165) {
               Class_bj.a(126, this.al, 1);
               return;
            }

            if (this.s == 166) {
               Class_bj.a(103, this.al, 1);
               return;
            }

            if (this.s == 166) {
               Class_bj.a(105, this.al, 1);
               return;
            }
         } else {
            Class_bj.a(110, Char.getMyChar(), 2);
         }

      }
   }

   private int c(int var1) {
      var1 %= ba[this.s - 168].length;
      return this.s != 198 && this.s != 199 && this.s != 200 && this.s != 201 && this.s != 203 && this.s != 204 ? ba[this.s - 168][var1] : 0;
   }

   private int d(int var1) {
      var1 %= 5;
      if (this.s == 178) {
         switch (var1) {
            case 0:
               return 5;
            case 1:
               return 6;
            case 2:
               return 7;
            case 3:
               return 8;
         }
      } else if (this.s == 168) {
         switch (var1) {
            case 0:
               return 1;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.s == 179) {
         switch (var1) {
            case 0:
               return 0;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.s == 175) {
         switch (var1) {
            case 0:
               return 0;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.s == 176) {
         switch (var1) {
            case 0:
               return 2;
            case 1:
               return 3;
            case 2:
               return 4;
            case 3:
               return 5;
            case 4:
               return 6;
         }
      } else if (this.s == 177) {
         switch (var1) {
            case 0:
               return 1;
            case 1:
               return 2;
            case 2:
               return 3;
            case 3:
               return 4;
            case 4:
               return 5;
         }
      } else if (this.s == 174) {
         switch (var1) {
            case 0:
               return 5;
            case 1:
               return 6;
            case 2:
               return 7;
            case 3:
               return 8;
            case 4:
               return 9;
         }
      }

      return 0;
   }

   private void k() {
      if (this.ag == 0) {
         int var1 = 0;
         int var2 = 0;
         if (this.au != null) {
            var1 = this.au.e;
            var2 = this.au.f;
         }

         if (this.av != null) {
            var1 = this.av.cx;
            var2 = this.av.cy;
         }

         this.an = this.ax;
         this.g = this.e >= var1 ? 0 : 1;
         if (this.y) {
            ++this.ap;
            if (this.ap >= b[this.s].l[this.an].length) {
               this.ap = 0;
               this.h = 2;
               this.au = null;
               this.av = null;
               this.ag = 0;
               this.ah = 0;
            }

            if (this.ap == b[this.s].l[this.an].length - 2) {
               if (this.ay == 0) {
                  Class_bj.a(this.aw == -1 ? 59 : this.aw, var1, var2, 1, (byte)(this.g == 0 ? -1 : 1));
               } else if (this.ay == 1 && this.aw >= 0) {
                  Class_ba.a(this.aw, var1, var2, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
               }
            }

            this.ae = b[this.s].l[this.ax][this.ap];
         }

         if (b[this.s].c != 0 && !this.o && this.q && this.r) {
            this.e += (var1 - this.e) / 3;
         }

         if (this.e > this.i + b[this.s].a) {
            this.ag = 1;
         }

         if (this.e < this.i - b[this.s].a) {
            this.ag = 1;
            return;
         }
      } else if (this.ag == 1) {
         if (b[this.s].c != 0 && !this.o && !this.q && !this.r) {
            this.e += (this.i - this.e) / 4;
            this.f += (this.j - this.f) / 4;
         }

         if (Class_fa.e(this.i - this.e) < 5 && Class_fa.e(this.j - this.f) < 5) {
            this.h = 2;
            this.ap = 0;
            this.ag = 0;
            this.ah = 0;
         }
      }

   }

   public static Mob a(int var0) {
      for(int var1 = GameScr.vMobAttack.size() - 1; var1 >= 0; --var1) {
         Mob var2;
         if ((var2 = (Mob)GameScr.vMobAttack.elementAt(var1)) != null && var2.m == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Mob b(int var0) {
      for(int var1 = GameScr.vMobAttack.size() - 1; var1 >= 0; --var1) {
         Mob var2;
         if ((var2 = (Mob)GameScr.vMobAttack.elementAt(var1)) != null && var2.x == var0 && !var2.y) {
            return var2;
         }
      }

      return null;
   }

   public final void g() {
      if (b[this.s] != null && b[this.s].h != null && (this.y || this.ae < b[this.s].h.length && b[this.s].h[this.ae] != null) && this.h != 0) {
         if (this.al == null && (this.s == 168 || this.s == 179 || this.s == 175)) {
            this.h = 8;
         }

         if (Code.ad && this.c > 0) {
            return;
         }

         if (this.ak != null || b[this.s].a == 0) {
            if (this.h != 3 && this.ab) {
               if (this.al != null) {
                  this.al.a(this.t, this.u, this.y, this.b().e);
                  this.al = null;
               }

               this.ab = false;
            }

            if (this.c <= 0 && this.m != -1) {
               this.h = 1;
            }

            int var1;
            int var2;
            int var3;
            Mob var4;
            label961:
            switch (this.h) {
               case 1:
                  this.n = false;
                  this.o = false;
                  this.p = false;
                  this.q = false;
                  this.r = false;
                  if (this.s != 98 && this.s != 99) {
                     ++this.ag;
                     this.f += this.ag;
                     if (z != null) {
                        if (z.bz != null) {
                           if (z.bz.template.id > 72) {
                              if (GameCanvas.gameTick % 9 == 0) {
                                 if (this.ah > 1) {
                                    this.ah += 5;
                                 } else if (this.ah < -1) {
                                    this.ah -= 5;
                                 }
                              }
                           } else if (GameCanvas.gameTick % 2 == 0) {
                              if (this.ah > 1) {
                                 --this.ah;
                              } else if (this.ah < -1) {
                                 ++this.ah;
                              }
                           }
                        }
                     } else if (Char.getMyChar() != null && Char.getMyChar().bz != null) {
                        if (Char.getMyChar().bz.template.id > 72) {
                           if (GameCanvas.gameTick % 9 == 0) {
                              if (this.ah > 1) {
                                 this.ah += 5;
                              } else if (this.ah < -1) {
                                 this.ah -= 5;
                              }
                           }
                        } else if (GameCanvas.gameTick % 2 == 0) {
                           if (this.ah > 1) {
                              --this.ah;
                           } else if (this.ah < -1) {
                              ++this.ah;
                           }
                        }
                     }

                     this.e += this.ah;
                     if (this.s != 209 && this.s != 210) {
                        if (this.s != 168 && this.s != 176 && this.s != 177 && this.s != 179 && this.s != 180 && this.s != 191) {
                           if (this.s != 178 && this.s != 181 && this.s != 183 && this.s != 185 && this.s != 188 && this.s != 192 && this.s != 194) {
                              if (this.s != 173 && this.s != 184) {
                                 if (this.s == 175) {
                                    var4 = this;
                                    var1 = 8;
                                 } else if (this.s != 170 && this.s != 195 && this.s != 196 && this.s != 197 && this.s != 186 && this.s != 189 && this.s != 190) {
                                    if (this.s == 187) {
                                       var4 = this;
                                       var1 = 9;
                                    } else if (this.s == 193) {
                                       var4 = this;
                                       var1 = 5;
                                    } else if (this.s == 174) {
                                       var4 = this;
                                       var1 = 10;
                                    } else {
                                       var4 = this;
                                       var1 = this.y ? 10 : 2;
                                    }
                                 } else {
                                    var4 = this;
                                    var1 = 3;
                                 }
                              } else {
                                 var4 = this;
                                 var1 = 6;
                              }
                           } else {
                              var4 = this;
                              var1 = 4;
                           }
                        } else {
                           var4 = this;
                           var1 = 7;
                        }
                     } else {
                        var4 = this;
                        var1 = 6;
                     }

                     var4.ae = var1;
                     if (this.f > GameScr.p * 24 || this.e < GameScr.m * 24 || this.e > GameScr.o * 24) {
                        this.ag = 0;
                        this.ah = 0;
                        this.e = this.f = 0;
                        this.c = this.b().f;
                        this.h = 0;
                        if (this.s < 168) {
                           this.ae = 0;
                        } else {
                           var2 = GameCanvas.gameTick;
                           var3 = GameCanvas.gameTick % bb[this.s - 168].length;
                           this.ae = bb[this.s - 168][var3];
                        }

                        this.aj = 0;
                        return;
                     }

                     if (this.ai == 0 && (TileMap.a(this.e, this.f) & 2) == 2) {
                        this.ag = this.ag > 4 ? -4 : -this.ag;
                        this.ai = 16;
                     }

                     if (this.ai > 0) {
                        --this.ai;
                     }
                  } else if (System.currentTimeMillis() - this.ao > 1200L) {
                     this.h = 0;
                  }
                  break;
               case 2:
                  this.aj = 0;
                  switch (b[this.s].c) {
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                        if (this.s != 209 && this.s != 210) {
                           if (this.s != 173 && this.s != 175 && this.s != 176 && this.s != 177 && this.s != 179 && this.s != 180 && this.s != 181 && this.s != 183 && this.s != 184 && this.s != 185) {
                              if (this.s != 168 && this.s != 179) {
                                 if (this.s == 174) {
                                    this.ae = 4;
                                 } else {
                                    this.ae = 0;
                                 }
                              } else {
                                 this.ae = 6;
                              }
                           } else {
                              this.ae = 1;
                           }
                        } else {
                           this.ae = 1;
                        }

                        ++this.ag;
                        if (this.ag > 10 + this.m % 10 && System.currentTimeMillis() - (this.at + ar) >= 0L) {
                           this.h = 5;
                        }

                        if (this.y) {
                           this.ae = GameCanvas.gameTick % 101 > 1 ? 0 : 1;
                        }
                        break label961;
                     case 4:
                     case 5:
                        if (!this.y) {
                           if (this.s < 168) {
                              this.ae = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                           } else {
                              this.ae = this.c(GameCanvas.gameTick);
                           }
                        } else {
                           this.ae = b[this.s].k[this.ap];
                        }

                        ++this.ag;
                        if (this.ag > this.m % 3) {
                           this.h = 5;
                        }
                     default:
                        break label961;
                  }
               case 3:
                  if (this.au == null && this.av == null) {
                     if (this.aw < 0) {
                        if (this.s != 209 && this.s != 210) {
                           if (this.s != 176 && this.s != 177 && this.s != 179) {
                              if (this.s == 175) {
                                 var4 = this;
                                 var1 = 7;
                              } else if (this.s != 180 && this.s != 181 && this.s != 183 && this.s != 184 && this.s != 173 && this.s != 188 && this.s != 192 && this.s != 194 && this.s != 202) {
                                 if (this.s == 193) {
                                    var4 = this;
                                    var1 = 4;
                                 } else if (this.s != 187 && this.s != 168 && this.s != 175 && this.s != 176 && this.s != 179 && this.s != 174) {
                                    var4 = this;
                                    var1 = GameCanvas.gameTick % 4 > 1 ? (b[this.s].c == 5 ? 3 : 0) : 1;
                                 } else {
                                    var4 = this;
                                    var1 = this.d(GameCanvas.gameTick);
                                 }
                              } else {
                                 var4 = this;
                                 var1 = 3;
                              }
                           } else {
                              var4 = this;
                              var1 = 6;
                           }
                        } else {
                           var4 = this;
                           var1 = 6;
                        }

                        var4.ae = var1;
                        if (this.ag == 0) {
                           var2 = 0;
                           var3 = 0;
                           if (this.an == 0) {
                              var2 = this.al.cx;
                              var3 = this.al.cy;
                           } else if (this.an == 1) {
                              var2 = this.am.a;
                              var3 = this.am.b;
                           }

                           if (Class_fa.e(var2 - this.e) < 24 || Class_fa.e(var2 - this.e) < 5 || b[this.s].c == 0) {
                              if (this.s != 168 && this.s != 176 && this.s != 177 && this.s != 179) {
                                 if (this.s == 175) {
                                    var4 = this;
                                    var1 = 7;
                                 } else {
                                    label1061: {
                                       if (this.s != 180 && this.s != 181 && this.s != 183 && this.s != 184 && this.s != 173 && this.s != 202) {
                                          if (this.s == 187 || this.s == 168 || this.s == 179 || this.s == 174) {
                                             var4 = this;
                                             var1 = this.d(GameCanvas.gameTick);
                                             break label1061;
                                          }

                                          var4 = this;
                                          if (b[this.s].h.length == 3) {
                                             var1 = 0;
                                             break label1061;
                                          }
                                       } else {
                                          var4 = this;
                                       }

                                       var1 = 3;
                                    }
                                 }
                              } else {
                                 var4 = this;
                                 var1 = 6;
                              }

                              var4.ae = var1;
                           }

                           if (this.y && (Class_fa.e(var2 - this.e) < 48 || Class_fa.e(var2 - this.e) < 10 || b[this.s].c == 0)) {
                              this.ae = b[this.s].h.length == 3 ? 0 : 3;
                           }

                           if (this.y) {
                              ++this.ap;
                              if (Class_fa.e(var2 - this.e) >= 48 && Class_fa.e(var3 - this.f) >= 10) {
                                 if (this.ap >= b[this.s].l[1].length) {
                                    this.ap = 0;
                                 }

                                 this.ae = b[this.s].l[1][this.ap];
                              } else {
                                 if (this.ap >= b[this.s].l[0].length) {
                                    this.ap = 0;
                                 }

                                 this.ae = b[this.s].l[0][this.ap];
                              }
                           }

                           if (this.ae == 3 || this.ae == 6 || this.ae == 7) {
                              this.ag = 1;
                           }

                           if (b[this.s].c != 0 && !this.o && this.q && this.r) {
                              this.e += (var2 - this.e) / 3;
                           }

                           if (this.e > this.i + b[this.s].a) {
                              this.ag = 1;
                           }

                           if (this.e < this.i - b[this.s].a) {
                              this.ag = 1;
                           }

                           if ((b[this.s].c == 4 || b[this.s].c == 5) && !this.o) {
                              this.f += (var3 - this.f) / 20;
                           }

                           ++this.ah;
                           if (this.y && Class_fa.e(var2 - this.e) < 48 && Class_fa.e(var3 - this.f) < 15 || Class_fa.e(var2 - this.e) < 12 && Class_fa.e(var3 - this.f) < 12 || this.ah > 12 || this.ag == 1 || b != null && b[this.s].l != null && this.ap == b[this.s].l[0].length - 2 && (this.b().e == 166 || this.b().e == 167)) {
                              label1062: {
                                 this.ag = 1;
                                 if (this.an == 0) {
                                    if (this.y && Class_fa.e(var2 - this.e) < 48 && Class_fa.e(var3 - this.f) < 15) {
                                       this.al.a(this.t, this.u, this.y, this.b().e);
                                       this.ab = false;
                                       if (this.b().e == 210) {
                                          if (this.al.cx > this.e) {
                                             Class_bj.a(142, this.e, this.f, 1);
                                          } else {
                                             Class_bj.a(142, this.e, this.f, 1, (byte)-1);
                                          }
                                          break label1062;
                                       }

                                       if (this.b().e == 209) {
                                          if (this.al.cx > this.e) {
                                             Class_bj.a(108, this.e, this.f, 1);
                                          } else {
                                             Class_bj.a(108, this.e, this.f, 1, (byte)-1);
                                          }
                                          break label1062;
                                       }

                                       if (this.b().e == 114) {
                                          Class_bj.a(79, this.al, 3);
                                          break label1062;
                                       }

                                       if (this.b().e == 115) {
                                          if (this.al == Char.getMyChar()) {
                                             GameScr.eq = 1;
                                          }

                                          GameScr.er = 0;
                                          Class_bj.a(81, this.al.cx, this.j + TileMap.size, 2);
                                          Class_bj.a(81, this.al.cx - 40, this.j + TileMap.size, 2);
                                          Class_bj.a(81, this.al.cx + 40, this.j + TileMap.size, 2);
                                          break label1062;
                                       }

                                       if (this.b().e == 116) {
                                          if (this.al == Char.getMyChar()) {
                                             GameScr.eq = 1;
                                             GameScr.er = 0;
                                          }

                                          if (this.al.cx > this.e) {
                                             Class_bj.a(86, this.e, this.f - this.l / 2 + 5, 1);
                                          } else {
                                             Class_bj.a(88, this.e, this.f - this.l / 2 + 5, 1);
                                          }

                                          Class_bj.a(87, this.al.cx, this.al.cy - this.al.bj / 2, 2);
                                          Class_bj.a(87, this.al.cx - 40, this.al.cy - this.al.bj / 2, 2);
                                          Class_bj.a(87, this.al.cx + 40, this.al.cy - this.al.bj / 2, 2);
                                          break label1062;
                                       }

                                       if (this.b().e == 138) {
                                          if (this.al.cx > this.e) {
                                             Class_bj.a(89, this.e + this.k / 2, this.f - this.l / 2 - 5, 1);
                                          } else {
                                             Class_bj.a(89, this.e - this.k / 2, this.f - this.l / 2 - 5, 1, (byte)-1);
                                          }

                                          Class_bj.a(90, this.al, 2);
                                          break label1062;
                                       }

                                       if (this.b().e == 139) {
                                          if (this.al == Char.getMyChar()) {
                                             GameScr.eq = 1;
                                             GameScr.er = 0;
                                          }

                                          Class_bj.a(91, this.al, 2);
                                          break label1062;
                                       }

                                       if (this.b().e != 140 && this.b().e != 161) {
                                          if (this.b().e != 141 && this.b().e != 162) {
                                             if (this.b().e != 144 && this.b().e != 163) {
                                                if (this.b().e == 160) {
                                                   if (this.al.cx > this.e) {
                                                      Class_bj.a(123, this.e + this.k / 2, this.f - 5, 1);
                                                   } else {
                                                      Class_bj.a(123, this.e - this.k / 2, this.f - 5, 1, (byte)-1);
                                                   }

                                                   Class_bj.a(91, this.al, 1);
                                                   break label1062;
                                                }

                                                if (this.b().e != 164 && this.b().e != 165) {
                                                   if (this.b().e == 167) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(125, this.e + this.k / 2, this.f, 1);
                                                      } else {
                                                         Class_bj.a(125, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                      }
                                                   } else if (this.b().e == 166) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(108, this.e + this.k / 2, this.f, 1);
                                                      } else {
                                                         Class_bj.a(108, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                      }
                                                   } else if (this.b().e == 198) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(143, this.e + this.k / 2, this.f, 1);
                                                      } else {
                                                         Class_bj.a(143, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                      }
                                                   } else if (this.b().e == 199) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(144, this.e + this.k / 2, this.f, 1);
                                                      } else {
                                                         Class_bj.a(144, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                      }
                                                   } else if (this.b().e == 200) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(142, this.e + this.k / 2, this.f, 1);
                                                      } else {
                                                         Class_bj.a(142, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                      }
                                                   } else if (this.b().e == 201) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(144, this.e + this.k / 2, this.f, 1);
                                                      } else {
                                                         Class_bj.a(144, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                      }
                                                   } else if (this.b().e == 203) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(159, this.e + this.k / 2, this.f, 1);
                                                         Class_bj.a(156, this.al.cx, this.al.cy, 1);
                                                      } else {
                                                         Class_bj.a(159, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                         Class_bj.a(156, this.al.cx, this.al.cy, -1);
                                                      }
                                                   } else if (this.b().e == 204) {
                                                      if (this.al.cx > this.e) {
                                                         Class_bj.a(159, this.e + this.k / 2, this.f, 1);
                                                         Class_bj.a(173, this.al.cx, this.al.cy, 1);
                                                      } else {
                                                         Class_bj.a(159, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                         Class_bj.a(173, this.al.cx, this.al.cy, -1);
                                                      }
                                                   }
                                                   break label1062;
                                                }

                                                if (this.al.cx > this.e) {
                                                   Class_bj.a(125, this.e + this.k / 2, this.f, 1);
                                                } else {
                                                   Class_bj.a(125, this.e - this.k / 2, this.f, 1, (byte)-1);
                                                }

                                                Class_bj.a(90, this.al, 1);
                                                break label1062;
                                             }

                                             if (this.al == Char.getMyChar()) {
                                                GameScr.eq = 1;
                                                GameScr.er = 0;
                                             }

                                             Class_bj.a(112, this.al, 2);
                                             Class_bj.a(109, this.al.cx - 40, this.al.cy - 40, 1);
                                             Class_bj.a(109, this.al.cx + 40, this.al.cy - 40, 1);
                                             Class_bj.a(109, this.al.cx - 20, this.al.cy, 2);
                                             Class_bj.a(109, this.al.cx + 20, this.al.cy, 2);
                                             break label1062;
                                          }

                                          if (this.al.cx > this.e) {
                                             Class_bj.a(108, this.e + this.k / 2, this.f, 1);
                                          } else {
                                             Class_bj.a(108, this.e - this.k / 2, this.f, 1, (byte)-1);
                                          }

                                          Class_bj.a(122, this.e, this.f, 1, (byte)this.g);
                                          Class_bj.a(91, this.al, 1);
                                          break label1062;
                                       }

                                       if (this.al == Char.getMyChar()) {
                                          GameScr.eq = 1;
                                          GameScr.er = 0;
                                       }

                                       Class_bj.a(112, this.al, 2);
                                       Class_bj.a(109, this.al.cx - 40, this.al.cy - 40, 1);
                                       Class_bj.a(109, this.al.cx + 40, this.al.cy - 40, 1);
                                       Class_bj.a(109, this.al.cx - 20, this.al.cy, 2);
                                       Class_bj.a(109, this.al.cx + 20, this.al.cy, 2);
                                       break label1062;
                                    }

                                    if (Class_fa.e(var2 - this.e) >= 24 || Class_fa.e(var3 - this.f) >= 15) {
                                       if (this.y) {
                                          if (this.b().e == 210) {
                                             if (this.al.cx > this.e) {
                                                Class_bj.a(178, this.al.cx, this.al.cy, 1);
                                             } else {
                                                Class_bj.a(178, this.al.cx, this.al.cy, 1, (byte)-1);
                                             }
                                          } else if (this.b().e == 209) {
                                             if (this.al.cx > this.e) {
                                                Class_bj.a(179, this.al.cx, this.al.cy, 1);
                                             } else {
                                                Class_bj.a(179, this.al.cx, this.al.cy, 1, (byte)-1);
                                             }
                                          } else if (this.b().e != 114 && this.b().e != 115) {
                                             if (this.b().e == 116) {
                                                Class_bj.a(84, this.al, 2);
                                                this.ab = false;
                                                this.al.a(this.t, this.u, this.y, this.b().e);
                                             } else if (this.b().e == 138) {
                                                if (this.al == Char.getMyChar()) {
                                                   GameScr.eq = 1;
                                                   GameScr.er = 0;
                                                }

                                                Class_bj.a(83, this.al, 2);
                                                this.ab = false;
                                                this.al.a(this.t, this.u, this.y, this.b().e);
                                             } else if (this.b().e == 139) {
                                                Class_bi.a(this.e + (this.g - 1) * 30, this.f - 30, this.y, this.w, this.b().e, this.t, this.u, this.al);
                                             } else if (this.b().e != 140 && this.b().e != 161) {
                                                if (this.b().e != 141 && this.b().e != 162) {
                                                   if (this.b().e != 144 && this.b().e != 163) {
                                                      if (this.b().e == 160) {
                                                         Class_bj.a(124, this.al, 2);
                                                         this.ab = false;
                                                         this.al.a(this.t, this.u, this.y, this.b().e);
                                                      } else if (this.b().e != 164 && this.b().e != 165) {
                                                         if (this.b().e == 167) {
                                                            Class_bj.a(112, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(112, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(112, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 166) {
                                                            Class_bj.a(92, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(92, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(92, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 198) {
                                                            Class_bj.a(142, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(142, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(142, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 199) {
                                                            Class_bj.a(143, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(143, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(143, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 200) {
                                                            Class_bj.a(144, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(144, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(144, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 201) {
                                                            Class_bj.a(108, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(108, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(108, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 203) {
                                                            Class_bj.a(149, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(149, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(149, this.al, 1);
                                                            Class_bj.a(156, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         } else if (this.b().e == 204) {
                                                            Class_bj.a(153, this.al.cx + 5, this.al.cy, 1);
                                                            Class_bj.a(153, this.al.cx - 5, this.al.cy, 1);
                                                            Class_bj.a(153, this.al, 1);
                                                            Class_bj.a(173, this.al, 1);
                                                            this.ab = false;
                                                            this.al.a(this.t, this.u, this.y, this.b().e);
                                                         }
                                                      } else {
                                                         Class_bj.a(126, this.al, 1);
                                                         this.ab = false;
                                                         this.al.a(this.t, this.u, this.y, this.b().e);
                                                      }
                                                   } else {
                                                      Class_bi.a(this.e + (this.g - 1) * 15, this.f - 20, this.y, this.w, this.b().e, this.t, this.u, this.al);
                                                   }
                                                } else {
                                                   if (this.al == Char.getMyChar()) {
                                                      GameScr.eq = 1;
                                                      GameScr.er = 0;
                                                   }

                                                   Class_bj.a(121, this.al, 1);
                                                   this.ab = false;
                                                   this.al.a(this.t, this.u, this.y, this.b().e);
                                                }
                                             } else {
                                                if (this.al == Char.getMyChar()) {
                                                   GameScr.eq = 1;
                                                   GameScr.er = 0;
                                                }

                                                Class_bj.a(110, this.al, 2);
                                                Class_bj.a(104, this.al.cx - 20, this.al.cy, 2);
                                                Class_bj.a(104, this.al.cx + 20, this.al.cy, 2);
                                                this.ab = false;
                                                this.al.a(this.t, this.u, this.y, this.b().e);
                                             }
                                          } else {
                                             Class_bi.a(this.e + (this.g - 1) * 15, this.f - 20, this.y, this.w, this.b().e, this.t, this.u, this.al);
                                          }
                                       } else {
                                          Class_bi.a(this.e - 5, this.f + this.g * 10, this.y, this.x, this.b().e, this.t, this.u, this.al);
                                       }

                                       this.ab = false;
                                       break label1062;
                                    }

                                    this.al.a(this.t, this.u, this.y, this.b().e);
                                 } else {
                                    if (this.an != 1) {
                                       break label1062;
                                    }

                                    if (Class_fa.e(var2 - this.e) < 24 && Class_fa.e(var3 - this.f) < 15) {
                                       this.am.d = true;
                                    } else if (this.y) {
                                       Class_bi.a(this.e - 5, this.f + this.g * 10 - 20, this.am);
                                    } else {
                                       Class_bi.a(this.e - 5, this.f + this.g * 10, this.am);
                                    }
                                 }

                                 this.ab = false;
                              }
                           }

                           this.g = this.e < var2 ? 1 : -1;
                        } else if (this.ag == 1) {
                           if (b[this.s].c != 0 && !this.o && !this.q && !this.r) {
                              this.e += (this.i - this.e) / 4;
                              this.f += (this.j - this.f) / 4;
                           }

                           if (Class_fa.e(this.i - this.e) < 5 && Class_fa.e(this.j - this.f) < 5) {
                              this.h = 2;
                              this.ag = 0;
                              this.ah = 0;
                           }
                        }
                     } else if (this.ag == 0) {
                        var2 = this.al.cx;
                        var3 = this.al.cy;
                        this.an = this.ax;
                        this.g = this.e >= var2 ? 0 : 1;
                        if (this.y) {
                           ++this.ap;
                           if (this.ap >= b[this.s].l[this.an].length) {
                              this.ap = 0;
                              this.h = 2;
                              this.au = null;
                              this.av = null;
                              this.ag = 0;
                              this.ah = 0;
                           }

                           if (this.ap == b[this.s].l[this.an].length - 1) {
                              if (this.ay == 0) {
                                 Class_bj.a(this.aw, var2, var3, 1, (byte)(this.g == 0 ? -1 : 1));
                              } else if (this.ay == 1 && this.aw >= 0) {
                                 Class_ba.a(this.aw, var2, var3, (byte)1, (short)-1, this.g == 0 ? -1 : 1);
                              }
                           }

                           this.ae = b[this.s].l[this.ax][this.ap];
                        } else {
                           Class_bj.a(this.aw, var2, var3, 1, (byte)(this.g == 0 ? -1 : 1));
                        }

                        if (b[this.s].c != 0 && !this.o && this.q && this.r) {
                           this.e += (var2 - this.e) / 3;
                        }

                        if (this.e > this.i + b[this.s].a) {
                           this.ag = 1;
                        }

                        if (this.e < this.i - b[this.s].a) {
                           this.ag = 1;
                        }
                     } else if (this.ag == 1) {
                        if (b[this.s].c != 0 && !this.o && !this.q && !this.r) {
                           this.e += (this.i - this.e) / 4;
                           this.f += (this.j - this.f) / 4;
                        }

                        if (Class_fa.e(this.i - this.e) < 5 && Class_fa.e(this.j - this.f) < 5) {
                           this.h = 2;
                           this.ap = 0;
                           this.ag = 0;
                           this.ah = 0;
                        }
                     }
                  } else {
                     this.k();
                  }
                  break;
               case 4:
                  this.aj = 0;
                  this.ae = 0;
                  ++this.ag;
                  if (this.ag > 40 + this.m % 5) {
                     this.f -= 2;
                     this.h = 5;
                     this.ag = 0;
                  }
                  break;
               case 5:
                  if (GameCanvas.gameTick % 4 == 0 && this.y) {
                     ++this.ap;
                     if (this.ap > b[this.s].k.length - 1) {
                        this.ap = 0;
                     }
                  }

                  this.aj = 0;
                  this.i();
                  break;
               case 6:
                  this.aj = 0;
                  ++this.ag;
                  this.f += this.ag;
                  if (this.f >= this.j) {
                     this.f = this.j;
                     this.ag = 0;
                     this.h = 5;
                  }
                  break;
               case 7:
                  this.h();
                  break;
               case 8:
                  this.ae = 0;
                  break;
               case 9:
                  var3 = GameCanvas.gameTick;
                  var3 = GameCanvas.gameTick % bc[this.s - 168].length;
                  this.ae = bc[this.s - 168][var3];
                  if (this.ae == 1) {
                     this.h = 8;
                  }
            }

            if (this.as && this.c <= 0) {
               GameScr.vMobAttack.removeElement(this);
            }

            this.a((byte)1, this.h);
         }
      }

   }
}
