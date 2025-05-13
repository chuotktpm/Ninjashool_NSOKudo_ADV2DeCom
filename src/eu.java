import java.util.Calendar;

public final class eu extends Auto {
   private boolean bha;
   private boolean bia;
   private int bja;
   private boolean bka;
   public int aaa;
   private int bla;
   private int bma;
   private boolean bna;
   private int boa;
   private long bpa;
   public int aba;
   private long bqa;
   public static boolean aca;
   public static boolean ada;
   public static boolean aea;

   public final void aaa(int var1, int var2, int var3, boolean var4, boolean var5) {
      super.a_();
      super.aga = var2;
      super.aha = var3;
      this.aba = var1;
      this.bha = var4;
      this.bia = var5;
      this.aaa = 0;
      this.bpa = 0L;
      this.bka = true;
      this.bja = -1;
      Calendar var6 = ci.aca();
      this.boa = var6.get(11) < 2 ? var6.get(5) - 1 : var6.get(5);
   }

   public final void aaa(String var1) {
      if (Code.aha != null && !TileMap.aea(super.aga)) {
         if (var1.startsWith("Thần thú đã xuất hiện tại")) {
            if (Char.getMyChar().cea.equals(Code.aha)) {
               int var2 = Char.getMyChar().aya;
               ev var3 = new ev();
               ev var4 = new ev();
               if (var2 >= 40 && var2 <= 60) {
                  if (var1.indexOf("Đảo Hebi") > 0) {
                     var3.addElement(34);
                     var4.addElement(32);
                  }

                  if (var1.indexOf("Hang Meiro") > 0) {
                     var3.addElement(35);
                     var4.addElement(32);
                  }

                  if (var1.indexOf("Rừng Kappa") > 0) {
                     var3.addElement(52);
                     var4.addElement(48);
                  }

                  if (var1.indexOf("Rừng Aokigahara") > 0) {
                     var3.addElement(14);
                     var4.addElement(10);
                  }

                  if (var1.indexOf("Rừng Aokigahara") > 0) {
                     var3.addElement(14);
                     var4.addElement(10);
                  }

                  if (var1.indexOf("Vách núi Ito") > 0) {
                     var3.addElement(15);
                     var4.addElement(10);
                  }

                  if (var1.indexOf("Núi Anzen") > 0) {
                     var3.addElement(68);
                     var4.addElement(38);
                  }

                  if (var1.indexOf("Thung lũng Taira") > 0) {
                     var3.addElement(16);
                     var4.addElement(10);
                  }
               }

               if (var2 >= 50 && var2 <= 70) {
                  if (var1.indexOf("Núi Ontake") > 0) {
                     var3.addElement(67);
                     var4.addElement(38);
                  }

                  if (var1.indexOf("Đỉnh Okama") > 0) {
                     var3.addElement(44);
                     var4.addElement(43);
                  }
               }

               if (var2 >= 60 && var2 <= 80) {
                  if (var1.indexOf("Khu đá đỏ Akai") > 0) {
                     var3.addElement(41);
                     var4.addElement(43);
                  }

                  if (var1.indexOf("Mũi Hone") > 0) {
                     var3.addElement(59);
                     var4.addElement(38);
                  }

                  if (var1.indexOf("Đỉnh Ichidai") > 0) {
                     var3.addElement(24);
                     var4.addElement(38);
                  }

                  if (var1.indexOf("Hang núi Kurai") > 0) {
                     var3.addElement(45);
                     var4.addElement(43);
                  }
               }

               if (var2 >= 70 && var2 <= 100) {
                  if (var1.indexOf("Ngôi đền Orochi") > 0) {
                     var3.addElement(19);
                     var4.addElement(17);
                  }

                  if (var1.indexOf("Đồng Kisei") > 0) {
                     var3.addElement(36);
                     var4.addElement(38);
                  }

                  if (var1.indexOf("Đền Harumoto") > 0) {
                     var3.addElement(54);
                     var4.addElement(43);
                  }
               }

               if (var2 >= 90) {
                  if (var1.indexOf("Sinh Tử Kiều") > 0) {
                     var3.addElement(143);
                     var4.addElement(this.bja);
                  }

                  if (var1.indexOf("Đoạn Sơn") > 0) {
                     var3.addElement(141);
                     var4.addElement(this.bja);
                  }
               }

               if (var3.size() > 0) {
                  Code.aaa((Auto)(new dv(var3, var4, this.bja)));
                  return;
               }
            } else {
               Code.aaa((Auto)(new dv(this.bja)));
            }
         }

      }
   }

