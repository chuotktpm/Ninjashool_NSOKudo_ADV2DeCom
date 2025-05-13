import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameCanvas extends ee implements ag {
   public static boolean aaa;
   public static boolean aba;
   public static boolean aca;
   public static boolean ada;
   public static boolean aea;
   public static boolean afa;
   public static boolean aga;
   public static boolean aha;
   public static boolean aia;
   public static GameCanvas aja;
   public static boolean[] aka;
   private static boolean[] bwa;
   public static boolean[] ala;
   public static boolean ama;
   public static boolean ana;
   public static boolean aoa;
   public static int apa;
   public static int aqa;
   public static int ara;
   public static int asa;
   public static cf[] ata;
   public static int aua;
   public static int ava;
   public static boolean awa;
   public static boolean axa;
   private static long bxa;
   private static long bya;
   public static boolean aya;
   public static int aza;
   public static int baa;
   public static int bba;
   public static int bca;
   public static fb bda;
   public static ck bea;
   public static ez bfa;
   public static ed bga;
   public static ce bha;
   public static fq bia;
   public static dq bja;
   public static dd bka;
   public static dt bla;
   private static Image[] bza;
   private static int caa;
   private static int cba;
   public static int bma;
   private static int[] cca;
   private as cda = new as();
   private static boolean cea;
   private static int cfa;
   private static int cga;
   private static int cha;
   private static int cia;
   private static int cja;
   private static int cka;
   private static int cla;
   private static Image cma;
   private static Image cna;
   public static Image[] bna;
   public static int boa;
   public static int bpa;
   private static int[] coa;
   private static int[] cpa;
   private static int cqa;
   private static int cra;
   public static int bqa;
   private static long csa;
   public static int bra;
   private static int[] cta;
   private int[] cua;
   private int[] cva;
   private int[] cwa;
   private static int[] cxa;
   private static int[] cya;
   private static int[] cza;
   private static Image[] daa;
   private static Image dba;
   private static Image[][] dca;
   private boolean dda;
   public static boolean bsa;
   private static Image[][] dea;
   private static Image[] dfa;
   private static Image[] dga;
   public static int bta;
   public static long bua;
   public static long bva;

   public static void aaa() {
      aaa = false;
      aba = true;
      aca = true;
      ada = false;
      afa = false;
      aka = new boolean[14];
      bwa = new boolean[14];
      ala = new boolean[14];
      ata = new cf[4];
      bea = new ck();
      cba = 0;
      bna = new Image[2];
      bqa = -1;
      csa = 0L;
      dea = new Image[4][];
      dfa = new Image[4];
      dga = new Image[2];
   }

   static {
      aa.aaa(1);
      aaa();
   }

   public GameCanvas() {
      fg var1;
      (var1 = fg.aaa()).setFullScreenMode(true);
      var1.aba = this;
      aza = var1.aca();
      baa = var1.aba();
      bba = aza / 2;
      bca = baa / 2;
      aya = System.getProperty("microedition.platform").indexOf("RIM") == 0;
      if (fg.aaa.hasPointerEvents()) {
         afa = true;
         if (aza >= 240) {
            aga = true;
         }

         if (aza < 320) {
            aha = true;
         }

         if (aza >= 320) {
            aia = true;
         }
      }

      int var3;
      if ((var3 = fd.ada("indLanguage")) < 0) {
         er.aea = 0;
      } else {
         er.aea = var3;
      }

      er.aaa();
      bja = new dq();
      if (baa <= 160) {
         fk.afa = 15;
         fb.aqa = 17;
      }

      aja = this;
      System.gc();
      new fk();
      dea[0] = new Image[17];

      for(var3 = 0; var3 < 17; ++var3) {
         dea[0][var3] = aca("/bg/bg0" + var3 + ".png");
      }

      dea[1] = new Image[17];

      for(var3 = 0; var3 < 17; ++var3) {
         dea[1][var3] = aca("/bg/bg1" + var3 + ".png");
      }

      dea[2] = new Image[17];

      for(var3 = 0; var3 < 17; ++var3) {
         dea[2][var3] = aca("/bg/bg2" + var3 + ".png");
      }

      dea[3] = new Image[15];

      for(var3 = 0; var3 < 15; ++var3) {
         dea[3][var3] = aca("/bg/bg3" + var3 + ".png");
      }

      for(var3 = 0; var3 < 4; ++var3) {
         dfa[var3] = aca("/bg/cl" + var3 + ".png");
      }

      dga[0] = aca("/bg/sun0.png");
      dga[1] = aca("/bg/sun1.png");
      TileMap.aja();
      if (!aaa) {
         if (dca == null) {
            dca = new Image[2][5];

            for(var3 = 0; var3 < 2; ++var3) {
               for(int var2 = 0; var2 < 5; ++var2) {
                  dca[var3][var2] = aca("/e/d" + var3 + var2 + ".png");
               }
            }
         }

         this.cua = new int[2];
         this.cva = new int[2];
         this.cwa = new int[2];
         this.cwa[0] = this.cwa[1] = -1;
      }

      ava();
      dba = aca("/u/f.png");
      if (afa) {
         for(var3 = 0; var3 < 2; ++var3) {
            bna[var3] = aca("/hd/bd" + var3 + ".png");
         }

         boa = as.aaa(bna[0]);
         bpa = as.aba(bna[0]);
         as.aaa(bna[1]);
         as.aba(bna[1]);
      } else if (fd.ada("lowGraphic") == 1) {
         aaa = true;
      }

      fo.ada();
      fb.aja();
      bha = new ce();
   }

   public static GameCanvas aba() {
      if (aja == null) {
         aja = new GameCanvas();
      }

      return aja;
   }

   public static void aca() {
      cs.aba().aaa(Class_ab.aga, Class_ab.afa);
   }

   public static void ada() {
      aza = fg.aaa.aca();
      baa = fg.aaa.aba();
      bba = aza / 2;
      bca = baa / 2;
      bga = new ed();
      bfa = new ez();
      new dl();
      bka = new dd();
      bla = new dt();
   }

   public final void aea() {
      if (bta > 0) {
         if ((bva = System.currentTimeMillis()) - bua >= 1000L) {
            if (--bta == 0) {
               cs.aba().aea();
            }

            bua = bva;
         }
      } else if (cs.aba().afa && System.currentTimeMillis() - cs.aba().aja > 300000L) {
         cs.aba().aea();
      }

      long var1;
      if ((var1 = System.currentTimeMillis()) - bxa >= 780L && !awa) {
         bxa = var1;
         awa = true;
      } else {
         awa = false;
      }

      if (var1 - bya >= 7800L && !axa) {
         bya = var1;
         axa = true;
      } else {
         axa = false;
      }

      if (ava > 0) {
         --ava;
      }

      if (++aua > 10000) {
         aua = 0;
      }

      if (bda != null) {
         if (bia != null) {
            bia.aaa();
         } else if (bea.aaa) {
            ck var6;
            if ((var6 = bea).aza != 0 && !var6.awa) {
               if ((ck.aia += var6.aza / 100) < 0) {
                  ck.aia = 0;
               } else if (ck.aia > ck.aka) {
                  ck.aia = ck.aka;
               } else {
                  ck.aja = ck.aia;
               }

               var6.aza = var6.aza * 9 / 10;
               if (var6.aza < 100 && var6.aza > -100) {
                  var6.aza = 0;
               }
            }

            if (ck.aja != ck.aia && !var6.awa) {
               var6.baa = ck.aia - ck.aja << 2;
               var6.bba += var6.baa;
               ck.aja += var6.bba >> 4;
               var6.bba &= 15;
            }

            if (var6.aha > var6.aea) {
               int var2;
               if ((var2 = var6.aha - var6.aea >> 1) <= 0) {
                  var2 = 1;
               }

               var6.aha -= var2;
            }

            if (ck.ala != 0 && (ck.ala >>= 1) < 0) {
               ck.ala = 0;
            }

            if (var6.aya > 0) {
               --var6.aya;
               GameScr.dja = false;
               if (var6.aya == 0) {
                  var6.aaa = false;
                  ca var7;
                  if (var6.aca >= 0 && (var7 = (ca)var6.aba.elementAt(var6.aca)) != null) {
                     var7.aaa();
                  }
               }
            }

            if ((var6 = bea).aaa) {
               boolean var8 = false;
               if (!aka[2] && !aka[4]) {
                  if (!aka[8] && !aka[6]) {
                     if (aka[5]) {
                        if (var6.aoa != null) {
                           if (var6.aoa.ada > 0) {
                              if (var6.aoa.aca == GameScr.ava()) {
                                 GameScr.ava().aba(var6.aoa.ada, var6.aoa.aja);
                              } else {
                                 var6.aaa(var6.aoa.ada, var6.aoa.aja);
                              }
                           }
                        } else {
                           var6.aya = 2;
                        }
                     } else if (aka[12]) {
                        if (var6.ama.ada > 0) {
                           var6.aaa(var6.ama.ada, var6.ama.aja);
                        } else {
                           var6.aya = 2;
                        }
                     } else if (!var6.ara && (aka[13] || fb.aaa(var6.ana))) {
                        var6.aaa = false;
                        br.aca();
                     }
                  } else {
                     var8 = true;
                     ++var6.aca;
                     if (var6.aca > var6.aba.size() - 1) {
                        var6.aca = 0;
                     }
                  }
               } else {
                  var8 = true;
                  --var6.aca;
                  if (var6.aca < 0) {
                     var6.aca = var6.aba.size() - 1;
                  }
               }

               var6.aoa = null;
               if (GameScr.dja && !afa && var6.aca != -1) {
                  ca var3 = (ca)var6.aba.elementAt(var6.aca);
                  fa var4;
                  if ((var4 = dc.ada().aaa(var3.aaa)) != null && var4.aaa == 2) {
                     var6.aoa = new ca(er.bna, var6, 1000, var4);
                  }
               }

               if (var8) {
                  if ((ck.aia = var6.aca * var6.afa + var6.afa - aza / 2) > ck.aka) {
                     ck.aia = ck.aka;
                  }

                  if (ck.aia < 0) {
                     ck.aia = 0;
                  }

                  if (var6.aca == var6.aba.size() - 1 || var6.aca == 0) {
                     ck.aja = ck.aia;
                  }
               }

               if (!var6.ara && aoa && !aca(var6.ada, var6.aea, var6.asa, var6.aga) && !var6.awa) {
                  var6.ata = var6.aua = 0;
                  var6.awa = false;
                  var6.aaa = false;
                  aoa = false;
               } else {
                  int var9;
                  int var10;
                  if (ama) {
                     if (!var6.awa && aca(var6.ada, var6.aea, var6.asa, var6.aga)) {
                        for(var9 = 0; var9 < var6.ava.length; ++var9) {
                           var6.ava[0] = apa;
                        }

                        var6.aua = apa;
                        var6.awa = true;
                        var6.axa = var6.aza != 0;
                        var6.aza = 0;
                     } else if (var6.awa) {
                        ++var6.ata;
                        if (var6.ata > 5 && var6.aua == apa && !var6.axa) {
                           var6.aua = -1000;
                           var6.aca = (ck.aia + apa - var6.ada) / var6.afa;
                        }

                        if ((var9 = apa - var6.ava[0]) != 0 && var6.aca != -1) {
                           var6.aca = -1;
                        }

                        for(var10 = var6.ava.length - 1; var10 > 0; --var10) {
                           int[] var10002 = var6.ava;
                           var10002[var10] = var10002[var10 - 1];
                        }

                        var6.ava[0] = apa;
                        if ((ck.aia -= var9) < 0) {
                           ck.aia = 0;
                        }

                        if (ck.aia > ck.aka) {
                           ck.aia = ck.aka;
                        }

                        if (ck.aja < 0 || ck.aja > ck.aka) {
                           var9 /= 2;
                        }

                        ck.aja -= var9;
                     }
                  }

                  if (aoa && var6.awa) {
                     var9 = apa - var6.ava[0];
                     aoa = false;
                     if (ci.aea(var9) < 20 && ci.aea(apa - var6.aua) < 20 && !var6.axa) {
                        var6.aza = 0;
                        ck.aia = ck.aja;
                        var6.aua = -1000;
                        var6.aca = (ck.aia + apa - var6.ada) / var6.afa;
                        var6.ata = 0;
                        var6.aya = 10;
                     } else if (var6.aca != -1 && var6.ata > 5) {
                        var6.ata = 0;
                        var6.aya = 1;
                     } else if (var6.aca == -1 && !var6.axa) {
                        if (ck.aja < 0) {
                           ck.aia = 0;
                        } else if (ck.aja > ck.aka) {
                           ck.aia = ck.aka;
                        } else {
                           byte var11;
                           if ((var10 = apa - var6.ava[0] + (var6.ava[0] - var6.ava[1]) + (var6.ava[1] - var6.ava[2])) > 10) {
                              var11 = 10;
                           } else if (var10 < -10) {
                              var11 = -10;
                           } else {
                              var11 = 0;
                           }

                           var6.aza = -var11 * 100;
                        }
                     }

                     var6.awa = false;
                     var6.ata = 0;
                     aoa = false;
                  }

                  aka();
                  ala();
               }
            }
         }

         if (!aea) {
            bda.aba();
         }

         bda.aca();
      }

      long var12 = System.currentTimeMillis();
      if (fd.aka && var12 > fd.aja) {
         fd.aka = false;

         try {
            if (fd.aia > 0) {
               GameScr.ava();
               aja.aqa();
            }
         } catch (Exception var5) {
            var5.printStackTrace();
         }
      }

      if (br.aha > 0 && --br.aha == 0) {
         br.aca();
      }

      if (this.dda) {
         this.afa();
      }

      fg.aaa.repaint();
      fg.aaa.serviceRepaints();
   }

   public final void afa() {
      this.dda = false;
      bfa.aaa();

      try {
         Char.ama();
         GameScr.awa();
         GameScr.aea();
         ama();
         br.aca();
         GameScr.aaa(true);
         GameScr.aia = 100;
         aaa(TileMap.ama);
         GameScr.bfa.removeAllElements();
         GameScr.bea.removeAllElements();
         GameScr.bha.removeAllElements();
         GameScr.bka.removeAllElements();
         Char.cha = null;
      } catch (Exception var1) {
         var1.printStackTrace();
      }
   }

   public static void aga() {
      if (ada && --bma < 0) {
         ada = false;
      }

   }

   public static void aha() {
      if (!aaa && cma != null) {
         for(int var0 = 0; var0 < coa.length; ++var0) {
            if (aua % (var0 + 2 << 3) == 0) {
               int var10002 = coa[var0]++;
               if (coa[var0] > GameScr.aba + (as.aaa(cma) >> 1)) {
                  coa[var0] = -(as.aaa(cma) >> 1);
               }
            }
         }
      }

   }

   public static void aaa(as var0) {
      if (ada) {
         if (aua % 10 > 7) {
            var0.aaa(16777215);
         } else {
            var0.aaa(0);
         }

         var0.aca(0, 0, GameScr.aba, GameScr.aca);
      } else {
         boolean var10000;
         int var2;
         if ((var2 = eg.aha) != -1) {
            var0.aaa(var2);
            var0.aca(0, 0, aza, baa);
            var10000 = true;
         } else {
            var10000 = false;
         }

         if (!var10000) {
            if (cea && !aaa && bza != null) {
               var0.aaa(caa);
               var0.aca(0, 0, GameScr.aba, cfa);
               int var1;
               if (bqa >= 0 && bqa <= 1) {
                  if (bza[0] != null) {
                     for(var1 = -((GameScr.aia >> 1) % 24); var1 < GameScr.aba; var1 += 24) {
                        var0.aaa(bza[0], var1, cga, 0);
                     }
                  }

                  if (bza[1] != null) {
                     for(var1 = -((GameScr.aia >> 2) % 24); var1 < GameScr.aba; var1 += 24) {
                        var0.aaa(bza[1], var1, cha, 0);
                     }
                  }

                  if (bza[3] != null) {
                     for(var1 = -((GameScr.aia >> 4) % 64); var1 < GameScr.aba; var1 += 64) {
                        var0.aaa(bza[3], var1, cja, 0);
                     }
                  }

                  if (cna != null) {
                     var0.aaa(cna, cqa, cra, 3);
                  }

                  if (cma != null) {
                     for(var1 = 0; var1 < 2; ++var1) {
                        var0.aaa(cma, coa[var1], cpa[var1], 3);
                     }
                  }

                  if (bza[2] != null) {
                     for(var1 = -((GameScr.aia >> 3) % 192); var1 < GameScr.aba; var1 += 192) {
                        var0.aaa(bza[2], var1, cia, 0);
                     }

                     return;
                  }
               } else if (bqa >= 2 && bqa <= 6) {
                  if (cna != null) {
                     var0.aaa(cna, cqa, cra, 3);
                  }

                  if (cma != null) {
                     for(var1 = 0; var1 < coa.length; ++var1) {
                        var0.aaa(cma, coa[var1], cpa[var1], 3);
                     }
                  }

                  if (bqa != 2) {
                     if (bza[3] != null) {
                        for(var1 = -((GameScr.aia >> cta[3]) % cca[3]); var1 < GameScr.aba; var1 += cca[3]) {
                           var0.aaa(bza[3], var1, cja, 0);
                        }
                     }

                     if (bza[2] != null) {
                        for(var1 = -((GameScr.aia >> cta[2]) % cca[2]); var1 < GameScr.aba; var1 += cca[2]) {
                           var0.aaa(bza[2], var1, cia, 0);
                        }
                     }

                     if (bza[1] != null) {
                        for(var1 = -((GameScr.aia >> cta[1]) % cca[1]); var1 < GameScr.aba; var1 += cca[1]) {
                           var0.aaa(bza[1], var1, cla, 0);
                        }
                     }

                     if (bza[0] != null) {
                        for(var1 = -((GameScr.aia >> cta[0]) % cca[0]); var1 < GameScr.aba; var1 += cca[0]) {
                           var0.aaa(bza[0], var1, cka, 0);
                        }

                        return;
                     }
                  }
               } else if (bqa >= 7 && bqa <= 16) {
                  var0.aaa(caa);
                  var0.aca(0, 0, GameScr.aba, GameScr.aca);
                  if (bqa != 8 && bza[3] != null) {
                     for(var1 = -((GameScr.aia >> cta[3]) % cca[3]); var1 < GameScr.aba; var1 += cca[3]) {
                        if (bqa != 11 && bqa != 12) {
                           var0.aaa(bza[3], var1, cja, 0);
                        } else {
                           var0.aaa(bza[3], var1, GameScr.aca - as.aba(bza[3]), 0);
                        }
                     }
                  }

                  if (bqa != 8 && bqa != 11 && bqa != 12 && bza[2] != null) {
                     if (TileMap.mapID == 45) {
                        var0.aaa(bza[2], GameScr.aba, cia, 0);
                     } else {
                        for(var1 = -((GameScr.aia >> cta[2]) % cca[2]); var1 < GameScr.aba; var1 += cca[2]) {
                           if (bqa == 14) {
                              var0.aaa(bza[2], var1, cia + 12, 0);
                           } else {
                              var0.aaa(bza[2], var1, cia, 0);
                           }
                        }
                     }
                  }

                  if (bqa != 11 && bqa != 12 && bza[1] != null && TileMap.mapID != 52) {
                     for(var1 = -((GameScr.aia >> cta[1]) % cca[1]); var1 < GameScr.aba; var1 += cca[1]) {
                        var0.aaa(bza[1], var1, cla, 0);
                     }
                  }

                  if (TileMap.mapID == 45 || TileMap.mapID == 55) {
                     var0.aaa(1114112);
                     var0.aca(0, cka + 20, GameScr.aba, GameScr.aca);
                  }

                  if (bza[0] != null) {
                     for(var1 = -((GameScr.aia >> cta[0]) % cca[0]); var1 < GameScr.aba; var1 += cca[0]) {
                        var0.aaa(bza[0], var1, cka, 0);
                     }
                  }

                  if (cma != null) {
                     if (bqa != 13 && bqa != 15) {
                        for(var1 = 0; var1 < 2; ++var1) {
                           var0.aaa(cma, coa[var1], cpa[var1], 3);
                        }

                        return;
                     }

                     for(var1 = 0; var1 < 2; ++var1) {
                        var0.aaa(cma, coa[var1], cpa[var1] - 130, 3);
                     }

                     return;
                  }
               }
            } else {
               var0.aaa(caa);
               var0.aca(0, 0, GameScr.aba, GameScr.aca);
            }

         }
      }
   }

   public static void aia() {
      bza = null;
      cma = null;
      cna = null;
   }

   public static void aaa(int var0) {
      byte var1;
      byte var2;
      byte var3;
      label217: {
         var1 = 0;
         var2 = 0;
         var3 = 0;
         bqa = var0;
         switch(var0) {
         case 2:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 3:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 4:
            var1 = 9;
            var2 = 6;
            break;
         case 5:
            cta = new int[]{1, 1, 1, 1};
            break label217;
         case 6:
            var1 = 12;
            break;
         case 7:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 8:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 9:
            var1 = 16;
            var2 = 10;
            var3 = 6;
            break;
         case 10:
            cta = new int[]{1, 1, 1, 1};
            break label217;
         case 11:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 12:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 13:
            var1 = 60;
            break;
         case 14:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 15:
            cta = new int[]{1, 2, 3, 4};
            break label217;
         case 16:
            break;
         default:
            break label217;
         }

         cta = new int[]{1, 2, 3, 4};
      }

      caa = af.aja[bqa];

      int var4;
      try {
         if (!aaa) {
            bza = new Image[4];
            cca = new int[4];

            for(var4 = 0; var4 < 4; ++var4) {
               try {
                  if (af.aia[bqa][var4] != -1) {
                     bza[var4] = dea[var4][af.aia[bqa][var4]];
                  }
               } catch (Exception var5) {
                  var5.printStackTrace();
               }

               if (bza[var4] != null) {
                  cca[var4] = as.aaa(bza[var4]);
               }
            }

            if (bqa == 10) {
               bza[1] = dea[0][9];
               bza[2] = dea[0][9];
               cca[1] = as.aaa(bza[1]);
               cca[2] = as.aaa(bza[2]);
            }

            if (bqa == 12) {
               bza[3] = dea[3][9];
               cca[3] = as.aaa(bza[3]);
            }

            if (bqa == 14) {
               if (afa) {
                  cla = (cka = baa - as.aba(bza[0])) - as.aba(bza[1]);
               } else {
                  cla = (cka = baa - as.aba(bza[0]) - 45) - as.aba(bza[1]);
               }
            }

            if (bqa == 15 && afa) {
               cla = (cka = baa - as.aba(bza[0])) - as.aba(bza[1]) + 100;
            }

            if (bqa == 16) {
               if (afa) {
                  cla = (cka = baa - as.aba(bza[0])) - as.aba(bza[1]) + 100;
               } else {
                  cla = (cka = baa - as.aba(bza[0]) - 40) - as.aba(bza[1]) + 100;
               }
            }
         }

         if (bqa >= 0 && bqa <= 1) {
            cma = dfa[0];
            cna = dga[0];
         } else {
            cma = null;
            cna = null;
         }

         if (bqa == 2) {
            cma = dfa[1];
            cna = dga[1];
         }

         if (bqa == 7 || bqa == 11 || bqa == 12) {
            if (TileMap.mapID == 20) {
               cma = null;
            } else {
               cma = dfa[0];
            }
         }

         if (var0 == 13 || var0 == 15) {
            cma = dfa[2];
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      cea = false;
      if (!aaa) {
         cea = true;
         if (bza[0] != null && bza[1] != null && bza[2] != null) {
            cfa = GameScr.aca - (as.aba(bza[0]) + as.aba(bza[1]) + as.aba(bza[2])) + 11;
         }

         if (bza[0] != null) {
            cga = GameScr.aca - as.aba(bza[0]);
         }

         if (bza[1] != null) {
            cha = cga - as.aba(bza[1]);
         }

         if (bza[2] != null) {
            cia = cha - as.aba(bza[2]);
         }

         if (bza[3] != null) {
            cja = cha - as.aba(bza[3]) - 10;
         }

         if (bqa >= 2 && bqa <= 13) {
            cka = var4 = GameScr.aca - as.aba(bza[0]);
            if (bza[1] != null) {
               var4 = var4 - as.aba(bza[1]) + var1;
            }

            cla = var4;
            if (bza[3] != null) {
               var4 = var4 - as.aba(bza[3]) + var3;
            }

            cja = var4;
            cfa = var4;
            if (bza[2] != null) {
               cia = cla - as.aba(bza[2]) + var2;
            }

            if (bqa == 2) {
               cfa = baa;
            }
         }
      }

      if (bqa >= 2 && bqa <= 12) {
         var4 = 2 * GameScr.aca / 3 - cla;
      } else {
         var4 = 2 * GameScr.aca / 3 - cha;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      if (TileMap.mapID == 48 && TileMap.mapID == 51) {
         cka += var4;
      }

      if (bqa >= 2 && bqa <= 6) {
         cla += var4;
      }

      cfa += var4;
      cga += var4;
      cha += var4;
      cia += var4;
      cja += var4;
      cqa = 3 * GameScr.aba / 4;
      cra = cfa / 3;
      coa = new int[2];
      cpa = new int[2];
      coa[0] = GameScr.aba / 3;
      cpa[0] = cfa / 2 - 8;
      coa[1] = 2 * GameScr.aba / 3;
      cpa[1] = cfa / 2 + 8;
      if (bqa == 2) {
         cra = cfa / 5;
         coa = new int[5];
         cpa = new int[5];
         coa[0] = GameScr.aba / 3;
         cpa[0] = cfa / 3 - 35;
         coa[1] = 3 * GameScr.aba / 4;
         cpa[1] = cfa / 3 + 12;
         coa[2] = GameScr.aba / 3 - 15;
         cpa[2] = cfa / 3 + 12;
         coa[3] = GameScr.aba / 15;
         cpa[3] = cfa / 2 + 12;
         coa[4] = 2 * GameScr.aba / 3 + 25;
         cpa[4] = cfa / 3 + 12;
      }

      if (!aaa) {
         if (bqa == 8) {
            cka = cla = GameScr.afa - 50;
         }

         if (bqa == 10 && bza[3] != null) {
            cja = cia - as.aba(bza[3]);
         }

         if (bqa == 11 || bqa == 12) {
            cja = 0;
         }
      }

   }

   public final void aba(int var1) {
      csa = System.currentTimeMillis();
      if (var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 122 || var1 == 10 || var1 == 8 || var1 == 13 || var1 == 32) {
         bra = var1;
      }

      if (bia != null) {
         bia.aaa(var1);
         bra = 0;
      } else {
         bda.aaa(var1);
         switch(var1) {
         case -39:
         case -2:
            ala[8] = true;
            aka[8] = true;
            return;
         case -38:
         case -1:
            ala[2] = true;
            aka[2] = true;
            return;
         case -22:
         case -7:
            ala[13] = true;
            aka[13] = true;
            return;
         case -21:
         case -6:
            ala[12] = true;
            aka[12] = true;
            return;
         case -5:
         case 10:
            ala[5] = true;
            aka[5] = true;
            return;
         case -4:
            ala[6] = true;
            aka[6] = true;
            return;
         case -3:
            ala[4] = true;
            aka[4] = true;
            return;
         case 35:
            ala[11] = true;
            aka[11] = true;
            return;
         case 42:
            ala[10] = true;
            aka[10] = true;
            return;
         case 48:
            ala[0] = true;
            aka[0] = true;
            return;
         case 49:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
               ala[1] = true;
               aka[1] = true;
            }

            return;
         case 50:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba && !GameScr.dka) {
               ala[2] = true;
               aka[2] = true;
            }

            return;
         case 51:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
               ala[3] = true;
               aka[3] = true;
            }

            return;
         case 52:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba && !GameScr.dka) {
               ala[4] = true;
               aka[4] = true;
            }

            return;
         case 53:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba && !GameScr.dka) {
               ala[5] = true;
               aka[5] = true;
            }

            return;
         case 54:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba && !GameScr.dka) {
               ala[6] = true;
               aka[6] = true;
            }

            return;
         case 55:
            ala[7] = true;
            aka[7] = true;
            return;
         case 56:
            if (bda == GameScr.aaa && aba && !bp.aaa().aba && !GameScr.dka) {
               ala[8] = true;
               aka[8] = true;
            }

            return;
         case 57:
            ala[9] = true;
            aka[9] = true;
            return;
         default:
         }
      }
   }

   public final void aca(int var1) {
      bra = 0;
      switch(var1) {
      case -39:
      case -2:
         ala[8] = false;
         return;
      case -38:
      case -1:
         ala[2] = false;
         return;
      case -22:
      case -7:
         ala[13] = false;
         bwa[13] = true;
         return;
      case -21:
      case -6:
         ala[12] = false;
         bwa[12] = true;
         return;
      case -5:
      case 10:
         ala[5] = false;
         bwa[5] = true;
         return;
      case -4:
         ala[6] = false;
         return;
      case -3:
         ala[4] = false;
         return;
      case 35:
         ala[11] = false;
         bwa[11] = true;
         return;
      case 42:
         ala[10] = false;
         bwa[10] = true;
         return;
      case 48:
         ala[0] = false;
         bwa[0] = true;
         return;
      case 49:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[1] = false;
            bwa[1] = true;
         }

         return;
      case 50:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[2] = false;
            bwa[2] = true;
         }

         return;
      case 51:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[3] = false;
            bwa[3] = true;
         }

         return;
      case 52:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[4] = false;
            bwa[4] = true;
         }

         return;
      case 53:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[5] = false;
            bwa[5] = true;
         }

         return;
      case 54:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[6] = false;
            bwa[6] = true;
         }

         return;
      case 55:
         ala[7] = false;
         bwa[7] = true;
         return;
      case 56:
         if (bda == GameScr.aaa && aba && !bp.aaa().aba) {
            ala[8] = false;
            bwa[8] = true;
         }

         return;
      case 57:
         ala[9] = false;
         bwa[9] = true;
         return;
      default:
      }
   }

   public final void aaa(int var1, int var2) {
      if (ci.aea(var1 - ara) >= 10 || ci.aea(var2 - asa) >= 10) {
         ana = false;
      }

      apa = var1;
      aqa = var2;
      if (++cba > 3) {
         cba = 0;
      }

      ata[cba] = new cf(var1, var2);
   }

   public static boolean aja() {
      return System.currentTimeMillis() - csa >= 800L;
   }

   public final void aba(int var1, int var2) {
      ama = true;
      ana = true;
      csa = System.currentTimeMillis();
      ara = var1;
      asa = var2;
      apa = var1;
      aqa = var2;
   }

   public final void aca(int var1, int var2) {
      ama = false;
      aoa = true;
      fb.ara = -1;
      apa = var1;
      aqa = var2;
   }

   public static boolean aaa(int var0, int var1, int var2, int var3) {
      int var4 = apa + GameScr.aia;
      int var5 = GameScr.aja + aqa;
      return (ama || aoa) && var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }

   public static boolean aaa(int var0, int var1, int var2, int var3, cw var4) {
      int var5 = apa + var4.aaa;
      int var6 = var4.aba + aqa;
      return (ama || aoa) && var5 >= var0 && var5 <= var0 + var2 && var6 >= var1 && var6 <= var1 + var3;
   }

   public static boolean aba(int var0, int var1, int var2, int var3) {
      return (ama || aoa) && apa >= var0 && apa <= var0 + var2 && aqa >= var1 && aqa <= var1 + var3;
   }

   public static void aka() {
      for(int var0 = 0; var0 < 14; ++var0) {
         aka[var0] = false;
      }

      aoa = false;
   }

   public static void ala() {
      for(int var0 = 0; var0 < 14; ++var0) {
         ala[var0] = false;
      }

   }

   public final void aaa(Graphics var1) {
      this.cda.aaa = var1;

      try {
         if (bda != null && !aea) {
            bda.aaa(this.cda);
            this.cda.ada(0, 0, aza, baa);
         }

         this.cda.aaa(-this.cda.aba(), -this.cda.aca());
         this.cda.ada(0, 0, aza, baa);
         as var9 = this.cda;
         String var2 = br.afa;
         if (TileMap.aja != null) {
            var2 = TileMap.aja;
         }

         if (br.aea && (!br.aia || br.aha <= 4990) && !GameScr.dla) {
            fk.aaa(bba - 64, 10, 128, 40, var9);
            if (br.aia) {
               aaa(bba - fw.aqa.aaa(var2) / 2 - 10, 30, var9);
               fw.aqa.aaa(var9, var2, bba + 5, 23, 2);
            } else if (br.aga != null) {
               fw.aqa.aaa(var9, var2, bba, 18, 2);
               fw.aka.aaa(var9, br.aga, bba, 32, 2);
            } else {
               fw.aqa.aaa(var9, var2, bba, 23, 2);
            }
         }

         if (bia != null) {
            bia.aaa(this.cda);
         } else if (bea.aaa) {
            as var11 = this.cda;
            ck var10 = bea;

            try {
               var11.aaa(-var11.aba(), -var11.aca());
               var11.aaa(-ck.aja, 0);
               int var3;
               String[] var4;
               int var5;
               int var6;
               if (afa) {
                  for(var3 = 0; var3 < var10.aba.size(); ++var3) {
                     if (var3 == var10.aca) {
                        var11.aaa(ck.aqa, var10.ada + var3 * var10.afa + 1, var10.aha + 1, 0);
                     } else {
                        var11.aaa(ck.apa, var10.ada + var3 * var10.afa + 1, var10.aha + 1, 0);
                     }

                     if ((var4 = ((ca)var10.aba.elementAt(var3)).aba) == null) {
                        var4 = new String[]{((ca)var10.aba.elementAt(var3)).aaa};
                     }

                     var5 = var10.aha + (var10.aga - var4.length * 14) / 2 + 1;

                     for(var6 = 0; var6 < var4.length; ++var6) {
                        if (GameScr.dja) {
                           if (dc.ada().ada(var4[var6])) {
                              if (aua % 10 > 5) {
                                 fw.ana.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                              } else {
                                 fw.ala.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                              }
                           } else {
                              fw.ala.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                           }
                        } else {
                           fw.ala.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                        }
                     }
                  }
               } else {
                  for(var3 = 0; var3 < var10.aba.size(); ++var3) {
                     if (var3 == var10.aca) {
                        var11.aaa(ck.aqa, var10.ada + var3 * var10.afa + 1, var10.aha + 1 - 23, 0);
                     } else {
                        var11.aaa(ck.apa, var10.ada + var3 * var10.afa + 1, var10.aha + 1 - 23, 0);
                     }

                     if ((var4 = ((ca)var10.aba.elementAt(var3)).aba) == null) {
                        var4 = new String[]{((ca)var10.aba.elementAt(var3)).aaa};
                     }

                     var5 = var10.aha + (var10.aga - var4.length * 14) / 2 + 1 - 23;

                     for(var6 = 0; var6 < var4.length; ++var6) {
                        if (GameScr.dja) {
                           if (dc.ada().ada(var4[var6])) {
                              if (aua % 10 > 5) {
                                 fw.ana.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                              } else {
                                 fw.ala.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                              }
                           } else {
                              fw.ala.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                           }
                        } else {
                           fw.ala.aaa(var11, var4[var6], var10.ada + var3 * var10.afa + var10.afa / 2 - 2, var5 + var6 * 14, 2);
                        }
                     }
                  }
               }

               var11.aaa(-var11.aba(), -var11.aca());
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         GameScr.aba(this.cda);
         if (bta > 0) {
            fk.aaa(30, baa - 118, aza - 60, 80, this.cda);
            aaa(bba, baa - 98, this.cda);
            fw.aqa.aaa(this.cda, "Xin chờ " + bta + "s...", bba, baa - 78, 2);
            return;
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public static void ama() {
      bka.aaa.ana = 500;
      bla.aaa.ana = 500;
      bla.aba.ana = 500;
      bia = null;
   }

   public static void aaa(String var0) {
      bja.aaa(var0, (ca)null, new ca(er.dca, aja, 8882, (Object)null), (ca)null);
      bia = bja;
   }

   public static void aba(String var0) {
      bja.aaa(var0, (ca)null, new ca(er.eha, aja, 8882, (Object)null), (ca)null);
      bia = bja;
      bja.aaa = true;
   }

   public static void ana() {
      aba(er.bda);
   }

   public static void aoa() {
      bja.aba = 500;
      bja.aaa(er.bda, (ca)null, (ca)null, (ca)null);
      bia = bja;
      bja.aaa = true;
   }

   public final void aaa(String var1, String var2, String var3, String var4) {
      bja.aaa(var4, new ca(var1, this, 8881, var3), (ca)null, new ca(var2, this, 8882, (Object)null));
      bia = bja;
   }

   public final void aaa(String var1, String var2, short var3, String var4, String var5) {
      ev var6;
      (var6 = new ev()).addElement(var3);
      var6.addElement(var4);
      bja.aaa(var5, new ca(var1, this, 8883, var6), (ca)null, new ca(var2, this, 8882, (Object)null));
      bia = bja;
   }

   public static void aaa(String var0, int var1) {
      bja.aaa(var0, (ca)null, new ca(er.dca, aja, var1, aza / 2 - 35, baa - 50), (ca)null);
      bia = bja;
   }

   public static void aaa(String var0, int var1, Object var2, int var3, Object var4) {
      bja.aaa(var0, new ca(er.cma, aja, var1, var2), new ca("", aja, var1, var2), new ca(er.cza, aja, var3, var4));
      bia = bja;
   }

   public static void aaa(String var0, ca var1, ca var2) {
      bja.aaa(var0, var1, (ca)null, var2);
      bia = bja;
   }

   public static Image aca(String var0) {
      var0 = "/x" + as.aba + var0;
      Image var1 = null;

      try {
         var1 = Image.createImage(var0);
      } catch (IOException var2) {
      }

      return var1;
   }

   public final boolean aaa(int var1, int var2, int var3) {
      if (aaa) {
         return false;
      } else {
         var1 = var1 == 1 ? 0 : 1;
         if (this.cwa[var1] != -1) {
            return false;
         } else {
            this.cwa[var1] = 0;
            this.cua[var1] = var2;
            this.cva[var1] = var3;
            return true;
         }
      }
   }

   private static void ava() {
      if (!aaa) {
         daa = new Image[3];

         for(int var0 = 0; var0 < 3; ++var0) {
            daa[var0] = aca("/e/w" + var0 + ".png");
         }

         cxa = new int[2];
         cya = new int[2];
         (cza = new int[2])[0] = cza[1] = -1;
      }

   }

   public static boolean ada(int var0, int var1) {
      if (aaa) {
         return false;
      } else {
         int var2 = cza[0] == -1 ? 0 : 1;
         if (cza[var2] != -1) {
            return false;
         } else {
            cza[var2] = 0;
            cxa[var2] = var0;
            cya[var2] = var1;
            return true;
         }
      }
   }

   public final void apa() {
      if (!aaa) {
         for(int var1 = 0; var1 < 2; ++var1) {
            if (this.cwa[var1] != -1) {
               int var10002 = this.cwa[var1]++;
               if (this.cwa[var1] >= 5) {
                  this.cwa[var1] = -1;
               }

               if (var1 == 0) {
                  var10002 = this.cua[var1]--;
               } else {
                  var10002 = this.cua[var1]++;
               }

               var10002 = this.cva[var1]--;
            }
         }
      }

   }

   public static boolean aea(int var0, int var1) {
      return var0 >= GameScr.aia && var0 <= GameScr.aia + GameScr.aba && var1 >= GameScr.aja && var1 <= GameScr.aja + GameScr.aca + 30;
   }

   public final void aba(as var1) {
      if (!aaa) {
         for(int var2 = 0; var2 < 2; ++var2) {
            if (this.cwa[var2] != -1 && aea(this.cua[var2], this.cva[var2])) {
               var1.aaa(dca[var2][this.cwa[var2]], this.cua[var2], this.cva[var2], 3);
            }
         }
      }

   }

   public static void aaa(int var0, int var1, as var2) {
      int var3 = aua % 3;
      var2.aaa(dba, 0, var3 << 4, 16, 16, 0, var0, var1, 3);
   }

   public final void aqa() {
      aea = false;
      this.dda = true;
   }

   public static boolean aca(int var0, int var1, int var2, int var3) {
      return (ama || aoa) && apa >= var0 && apa <= var0 + var2 && aqa >= var1 && aqa <= var1 + var3;
   }

   public final void aaa(int var1, Object var2) {
      int var4;
      Service var10000;
      String var80;
      short var81;
      Char var82;
      int var83;
      String var84;
      fe var85;
      Service var91;
      gg[] var92;
      switch(var1) {
      case 1608:
         Service.aaa().aaa((String)bla.aaa.aea(), (String)bla.aba.aea(), (byte)0);
         ama();
         return;
      case 1700:
         Service.aaa().aaa((short)100, bka.aaa.aea(), GameScr.gra);
         ama();
         return;
      case 8881:
         ex.aba((String)var2);
         bia = null;
         return;
      case 8882:
         bia = null;
         return;
      case 8883:
         var81 = (Short)((ev)var2).elementAt(0);
         ex.aaa((String)((ev)var2).elementAt(0), var81);
         bia = null;
         return;
      case 8884:
         ama();
         bfa.aaa();
         return;
      case 8885:
         Class_ab.aja.notifyDestroyed();
         return;
      case 8887:
         ama();
         var1 = (Integer)var2;
         Service.aaa().ara(var1);
         return;
      case 8888:
         var1 = (Integer)var2;
         var10000 = Service.aaa();
         var83 = var1;
         var91 = var10000;
         var85 = null;

         try {
            (var85 = new fe((byte)81)).aba().writeInt(var83);
            var91.aaa.aaa(var85);
         } catch (Exception var76) {
            var76.printStackTrace();
         } finally {
            var85.aca();
         }

         ama();
         return;
      case 8889:
         var80 = (String)var2;
         ama();
         Service.aaa().aia(var80);
         return;
      case 8890:
         ama();
         Service.aaa().ana((Integer)var2);
         return;
      case 16081:
         Service.aaa().aaa((String)bla.aaa.aea(), (String)bla.aba.aea(), (byte)1);
         ama();
         return;
      case 88810:
         var1 = (Integer)var2;
         ama();
         Service.aaa().aka(var1);
         return;
      case 88811:
         ama();
         Service.aaa().aha();
         return;
      case 88812:
         var82 = (Char)var2;
         ama();
         var10000 = Service.aaa();
         var83 = var82.asa;
         var91 = var10000;
         var85 = null;

         try {
            (var85 = new fe((byte)66)).aba().writeInt(var83);
            var91.aaa.aaa(var85);
            return;
         } catch (Exception var78) {
            var78.printStackTrace();
         } finally {
            var85.aca();
         }

         return;
      case 88813:
         ama();
         var92 = (gg[])var2;
         Service.aaa().aaa(var92);
         return;
      case 88814:
         var92 = (gg[])var2;
         ama();
         Service.aaa().aba(var92);
         return;
      case 88815:
         GameScr.ava();
         GameScr.boa();
         return;
      case 88816:
         var10000 = Service.aaa();
         String var10001 = bla.aaa.aea();
         String var87 = bla.aba.aea();
         var84 = var10001;
         var91 = var10000;
         fe var89 = null;

         try {
            (var89 = Service.aba((byte)-99)).aba().writeUTF(var84);
            var89.aba().writeUTF(var87);
            var91.aaa.aaa(var89);
         } catch (Exception var74) {
            var74.printStackTrace();
         } finally {
            var89.aca();
         }

         ama();
         return;
      case 88817:
         if (Char.getMyChar().dra != null) {
            Service.aaa().aca(Char.getMyChar().dra.template.aaa, bea.aca, 0);
            return;
         }

         Service.aaa().aca(0, bea.aca, 0);
         return;
      case 88818:
         var81 = (Short)var2;
         Service.aaa().aaa(var81, bka.aaa.aea());
         ama();
         return;
      case 88819:
         var81 = (Short)var2;
         var10000 = Service.aaa();
         short var88 = var81;
         var91 = var10000;
         var85 = null;

         try {
            (var85 = new fe((byte)34)).aba().writeShort(var88);
            var91.aaa.aaa(var85);
         } catch (Exception var72) {
            var72.printStackTrace();
         } finally {
            var85.aca();
         }

         GameScr.ava().bpa();
         return;
      case 88820:
         String[] var90 = (String[])var2;
         if (Char.getMyChar().dra == null) {
            return;
         }

         Integer var86 = new Integer(bea.aca);
         if (var90.length <= 1) {
            cq.aaa("", 1, Char.getMyChar().dra);
            Service.aaa().aca(Char.getMyChar().dra.template.aaa, var86, 0);
            return;
         }

         ev var3 = new ev();

         for(var4 = 0; var4 < var90.length - 1; ++var4) {
            var3.addElement(new ca(var90[var4 + 1], aja, 88821, var86));
         }

         bea.aaa(var3);
         return;
      case 88821:
         var4 = (Integer)var2;
         cq.aaa("", 1, Char.getMyChar().dra);
         Service.aaa().aca(Char.getMyChar().dra.template.aaa, var4, bea.aca);
         return;
      case 88822:
         cq.aaa("", 1, Char.getMyChar().dra);
         Service.aaa().aca(Char.getMyChar().dra.template.aaa, bea.aca, 0);
         return;
      case 88823:
         aaa(er.fxa);
         return;
      case 88824:
         aaa(er.fya);
         return;
      case 88825:
         aaa(er.qwa);
         return;
      case 88826:
         aaa(er.qya);
         return;
      case 88827:
         aaa(er.qxa);
         return;
      case 88828:
         aaa(er.qza);
         return;
      case 88829:
         if ((var80 = bka.aaa.aea()).equals("")) {
            return;
         }

         Service.aaa().aaa(var80, (Integer)var2);
         aba(er.bda);
         return;
      case 88830:
         var1 = (Integer)var2;
         ama();
         Service.aaa().bda(var1);
         return;
      case 88831:
         var1 = (Integer)var2;
         ama();
         Service.aaa().bea(var1);
         return;
      case 88832:
         var80 = bka.aaa.aea();
         ama();
         if (!var80.equals("")) {
            Service.aaa().ama(var80);
            return;
         }
         break;
      case 88833:
         var80 = bka.aaa.aea();
         ama();
         if (!var80.equals("")) {
            try {
               var1 = Integer.parseInt(var80);
               if (Char.getMyChar().cqa >= var1 && var1 >= 0) {
                  Service.aaa().bfa(var1);
                  return;
               }

               be.aaa(er.raa, 20, fw.ala);
               return;
            } catch (Exception var71) {
               return;
            }
         }
         break;
      case 88834:
         var80 = bka.aaa.aea();
         ama();
         if (!var80.equals("")) {
            try {
               if ((var1 = Integer.parseInt(var80)) <= 0) {
                  return;
               }

               Service.aaa().bga(var1);
               return;
            } catch (Exception var70) {
               return;
            }
         }
         break;
      case 88835:
         var1 = Integer.parseInt((String)var2);
         var83 = Integer.parseInt(bka.aaa.aea());
         bia = null;
         if (var83 > 0 && var83 < Char.getMyChar().arrItemBag[var1].aea) {
            Service.aaa().aka(var1, var83);
            return;
         }

         aaa(er.rba);
         return;
      case 88836:
         bka.aaa.aba(6);
         bka.aaa(er.qaa, new ca(er.ega, aja, 888361, (Object)null), 1);
         return;
      case 88837:
         var80 = bka.aaa.aea();
         ama();

         try {
            Service.aaa().bja(Integer.parseInt(var80.trim()));
            return;
         } catch (Exception var69) {
            return;
         }
      case 88838:
         var80 = bla.aaa.aea().trim();
         var84 = bla.aba.aea().trim();
         ama();
         if (var80.length() >= 6 && var84.length() >= 6) {
            try {
               var1 = Integer.parseInt(var80);
               var83 = Integer.parseInt(var84);
               if (var1 >= 99999 && var83 >= 99999) {
                  Service.aaa().ala(var1, var83);
                  return;
               }

               aaa(er.pwa);
               return;
            } catch (Exception var68) {
               aaa(er.pva);
               return;
            }
         }

         aaa(er.pua);
         return;
      case 88839:
         var80 = bka.aaa.aea();
         ama();

         try {
            Integer.parseInt(var80);
            aaa(er.rda, 888391, var80, 8882, (Object)null);
            return;
         } catch (Exception var67) {
            be.aaa(er.pxa, 20, fw.ala);
            return;
         }
      case 88840:
         var82 = (Char)var2;
         ama();
         Service.aaa().ala(var82.asa);
         return;
      case 88841:
         var82 = (Char)var2;
         ama();
         Service.aaa().ama(var82.asa);
         return;
      case 88842:
         Service.aaa().baa();
         return;
      case 88843:
         var84 = bka.aaa.aea();
         ama();
         if (var84.equals("")) {
            aaa(er.rca);
            return;
         }

         Service.aaa().aqa(var84);
         return;
      case 888181:
         var81 = (Short)var2;
         Service.aaa().aba(var81, bka.aaa.aea());
         ama();
         return;
      case 888361:
         var80 = bka.aaa.aea();
         ama();
         if (var80.length() >= 6 && !var80.equals("")) {
            try {
               Service.aaa().bha(Integer.parseInt(var80));
               return;
            } catch (Exception var66) {
               aaa(er.pva);
               return;
            }
         }

         aaa(er.pua);
         return;
      case 888391:
         try {
            ama();
            var83 = Integer.parseInt((String)var2);
            Service.aaa().bia(var83);
            return;
         } catch (Exception var65) {
            return;
         }
      }

   }

   public static void ara() {
      aaa = false;
      aba = false;
      aca = false;
      ada = false;
      aea = false;
      afa = false;
      aga = false;
      aha = false;
      aia = false;
      aja = null;
      aka = null;
      bwa = null;
      ala = null;
      ama = false;
      ana = false;
      aoa = false;
      apa = 0;
      aqa = 0;
      ara = 0;
      asa = 0;
      ata = null;
      aua = 0;
      ava = 0;
      awa = false;
      axa = false;
      bxa = 0L;
      bya = 0L;
      aya = false;
      aza = 0;
      baa = 0;
      bba = 0;
      bca = 0;
      bda = null;
      bea = null;
      bfa = null;
      bga = null;
      bha = null;
      bia = null;
      bja = null;
      bka = null;
      bla = null;
      bza = null;
      caa = 0;
      cba = 0;
      bma = 0;
      cca = null;
      cea = false;
      cfa = 0;
      cga = 0;
      cha = 0;
      cia = 0;
      cja = 0;
      cka = 0;
      cla = 0;
      cma = null;
      cna = null;
      bna = null;
      boa = 0;
      bpa = 0;
      coa = null;
      cpa = null;
      cqa = 0;
      cra = 0;
      bqa = 0;
      csa = 0L;
      bra = 0;
      cta = null;
      cxa = null;
      cya = null;
      cza = null;
      daa = null;
      dba = null;
      dca = null;
      bsa = false;
      dea = null;
      dfa = null;
      dga = null;
      bta = 0;
      bua = 0L;
      bva = 0L;
   }
}
