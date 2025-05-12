import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public abstract class Auto {
   public boolean afa;
   public int aga;
   public int aha;
   public boolean aia;
   public int aja;
   public int aka;
   private int aaa;
   private int aba;
   public int ala;
   public long ama;
   public long ana;
   public Auto aoa;
   public static boolean apa;
   public static bc aqa;
   public static bc ara;
   public static bc asa;
   public static bc ata;
   public static bc aua;
   public static boolean ava;
   public static ev awa;
   private static ev aca;
   public static int axa;
   private static boolean ada;
   private static long aea;
   public static ev aya;
   public static ev aza;
   protected long baa = 0L;
   protected long bba = 0L;
   protected long bca = 0L;
   protected boolean bda = false;
   private static ev bha;
   private static long bia;
   byte bea;
   ByteArrayInputStream bfa;
   DataInputStream bga;

   static {
      aa.aaa(61);
      apa();
   }

   public static void aaa(ac var0) {
      if (var0.axa || var0.aga != 0 && var0.ava != 3 && var0.aca != var0.ada().afa) {
         if (!var0.axa && var0.ava == 0) {
            if (var0.aca == 10 * var0.ada().afa) {
               var0.ava = 1;
            } else {
               if (var0.aca != 100 * var0.ada().afa && var0.ara != 89) {
                  return;
               }

               var0.ava = 2;
            }
         }

         if (!awa.contains(var0)) {
            awa.addElement(var0);
         }
      }

   }

   public static void aba(ac var0) {
      awa.removeElement(var0);
   }

   public static void aia() {
      awa.removeAllElements();
   }

   public static void aba(fz var0) {
      if (var0 != fz.ala()) {
         if (aca.contains(var0)) {
            if (var0.dla != 3 && var0.dza != fz.ala().asa) {
               aca.removeElement(var0);
               return;
            }
         } else if (var0.dla == 3 || var0.dza == fz.ala().asa) {
            aca.addElement(var0);
            if (gj.aba && ci.aea(fz.ala().ala - var0.ala) <= 300 && ci.aea(fz.ala().ama - var0.ama) <= 300) {
               gj.aea();
            }
         }
      }

   }

   public static void aja() {
      aca.removeAllElements();
   }

   public void a_() {
      this.aga = -1;
      this.aha = -1;
      this.aia = false;
      this.aoa = null;
      this.ala = fz.ala().csa;
      this.ama = fz.ala().aja;
      this.ana = System.currentTimeMillis();
      this.afa = false;
      Code.asa = -1;
      Code.awa = 0;
      apa = fz.ala().aea;
      aqa = gf.fwa[0] != null ? gf.fwa[0] : null;
      ara = gf.fwa[1] != null ? gf.fwa[1] : null;
      asa = gf.fwa[2] != null ? gf.fwa[2] : null;
      ata = gf.fwa[3] != null ? gf.fwa[3] : null;
      aua = gf.fwa[4] != null ? gf.fwa[4] : null;
      this.b_();
   }

   protected void b_() {
      ava = false;
      Code.bca = System.currentTimeMillis();
   }

   protected static boolean aca(fz var0) {
      return var0.bba <= 0 || var0.aqa == 14 || var0.aqa == 5;
   }

   protected static boolean aka() {
      return aca(fz.ala());
   }

   public static void aaa(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
      }

   }

   private void aaa(byte var1) {
      this.bea = var1;
   }

   private void aaa(byte[] var1) {
      this.bfa = new ByteArrayInputStream(var1);
      this.bga = new DataInputStream(this.bfa);
   }

   private void aea() {
      switch(this.bea) {
      case 60:
      case 61:
         try {
            if (fz.ala().cya != null && fz.ala().asa == this.bga.readInt() && fz.ala().aza > fz.ala().cya.aja) {
               fz var1 = fz.ala();
               var1.aza -= fz.ala().cya.aja;
            }
         } catch (IOException var2) {
            var2.printStackTrace();
         }
      default:
      }
   }

   public static boolean aaa(int var0) {
      return var0 >= 162 && var0 <= 165;
   }

   protected final void aaa(int var1, int var2, int var3, int var4) {
      if ((var1 < 139 || var1 > 148) && gn.aoa >= 139 && gn.aoa <= 148) {
         ala();
      } else {
         if (gn.aea(var1) && fz.ala().dka > 0) {
            var1 = 23;
            var2 = axa;
            var4 = -1;
            var3 = -1;
            if (fz.ala().dla != 3) {
               this.bda = true;
               gm.aaa().awa(3);
            }
         }

         if (gn.aoa != var1) {
            if (aaa(var1)) {
               if (!aaa((int)gn.aoa)) {
                  gf.ava().aba(1100014, (Object)null);
                  aaa(100L);
               }

               if (fz.ala().dka <= 0) {
                  if (fz.afa(833) != null && !aaa((int)gn.aoa)) {
                     System.out.println("Dung truyen thuyet lenh");
                     gm.aaa().aea(fz.afa(833).ada);
                     return;
                  }

                  if (fz.afa(833) == null && fz.ala().cta >= 100 && !aaa((int)gn.aoa)) {
                     gm.aaa().aba(14, Code.cfa, 1);
                     gj.aha();
                     return;
                  }

                  if (gn.aoa == 162) {
                     if (var1 == 163) {
                        Code.afa("nm1");
                        aaa(500L);
                     }

                     if (var1 == 164) {
                        Code.afa("nm2");
                        aaa(500L);
                     }

                     if (var1 == 165) {
                        Code.afa("nm");
                        aaa(500L);
                     }
                  }
               } else if (fz.afa(257) != null) {
                  gm.aaa().aea(fz.afa(257).ada);
               } else {
                  be.aaa("Hết hlct", 50, fw.aja);
               }

               return;
            }

            if (!gn.aka(var1)) {
               if (gn.aea(var1)) {
                  try {
                     Thread.sleep(1L);
                     return;
                  } catch (InterruptedException var6) {
                  }
               }

               return;
            }
         } else {
            if (var2 == -1) {
               if (Code.ava) {
                  int[] var5 = Code.axa;
                  Code.awa = 0;
                  aba(this.aha = var5[0]);
               } else {
                  this.aca(var2);
               }
            } else if (var2 >= 0) {
               aba(var2);
            }

            if (gn.ala == this.aha && var3 > 0 && var4 > 0 && fz.ala().ala != var3 && fz.ala().ama != var4) {
               if (this instanceof TuDanh || this instanceof ej) {
                  fz.aca(var3, var4);
                  return;
               }

               this.aca(aba(var3, var4));
            }
         }
      }

   }

   protected static void ala() {
      fz var0 = fz.ala();
      if (!fz.aja(37) && !fz.aja(35)) {
         av var1;
         if ((var1 = gf.aia(13)) != null && Math.abs(var1.ala - var0.ala) <= 400 && Math.abs(var1.ama - var0.ama) <= 400) {
            fz.aca(var1.ala > 400 ? var1.ala - 400 : var1.ala + 400, var1.ama);
         }

         gm.aaa().aea();
      } else {
         fz.aca(var0.ala, gn.ada);
      }

      long var5 = System.currentTimeMillis();

      while(var0.bba > 0 && System.currentTimeMillis() - var5 < 5L) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var4) {
         }
      }

   }

   protected static void aaa(boolean var0) {
      fz var1 = fz.ala();
      if (var0) {
         if (ada) {
            if (System.currentTimeMillis() - aea < 2L) {
               return;
            }

            ada = false;
         } else if (fz.fla && gf.bfa.size() > 0) {
            for(int var2 = 0; var2 < gf.bfa.size(); ++var2) {
               ep var3;
               if ((var3 = (ep)gf.bfa.elementAt(var2)).aaa != var1.asa && var3.afa != null && var3.afa.bba > 0 && var3.afa.cua.aaa == 6) {
                  gf.aca("Chờ hồi sinh!");
                  aea = System.currentTimeMillis();
                  ada = true;
                  return;
               }
            }
         }
      }

      try {
         Thread.sleep(5L);
      } catch (InterruptedException var5) {
      }

      awa.removeAllElements();
      ava = false;
      gj.aaa = true;
      if (eg.aaa && fz.ala().cta > 0) {
         gm.aaa().ala();
      } else {
         gm.aaa().aka();
         gn.aga();
      }

      gj.aaa = false;

      try {
         Thread.sleep(5L);
      } catch (InterruptedException var4) {
      }

   }

   protected static void aba(int var0) {
      if (gn.ala != var0) {
         av var1 = gf.aia(13);
         int var2 = -1;
         if (var1 != null && var1.aqa != 15) {
            if (Math.abs(var1.ala - fz.ala().ala) > 22 || Math.abs(var1.ama - fz.ala().ama) > 22) {
               fz.aca(var1.ala, var1.ama);

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var4) {
               }
            }
         } else {
            if (gn.aoa != 99 && gn.aoa != 103 && gn.aoa != 134 && gn.aoa != 135 && gn.aoa != 136 && gn.aoa != 137) {
               return;
            }

            if ((var2 = fz.aia(37)) < 0 && (var2 = fz.aia(35)) < 0) {
               return;
            }
         }

         if (System.currentTimeMillis() - bia < 100L) {
            return;
         }

         gm.aaa().aaa(var0, var2);
         gn.aga();
         bia = System.currentTimeMillis();

         try {
            Thread.sleep(1L);
            return;
         } catch (InterruptedException var5) {
         }
      }

   }

   protected final void aca(int var1) {
      if (!this.afa || Code.aha == null || fz.ala().cea.equals(Code.aha)) {
         gf var2 = gf.ava();
         av var3 = gf.aia(13);
         int var4 = -1;
         if (var3 != null && var3.aqa != 15) {
            if (Math.abs(var3.ala - fz.ala().ala) > 22 || Math.abs(var3.ama - fz.ala().ama) > 22) {
               fz.aca(var3.ala, var3.ama);

               try {
                  Thread.sleep(100L);
               } catch (InterruptedException var8) {
               }
            }
         } else {
            if (gn.aoa != 99 && gn.aoa != 103 && gn.aoa != 134 && gn.aoa != 135 && gn.aoa != 136 && gn.aoa != 137) {
               this.aha = gn.ala;
               bia = System.currentTimeMillis();
               return;
            }

            if ((var4 = fz.aia(37)) < 0 && (var4 = fz.aia(35)) < 0) {
               this.aha = gn.ala;
               bia = System.currentTimeMillis();
               return;
            }
         }

         if (System.currentTimeMillis() - bia < 100L) {
            return;
         }

         gm.aaa().aea();
         gj.afa();
         int var5 = -1;
         if (var1 < 0) {
            var1 = var2.eea.length - 1;
         } else if (var1 >= var2.eea.length) {
            var1 = 0;
         }

         if (this instanceof fl) {
            var5 = (var1 / 5 + 1) * 5 % var2.eea.length;
         } else if (!fz.fga) {
            var5 = (var1 + 1) % var2.eea.length;
         } else {
            int var6 = -1;

            for(int var7 = (var1 + 1) % var2.eea.length; var7 != var1; var7 = (var7 + 1) % var2.eea.length) {
               if (ADV.aca && (var6 == -1 || var2.eea[var7] > var6)) {
                  var5 = var7;
                  var6 = var2.eea[var7];
               }

               if (!ADV.aca && (var6 == -1 || var2.eea[var7] < var6)) {
                  var5 = var7;
                  var6 = var2.eea[var7];
               }
            }
         }

         gm.aaa().aaa(var5, var4);
         this.aha = var5;
         gn.aga();
         if (this.afa()) {
            gm.aaa().aka("khu ".concat(String.valueOf(var5)));
         }

         bia = System.currentTimeMillis();

         try {
            Thread.sleep(1L);
            return;
         } catch (InterruptedException var9) {
         }
      }

   }

   private static boolean aaa(ac var0, int var1) {
      if (var0.ara == 202 && var0.aga == 8) {
         return false;
      } else {
         return var1 < 0 || var0.ara == var1;
      }
   }

   private static boolean aaa(int var0, int var1) {
      return var1 < 0 || var0 == 0 && (var1 & 1) > 0 || var0 == 1 && (var1 & 2) > 0 || var0 == 2 && (var1 & 4) > 0 || var0 == 3 && (var1 & 8) > 0;
   }

   public final int aaa(boolean var1, boolean var2, boolean var3) {
      if (this.aia) {
         return -1;
      } else {
         int var4 = 0;
         if (var1) {
            var4 = 1;
         }

         if (var2) {
            var4 |= 2;
         }

         if (var3) {
            var4 |= 4;
         }

         return var4;
      }
   }

   protected static boolean aaa(fz var0, fz var1) {
      return var1.aqa != 14 && var1.aqa != 5 && var1.aqa != 15 && (var1.dla == 3 || var0.dla == 3 || var1.dla == 1 && var0.dla == 1 || var1.dla == 5 && var0.dla == 4 || var1.dla == 4 && var0.dla == 5 || var0.dza >= 0 && var0.dza == var1.asa || var0.dya >= 0 && var0.dya == var1.asa || var1.dza >= 0 && var1.dza == var0.asa);
   }

   protected final void aca(ac var1) {
      if (var1 != null) {
         int var2 = var1.aha;
         int var3 = var1.aia;
         fz var4 = fz.ala();
         if (gn.aoa == 35) {
            if (var1.aha == 1428 && var1.aia == 528) {
               var2 = 1452;
               var3 = 552;
            } else if (var1.aha == 1284 && var1.aia == 528) {
               var2 = 1308;
               var3 = 552;
            } else if (var1.aha == 1836 && var1.aia == 648) {
               var2 = 1812;
               var3 = 672;
            }
         } else if (gn.aoa == 37) {
            if ((var1.aha == 876 || var1.aha == 900) && var1.aia == 408) {
               var2 = 900;
               var3 = 432;
            } else if ((var1.aha == 828 || var1.aha == 852) && var1.aia == 360) {
               var2 = 852;
               var3 = 384;
            } else if ((var1.aha == 924 || var1.aha == 876) && var1.aia == 624) {
               var2 = 924;
               var3 = 648;
            } else if (var1.aha == 732 && var1.aia == 600 || var1.aha == 756 && var1.aia == 576) {
               var2 = 756;
               var3 = 600;
            }
         }

         if (fz.ada(var2, var3)) {
            this.aaa = this.aja;
            this.aba = this.aka;
            this.aja = var4.ala;
            this.aka = var4.ama;
            var4.dpa = var1;

            try {
               Thread.sleep(1L);
               return;
            } catch (InterruptedException var6) {
               return;
            }
         }

         var4.dpa = null;
      }

   }

   protected static void ada(fz var0) {
      if (var0 != null) {
         fz var1 = fz.ala();
         fz.aca(var0.ala, gn.ada(var0.ala, var0.ama));
         var1.dsa = var0;

         try {
            Thread.sleep(1L);
            return;
         } catch (InterruptedException var3) {
         }
      }

   }

   public static void aaa(em var0) {
      if (aya.size() > 0 || aza.size() > 0) {
         bd[] var1 = new bd[aya.size() + aza.size()];

         int var2;
         for(var2 = 0; var2 < aya.size(); ++var2) {
            var1[var2] = new bd();
            var1[var2].ada = gf.bca[var0.aaa - 1];
            var1[var2].aba = (ac)aya.elementAt(var2);
         }

         for(var2 = 0; var2 < aza.size(); ++var2) {
            var1[var2 + aya.size()] = new bd();
            var1[var2 + aya.size()].ada = gf.bca[var0.aaa - 1];
            var1[var2 + aya.size()].aca = (fz)aza.elementAt(var2);
         }

         if (var1.length > 1) {
            er var3 = new er();
            if (var1[0].aba != null) {
               var3 = new er(var1[0].aba.ada, var1[0].aba.aea);
            } else if (var1[0].aca != null) {
               var3 = new er(var1[0].aca.ala, var1[0].aca.ama);
            }

            ev var4 = new ev();

            for(int var5 = 1; var5 < var1.length; ++var5) {
               if (var1[var5].aba != null) {
                  var4.addElement(new er(var1[var5].aba.ada, var1[var5].aba.aea));
               } else if (var1[var5].aca != null) {
                  var4.addElement(new er(var1[var5].aca.ala, var1[var5].aca.ama));
               }

               if (var5 > 5) {
                  break;
               }
            }

            en.aaa(var4, var3, fz.ala().aza());
         }

         fz.ala().hca = var1;
      }

   }

   private boolean afa() {
      return this.afa && gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa;
   }

   protected final boolean ama() {
      return this.afa && gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa != fz.ala().asa;
   }

   private void aga() {
      if (Code.ava) {
         aba(this.aha = Code.axa[Code.awa = (Code.awa + 1) % Code.axa.length]);
         if (this.afa()) {
            gm.aaa().aka("khu " + this.aha);
            return;
         }
      } else {
         this.aca(gn.ala);
      }

   }

   private boolean aaa(int var1, int var2, int var3) {
      if (var1 >= 4) {
         return false;
      } else {
         for(int var4 = 0; var4 < awa.size(); ++var4) {
            ac var5;
            if ((var5 = (ac)awa.elementAt(var4)).ava != 0 && var5.aba > 0 && var5.aga != 0) {
               boolean var6;
               label70: {
                  if (var5.ava == 3) {
                     if (this instanceof fl || this instanceof TuDanh) {
                        var6 = false;
                        break label70;
                     }
                  } else if ((!var5.axa || (var1 & 6) == 6) && (var5.ava != 1 || (var1 & 2) != 0) && (var5.ava != 2 || (var1 & 4) != 0)) {
                     var6 = false;
                     break label70;
                  }

                  var6 = true;
               }

               if (var6 && ci.aea(var2 - var5.aha) <= 200 && ci.aea(var3 - var5.aia) <= 100) {
                  return true;
               }
            } else {
               awa.removeElement(var5);
               --var4;
            }
         }

         return false;
      }
   }

   private boolean aea(int var1, int var2) {
      if (fz.fma && !(this instanceof fl)) {
         for(int var3 = 0; var3 < aca.size(); ++var3) {
            fz var4;
            if (!aca(var4 = (fz)aca.elementAt(var3)) && ci.aea(var1 - var4.ala) <= 300 && ci.aea(var2 - var4.ama) <= 300) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected static ac aba(int var0, int var1) {
      ac var2 = null;
      fz var3 = fz.ala();
      int var4 = var0 - var3.aga() - 10;
      int var5 = var0 + var3.aga() + 10;
      int var6 = var1 - var3.aha() - (var3.cua.aaa != 0 && var3.cua.aaa != 1 && var3.cua.aaa != 3 && var3.cua.aaa != 5 ? 0 : 40);
      int var7;
      if ((var7 = var1 + var3.aha()) > var1 + 30) {
         var7 = var1 + 30;
      }

      int var8 = -1;

      for(int var9 = 0; var9 < gf.bna.size(); ++var9) {
         ac var10 = (ac)gf.bna.elementAt(var9);
         int var11 = Math.abs(var0 - var10.ada);
         int var12 = Math.abs(var1 - var10.aea);
         var11 = var11 > var12 ? var11 : var12;
         if (var4 <= var10.ada && var10.ada <= var5 && var6 <= var10.aea && var10.aea <= var7 && var10.aga != 0 && var10.aga != 1 && (var8 == -1 || var11 < var8)) {
            var2 = var10;
            var8 = var11;
         }
      }

      return var2;
   }

   protected final void aaa(int var1, boolean var2) {
      if (Code.asa < 0 || Code.asa >= Code.ata.size()) {
         Code.asa = 0;
      }

      while(true) {
         int var3 = (Integer)Code.ata.elementAt(Code.asa);
         int var4 = (Integer)Code.aua.elementAt(Code.asa);
         ac var5 = aba(var3, var4);
         if (!this.aaa(var1, var3, var4) && !this.aea(var3, var4) && var5 != null && !this.aaa(var1, var5.ada, var5.aea)) {
            this.aaa = fz.ala().ala;
            this.aba = fz.ala().ama;
            fz.aca(var3, var4);
            fz.ala().dpa = var5;
            gm.aaa().aaa(var5.ala);

            try {
               Thread.sleep(1L);
               return;
            } catch (InterruptedException var7) {
               return;
            }
         }

         if (++Code.asa == Code.ata.size()) {
            Code.asa = 0;
            if (fz.fea && var2) {
               this.aga();
            }
         }
      }
   }

   protected ac aaa(fz var1, int var2, int var3, fz var4, boolean var5) {
      if (Code.ara && Code.ata.size() > 0) {
         this.aaa(var3, var5);
         return aba(var1.ala, var1.ama);
      } else {
         int var6 = var3;
         int var7 = var2;
         var3 = var1.ama;
         var2 = var1.ala;
         Auto var8 = this;
         int var9 = -1;
         int var10 = -1;
         int var11 = -1;
         ac var12 = null;
         ev var13 = gf.bna;
         int var14 = 0;

         ac var15;
         while(true) {
            if (var14 >= var13.size()) {
               var15 = var12;
               break;
            }

            ac var16;
            if ((var16 = (ac)var13.elementAt(var14)) != null && var16.aba > 0 && var16.aga != 0 && var16.aga != 1 && aaa(var16, var7) && aaa(var16.ava, var6) && (var4 == null || var4.asa == fz.ala().asa || ci.aaa(var16.aha, var16.aia, var4.ala, var4.ama) <= 1000) && !var8.aaa(var6, var16.ada, var16.aea) && !var8.aea(var16.ada, var16.aea)) {
               if (var8.aia) {
                  if (var8.aga != 157 && var8.aga != 158 && var8.aga != 159) {
                     if (var9 == -1 || var16.ava < var11 || var16.aia < var9 || var16.aia == var9 && var16.aha < var10) {
                        var11 = var16.ava;
                        var9 = var16.aia;
                        var10 = var16.aha;
                        var12 = var16;
                     }
                  } else if (var16.axa) {
                     var15 = var16;
                     break;
                  }
               } else if (Code.ana == -1 || ci.aaa(Code.aoa, Code.apa, var16.aha, var16.aia) <= Code.ana) {
                  ev var17 = var13;
                  ac var18 = var16;
                  int var19 = 0;

                  int var20;
                  for(var20 = 0; var20 < var17.size(); ++var20) {
                     ac var21;
                     if ((var21 = (ac)var17.elementAt(var20)) != null && var21.aba > 0 && var21.aga != 0 && var21.aga != 1 && aaa(var18, var7) && aaa(var18.ava, var6) && ci.aea(var21.ada - var18.ada) <= 100 && ci.aea(var21.aea - var18.aea) <= 50) {
                        ++var19;
                     }
                  }

                  if (var19 > aqa.aia) {
                     var19 = aqa.aia;
                  }

                  var19 = var18.ava << 4 | var19 & 15;
                  var20 = var4 != null && var4.asa != fz.ala().asa ? ci.aaa(var4.ala, var4.ama, var16.aha, var16.aia) : ci.aaa(var2, var3, var16.aha, var16.aia);
                  if (var19 > var11 || var19 == var11 && var20 < var9) {
                     var11 = var19;
                     var9 = var20;
                     var12 = var16;
                  }
               }
            }

            ++var14;
         }

         if (var15 != null) {
            this.aca(var15);
            return var15;
         } else {
            if (System.currentTimeMillis() - this.baa > 1L && !this.c_()) {
               if (this.aia) {
                  int var23;
                  if ((var23 = gn.aha(gn.aoa)) >= 0) {
                     this.aga = var23;
                  }

                  this.aja = this.aka = -1;

                  try {
                     Thread.sleep(5L);
                  } catch (InterruptedException var22) {
                  }
               } else if (var5 && fz.fea) {
                  this.aga();
               }
            }

            return null;
         }
      }
   }

   protected final fz aaa(fz var1, int var2) {
      for(int var3 = 0; var3 < gf.bla.size(); ++var3) {
         fz var4;
         if ((var4 = (fz)gf.bla.elementAt(var3)) != null && !aca(var4) && !this.aaa(var2, var4.ala, var4.ama) && !this.aea(var4.ala, var4.ama) && !Code.ada(var4.cea) && ff.aca(var4.cea) && (var4.dla == 1 || var4.dza == var1.asa || var1.dka < 15)) {
            return var4;
         }
      }

      return null;
   }

   protected static fz aea(fz var0) {
      fz var1 = var0;
      int var2 = var0.ama;
      int var3 = var0.ala;
      var0 = null;
      fz var4 = fz.ala();
      int var5 = var3 - var4.aga() - 10;
      int var6 = var3 + var4.aga() + 10;
      int var7 = var2 - var4.aha() - (var4.cua.aaa != 0 && var4.cua.aaa != 1 && var4.cua.aaa != 3 && var4.cua.aaa != 5 ? 0 : 40);
      int var8 = var2 + var4.aha() + (var4.cua.aaa != 0 && var4.cua.aaa != 1 && var4.cua.aaa != 3 && var4.cua.aaa != 5 ? 0 : 40);
      int var9 = -1;

      for(int var10 = 0; var10 < gf.bla.size(); ++var10) {
         fz var11 = (fz)gf.bla.elementAt(var10);
         int var12 = Math.abs(var3 - var11.ala);
         int var13 = Math.abs(var2 - var11.ama);
         var12 = var12 > var13 ? var12 : var13;
         if (var5 <= var11.ala && var11.ala <= var6 && var7 <= var11.ama && var11.ama <= var8 && !aca(var11) && aaa(var4, var11) && !Code.ada(var11.cea) && (var9 == -1 || var12 < var9)) {
            var0 = var11;
            var9 = var12;
         }
      }

      return var1.dsa = var0;
   }

   protected final void aca(int var1, int var2) {
      dg.aaa();
      fz var3 = fz.ala();
      if (!aoa()) {
         fz var4 = this.afa && gf.bfa.size() > 0 ? ((ep)gf.bfa.firstElement()).afa : null;
         boolean var5 = !this.afa || Code.aha == null || var3.cea.equals(Code.aha) && gj.bia();
         ac var6 = var3.dpa;
         fz var7 = var3.dsa;
         if (Code.boa && (var7 == null || Code.ada(var7.cea) || !ff.aca(var7.cea) && !aaa(var3, var7)) && (var7 = this.aaa(var3, var2)) == null) {
            var7 = aea(var3);
         }

         boolean var8 = var7 != null && ff.aca(var7.cea);
         if (var7 == null && this.bda) {
            gm.aaa().awa(0);
            this.bda = false;
         }

         if (Code.boa && var3.dka >= 5 && System.currentTimeMillis() - this.bca > 5000L) {
            gg var9;
            if ((var9 = fz.afa(257)) != null && var9.aaa.aaa == 257) {
               gm.aaa().aea(var9.ada);
            }

            this.bca = System.currentTimeMillis();
         }

         if (Code.ara && Code.ata.size() > 0 && Code.asa < 0) {
            this.aaa(var2, var5);
            return;
         }

         boolean var21 = false;
         if (this.aaa(var2, var3.ala, var3.ama) || this.aea(var3.ala, var3.ama) || var6 != null && this.aaa(var2, var6.ada, var6.aea)) {
            try {
               Thread.sleep(5L);
            } catch (InterruptedException var20) {
            }

            gf.aca("Né");
            if (fz.fea && var5) {
               this.aga();
               var21 = true;
            } else {
               var21 = false;
            }

            if (var21) {
               return;
            }

            var21 = true;
            var6 = null;
         }

         if (var6 == null || var6.aga == 0 || !aaa(var6, var1) || !aaa(var6.ava, var2) || System.currentTimeMillis() - this.baa > 5000L) {
            var6 = this.aaa(var3, var1, var2, var4, var5);
         }

         if (var6 == null && var21 && this.aaa > 0 && this.aba > 0) {
            fz.aca(this.aaa, this.aba);
         }

         int var10;
         fz var11;
         int var12;
         bc var13;
         if (fz.fla && gf.bfa.size() > 0 && var3.cua.aaa == 6 && var3.bba > 0) {
            for(var12 = 0; var12 < var3.cwa.size(); ++var12) {
               if ((var13 = (bc)var3.cwa.elementAt(var12)) != null && var13.aaa.ada == 4) {
                  if (!var13.aaa()) {
                     for(var10 = 0; var10 < gf.bfa.size(); ++var10) {
                        ep var14;
                        if ((var14 = (ep)gf.bfa.elementAt(var10)).aaa != var3.asa && var14.afa != null && var14.afa.bba <= 0) {
                           var11 = var14.afa;
                           if (Math.abs(var3.ala - var11.ala) > 50 || Math.abs(var3.ama - var11.ama) > 50) {
                              fz.aca(var11.ala, var11.ama);
                           }

                           try {
                              Thread.sleep(500L);
                           } catch (InterruptedException var18) {
                           }

                           gm.aaa().aua(var14.aaa);
                           var13.afa = System.currentTimeMillis();
                           var13.ala = true;
                           var3.aba(gf.aza[var13.aaa.aaa], 0);

                           try {
                              Thread.sleep(1L);
                              return;
                           } catch (InterruptedException var17) {
                              return;
                           }
                        }
                     }
                  }
                  break;
               }
            }
         }

         if (fz.ffa && !this.aia && (var6 == null || var6.ava == 0 && (var2 & 6) != 0)) {
            boolean var22 = (var2 & 2) != 0;
            var5 = (var2 & 4) != 0;

            for(var10 = 0; var10 < awa.size(); ++var10) {
               ac var23;
               if ((var23 = (ac)awa.elementAt(var10)).aba > 0 && var23.aga != 0 && var23.aga != 1 && !this.aaa(var2, var23.ada, var23.aea) && !this.aea(var23.ada, var23.aea) && aaa(var23, var1) && (var22 && var23.ava == 1 || var5 && var23.ava == 2)) {
                  var6 = var23;
                  this.aca(var23);
                  break;
               }
            }
         }

         if (aqa != null) {
            var13 = aqa;
            if (ara != null && !ara.aaa()) {
               var13 = ara;
            }

            if (asa != null && !asa.aaa()) {
               var13 = asa;
            }

            if (ata != null && !ata.aaa()) {
               var13 = ata;
            }

            if (aua != null && !aua.aaa()) {
               var13 = aua;
            }

            int var24;
            if (var13.aaa() && (fz.eia || this instanceof bt)) {
               label830: {
                  var24 = 0;

                  bc var15;
                  label633:
                  while(true) {
                     if (var24 >= var3.cwa.size()) {
                        break label830;
                     }

                     if ((var15 = (bc)var3.cwa.elementAt(var24)) != null && System.currentTimeMillis() - var15.afa >= (long)var15.aea - 300L) {
                        if (var15.aaa.ada == 2) {
                           if ((var3.aca == null && fz.eja || var15.aaa.aaa < 67 || var15.aaa.aaa > 72) && (fz.eka || var15.aaa.aaa != 31) && (var15.aaa.aaa != 15 || !fz.ela || var3.bba < var3.bea * fz.fra / 100 && var3.aea) && (var15.aaa.aaa != 6 || var3.aea)) {
                              var12 = (int)(System.currentTimeMillis() / 1000L);
                              var10 = 0;

                              while(true) {
                                 if (var10 >= var3.cxa.size()) {
                                    break label633;
                                 }

                                 bu var16;
                                 if ((var16 = (bu)var3.cxa.elementAt(var10)) != null && (var16.aea.aca == var15.aaa.aea || var15.aaa.aaa == 58 && var16.aea.aba == 7) && var16.aca - (var12 - var16.aba) >= 2) {
                                    break;
                                 }

                                 ++var10;
                              }
                           }
                        } else if (var15.aaa.ada == 3 && var6 != null && var6.ava == 0 && var6.aba > var6.aca / 2) {
                           if (var15.aaa.aaa != 4 || fz.ela && var3.bba < var3.bea * fz.fra / 100) {
                              break;
                           }
                        } else if ((var15.aaa.aaa == 7 || var15.aaa.aaa == 16 || var15.aaa.aaa == 25 || var15.aaa.aaa == 34 || var15.aaa.aaa == 43) && var6 != null && (var6.ava != 0 || var6.aba >= var6.aca / 2) && (var15.aaa.aaa != 7 && var15.aaa.aaa != 16 || !var6.aoa) && (var15.aaa.aaa != 25 && var15.aaa.aaa != 34 || var6.apa) && (var15.aaa.aaa != 43 || var6.aqa)) {
                           break;
                        }
                     }

                     ++var24;
                  }

                  var13 = var15;

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var19) {
                  }
               }
            }

            if (var13.aaa.ada == 2) {
               if (System.currentTimeMillis() - var13.afa >= (long)(var13.aea - 100)) {
                  var13.afa = System.currentTimeMillis();
                  gm.aaa().afa(var13.aaa.aaa);
                  gm.aaa().ara();
                  if (!Code.bfa) {
                     var3.aba(gf.aza[var13.aaa.aaa], 0);
                  }
               } else {
                  var13.ala = true;
               }
            } else {
               ac var25;
               if (Code.boa && var7 != null && !aca(var7) && (var8 || aaa(var3, var7))) {
                  if (var8) {
                     if ((var13.aaa.ada == 1 || var13.aaa.ada == 3) && (ci.aea(var3.ala - var7.ala) > var13.aga + 30 || ci.aea(var3.ama - var7.ama) > var13.aha + 30) && System.currentTimeMillis() - this.bba > 1500L) {
                        ada(var7);
                        this.bba = System.currentTimeMillis();
                     }

                     if (var7.dza != var3.asa && var7.dla != 3) {
                        this.bda = true;
                        gm.aaa().awa(3);
                     }
                  }

                  var24 = var13.aga;
                  var10 = var13.aha;
                  aya.removeAllElements();
                  aza.removeAllElements();
                  aza.addElement(var7);

                  for(var12 = 0; var12 < gf.bla.size() && aya.size() + aza.size() < var13.aia; ++var12) {
                     if ((var11 = (fz)gf.bla.elementAt(var12)).bba > 0 && var11.aqa != 14 && var11.aqa != 5 && var11.aqa != 15 && !var11.equals(var7) && (var11.dla == 3 || var3.dla == 3 || var11.dla == 1 && var3.dla == 1 || var3.dza >= 0 && var3.dza == var11.asa || var3.dya >= 0 && var3.dya == var11.asa || var11.dza == var3.asa) && !Code.ada(var11.cea) && var7.ala - var24 <= var11.ala && var11.ala <= var7.ala + var24 && var7.ama - var10 <= var11.ama && var11.ama <= var7.ama + var10) {
                        aza.addElement(var11);
                     }
                  }

                  for(var12 = 0; var12 < gf.bna.size() && aya.size() + aza.size() < var13.aia; ++var12) {
                     if ((var25 = (ac)gf.bna.elementAt(var12)).aga != 0 && var25.aga != 1 && var7.ala - var24 <= var25.ada && var25.ada <= var7.ala + var24 && var7.ama - var10 <= var25.aea && var25.aea <= var7.ama + var10 && aaa(var25.ava, var2) && (var1 == -1 || var25.ara == var1)) {
                        aya.addElement(var25);
                     }
                  }

                  if (System.currentTimeMillis() - var13.afa >= (long)(var13.aea - 100)) {
                     var13.afa = System.currentTimeMillis();
                     gm.aaa().afa(var13.aaa.aaa);
                     gm.aaa().aaa((ev)aya, (ev)aza, (int)2);
                     if (!Code.bfa) {
                        var3.aba(gf.aza[var13.aaa.aaa], 0);
                     }
                  } else {
                     var13.ala = true;
                  }
               } else {
                  if (var6 == null || var1 != -1 && var6.ara != var1 || !aaa(var6.ava, var2)) {
                     return;
                  }

                  if ((var13.aaa.ada == 1 || var13.aaa.ada == 3) && (ci.aea(var3.ala - var6.aha) > var13.aga + 30 || ci.aea(var3.ama - var6.aia) > var13.aha + 30)) {
                     var3.dpa = null;
                     return;
                  }

                  var24 = var13.aga;
                  var10 = var13.aha;
                  aya.removeAllElements();
                  aza.removeAllElements();
                  aya.addElement(var6);

                  for(var12 = 0; var12 < gf.bna.size() && aya.size() + aza.size() < var13.aia; ++var12) {
                     if ((var25 = (ac)gf.bna.elementAt(var12)).aga != 0 && var25.aga != 1 && !var25.equals(var6) && var6.aha - 100 <= var25.aha && var25.aha <= var6.aha + 100 && var6.aia - 50 <= var25.aia && var25.aia <= var6.aia + 50 && aaa(var25.ava, var2) && (var1 == -1 || var25.ara == var1)) {
                        aya.addElement(var25);
                     }
                  }

                  for(var12 = 0; var12 < gf.bla.size() && aya.size() + aza.size() < var13.aia; ++var12) {
                     if ((var11 = (fz)gf.bla.elementAt(var12)).bba > 0 && var11.aqa != 14 && var11.aqa != 5 && var11.aqa != 15 && (var11.dla == 3 || var3.dla == 3 || var11.dla == 1 && var3.dla == 1 || var3.dza >= 0 && var3.dza == var11.asa || var3.dya >= 0 && var3.dya == var11.asa || var11.dza == var3.asa) && !Code.ada(var11.cea) && var6.ada - var24 <= var11.ala && var11.ala <= var6.ada + var24 && var6.aea - var10 <= var11.ama && var11.ama <= var6.aea + var10) {
                        aza.addElement(var11);
                     }
                  }

                  if (System.currentTimeMillis() - var13.afa >= (long)(var13.aea - 100)) {
                     var13.afa = System.currentTimeMillis();
                     gm.aaa().afa(var13.aaa.aaa);
                     gm.aaa().aaa((ev)aya, (ev)aza, (int)1);
                     if (!Code.bfa) {
                        var3.aba(gf.aza[var13.aaa.aaa], 0);
                     }
                  } else {
                     var13.ala = true;
                  }
               }
            }

            this.baa = System.currentTimeMillis();
         }
      }

   }

   public void ada(int var1, int var2) {
      fz var3 = fz.ala();
      if (!aoa()) {
         fz var4 = var3.dsa;
         if (var4 == null) {
            aea(var3);
         }

         if (aqa != null) {
            bc var6 = aqa;
            if (ara != null && !ara.aaa()) {
               var6 = ara;
            }

            if (asa != null && !asa.aaa()) {
               var6 = asa;
            }

            if (ata != null && !ata.aaa()) {
               var6 = ata;
            }

            if (aua != null && !aua.aaa()) {
               var6 = aua;
            }

            int var5;
            int var7;
            int var8;
            if (var6.aaa() && (fz.eia || this instanceof bt)) {
               label310: {
                  var7 = 0;

                  bc var9;
                  label280:
                  while(true) {
                     if (var7 >= var3.cwa.size()) {
                        break label310;
                     }

                     if ((var9 = (bc)var3.cwa.elementAt(var7)) != null && System.currentTimeMillis() - var9.afa >= (long)var9.aea - 300L) {
                        if (var9.aaa.ada == 2) {
                           if ((var3.aca == null && fz.eja || var9.aaa.aaa < 67 || var9.aaa.aaa > 72) && (fz.eka || var9.aaa.aaa != 31) && (var9.aaa.aaa != 15 || !fz.ela || var3.bba < var3.bea * fz.fra / 100 && var3.aea) && (var9.aaa.aaa != 6 || var3.aea)) {
                              var5 = (int)(System.currentTimeMillis() / 1000L);
                              var8 = 0;

                              while(true) {
                                 if (var8 >= var3.cxa.size()) {
                                    break label280;
                                 }

                                 bu var10;
                                 if ((var10 = (bu)var3.cxa.elementAt(var8)) != null && (var10.aea.aca == var9.aaa.aea || var9.aaa.aaa == 58 && var10.aea.aba == 7) && var10.aca - (var5 - var10.aba) >= 2) {
                                    break;
                                 }

                                 ++var8;
                              }
                           }
                        } else if (var9.aaa.ada == 3) {
                           if (var9.aaa.aaa != 4 || fz.ela && var3.bba < var3.bea * fz.fra / 100) {
                              break;
                           }
                        } else if ((var9.aaa.aaa == 7 || var9.aaa.aaa == 16 || var9.aaa.aaa == 25 || var9.aaa.aaa == 34 || var9.aaa.aaa == 43) && var9.aaa.aaa != 7 && var9.aaa.aaa != 16 && var9.aaa.aaa != 25 && var9.aaa.aaa != 34 && var9.aaa.aaa != 43) {
                           break;
                        }
                     }

                     ++var7;
                  }

                  var6 = var9;

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var11) {
                  }
               }
            }

            if (var6.aaa.ada == 2) {
               if (System.currentTimeMillis() - var6.afa >= (long)(var6.aea - 100)) {
                  var6.afa = System.currentTimeMillis();
                  gm.aaa().afa(var6.aaa.aaa);
                  gm.aaa().ara();
                  if (!Code.bfa) {
                     var3.aba(gf.aza[var6.aaa.aaa], 0);
                  }
               } else {
                  var6.ala = true;
               }
            } else {
               if ((var6.aaa.ada == 1 || var6.aaa.ada == 3) && (ci.aea(var3.ala - var4.ala) > var6.aga + 30 || ci.aea(var3.ama - var4.ama) > var6.aha + 30) && System.currentTimeMillis() - this.bba > 1500L) {
                  ada(var4);
                  this.bba = System.currentTimeMillis();
               }

               var7 = var6.aga;
               var8 = var6.aha;
               aya.removeAllElements();
               aza.removeAllElements();
               aza.addElement(var4);

               for(var5 = 0; var5 < gf.bla.size() && aya.size() + aza.size() < var6.aia; ++var5) {
                  fz var13;
                  if ((var13 = (fz)gf.bla.elementAt(var5)).bba > 0 && var13.aqa != 14 && var13.aqa != 5 && var13.aqa != 15 && !var13.equals(var4) && (var13.dla == 3 || var3.dla == 3 || var13.dla == 1 && var3.dla == 1 || var3.dza >= 0 && var3.dza == var13.asa || var3.dya >= 0 && var3.dya == var13.asa || var13.dza == var3.asa) && !Code.ada(var13.cea) && var4.ala - var7 <= var13.ala && var13.ala <= var4.ala + var7 && var4.ama - var8 <= var13.ama && var13.ama <= var4.ama + var8) {
                     aza.addElement(var13);
                  }
               }

               for(var5 = 0; var5 < gf.bna.size() && aya.size() + aza.size() < var6.aia; ++var5) {
                  ac var12;
                  if ((var12 = (ac)gf.bna.elementAt(var5)).aga != 0 && var12.aga != 1 && var4.ala - var7 <= var12.ada && var12.ada <= var4.ala + var7 && var4.ama - var8 <= var12.aea && var12.aea <= var4.ama + var8 && aaa(var12.ava, var2) && (var1 == -1 || var12.ara == var1)) {
                     aya.addElement(var12);
                  }
               }

               if (System.currentTimeMillis() - var6.afa >= (long)(var6.aea - 100)) {
                  var6.afa = System.currentTimeMillis();
                  gm.aaa().afa(var6.aaa.aaa);
                  gm.aaa().aaa((ev)aya, (ev)aza, (int)2);
                  if (!Code.bfa) {
                     var3.aba(gf.aza[var6.aaa.aaa], 0);
                  }
               } else {
                  var6.ala = true;
               }
            }

            this.baa = System.currentTimeMillis();
         }
      }

   }

   protected boolean c_() {
      if (!(this instanceof fl) && !Code.aqa) {
         fz var1 = fz.ala();
         int var2 = Code.ama < 0 ? -1 : Code.ama;

         for(int var3 = 0; var3 < gf.bma.size(); ++var3) {
            am var4;
            if (!(var4 = (am)gf.bma.elementAt(var3)).aka && (var1.cua.aaa == 1 && var4.aha.aaa == 218 || var4.aha.aba == 19 || Code.aaa(var4.aha) && (fz.bja() > 2 || var4.aha.aia && fz.aja(var4.aha.aaa))) && (var2 < 0 || ci.aaa(var1.ala, var1.ama, var4.aca, var4.ada) < var2) && !this.aea(var4.aaa, var4.aba)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   protected final void ada(int var1) {
      if (!Code.aqa) {
         fz var2 = fz.ala();
         if (!aoa()) {
            bha.removeAllElements();
            int var3 = this.aaa(fz.fga, fz.fha, fz.fia);

            int var4;
            for(var4 = 0; var4 < gf.bma.size(); ++var4) {
               am var5;
               if (!(var5 = (am)gf.bma.elementAt(var4)).aka && (var2.cua.aaa == 1 && var5.aha.aaa == 218 || (Code.aaa(var5.aha) || var5.aha.aaa == var1) && (fz.bja() > 2 || var5.aha.aba == 19 || var5.aha.aia && fz.aja(var5.aha.aaa))) && !this.aaa(var3, var5.aca, var5.ada) && !this.aea(var5.aca, var5.ada) && (Code.ama < 0 || ci.aaa(var2.ala, var2.ama, var5.aca, var5.ada) < Code.ama)) {
                  bha.addElement(var5);
               }
            }

            if (bha.size() > 0) {
               var4 = var2.ala;
               int var11 = var2.ama;
               ac var6 = var2.dpa;

               label71:
               for(var3 = 0; var3 < bha.size(); ++var3) {
                  try {
                     Thread.sleep(1L);
                  } catch (InterruptedException var10) {
                  }

                  am var7;
                  fz.aca((var7 = (am)bha.elementAt(var3)).aca, gn.ada(var7.aca, var7.ada));
                  var2.dta = var7;

                  for(int var8 = 0; var8 < 4 && var7.aia != 2 && !var7.aka; ++var8) {
                     gm.aaa().aoa(var7.aga);
                     if (gj.ada()) {
                        break;
                     }

                     if (this.aea(var2.ala, var2.ama) || var2.bba <= 0) {
                        break label71;
                     }
                  }

                  var7.aka = true;
                  var7.ala = System.currentTimeMillis();
               }

               try {
                  Thread.sleep(1L);
               } catch (InterruptedException var9) {
               }

               fz.aca(var4, var11);
               var2.dpa = var6;
            }
         }
      }

   }

   protected final void ana() {
      if (gn.aoa != 22) {
         this.aaa(22, -2, -1, -1);
      } else {
         fz var1;
         if ((var1 = fz.ala()).aca != null) {
            for(int var2 = 0; var2 < var1.cwa.size(); ++var2) {
               bc var3;
               if ((var3 = (bc)var1.cwa.elementAt(var2)) != null && !var3.aaa() && var3.aaa.aaa >= 67 && var3.aaa.aaa <= 72) {
                  gm.aaa().afa(var3.aaa.aaa);
                  gm.aaa().ara();
                  gj.bda();
                  break;
               }
            }

            gf.aha(12);
            gm.aaa().aja(12, 3);
            gj.bda();
         }
      }

   }

   protected static boolean aoa() {
      fz var0;
      if ((var0 = fz.ala()).aea && var0.bba < var0.bea) {
         for(int var1 = 0; var1 < var0.cxa.size(); ++var1) {
            bu var2;
            if ((var2 = (bu)var0.cxa.elementAt(var1)) != null && var2.aea.aba == 12) {
               return true;
            }
         }
      }

      return false;
   }

   protected abstract void aaa();

   public String toString() {
      return "";
   }

   public static void apa() {
      bia = 0L;
      awa = new ev();
      aca = new ev();
      axa = 0;
      ada = false;
      aea = -1L;
      aya = new ev();
      aza = new ev();
      bha = new ev();
   }

   public static void aqa() {
      apa = false;
      aqa = null;
      ava = false;
      awa = null;
      aca = null;
      axa = 0;
      ada = false;
      aea = 0L;
      aya = null;
      aza = null;
      bha = null;
      bia = 0L;
   }
}
