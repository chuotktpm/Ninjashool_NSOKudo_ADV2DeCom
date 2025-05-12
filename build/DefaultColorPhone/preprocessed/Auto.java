public abstract class Auto {
   public boolean g;
   public int h;
   public int i;
   public boolean j;
   public int k;
   public int l;
   private int a;
   private int b;
   public int m;
   public long n;
   public long o;
   public Auto instance;
   public static boolean q;
   public static Skill selectSkill;
   public static Skill skill_1;
   public static Skill skill_2;
   public static Skill skill_3;
   public static Skill skill_4;
   public static Skill skill_5;
   public static boolean s;
   public static MyVector t = new MyVector();
   private static MyVector c = new MyVector();
   public static int u = 0;
   private static boolean d = false;
   private static long e = -1L;
   public static MyVector v = new MyVector();
   public static MyVector w = new MyVector();
   protected long x = 0L;
   protected long y = 0L;
   protected long z = 0L;
   protected boolean aa = false;
   private static MyVector f = new MyVector();
   private static long ab = 0L;

   public Auto() {
   }

   public static void a(Mob var0) {
      if (var0.y || var0.h != 0 && var0.w != 3 && var0.d != var0.b().f) {
         if (!var0.y && var0.w == 0) {
            if (var0.d == 10 * var0.b().f) {
               var0.w = 1;
            } else {
               if (var0.d != 100 * var0.b().f && var0.s != 89) {
                  return;
               }

               var0.w = 2;
            }
         }

         if (!t.contains(var0)) {
            t.addElement(var0);
         }
      }

   }

   public static void b(Mob var0) {
      t.removeElement(var0);
   }

   public static void g() {
      t.removeAllElements();
   }

   public static void b(Char var0) {
      if (var0 != Char.getMyChar()) {
         if (c.contains(var0)) {
            if (var0.cm != 3 && var0.da != Char.getMyChar().charID) {
               c.removeElement(var0);
               return;
            }
         } else if (var0.cm == 3 || var0.da == Char.getMyChar().charID) {
            c.addElement(var0);
            if (LockGame.b && Class_fa.e(Char.getMyChar().cx - var0.cx) <= 300 && Class_fa.e(Char.getMyChar().cy - var0.cy) <= 300) {
               LockGame.d();
            }
         }
      }

   }

   public static void h() {
      c.removeAllElements();
   }

   public void a() {
      (new Thread(new Class_gi())).start();
      this.h = -1;
      this.i = -1;
      this.j = false;
      this.instance = null;
      this.m = Char.getMyChar().yen;
      this.n = Char.getMyChar().k;
      this.o = System.currentTimeMillis();
      this.g = false;
      Code.r = -1;
      Code.v = 0;
      q = Char.getMyChar().isHuman;
      selectSkill = Char.getMyChar().bz;
      skill_1 = GameScr.arrSkill[0] != null && GameScr.arrSkill[0].template.id != selectSkill.template.id ? GameScr.arrSkill[0] : null;
      skill_2 = GameScr.arrSkill[1] != null && GameScr.arrSkill[1].template.id != selectSkill.template.id ? GameScr.arrSkill[1] : null;
      skill_3 = GameScr.arrSkill[2] != null && GameScr.arrSkill[2].template.id != selectSkill.template.id ? GameScr.arrSkill[2] : null;
      skill_4 = GameScr.arrSkill[3] != null && GameScr.arrSkill[3].template.id != selectSkill.template.id ? GameScr.arrSkill[3] : null;
      skill_5 = GameScr.arrSkill[4] != null && GameScr.arrSkill[4].template.id != selectSkill.template.id ? GameScr.arrSkill[4] : null;
      this.b();
   }

   protected void b() {
      s = false;
      Code.ab = System.currentTimeMillis();
   }

   protected static boolean c(Char var0) {
      return var0.cHP <= 0 || var0.r == 14 || var0.r == 5;
   }

   protected final boolean i() {
      return c(Char.getMyChar());
   }

   protected final void a(int var1, int var2, int var3, int var4) {
      if ((var1 < 139 || var1 > 148) && TileMap.mapID >= 139 && TileMap.mapID <= 148) {
         tuSat();
      } else {
         if (TileMap.e(var1) && Char.getMyChar().hieuChien > 0) {
            var1 = 23;
            var2 = u;
            var4 = -1;
            var3 = -1;
            if (Char.getMyChar().cm != 3) {
               this.aa = true;
               Service.getInstance().z(3);
            }
         }

         if (TileMap.mapID != var1) {
            if (!TileMap.k(var1)) {
               if (TileMap.e(var1)) {
                  NinjaUtil.sleep(2000L);
               }

               return;
            }

            NinjaUtil.sleep(100L);
         }

         if (var2 == -1) {
            if (Code.u) {
               int[] var10001 = Code.w;
               Code.v = 0;
               a(this.i = var10001[0]);
            } else {
               this.b(var2);
            }
         } else if (var2 >= 0) {
            a(var2);
         }

         if (var3 > 0 && var4 > 0) {
            if (this instanceof TuDanh || this instanceof Class_al) {
               Char.c(var3, var4);
               return;
            }

            this.c(b(var3, var4));
         }
      }

   }

   protected static void tuSat() {
      Char p = Char.getMyChar();
      if (!Char.hasItem(37) && !Char.hasItem(35)) {
         Npc var1;
         if ((var1 = GameScr.i(13)) != null && Math.abs(var1.cx - p.cx) <= 400 && Math.abs(var1.cy - p.cy) <= 400) {
            Char.c(var1.cx > 400 ? var1.cx - 400 : var1.cx + 400, var1.cy);
         }

         Service.getInstance().openUIZone();
      } else {
         Char.c(p.cx, TileMap.d);
      }

      long var3 = System.currentTimeMillis();

      while(p.cHP > 0 && System.currentTimeMillis() - var3 < 5000L) {
         NinjaUtil.sleep(100L);
      }

   }

   protected static void a(boolean var0) {
      Char var1 = Char.getMyChar();
      if (var0) {
         if (d) {
            if (System.currentTimeMillis() - e < 2000L) {
               return;
            }

            d = false;
         } else if (Char.em && GameScr.vParty.size() > 0) {
            for(int var3 = 0; var3 < GameScr.vParty.size(); ++var3) {
               Party var2;
               if ((var2 = (Party)GameScr.vParty.elementAt(var3)).a != var1.charID && var2.f != null && var2.f.cHP > 0 && var2.f.nClass.classId == 6) {
                  GameScr.chatPopup("Chờ hồi sinh!");
                  e = System.currentTimeMillis();
                  d = true;
                  return;
               }
            }
         }
      }

      t.removeAllElements();
      s = false;
      LockGame.a = true;
      if (Class_cn.c && Char.getMyChar().luong > 0) {
         Service.getInstance().l();
      } else {
         Service.getInstance().returnTownFromDead();
      }

      LockGame.a = false;
   }

   protected static void a(int var0) {
      if (TileMap.zoneID != var0) {
         Npc var1 = GameScr.i(13);
         int var2 = -1;
         if (var1 != null && var1.r != 15) {
            if (Math.abs(var1.cx - Char.getMyChar().cx) > 22 || Math.abs(var1.cy - Char.getMyChar().cy) > 22) {
               Char.c(var1.cx, var1.cy);
            }
         } else {
            if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
               return;
            }

            if ((var2 = Char.getIndexItemById(37)) < 0 && (var2 = Char.getIndexItemById(35)) < 0) {
               return;
            }
         }

         if (System.currentTimeMillis() - ab >= 7000L) {
            Service.getInstance().a(var0, var2);
            TileMap.g();
            ab = System.currentTimeMillis();
            NinjaUtil.sleep(100L);
         }
      }

   }

   protected final void b(int var1) {
      if (!this.g || Code.g == null || Char.getMyChar().charName.equals(Code.g)) {
         GameScr var2 = GameScr.getInstance();
         Npc var3 = GameScr.i(13);
         int var4 = -1;
         if (var3 != null && var3.r != 15) {
            if (Math.abs(var3.cx - Char.getMyChar().cx) > 22 || Math.abs(var3.cy - Char.getMyChar().cy) > 22) {
               Char.c(var3.cx, var3.cy);
            }
         } else {
            if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
               this.i = TileMap.zoneID;
               ab = System.currentTimeMillis();
               return;
            }

            if ((var4 = Char.getIndexItemById(37)) < 0 && (var4 = Char.getIndexItemById(35)) < 0) {
               this.i = TileMap.zoneID;
               ab = System.currentTimeMillis();
               return;
            }
         }

         if (System.currentTimeMillis() - ab >= 7000L) {
            Service.getInstance().openUIZone();
            LockGame.e();
            int var7 = -1;
            if (var1 < 0) {
               var1 = var2.zones.length - 1;
            } else if (var1 >= var2.zones.length) {
               var1 = 0;
            }

            if (this instanceof Class_ag) {
               var7 = (var1 / 5 + 1) * 5 % var2.zones.length;
            } else if (!Char.tickDanhQuaiThuong) {
               var7 = (var1 + 1) % var2.zones.length;
            } else {
               int var5 = -1;

               for(int var6 = (var1 + 1) % var2.zones.length; var6 != var1; var6 = (var6 + 1) % var2.zones.length) {
                  if (var5 == -1 || var2.zones[var6] < var5) {
                     var7 = var6;
                     var5 = var2.zones[var6];
                  }
               }
            }

            Service.getInstance().a(var7, var4);
            this.i = var7;
            TileMap.g();
            if (this.e()) {
               Service.getInstance().k("khu " + var7);
            }

            ab = System.currentTimeMillis();
            NinjaUtil.sleep(100L);
         }
      }

   }

   private static boolean a(Mob var0, int var1) {
      if (var0.s == 202 && var0.h == 8) {
         return false;
      } else {
         return var1 < 0 || var0.s == var1;
      }
   }

   private static boolean a(int var0, int var1) {
      return var1 < 0 || var0 == 0 && (var1 & 1) > 0 || var0 == 1 && (var1 & 2) > 0 || var0 == 2 && (var1 & 4) > 0 || var0 == 3 && (var1 & 8) > 0;
   }

   public final int a(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (this.j) {
         return -1;
      } else {
         int var5 = 0;
         if (var1) {
            var5 = 1;
         }

         if (var2) {
            var5 |= 2;
         }

         if (var3) {
            var5 |= 4;
         }

         return var5;
      }
   }

   protected static boolean a(Char var0, Char var1) {
      return var1.r != 14 && var1.r != 5 && var1.r != 15 && (var1.cm == 3 || var0.cm == 3 || var1.cm == 1 && var0.cm == 1 || var1.cm == 5 && var0.cm == 4 || var1.cm == 4 && var0.cm == 5 || var0.da >= 0 && var0.da == var1.charID || var0.cz >= 0 && var0.cz == var1.charID || var1.da >= 0 && var1.da == var0.charID);
   }

   protected final void c(Mob var1) {
      if (var1 != null) {
         int var2 = var1.i;
         int var3 = var1.j;
         Char var4 = Char.getMyChar();
         if (TileMap.mapID == 35) {
            if (var1.i == 1428 && var1.j == 528) {
               var2 = 1452;
               var3 = 552;
            } else if (var1.i == 1284 && var1.j == 528) {
               var2 = 1308;
               var3 = 552;
            } else if (var1.i == 1836 && var1.j == 648) {
               var2 = 1812;
               var3 = 672;
            }
         } else if (TileMap.mapID == 37) {
            if ((var1.i == 876 || var1.i == 900) && var1.j == 408) {
               var2 = 900;
               var3 = 432;
            } else if ((var1.i == 828 || var1.i == 852) && var1.j == 360) {
               var2 = 852;
               var3 = 384;
            } else if ((var1.i == 924 || var1.i == 876) && var1.j == 624) {
               var2 = 924;
               var3 = 648;
            } else if (var1.i == 732 && var1.j == 600 || var1.i == 756 && var1.j == 576) {
               var2 = 756;
               var3 = 600;
            }
         }

         if (Char.d(var2, var3)) {
            this.k = this.a;
            this.l = this.b;
            this.k = var4.cx;
            this.l = var4.cy;
            var4.mobFocus = var1;

            try {
               NinjaUtil.sleep(1L);
               return;
            } catch (Exception var6) {
               return;
            }
         }

         var4.mobFocus = null;
      }

   }

   protected static void d(Char var0) {
      if (var0 != null) {
         Char var1 = Char.getMyChar();
         Char.c(var0.cx, TileMap.d(var0.cx, var0.cy));
         var1.charFocus = var0;
         NinjaUtil.sleep(100L);
      }

   }

   public static void a(SkillPaint var0) {
      if (v.size() > 0 || w.size() > 0) {
         Class_cc[] var1 = new Class_cc[v.size() + w.size()];

         int var2;
         for(var2 = 0; var2 < v.size(); ++var2) {
            var1[var2] = new Class_cc();
            var1[var2].d = GameScr.efs[var0.a - 1];
            var1[var2].b = (Mob)v.elementAt(var2);
         }

         for(var2 = 0; var2 < w.size(); ++var2) {
            var1[var2 + v.size()] = new Class_cc();
            var1[var2 + v.size()].d = GameScr.efs[var0.a - 1];
            var1[var2 + v.size()].c = (Char)w.elementAt(var2);
         }

         if (var1.length > 1) {
            mResources var5 = new mResources();
            if (var1[0].b != null) {
               var5 = new mResources(var1[0].b.e, var1[0].b.f);
            } else if (var1[0].c != null) {
               var5 = new mResources(var1[0].c.cx, var1[0].c.cy);
            }

            MyVector var4 = new MyVector();

            for(int var3 = 1; var3 < var1.length; ++var3) {
               if (var1[var3].b != null) {
                  var4.addElement(new mResources(var1[var3].b.e, var1[var3].b.f));
               } else if (var1[var3].c != null) {
                  var4.addElement(new mResources(var1[var3].c.cx, var1[var3].c.cy));
               }

               if (var3 > 5) {
                  break;
               }
            }

            Class_bb.a(var4, var5, Char.getMyChar().w());
         }

         Char.getMyChar().gd = var1;
      }

   }

   private boolean e() {
      return this.g && GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).a == Char.getMyChar().charID;
   }

   protected final boolean k() {
      return this.g && GameScr.vParty.size() > 0 && ((Party)GameScr.vParty.firstElement()).a != Char.getMyChar().charID;
   }

   private void f() {
      if (Code.u) {
         a(this.i = Code.w[Code.v = (Code.v + 1) % Code.w.length]);
         if (this.e()) {
            Service.getInstance().k("khu " + this.i);
            return;
         }
      } else {
         this.b(TileMap.zoneID);
      }

   }

   private boolean a(int var1, int var2, int var3) {
      if (var1 >= 4) {
         return false;
      } else {
         for(int var4 = 0; var4 < t.size(); ++var4) {
            Mob var5;
            if ((var5 = (Mob)t.elementAt(var4)).w != 0 && var5.c > 0 && var5.h != 0) {
               boolean var10000;
               label71: {
                  if (var5.w == 3) {
                     if (this instanceof Class_ag || this instanceof TuDanh) {
                        var10000 = false;
                        break label71;
                     }
                  } else if ((!var5.y || (var1 & 6) == 6) && (var5.w != 1 || (var1 & 2) != 0) && (var5.w != 2 || (var1 & 4) != 0)) {
                     var10000 = false;
                     break label71;
                  }

                  var10000 = true;
               }

               if (var10000 && Class_fa.e(var2 - var5.i) <= 90 && Class_fa.e(var3 - var5.j) <= 90) {
                  return true;
               }
            } else {
               t.removeElement(var5);
               var4 += 255;
            }
         }

         return false;
      }
   }

   private boolean d(int var1, int var2) {
      if (Char.en && !(this instanceof Class_ag)) {
         for(int var3 = 0; var3 < c.size(); ++var3) {
            Char var4;
            if (!c(var4 = (Char)c.elementAt(var3)) && Class_fa.e(var1 - var4.cx) <= 300 && Class_fa.e(var2 - var4.cy) <= 300) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected static Mob b(int var0, int var1) {
      Mob var2 = null;
      Char var3 = Char.getMyChar();
      int var4 = var0 - var3.d() - 10;
      int var5 = var0 + var3.d() + 10;
      int var6 = var1 - var3.e() - (var3.nClass.classId != 0 && var3.nClass.classId != 1 && var3.nClass.classId != 3 && var3.nClass.classId != 5 && var3.nClass.classId != 7 ? 0 : 40);
      int var12;
      if ((var12 = var1 + var3.e()) > var1 + 30) {
         var12 = var1 + 30;
      }

      int var7 = -1;

      for(int var8 = 0; var8 < GameScr.vMobAttack.size(); ++var8) {
         Mob var9 = (Mob)GameScr.vMobAttack.elementAt(var8);
         int var10 = Math.abs(var0 - var9.e);
         int var11 = Math.abs(var1 - var9.f);
         var10 = var10 > var11 ? var10 : var11;
         if (var4 <= var9.e && var9.e <= var5 && var6 <= var9.f && var9.f <= var12 && var9.h != 0 && var9.h != 1 && (var7 == -1 || var10 < var7)) {
            var2 = var9;
            var7 = var10;
         }
      }

      return var2;
   }

   protected final void a(int var1, boolean var2) {
      if (Code.r < 0 || Code.r >= Code.s.size()) {
         Code.r = 0;
      }

      while(true) {
         int var3 = ((Integer)Code.s.elementAt(Code.r)).intValue();
         int var4 = ((Integer)Code.t.elementAt(Code.r)).intValue();
         Mob var5 = b(var3, var4);
         if (!this.a(var1, var3, var4) && !this.d(var3, var4) && var5 != null && !this.a(var1, var5.e, var5.f)) {
            this.a = Char.getMyChar().cx;
            this.b = Char.getMyChar().cy;
            Char.c(var3, var4);
            Char.getMyChar().mobFocus = var5;
            Service.getInstance().b(var5.m);
            NinjaUtil.sleep(100L);
            return;
         }

         if (++Code.r == Code.s.size()) {
            Code.r = 0;
            if (Char.tickChuyenMapHetBoss && var2) {
               this.f();
            }
         }
      }
   }

   protected Mob a(Char var1, int var2, int var3, Char var4, boolean var5) {
      if (Code.q && Code.s.size() > 0) {
         this.a(var3, var5);
         return b(var1.cx, var1.cy);
      } else {
         Char var7 = var4;
         int var6 = var3;
         int var25 = var2;
         var3 = var1.cy;
         var2 = var1.cx;
         Auto var22 = this;
         int var8 = -1;
         int var9 = -1;
         int var10 = -1;
         Mob var11 = null;
         MyVector var12 = GameScr.vMobAttack;
         int var13 = 0;

         Mob var10000;
         int var19;
         while(true) {
            if (var13 >= var12.size()) {
               var10000 = var11;
               break;
            }

            Mob var14;
            if ((var14 = (Mob)var12.elementAt(var13)) != null && var14.c > 0 && var14.h != 0 && var14.h != 1 && a(var14, var25) && a(var14.w, var6) && (var7 == null || var7.charID == Char.getMyChar().charID || Class_fa.a(var14.i, var14.j, var7.cx, var7.cy) <= 1000) && !var22.a(var6, var14.e, var14.f) && !var22.d(var14.e, var14.f)) {
               if (var22.j) {
                  if (var22.h == 157 || var22.h == 158 || var22.h == 159) {
                     var10000 = var14;
                     break;
                  }

                  if (var8 == -1 || var14.w < var10 || var14.j < var8 || var14.j == var8 && var14.i < var9) {
                     var10 = var14.w;
                     var8 = var14.j;
                     var9 = var14.i;
                     var11 = var14;
                  }
               } else if (Code.m == -1 || Class_fa.a(Code.n, Code.o, var14.i, var14.j) <= Code.m) {
                  var19 = var6;
                  int var18 = var25;
                  MyVector var17 = var12;
                  Mob var16 = var14;
                  int var15 = 0;

                  int var26;
                  for(var26 = 0; var26 < var17.size(); ++var26) {
                     Mob var21;
                     if ((var21 = (Mob)var17.elementAt(var26)) != null && var21.c > 0 && var21.h != 0 && var21.h != 1 && a(var16, var18) && a(var16.w, var19) && Class_fa.e(var21.e - var16.e) <= 100 && Class_fa.e(var21.f - var16.f) <= 50) {
                        ++var15;
                     }
                  }

                  if (var15 > selectSkill.maxFight) {
                     var15 = selectSkill.maxFight;
                  }

                  var15 = var16.w << 4 | var15 & 15;
                  var26 = var7 != null && var7.charID != Char.getMyChar().charID ? Class_fa.a(var7.cx, var7.cy, var14.i, var14.j) : Class_fa.a(var2, var3, var14.i, var14.j);
                  if (var15 > var10 || var15 == var10 && var26 < var8) {
                     var10 = var15;
                     var8 = var26;
                     var11 = var14;
                  }
               }
            }

            ++var13;
         }

         if (var10000 != null) {
            this.c(var10000);
            return var10000;
         } else {
            if (System.currentTimeMillis() - this.x > 1000L && !this.d()) {
               if (this.j) {
                  if ((var19 = TileMap.h(TileMap.mapID)) >= 0) {
                     this.h = var19;
                  }

                  this.k = this.l = -1;
                  NinjaUtil.sleep(500L);
               } else if (var5 && Char.tickChuyenMapHetBoss) {
                  this.f();
               }
            }

            return null;
         }
      }
   }

   protected final Char a(Char var1, int var2) {
      for(int var3 = 0; var3 < GameScr.vCharInMap.size(); ++var3) {
         Char var4;
         if ((var4 = (Char)GameScr.vCharInMap.elementAt(var3)) != null && !c(var4) && !this.a(var2, var4.cx, var4.cy) && !this.d(var4.cx, var4.cy) && !Code.d(var4.charName) && Class_ao.c(var4.charName) && (var4.cm == 1 || var4.da == var1.charID || var1.hieuChien < 15)) {
            return var4;
         }
      }

      return null;
   }

   protected final Char e(Char var1) {
      Char var10000 = var1;
      int var3 = var1.cy;
      int var2 = var1.cx;
      var1 = null;
      Char var4 = Char.getMyChar();
      int var5 = var2 - var4.d() - 10;
      int var6 = var2 + var4.d() + 10;
      int var7 = var3 - var4.e() - (var4.nClass.classId != 0 && var4.nClass.classId != 1 && var4.nClass.classId != 3 && var4.nClass.classId != 5 && var4.nClass.classId != 7 ? 0 : 40);
      int var8 = var3 + var4.e() + (var4.nClass.classId != 0 && var4.nClass.classId != 1 && var4.nClass.classId != 3 && var4.nClass.classId != 5 && var4.nClass.classId != 7 ? 0 : 40);
      int var9 = -1;

      for(int var10 = 0; var10 < GameScr.vCharInMap.size(); ++var10) {
         Char var11 = (Char)GameScr.vCharInMap.elementAt(var10);
         int var12 = Math.abs(var2 - var11.cx);
         int var13 = Math.abs(var3 - var11.cy);
         var12 = var12 > var13 ? var12 : var13;
         if (var11 != null && var5 <= var11.cx && var11.cx <= var6 && var7 <= var11.cy && var11.cy <= var8 && !c(var11) && a(var4, var11) && !Code.d(var11.charName) && (var9 == -1 || var12 < var9)) {
            var1 = var11;
            var9 = var12;
         }
      }

      return var10000.charFocus = var1;
   }

   protected final void c(int var1, int var2) {
      Char var3 = Char.getMyChar();
      if (!m()) {
         Char var4 = this.g && GameScr.vParty.size() > 0 ? ((Party)GameScr.vParty.firstElement()).f : null;
         boolean var5 = !this.g || Code.g == null || var3.charName.equals(Code.g) && LockGame.ae();
         Mob var6 = var3.mobFocus;
         Char var7 = var3.charFocus;
         if (Code.an && (var7 == null || Code.d(var7.charName) || !Class_ao.c(var7.charName) && !a(var3, var7)) && (var7 = this.a(var3, var2)) == null) {
            var7 = this.e(var3);
         }

         boolean var8 = var7 != null && Class_ao.c(var7.charName);
         if (var7 == null && this.aa) {
            Service.getInstance().z(0);
            this.aa = false;
         }

         if (Code.an && var3.hieuChien >= 5 && System.currentTimeMillis() - this.z > 5000L) {
            Item var9;
            if ((var9 = Char.g(257)) != null && var9.template.id == 257) {
               Service.getInstance().useItem(var9.indexUI);
            }

            this.z = System.currentTimeMillis();
         }

         if (Code.q && Code.s.size() > 0 && Code.r < 0) {
            this.a(var2, var5);
         } else {
            boolean var18 = false;
            if (this.a(var2, var3.cx, var3.cy) || this.d(var3.cx, var3.cy) || var6 != null && this.a(var2, var6.e, var6.f)) {
               GameScr.chatPopup("Né");
               boolean var10000;
               if (Char.tickChuyenMapHetBoss && var5) {
                  this.f();
                  var10000 = true;
               } else {
                  var10000 = false;
               }

               if (var10000) {
                  return;
               }

               var18 = true;
               var6 = null;
            }

            if (var6 == null || var6.h == 0 || !a(var6, var1) || !a(var6.w, var2) || System.currentTimeMillis() - this.x > 5000L) {
               var6 = this.a(var3, var1, var2, var4, var5);
            }

            if (var6 == null && var18 && this.a > 0 && this.b > 0) {
               Char.c(this.a, this.b);
            }

            int var20;
            Char var11;
            if (Char.em && GameScr.vParty.size() > 0 && var3.nClass.classId == 6 && var3.cHP > 0) {
               for(int var13 = 0; var13 < var3.bx.size(); ++var13) {
                  Skill var15;
                  if ((var15 = (Skill)var3.bx.elementAt(var13)) != null && var15.template.type == 4) {
                     if (!var15.isCooldown()) {
                        for(var20 = 0; var20 < GameScr.vParty.size(); ++var20) {
                           Party var10;
                           if ((var10 = (Party)GameScr.vParty.elementAt(var20)).a != var3.charID && var10.f != null && var10.f.cHP <= 0) {
                              var11 = var10.f;
                              if (Math.abs(var3.cx - var11.cx) > 50 || Math.abs(var3.cy - var11.cy) > 50) {
                                 Char.c(var11.cx, var11.cy);
                              }

                              NinjaUtil.sleep(500L);
                              Service.getInstance().buffLive(var10.a);
                              var15.lastTimeUseThisSkill = System.currentTimeMillis();
                              var15.paintCanNotUseSkill = true;
                              var3.b(GameScr.skillPaints[var15.template.id], 0);
                              NinjaUtil.sleep(1000L);
                              return;
                           }
                        }
                     }
                     break;
                  }
               }
            }

            if (Char.tickSanTATL && !this.j && (var6 == null || var6.w == 0 && (var2 & 6) != 0)) {
               boolean var14 = (var2 & 2) != 0;
               var5 = (var2 & 4) != 0;

               for(var20 = 0; var20 < t.size(); ++var20) {
                  Mob var19;
                  if ((var19 = (Mob)t.elementAt(var20)).c > 0 && var19.h != 0 && var19.h != 1 && !this.a(var2, var19.e, var19.f) && !this.d(var19.e, var19.f) && a(var19, var1) && (var14 && var19.w == 1 || var5 && var19.w == 2)) {
                     var6 = var19;
                     this.c(var19);
                     break;
                  }
               }
            }

            if (selectSkill != null) {
               Skill currentSkill;
               int var17;
               int var21;
               if (skill_1 != null && !skill_1.isCooldown()) {
                  currentSkill = skill_1;
               } else if (skill_2 != null && !skill_2.isCooldown()) {
                  currentSkill = skill_2;
               } else if (skill_3 != null && !skill_3.isCooldown()) {
                  currentSkill = skill_3;
               } else if (skill_4 != null && !skill_4.isCooldown()) {
                  currentSkill = skill_4;
               } else if (skill_5 != null && !skill_5.isCooldown()) {
                  currentSkill = skill_5;
               } else if ((currentSkill = selectSkill).isCooldown() && (Char.isABuff || this instanceof As20)) {
                  label811: {
                     var17 = 0;

                     Skill var23;
                     label597:
                     while(true) {
                        if (var17 >= var3.bx.size()) {
                           break label811;
                        }

                        if ((var23 = (Skill)var3.bx.elementAt(var17)) != null && System.currentTimeMillis() - var23.lastTimeUseThisSkill >= (long)var23.coolDown - 300L) {
                           if (var23.template.type == 2) {
                              if ((var3.d == null && Char.dk || var23.template.id < 67 || var23.template.id > 72) && (Char.dl || var23.template.id != 31) && (var23.template.id != 15 || !Char.dm || var3.cHP < var3.cMaxHP * Char.es / 100 && var3.isHuman) && (var23.template.id != 6 || var3.isHuman)) {
                                 var21 = (int)(System.currentTimeMillis() / 1000L);
                                 int var22 = 0;

                                 while(true) {
                                    if (var22 >= var3.by.size()) {
                                       break label597;
                                    }

                                    Class_cq var12;
                                    if ((var12 = (Class_cq)var3.by.elementAt(var22)) != null && (var12.e.c == var23.template.iconId || var23.template.id == 58 && var12.e.b == 7) && var12.c - (var21 - var12.b) >= 2) {
                                       break;
                                    }

                                    ++var22;
                                 }
                              }
                           } else if (var23.template.type == 3 && var6 != null && var6.w == 0 && var6.c > var6.d / 2) {
                              if (var23.template.id != 4 || Char.dm && var3.cHP < var3.cMaxHP * Char.es / 100) {
                                 break;
                              }
                           } else if ((var23.template.id == 7 || var23.template.id == 16 || var23.template.id == 25 || var23.template.id == 34 || var23.template.id == 43) && var6 != null && (var6.w != 0 || var6.c >= var6.d / 2) && (var23.template.id != 7 && var23.template.id != 16 || !var6.p) && (var23.template.id != 25 && var23.template.id != 34 || var6.q) && (var23.template.id != 43 || var6.r)) {
                              break;
                           }
                        }

                        ++var17;
                     }

                     currentSkill = var23;
                     NinjaUtil.sleep(500L);
                  }
               }

               Service.getInstance().g(currentSkill.template.id);
               if (currentSkill.template.type == 2) {
                  Service.getInstance().r();
               } else {
                  Mob var24;
                  if (Code.an && var7 != null && !c(var7) && (var8 || a(var3, var7))) {
                     if (var8) {
                        if ((currentSkill.template.type == 1 || currentSkill.template.type == 3) && (Class_fa.e(var3.cx - var7.cx) > currentSkill.dx + 30 || Class_fa.e(var3.cy - var7.cy) > currentSkill.dy + 30) && System.currentTimeMillis() - this.y > 1500L) {
                           d(var7);
                           this.y = System.currentTimeMillis();
                        }

                        if (var7.da != var3.charID && var7.cm != 3) {
                           this.aa = true;
                           Service.getInstance().z(3);
                        }
                     }

                     var17 = currentSkill.dx;
                     var20 = currentSkill.dy;
                     v.removeAllElements();
                     w.removeAllElements();
                     w.addElement(var7);

                     for(var21 = 0; var21 < GameScr.vCharInMap.size() && v.size() + w.size() < currentSkill.maxFight; ++var21) {
                        if ((var11 = (Char)GameScr.vCharInMap.elementAt(var21)).cHP > 0 && var11.r != 14 && var11.r != 5 && var11.r != 15 && !var11.equals(var7) && (var11.cm == 3 || var3.cm == 3 || var11.cm == 1 && var3.cm == 1 || var3.da >= 0 && var3.da == var11.charID || var3.cz >= 0 && var3.cz == var11.charID || var11.da == var3.charID) && !Code.d(var11.charName) && var7.cx - var17 <= var11.cx && var11.cx <= var7.cx + var17 && var7.cy - var20 <= var11.cy && var11.cy <= var7.cy + var20) {
                           w.addElement(var11);
                        }
                     }

                     for(var21 = 0; var21 < GameScr.vMobAttack.size() && v.size() + w.size() < currentSkill.maxFight; ++var21) {
                        if ((var24 = (Mob)GameScr.vMobAttack.elementAt(var21)).h != 0 && var24.h != 1 && var7.cx - var17 <= var24.e && var24.e <= var7.cx + var17 && var7.cy - var20 <= var24.f && var24.f <= var7.cy + var20 && a(var24.w, var2) && (var1 == -1 || var24.s == var1)) {
                           v.addElement(var24);
                        }
                     }

                     Service.getInstance().a(v, w, 2);
                  } else {
                     if (var6 == null || var1 != -1 && var6.s != var1 || !a(var6.w, var2)) {
                        return;
                     }

                     if ((currentSkill.template.type == 1 || currentSkill.template.type == 3) && (Class_fa.e(var3.cx - var6.i) > currentSkill.dx + 30 || Class_fa.e(var3.cy - var6.j) > currentSkill.dy + 30)) {
                        var3.mobFocus = null;
                        return;
                     }

                     var17 = currentSkill.dx;
                     var20 = currentSkill.dy;
                     v.removeAllElements();
                     w.removeAllElements();
                     v.addElement(var6);

                     for(var21 = 0; var21 < GameScr.vMobAttack.size() && v.size() + w.size() < currentSkill.maxFight; ++var21) {
                        if ((var24 = (Mob)GameScr.vMobAttack.elementAt(var21)).h != 0 && var24.h != 1 && !var24.equals(var6) && var6.i - 100 <= var24.i && var24.i <= var6.i + 100 && var6.j - 50 <= var24.j && var24.j <= var6.j + 50 && a(var24.w, var2) && (var1 == -1 || var24.s == var1)) {
                           v.addElement(var24);
                        }
                     }

                     for(var21 = 0; var21 < GameScr.vCharInMap.size() && v.size() + w.size() < currentSkill.maxFight; ++var21) {
                        if ((var11 = (Char)GameScr.vCharInMap.elementAt(var21)).cHP > 0 && var11.r != 14 && var11.r != 5 && var11.r != 15 && (var11.cm == 3 || var3.cm == 3 || var11.cm == 1 && var3.cm == 1 || var3.da >= 0 && var3.da == var11.charID || var3.cz >= 0 && var3.cz == var11.charID || var11.da == var3.charID) && !Code.d(var11.charName) && var6.e - var17 <= var11.cx && var11.cx <= var6.e + var17 && var6.f - var20 <= var11.cy && var11.cy <= var6.f + var20) {
                           w.addElement(var11);
                        }
                     }

                     Service.getInstance().a(v, w, 1);
                  }
               }

               if (System.currentTimeMillis() - currentSkill.lastTimeUseThisSkill >= (long)(currentSkill.coolDown - 100)) {
                  currentSkill.lastTimeUseThisSkill = System.currentTimeMillis();
                  currentSkill.paintCanNotUseSkill = true;
                  if (!Code.ae) {
                     var3.b(GameScr.skillPaints[currentSkill.template.id], 0);
                  }
               }

               this.x = System.currentTimeMillis();
               if (currentSkill.template.id == 15) {
                  NinjaUtil.sleep(2000L);
               }
            }
         }
      }

   }

   protected boolean d() {
      if (!(this instanceof Class_ag) && !Code.p) {
         Char var1 = Char.getMyChar();
         int var2 = Code.l < 0 ? -1 : Code.l;

         for(int var3 = 0; var3 < GameScr.af.size(); ++var3) {
            ItemMap var4;
            if (!(var4 = (ItemMap)GameScr.af.elementAt(var3)).k && (var1.nClass.classId == 1 && var4.h.id == 218 || var4.h.type == 19 || Code.isItemCanPickUp(var4.h) && (Char.countNullSlot() > 2 || var4.h.isUpToUp && Char.hasItem(var4.h.id))) && (var2 < 0 || Class_fa.a(var1.cx, var1.cy, var4.c, var4.d) < var2) && !this.d(var4.a, var4.b)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected final void c(int var1) {
      if (!Code.p) {
         Char var2 = Char.getMyChar();
         if (!m()) {
            f.removeAllElements();
            int var3 = this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false);

            int var4;
            for(var4 = 0; var4 < GameScr.af.size(); ++var4) {
               ItemMap var5;
               if (!(var5 = (ItemMap)GameScr.af.elementAt(var4)).k && (var2.nClass.classId == 1 && var5.h.id == 218 || (Code.isItemCanPickUp(var5.h) || var5.h.id == var1) && (Char.countNullSlot() > 2 || var5.h.type == 19 || var5.h.isUpToUp && Char.hasItem(var5.h.id))) && !this.a(var3, var5.c, var5.d) && !this.d(var5.c, var5.d) && (Code.l < 0 || Class_fa.a(var2.cx, var2.cy, var5.c, var5.d) < Code.l)) {
                  f.addElement(var5);
               }
            }

            if (f.size() > 0) {
               var4 = var2.cx;
               int var9 = var2.cy;
               Mob var8 = var2.mobFocus;

               label58:
               for(var3 = 0; var3 < f.size(); ++var3) {
                  ItemMap var6;
                  Char.c((var6 = (ItemMap)f.elementAt(var3)).c, TileMap.d(var6.c, var6.d));
                  var2.itemFocus = var6;

                  for(int var7 = 0; var7 < 4 && var6.status != 2 && !var6.k; ++var7) {
                     Service.getInstance().pickItem(var6.g);
                     if (LockGame.c()) {
                        break;
                     }

                     if (this.d(var2.cx, var2.cy) || var2.cHP <= 0) {
                        break label58;
                     }
                  }

                  var6.k = true;
                  var6.l = System.currentTimeMillis();
               }

               Char.c(var4, var9);
               var2.mobFocus = var8;
            }
         }
      }

   }

   protected final void l() {
      if (TileMap.mapID != 22) {
         this.a(22, -2, -1, -1);
      } else {
         Char var1 = Char.getMyChar();
         NinjaUtil.sleep(200L);

         for(int var2 = 0; var2 < var1.bx.size(); ++var2) {
            Skill var3;
            if ((var3 = (Skill)var1.bx.elementAt(var2)) != null && !var3.isCooldown() && var3.template.id >= 67 && var3.template.id <= 72 || var3.template.id == 97) {
               Service.getInstance().g(var3.template.id);
               Service.getInstance().r();
               LockGame.ab();
               break;
            }
         }

         GameScr.h(12);
         LockGame.ab();
         Service.getInstance().getTask(12, 3);
         LockGame.ab();
      }

   }

   protected static boolean m() {
      Char var0;
      if ((var0 = Char.getMyChar()).isHuman && var0.cHP < var0.cMaxHP) {
         for(int var1 = 0; var1 < var0.by.size(); ++var1) {
            Class_cq var2;
            if ((var2 = (Class_cq)var0.by.elementAt(var1)) != null && var2.e.b == 12) {
               return true;
            }
         }
      }

      return false;
   }

   protected abstract void c();

   public String toString() {
      return "";
   }

   public static void sleep(long var0) {
      try {
         NinjaUtil.sleep(var0);
      } catch (Exception var3) {
      }

   }
}
