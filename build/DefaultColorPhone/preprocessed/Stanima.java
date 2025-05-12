
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Calendar;

public final class Stanima extends Auto {
   private boolean ab;
   private boolean ac;
   private int ad;
   private boolean ae;
   public int a;
   private int af;
   private int ag;
   private boolean ah;
   private int ai;
   private long aj;
   public int b;
   private long ak;
   public static boolean c;
   public static boolean d;
   public static boolean e;
   public static boolean f;

   public Stanima() {
   }

   public final void a(int var1, int var2, int var3, boolean var4, boolean var5) {
      super.a();
      super.h = var2;
      super.i = var3;
      this.b = var1;
      this.ab = var4;
      this.ac = var5;
      this.a = 0;
      this.aj = 0L;
      this.ae = true;
      this.ad = -1;
      Calendar var6 = Class_fa.b();
      this.ai = var6.get(11) < 2 ? var6.get(5) - 1 : var6.get(5);
   }

   public final void a(String var1) {
      if (Code.g != null && !TileMap.e(super.h)) {
         if (var1.startsWith("Thần thú đã xuất hiện tại")) {
            Code var10000;
            if (Char.getMyChar().charName.equals(Code.g)) {
               int var2 = Char.getMyChar().cLevel;
               MyVector var3 = new MyVector();
               MyVector var4 = new MyVector();
               if (var2 >= 40 && var2 <= 60) {
                  if (var1.indexOf("Đảo Hebi") > 0) {
                     var3.addElement(new Integer(34));
                     var4.addElement(new Integer(32));
                  }

                  if (var1.indexOf("Hang Meiro") > 0) {
                     var3.addElement(new Integer(35));
                     var4.addElement(new Integer(32));
                  }

                  if (var1.indexOf("Rừng Kappa") > 0) {
                     var3.addElement(new Integer(52));
                     var4.addElement(new Integer(48));
                  }

                  if (var1.indexOf("Rừng Aokigahara") > 0) {
                     var3.addElement(new Integer(14));
                     var4.addElement(new Integer(10));
                  }

                  if (var1.indexOf("Vách núi Ito") > 0) {
                     var3.addElement(new Integer(15));
                     var4.addElement(new Integer(10));
                  }

                  if (var1.indexOf("Núi Anzen") > 0) {
                     var3.addElement(new Integer(68));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Thung lũng Taira") > 0) {
                     var3.addElement(new Integer(16));
                     var4.addElement(new Integer(10));
                  }
               }

               if (var2 >= 50 && var2 <= 70) {
                  if (var1.indexOf("Núi Ontake") > 0) {
                     var3.addElement(new Integer(67));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Đỉnh Okama") > 0) {
                     var3.addElement(new Integer(44));
                     var4.addElement(new Integer(43));
                  }
               }

               if (var2 >= 60 && var2 <= 80) {
                  if (var1.indexOf("Khu đá đỏ Akai") > 0) {
                     var3.addElement(new Integer(41));
                     var4.addElement(new Integer(43));
                  }

                  if (var1.indexOf("Mũi Hone") > 0) {
                     var3.addElement(new Integer(59));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Đỉnh Ichidai") > 0) {
                     var3.addElement(new Integer(24));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Hang núi Kurai") > 0) {
                     var3.addElement(new Integer(45));
                     var4.addElement(new Integer(43));
                  }
               }

               if (var2 >= 70 && var2 <= 100) {
                  if (var1.indexOf("Ngôi đền Orochi") > 0) {
                     var3.addElement(new Integer(19));
                     var4.addElement(new Integer(17));
                  }

                  if (var1.indexOf("Đồng Kisei") > 0) {
                     var3.addElement(new Integer(36));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Đền Harumoto") > 0) {
                     var3.addElement(new Integer(54));
                     var4.addElement(new Integer(43));
                  }
               }

               if (var2 >= 90) {
                  if (var1.indexOf("Sinh Tử Kiều") > 0) {
                     var3.addElement(new Integer(143));
                     var4.addElement(new Integer(this.ad));
                  }

                  if (var1.indexOf("Đoạn Sơn") > 0) {
                     var3.addElement(new Integer(141));
                     var4.addElement(new Integer(this.ad));
                  }
               }

               if (var3.size() > 0) {
                  var10000 = Code.a;
                  Code.a(new Class_an(var3, var4, this.ad));
                  return;
               }
            } else {
               var10000 = Code.a;
               Code.a(new Class_an(this.ad));
            }
         }

      }
   }

   public final void e() {
      if (this.a == 0) {
         this.ai = Class_fa.b().get(5);
         if (!TileMap.e(super.h)) {
            this.a = 2;
            this.ak = System.currentTimeMillis();
            this.af = super.h;
            this.ag = super.i;
            this.ah = super.g;
            this.ae = false;
            d = false;
            e = false;
            return;
         }
      } else {
         if (this.a == 1) {
            this.a = 3;
            this.ak = System.currentTimeMillis();
            this.ae = false;
            return;
         }

         if (this.a == 2) {
            this.a = 1;
            this.ak = System.currentTimeMillis();
            c = false;
            return;
         }

         if (this.a == 3) {
            this.a = 0;
            this.ae = false;
            Code.a.d();
            return;
         }

         if (this.a == 4) {
            this.a = 0;
            this.ae = false;
         }
      }

   }

