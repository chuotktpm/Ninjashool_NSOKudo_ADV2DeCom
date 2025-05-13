public class bt extends ds {
   private int aaa;
   private static final int[] aba;
   private static final int[] aca;
   private static final int[] ada;
   private static final int[] aea;
   private static final int[] bha;
   private static final int[] bia;
   private static final int[] bja;

   private static void aea() {
      aba = new int[]{0, 1, 1, 72, 72, 27, 27};
      aca = new int[]{0, 9, 9, 10, 10, 11, 11};
      ada = new int[]{0, 0, 1, 0, 1, 0, 1};
      aea = new int[]{0, 94, 114, 99, 109, 105, 119};
      bha = new int[]{-1, 40, 49, 58, 67, 76, 85};
      bia = new int[]{-1, 41, 50, 59, 68, 77, 86};
      bja = new int[]{-1, 42, 51, 60, 69, 78, 87};
   }

   public static void aba() {
      aea();
   }

   static {
      aa.aaa(14);
      aba();
   }

   public bt(int var1) {
      super.a_();
      this.aaa = var1;
   }

   public boolean aaa(fz var1) {
      return var1.aya >= 20;
   }

   public void aaa(fz var1, byte var2, byte var3) {
      if (var1.aua < 9) {
         super.aaa(var1, var2, var3);
      } else {
         int var5;
         int var7;
         int var8;
         int var9;
         gg var11;
         int var13;
         int var15;
         int var18;
         int var20;
         gg var21;
         switch(var1.aua) {
         case 9:
            if (var1.cua.aaa != 0) {
               if (gn.aoa == 28) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               } else {
                  this.aaa(28, -1, -1, -1);
                  return;
               }
            } else if (this.aaa == 0) {
               GameScr.chatPopup("Hãy vào lớp!");
               Code.aga();
               return;
            } else {
               var20 = aba[this.aaa];
               if (gn.aoa != var20) {
                  this.aaa(var20, -2, -1, -1);
                  return;
               } else {
                  GameScr.aba(5, 1, 0);

                  for(var5 = 0; var5 < var1.arrItemBag.length; ++var5) {
                     if ((var11 = var1.arrItemBag[var5]) != null && (var11.aaa.aba == 22 || var11.aaa.aba == 27)) {
                        Service.aaa().aea(var11.ada);
                     }
                  }

                  Thread.sleep(1000L);
                  if ((var21 = var1.dca[1]) != null) {
                     Service.aaa().aaa((short)var21.aaa.aba);
                     LockGame.ara();
                  }

                  GameScr.aba(aca[this.aaa], 1, ada[this.aaa]);

                  do {
                     Thread.sleep(1000L);
                  } while(fz.afa(aea[this.aaa]) == null);

                  if ((var21 = fz.afa(bha[this.aaa])) != null) {
                     Service.aaa().aea(var21.ada);
                  }

                  if ((var21 = fz.afa(aea[this.aaa])) != null) {
                     Service.aaa().aea(var21.ada);
                  }

                  Thread.sleep(1000L);
                  GameScr.aba(4, 0, 0);

                  for(var15 = 0; var15 < var1.arrItemBag.length; ++var15) {
                     if ((var21 = var1.arrItemBag[var15]) != null && (var21.aaa.aba < 10 || var21.aaa.aba == 16 || var21.aaa.aba == 17 || var21.aaa.aaa == 23)) {
                        Service.aaa().aha(var21.ada, var21.ada);
                     }
                  }

                  Service.aaa().afa();
                  LockGame.ata();
                  return;
               }
            }
         case 10:
            if (var1.cza.aaa == 0) {
               if (gn.aoa == 28) {
                  this.ada(-1);
                  this.aca(5, 1);
                  return;
               }

               this.aaa(28, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 1) {
               if (gn.aoa == 4) {
                  this.ada(-1);
                  this.aca(6, 1);
                  return;
               }

               this.aaa(4, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 2) {
               if (gn.aoa == 46) {
                  this.ada(-1);
                  this.aca(7, 1);
                  return;
               }

               this.aaa(46, -1, -1, -1);
               return;
            }
            break;
         case 11:
            if (var1.cza.aaa == 0) {
               if (gn.aoa == 28) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(28, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 1) {
               for(var20 = 0; var20 < GameScr.bla.size(); ++var20) {
                  fz var23;
                  if ((var23 = (fz)GameScr.bla.elementAt(var20)) != null) {
                     Service.aaa().aaa(var23.cea);
                  }
               }

               var15 = super.aha;
               GameScr var19 = GameScr.ava();
               av var22;
               if ((var22 = GameScr.aia(13)) != null && var22.aqa != 15) {
                  if (Math.abs(var22.ala - fz.ala().ala) > 22 || Math.abs(var22.ama - fz.ala().ama) > 22) {
                     fz.aca(var22.ala, var22.ama);
                  }

                  Service.aaa().aea();
                  LockGame.afa();
                  var20 = -1;
                  if (var15 < 0) {
                     var15 = var19.eea.length - 1;
                  } else if (var15 >= var19.eea.length) {
                     var15 = 0;
                  }

                  var5 = 0;

                  for(var18 = (var15 + 1) % var19.eea.length; var18 != var15; var18 = (var18 + 1) % var19.eea.length) {
                     if (var19.eea[var18] < 20 && var19.eea[var18] > var5) {
                        var20 = var18;
                        var5 = var19.eea[var18];
                     }
                  }

                  super.aha = var20;
                  Service.aaa().aaa((int)var20, (int)-1);
                  gn.aga();
                  Thread.sleep(100L);
                  return;
               }

               super.aha = gn.ala;
               return;
            }
            break;
         case 12:
            if (var1.cza.aaa == 0) {
               if (gn.aoa == 3) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(3, -1, -1, -1);
               return;
            }

            boolean var16 = false;
            var5 = -1;
            var11 = null;
            if (var1.cza.aaa == 1) {
               var16 = true;
               var5 = (new int[]{194, 94, 114, 99, 109, 105, 119})[var1.cua.aaa];
               if ((var11 = var1.dca[1]) == null) {
                  var16 = false;
                  var11 = fz.afa(var5);
               }
            } else if (var1.cza.aaa == 2) {
               var16 = true;
               var5 = 174;
               if ((var11 = var1.dca[9]) == null) {
                  var16 = false;
                  var11 = fz.afa(174);
               }
            } else if (var1.cza.aaa == 3) {
               var16 = true;
               var5 = var1.ata == 1 ? 124 : 125;
               if ((var11 = var1.dca[8]) == null) {
                  var16 = false;
                  var11 = fz.afa(var5);
               }
            }

            if (var11 == null) {
               if (gn.aoa == 4) {
                  this.ada(var5);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(4, -1, -1, -1);
               return;
            }

            var13 = 0;
            var18 = 0;
            if (var11.ara()) {
               var13 = GameScr.dva[var11.aia] / 2;
               var18 = GameScr.dza[var11.aia];
            } else if (var11.asa()) {
               var13 = GameScr.dwa[var11.aia] / 2;
               var18 = GameScr.eaa[var11.aia];
            } else if (var11.ata()) {
               var13 = GameScr.dxa[var11.aia] / 2;
               var18 = GameScr.eba[var11.aia];
            }

            if (var13 << 1 > fz.bia() || var18 << 1 > var1.csa) {
               if (gn.aoa == 46) {
                  this.ada(1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(46, -1, -1, -1);
               return;
            }

            if (gn.aoa != 22) {
               this.aaa(22, -2, -1, -1);
               return;
            }

            if (var16) {
               Service.aaa().aaa((int)var11.aaa.aba);
               LockGame.ara();
            }

            var7 = var11.aia;
            GameScr.aba(6, 0, 0);
            LockGame.ara();
            GameScr.dfa = var11;

            for(var8 = 0; var8 < 2 && var11.aia == var7; ++var8) {
               GameScr.cxa = new gg[18];
               var9 = 0;
               int var24 = 0;

               for(var20 = 0; var20 < var1.arrItemBag.length && var24 < var13; ++var20) {
                  if ((var21 = var1.arrItemBag[var20]) != null && var21.aaa.aba == 26 && var21.aaa.aaa <= 3) {
                     var1.arrItemBag[var20] = null;
                     GameScr.cxa[var9++] = var21;
                     var24 += GameScr.dva[var21.aaa.aaa];
                  }
               }

               do {
                  Thread.sleep(3000L);
                  Service.aaa().aaa(var11, GameScr.cxa);
                  LockGame.ara();
               } while(GameScr.cxa[0] != null);
            }

            GameScr.dfa = null;
            Service.aaa().aea(var11.ada);
            if (var11.aia > var7) {
               LockGame.apa();
               return;
            }
            break;
         case 13:
            gg var4;
            if ((var4 = var1.dca[1]) != null && var4.aia < 2) {
               var5 = GameScr.dxa[var4.aia] / 2;
               var15 = GameScr.eba[var4.aia];
               if (var5 << 1 <= fz.bia() && var15 << 1 <= var1.csa) {
                  if (gn.aoa != 22) {
                     this.aaa(22, -2, -1, -1);
                     return;
                  }

                  Service.aaa().aaa((int)var4.aaa.aba);
                  LockGame.ara();
                  var13 = var4.aia;
                  GameScr.aba(6, 0, 0);
                  LockGame.ara();
                  GameScr.dfa = var4;

                  for(var18 = 0; var18 < 2 && var4.aia == var13; ++var18) {
                     GameScr.cxa = new gg[18];
                     var7 = 0;
                     var8 = 0;

                     for(var9 = 0; var9 < var1.arrItemBag.length && var8 < var5; ++var9) {
                        gg var10;
                        if ((var10 = var1.arrItemBag[var9]) != null && var10.aaa.aba == 26 && var10.aaa.aaa <= 3) {
                           var1.arrItemBag[var9] = null;
                           GameScr.cxa[var7++] = var10;
                           var8 += GameScr.dva[var10.aaa.aaa];
                        }
                     }

                     do {
                        Thread.sleep(3000L);
                        Service.aaa().aaa(var4, GameScr.cxa, false);
                        LockGame.ara();
                     } while(GameScr.cxa[0] != null);
                  }

                  GameScr.dfa = null;
                  Service.aaa().aea(var4.ada);
                  return;
               }

               if (gn.aoa == 4) {
                  this.ada(1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(4, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 0) {
               if (gn.aoa == 4) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(4, -1, -1, -1);
               return;
            }

            var5 = var1.cza.aaa == 1 ? 56 : (var1.cza.aaa == 2 ? 0 : 73);
            if (gn.aoa != var5) {
               if (gn.aoa != var2) {
                  super.aaa(var2, -2, -1, -1);
                  return;
               }

               if (GameScr.aya < 10 && var1.csa >= 300 * (10 - GameScr.aya)) {
                  GameScr.aba(3, 0, 0);
                  Service.aaa().aaa(7, 1, 10 - GameScr.aya);
                  LockGame.aha();
                  return;
               }

               GameScr.aba(var3, 0, 0);
               Service.aaa().aja(var3, 0);
               gn.aga();
               return;
            }

            if (var1.bba < var1.bea / 2 && var1.bba > 0) {
               var1.aea(16);
            }

            if (var1.aza < var1.baa / 2 && var1.bba > 0) {
               var1.aea(17);
            }

            fz var14;
            if (GameScr.bla.size() > 0 && (var14 = (fz)GameScr.bla.elementAt(0)) != null) {
               bc var17 = Auto.aqa;
               if (ci.aea(var1.ala - var14.ala) > var17.aga || ci.aea(var1.ama - var14.ama) > var17.aha) {
                  fz.aca(var14.ala < gn.aca ? var14.ala : gn.aca - 50, var14.ama);
               }

               Auto.aya.removeAllElements();
               Auto.aza.removeAllElements();
               Auto.aza.addElement(var14);
               Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)1);
               if (System.currentTimeMillis() - var17.afa >= (long)var17.aea) {
                  var17.afa = System.currentTimeMillis();
                  var17.ala = true;
                  var1.aba(GameScr.aza[var17.aaa.aaa], 0);
                  return;
               }
            }
            break;
         case 14:
            if (var1.aya >= 15 && (var11 = fz.afa(bia[var1.cua.aaa])) != null) {
               GameScr.chatPopup("Học sách kĩ năng");
               Service.aaa().aea(var11.ada);
               Thread.sleep(1000L);
            }

            if (var1.cza.aaa == 0) {
               if (gn.aoa == 29) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(29, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 1) {
               if (gn.aoa == 29 && super.aha == gn.ala) {
                  int var10000;
                  if (Code.ama < 0) {
                     var10000 = -1;
                  } else {
                     var10000 = Code.ama;
                     var10000 *= var10000;
                  }

                  var5 = var10000;
                  am var12 = null;

                  for(var13 = 0; var13 < GameScr.bma.size(); ++var13) {
                     am var6;
                     var7 = Math.abs((var6 = (am)GameScr.bma.elementAt(var13)).aaa - var1.ala);
                     var8 = Math.abs(var6.aba - var1.ama);
                     var9 = var7 * var7 + var8 * var8;
                     if (!var6.aka && var6.aha.aaa == 212 && (fz.bja() > 2 || fz.aja(212)) && (var5 < 0 || var9 < var5)) {
                        var5 = var9;
                        var12 = var6;
                     }
                  }

                  if (var12 == null) {
                     super.aha = (super.aha + 1) % 30;
                     return;
                  }

                  fz.aca(var12.aca, var12.ada);
                  Service.aaa().aoa(var12.aga);

                  for(var13 = 0; var13 < 5 && !LockGame.ada(); ++var13) {
                  }

                  var12.aka = true;
                  return;
               }

               this.aaa(29, super.aha, -1, -1);
               return;
            }

            if (var1.cza.aaa == 2) {
               if (gn.aoa == 40) {
                  this.aca(15, 1);
                  this.ada(213);
                  return;
               }

               this.aaa(40, -1, -1, -1);
               return;
            }
            break;
         case 15:
            if (var1.cza.aaa == 0) {
               if (gn.aoa == 8) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(8, -1, -1, -1);
               return;
            }

            if (gn.aoa != var2) {
               super.aaa(var2, -2, -1, -1);
               return;
            }

            GameScr.aba(var3, 0, 0);
            LockGame.apa();
            Auto.ala();
            return;
         case 16:
            if (var1.aya >= 20 && (var11 = fz.afa(bja[var1.cua.aaa])) != null) {
               GameScr.chatPopup("Học sách kĩ năng");
               Service.aaa().aea(var11.ada);
               Thread.sleep(1000L);
            }

            if (var1.cza.aaa == 0) {
               if (gn.aoa == 8) {
                  this.ada(-1);
                  this.aca(-1, 1);
                  return;
               }

               this.aaa(8, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 1) {
               if (gn.aoa == 63) {
                  this.ada(-1);
                  this.aca(23, 1);
                  return;
               }

               this.aaa(63, -1, -1, -1);
               return;
            }

            if (var1.cza.aaa == 2) {
               if (gn.aoa == 47) {
                  this.ada(-1);
                  this.aca(24, 1);
                  return;
               }

               this.aaa(47, -1, -1, -1);
            }
         }

      }
   }

   public String toString() {
      return "Auto Nhiệm Vụ 20";
   }

   public static void aca() {
      aba = null;
      aca = null;
      ada = null;
      aea = null;
      bha = null;
      bia = null;
      bja = null;
   }
}