   public final void aea() {
      if (this.aaa == 0) {
         this.boa = ci.aca().get(5);
         if (!TileMap.aea(super.aga)) {
            this.aaa = 2;
            this.bqa = System.currentTimeMillis();
            this.bla = super.aga;
            this.bma = super.aha;
            this.bna = super.afa;
            this.bka = false;
            ada = false;
            aea = false;
            return;
         }
      } else {
         if (this.aaa == 1) {
            this.aaa = 3;
            this.bqa = System.currentTimeMillis();
            this.bka = false;
            return;
         }

         if (this.aaa == 2) {
            this.aaa = 1;
            this.bqa = System.currentTimeMillis();
            aca = false;
            return;
         }

         if (this.aaa == 3) {
            this.aaa = 0;
            this.bka = false;
            Code.ada();
            return;
         }

         if (this.aaa == 4) {
            this.aaa = 0;
            this.bka = false;
         }
      }

   }

   public final void b_() {
      this.bpa = 0L;
      super.b_();
   }

   public final boolean afa() {
      return Code.aba instanceof eu && this.aaa == 2 && Char.getMyChar().aya >= 60 && Char.getMyChar().aya < 70;
   }

   public final void aaa() {
      if (Auto.aka()) {
         Auto.aaa(true);
      } else {
         Calendar var1;
         int var2 = (var1 = ci.aca()).get(5);
         int var3 = var1.get(11);
         int var4 = var1.get(12);
         switch(this.aaa) {
         case 0:
            if (!this.bka && this.bja > 0) {
               if (TileMap.mapID != this.bja) {
                  this.goMap(this.bja, -2, -1, -1);
                  return;
               }

               GameScr.PickNpc(5, 1, 0);
               if (LockGame.aza()) {
                  this.bka = true;
                  super.aga = this.bla;
                  super.aha = this.bma;
                  super.afa = this.bna;
                  super.aia = false;
                  return;
               }

               return;
            }

            if (this.bja < 0 && (TileMap.ada(TileMap.mapID) || TileMap.afa(TileMap.mapID))) {
               this.bja = TileMap.mapID;
            }

            if (var2 == this.boa || var3 < 2 || var4 < 30) {
               if (super.aga != TileMap.mapID || !super.aia && super.aha != TileMap.zoneID) {
                  this.goMap(super.aga, super.aha, super.aja, super.aka);
                  return;
               }

               if (Char.epa && Code.aia() && Char.bja() < 5 && !TileMap.aea(TileMap.mapID)) {
                  Auto.ala();
                  return;
               }

               if (!this.bia && !this.bha) {
                  this.aca(this.aba, this.aaa(Char.fga, Char.fha, Char.fia));
                  this.ada(-1);
               } else {
                  Char var12 = Char.getMyChar();
                  Char var8 = GameScr.bfa.size() > 0 ? ((ep)GameScr.bfa.firstElement()).afa : null;
                  bc var15;
                  if (this.bia && GameScr.bfa.size() > 0 && var12.cua.aaa == 6) {
                     for(var3 = 0; var3 < var12.cwa.size(); ++var3) {
                        if ((var15 = (bc)var12.cwa.elementAt(var3)) != null && var15.aaa.ada == 4) {
                           if (!var15.aaa()) {
                              for(var3 = 0; var3 < GameScr.bfa.size(); ++var3) {
                                 ep var5;
                                 if ((var5 = (ep)GameScr.bfa.elementAt(var3)).aaa != var12.asa && var5.afa != null && var5.afa.bba <= 0) {
                                    var3 = var12.cx;
                                    int var9 = var12.cy;
                                    Char var6;
                                    Char.charMove((var6 = var5.afa).cx, var6.cy);
                                    Thread.sleep(500L);
                                    Service.aaa().aua(var5.aaa);
                                    var15.afa = System.currentTimeMillis();
                                    var15.ala = true;
                                    var12.aba(GameScr.aza[var15.aaa.aaa], 0);
                                    Thread.sleep(1000L);
                                    Char.charMove(var3, var9);
                                    return;
                                 }
                              }
                           }
                           break;
                        }
                     }
                  }

                  if (this.bha && this.ama() && var8 != null && var12.cua.aaa == 6) {
                     for(var3 = 0; var3 < var12.cwa.size(); ++var3) {
                        if ((var15 = (bc)var12.cwa.elementAt(var3)) != null && !var15.aaa() && var15.aaa.ada == 2 && (var15.aaa.aaa < 67 || var15.aaa.aaa > 72) && (var15.aaa.aaa != 47 || var8.bba < var8.bea * Char.fra / 100)) {
                           int var16;
                           for(var16 = 0; var16 < var8.cxa.size(); ++var16) {
                              var8.cxa.elementAt(var16);
                           }

                           var16 = var12.cx;
                           var3 = var12.cy;
                           Char.charMove(var8.cx, var8.cy);
                           Service.aaa().afa(var15.aaa.aaa);
                           Service.aaa().ara();
                           var15.afa = System.currentTimeMillis();
                           var15.ala = true;
                           var12.aba(GameScr.aza[var15.aaa.aaa], 0);
                           Thread.sleep(1000L);
                           Char.charMove(var16, var3);
                           break;
                        }
                     }
                  }
               }

               gg var14;
               if (System.currentTimeMillis() - this.bpa > 602000L && Char.bja() > 1 && (var14 = Char.afa(38)) != null) {
                  Service.aaa().aea(var14.ada);
                  this.bpa = System.currentTimeMillis();
                  return;
               }

               return;
            }
            break;
         case 1:
            if (Code.aha == null || System.currentTimeMillis() - this.bqa >= 3600000L) {
               this.aea();
               return;
            }

            if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
               this.goMap(1, 21, -1, -1);
               return;
            }

            aj var10 = Char.ama(1);
            boolean var7 = Char.getMyChar().cea.equals(Code.aha);
            if (aca && var7) {
               this.aea();
               Service.aaa().aka("sts");
               return;
            }

            if (var10 == null) {
               Npc var11;
               Char.charMove((var11 = GameScr.findNpc(25)).cx, var11.cy);
               LockGame.aaa(300000L);
               if (var7) {
                  GameScr.PickNpc(25, GameScr.gva + 1, 0);
                  LockGame.ala();
                  Thread.sleep(2000L);
                  return;
               }
            } else {
               if (var10.aba >= var10.aca) {
                  GameScr.PickNpc(25, GameScr.gva + 1, 2);
                  LockGame.ana();
                  Thread.sleep(2000L);
                  return;
               }

               if (var7) {
                  fl var13;
                  (var13 = Code.aea).a_();
                  var13.afa = true;
                  Code.aaa((Auto)var13);
                  Service.aaa().aka("att " + var13.aga + " " + var13.aha + " " + var13.aaa);
                  return;
               }
            }

            return;
         case 2:
            if (Char.getMyChar().aya < 30 || System.currentTimeMillis() - this.bqa >= 10800000L) {
               this.aea();
               return;
            }

            if (!this.bka) {
               if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                  this.goMap(1, 21, -1, -1);
                  return;
               }

               if (Char.fta <= 50) {
                  int var10000 = (var2 = Char.aka(Char.fta == 50 ? 29 : 23 + Char.fta / 10)) >= 2 ? 0 : 2 - var2;
                  var2 = var10000;
                  if (var10000 > 0) {
                     GameScr.PickNpc(4, 0, 0);
                     if (Char.fta == 50) {
                        Service.aaa().aaa(9, 7, var2);
                     } else {
                        Service.aaa().aaa(9, Char.fta / 10, var2);
                     }

                     LockGame.aha();
                  }
               }

               if (var1.get(7) == 2) {
                  GameScr.PickNpc(24, 1, 0);
                  Thread.sleep(2000L);
               }

               this.bka = true;
               if ((var2 = Char.getMyChar().aya) >= 90) {
                  LockGame.bja();
                  Code.aaa((Auto)(new bj()));
                  ada = true;
                  return;
               }

               super.aga = var2 < 40 ? 91 : (var2 < 50 ? 94 : (var2 < 60 ? 105 : (var2 < 70 ? 114 : 125)));
               super.aia = true;
               super.afa = false;
               if (var2 >= 60 && var2 < 70) {
                  if (GameScr.bfa.size() > 1) {
                     Service.aaa().ata();
                     return;
                  }

                  return;
               }

               if (Code.aha != null) {
                  LockGame.bja();
                  return;
               }
            } else {
               if (!ada) {
                  if (TileMap.mapID == super.aga) {
                     this.aca(-1, -1);
                     this.ada(-1);
                     return;
                  }

                  this.goMap(super.aga, -2, -1, -1);
                  return;
               }

               if (!TileMap.afa(TileMap.mapID)) {
                  return;
               }

               GameScr.PickNpc(0, 2, 0);
               Service.aaa().bda();
               this.bka = false;
               ada = false;
               if (!aea) {
                  return;
               }
            }
            break;
         case 3:
            if (!this.bka) {
               if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                  this.goMap(1, 21, -1, -1);
                  return;
               }

               GameScr.PickNpc(5, 1, 0);
               if (LockGame.aza()) {
                  if (var1.get(7) == 2) {
                     GameScr.PickNpc(24, 1, 0);
                     Thread.sleep(2000L);
                  }

                  this.bka = true;
                  return;
               }

               return;
            }
            break;
         default:
            return;
         }

         this.aea();
      }
   }

   public final String toString() {
      if (this.bha && this.bia) {
         return "Stanima Buff HS";
      } else if (this.bha) {
         return "Stanima Buff";
      } else if (this.bia) {
         return "Stanima HS";
      } else {
         return this.aba >= 0 && this.aba < ac.aaa.length ? "Stanima " + ac.aaa[this.aba].aga : "Stanima";
      }
   }

   public static void aga() {
   }

   static {
      aa.aaa(45);
      aga();
   }

   public static void aha() {
      aca = false;
      ada = false;
      aea = false;
   }
}