   public final void b() {
      this.aj = 0L;
      super.b();
   }

   public final boolean f() {
      return Code.b instanceof Stanima && this.a == 2 && Char.getMyChar().cLevel >= 60 && Char.getMyChar().cLevel < 70;
   }

   public final void c() {
      if (super.i()) {
         Auto.a(true);
      } else {
         Calendar var1;
         int var2 = (var1 = Class_fa.b()).get(5);
         int var3 = var1.get(11);
         int var4 = var1.get(12);
         Code var17;
         switch (this.a) {
            case 0:
               if (!this.ae && this.ad > 0) {
                  if (TileMap.mapID != this.ad) {
                     this.a(this.ad, -2, -1, -1);
                     return;
                  }

                  GameScr.PickNpc(5, 1, 0);
                  if (LockGame.y()) {
                     this.ae = true;
                     super.h = this.af;
                     super.i = this.ag;
                     super.g = this.ah;
                     super.j = false;
                     return;
                  }

                  return;
               }

               if (this.ad < 0 && (TileMap.d(TileMap.mapID) || TileMap.f(TileMap.mapID))) {
                  this.ad = TileMap.mapID;
               }

               if (var2 == this.ai || var3 < 2 || var4 < 30) {
                  if (super.h != TileMap.mapID || !super.j && super.i != TileMap.zoneID) {
                     this.a(super.h, super.i, super.k, super.l);
                     return;
                  }

                  if (Char.tickLuyenDaMax && Code.h() && Char.countNullSlot() < 5 && !TileMap.e(TileMap.mapID)) {
                     Auto.tuSat();
                     return;
                  }

                  if (!this.ac && !this.ab) {
                     this.c(this.b, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                     this.c(-1);
                  } else {
                     Char var12 = Char.getMyChar();
                     Char var8 = GameScr.vParty.size() > 0 ? ((Party)GameScr.vParty.firstElement()).f : null;
                     Skill var15;
                     if (this.ac && GameScr.vParty.size() > 0 && var12.nClass.classId == 6) {
                        for(var3 = 0; var3 < var12.bx.size(); ++var3) {
                           if ((var15 = (Skill)var12.bx.elementAt(var3)) != null && var15.template.type == 4) {
                              if (!var15.isCooldown()) {
                                 for(var3 = 0; var3 < GameScr.vParty.size(); ++var3) {
                                    Party var5;
                                    if ((var5 = (Party)GameScr.vParty.elementAt(var3)).a != var12.charID && var5.f != null && var5.f.cHP <= 0) {
                                        try {
                                            var3 = var12.cx;
                                            int var9 = var12.cy;
                                            Char var6;
                                            Char.c((var6 = var5.f).cx, var6.cy);
                                            Service.getInstance().buffLive(var5.a);
                                            var15.lastTimeUseThisSkill = System.currentTimeMillis();
                                            var15.paintCanNotUseSkill = true;
                                            var12.b(GameScr.skillPaints[var15.template.id], 0);
                                            Thread.sleep(1000L);
                                            Char.c(var3, var9);
                                            return;
                                        } catch (InterruptedException ex) {
                                            
                                        }
                                    }
                                 }
                              }
                              break;
                           }
                        }
                     }

                     if (this.ab && this.k() && var8 != null && var12.nClass.classId == 6) {
                        for(var3 = 0; var3 < var12.bx.size(); ++var3) {
                           if ((var15 = (Skill)var12.bx.elementAt(var3)) != null && !var15.isCooldown() && var15.template.type == 2 && (var15.template.id < 67 || var15.template.id > 72) && (var15.template.id != 47 || var8.cHP < var8.cMaxHP * Char.es / 100)) {
                               try {
                                   System.currentTimeMillis();
                                   
                                   int var16;
                                   for(var16 = 0; var16 < var8.by.size(); ++var16) {
                                       var8.by.elementAt(var16);
                                   }
                                   
                                   var16 = var12.cx;
                                   var3 = var12.cy;
                                   Char.c(var8.cx, var8.cy);
                                   Service.getInstance().g(var15.template.id);
                                   Service.getInstance().r();
                                   var15.lastTimeUseThisSkill = System.currentTimeMillis();
                                   var15.paintCanNotUseSkill = true;
                                   var12.b(GameScr.skillPaints[var15.template.id], 0);
                                   Thread.sleep(1000L);
                                   Char.c(var16, var3);
                                   break;
                               } catch (InterruptedException ex) {
                                   
                               }
                           }
                        }
                     }
                  }

                  Item var14;
                  if (System.currentTimeMillis() - this.aj > 602000L && Char.countNullSlot() > 1 && (var14 = Char.g(38)) != null) {
                     Service.getInstance().useItem(var14.indexUI);
                     this.aj = System.currentTimeMillis();
                     return;
                  }

                  return;
               }
               break;
            case 1:
               if (Code.g == null || System.currentTimeMillis() - this.ak >= 3600000L) {
                  this.e();
                  return;
               }

               if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                  this.a(1, 21, -1, -1);
                  return;
               }

               TaskOrder var10 = Char.l(1);
               boolean var7 = Char.getMyChar().charName.equals(Code.g);
               if (c && var7) {
                  this.e();
                  Service.getInstance().k("sts");
                  return;
               }

               if (var10 == null) {
                  Npc var11;
                  Char.c((var11 = GameScr.i(25)).cx, var11.cy);
                  LockGame.b(300000L);
                  if (var7) {
                      try {
                          GameScr.PickNpc(25, GameScr.fj + 1, 0);
                          LockGame.k();
                          Thread.sleep(2000L);
                          return;
                      } catch (InterruptedException ex) {
                          
                      }
                  }
               } else {
                  if (var10.count >= var10.maxCount) {
                      try {
                          GameScr.PickNpc(25, GameScr.fj + 1, 2);
                          LockGame.m();
                          Thread.sleep(2000L);
                          return;
                      } catch (InterruptedException ex) {
                          
                      }
                  }

                  if (var7) {
                     Class_ag var13;
                     (var13 = Code.e).a();
                     var13.g = true;
                     var17 = Code.a;
                     Code.a(var13);
                     Service.getInstance().k("att " + var13.h + " " + var13.i + " " + var13.a);
                     return;
                  }
               }

               return;
            case 2:
               if (Char.getMyChar().cLevel < 30 || System.currentTimeMillis() - this.ak >= 10800000L) {
                  this.e();
                  return;
               }

               if (!this.ae) {
                  if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                     this.a(1, 21, -1, -1);
                     return;
                  }

                  if (Char.eu <= 50) {
                     int var10000 = (var2 = Char.k(Char.eu == 50 ? 29 : 23 + Char.eu / 10)) >= 2 ? 0 : 2 - var2;
                     var2 = var10000;
                     if (var10000 > 0) {
                        GameScr.PickNpc(4, 0, 0);
                        if (Char.eu == 50) {
                           Service.getInstance().buyItem(9, 7, var2);
                        } else {
                           Service.getInstance().buyItem(9, Char.eu / 10, var2);
                        }

                        LockGame.g();
                     }
                  }

                  if (var1.get(7) == 2) {
                      try {
                          GameScr.PickNpc(24, 1, 0);
                          Thread.sleep(2000L);
                      } catch (InterruptedException ex) {
                          
                      }
                  }

                  this.ae = true;
                  if ((var2 = Char.getMyChar().cLevel) >= 90) {
                     LockGame.c(300000L);
                     var17 = Code.a;
                     Code.a(new Class_aj());
                     d = true;
                     return;
                  }

                  super.h = var2 < 40 ? 91 : (var2 < 50 ? 94 : (var2 < 60 ? 105 : (var2 < 70 ? 114 : 125)));
                  super.j = true;
                  super.g = false;
                  if (var2 >= 60 && var2 < 70) {
                     if (GameScr.vParty.size() > 1) {
                        Service.getInstance().t();
                        return;
                     }

                     return;
                  }

                  if (Code.g != null) {
                     LockGame.c(300000L);
                     return;
                  }
               } else {
                  if (!d) {
                     if (TileMap.mapID == super.h) {
                        this.c(-1, -1);
                        this.c(-1);
                        return;
                     }

                     this.a(super.h, -2, -1, -1);
                     return;
                  }

                  if (!TileMap.f(TileMap.mapID)) {
                     return;
                  }

                  GameScr.PickNpc(0, 2, 0);
                  Service.getInstance().af();
                  this.ae = false;
                  d = false;
                  if (!e) {
                     return;
                  }
               }
               break;
            case 3:
               if (!this.ae) {
                  if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                     this.a(1, 21, -1, -1);
                     return;
                  }

                  GameScr.PickNpc(5, 1, 0);
                  if (LockGame.y()) {
                     if (var1.get(7) == 2) {
                         try {
                             GameScr.PickNpc(24, 1, 0);
                             Thread.sleep(2000L);
                         } catch (InterruptedException ex) {
                             
                         }
                     }

                     this.ae = true;
                     return;
                  }

                  return;
               }
               break;
            default:
               return;
         }

         this.e();
      }
   }

   public final String toString() {
      if (this.ab && this.ac) {
         return "Stanima Buff HS";
      } else if (this.ab) {
         return "Stanima Buff";
      } else if (this.ac) {
         return "Stanima HS";
      } else {
         return this.b >= 0 && this.b < Mob.b.length ? "Stanima " + Mob.b[this.b].g : "Stanima";
      }
   }
}
