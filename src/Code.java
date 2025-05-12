import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;

public final class Code implements Runnable {
   public static Code aaa;
   private static boolean cga;
   private static Thread cha;
   public static Auto aba;
   private static TanSat cia;
   public static eu aca;
   public static cv ada;
   public static fl aea;
   private static TuDanh cja;
   private static es cka;
   public static fv afa;
   private static ADV cla;
   public static go aga;
   private static gk cma;
   private static cj cna;
   private static ap coa;
   private static eo cpa;
   public static String aha;
   public static ev aia;
   public static ev aja;
   private static long cqa;
   private static long cra;
   public static short[] aka;
   public static short[] ala;
   public static int ama;
   public static int ana;
   public static int aoa;
   public static int apa;
   public static boolean aqa;
   public static boolean ara;
   public static int asa;
   public static ev ata;
   public static ev aua;
   public static boolean ava;
   public static int awa;
   public static int[] axa;
   public static boolean aya;
   public static int aza;
   private static long csa;
   private static ev cta;
   private static ev cua;
   private static long cva;
   public static ev baa;
   public static ev bba;
   public static long bca;
   public static long bda;
   public static boolean bea;
   public static boolean bfa;
   public static boolean bga;
   public static int bha;
   public static boolean bia;
   public static int bja;
   public static boolean bka;
   public static int bla;
   public static boolean bma;
   public static int bna;
   public static boolean boa;
   public static String bpa;
   public static int bqa;
   public static int bra;
   public static int bsa;
   public static int bta;
   private static String[] cwa;
   public static int bua;
   public static int bva;
   public static int bwa;
   public static int bxa;
   public static int bya;
   public static long bza;
   private static boolean cxa;
   private static long cya;
   private static Random cza;
   private static long daa;
   private static dm dba;
   public static ev caa;
   public static int cba;
   public static int cca;
   public static boolean cda;
   public static gq cea = new gq();
   public static int cfa = 38;

   static {
      aa.aaa(63);
      aqa();
   }

   private static void ata() {
      dba = new dm();
      eg.aba = 1;
      eg.aha = -1;
      eg.afa = new bv();
      eg.aaa = fd.ada("hsl") == 1;
      aya = fd.ada("glv") == 1;
      eg.aga = fd.ada("adv") == 1;
      TanSat.aba = fd.ada("locdo") == 1;
      String var0;
      if ((var0 = fd.aca("nextmap")) != null) {
         try {
            eg.aba = Integer.parseInt(var0);
         } catch (NumberFormatException var8) {
         }
      }

      if ((var0 = fd.aca("background")) != null) {
         try {
            eg.aha = Integer.parseInt(var0);
         } catch (NumberFormatException var7) {
         }
      }

      aaa = new Code();
      cga = false;
      cia = new TanSat();
      aca = new eu();
      ada = new cv();
      aea = new fl();
      cja = new TuDanh();
      cka = new es();
      afa = new fv();
      cla = new ADV();
      aga = new go();
      cma = new gk();
      cna = new cj();
      coa = new ap();
      cpa = new eo();
      cqa = 0L;
      cra = 0L;
      aka = new short[30];
      ala = new short[30];
      ama = -1;
      ana = -1;
      aoa = -1;
      cba = 8;
      cca = 5;
      apa = -1;
      aqa = false;
      ara = false;
      ata = new ev();
      caa = new ev();
      aua = new ev();
      ava = false;
      axa = new int[0];
      boa = false;
      aza = 40;
      csa = 0L;
      cta = new ev();
      cua = new ev();
      cva = 0L;
      baa = new ev();
      bba = new ev();

      int var1;
      for(var1 = 0; var1 < aka.length; ++var1) {
         aka[var1] = -1;
      }

      for(var1 = 0; var1 < ala.length; ++var1) {
         ala[var1] = -1;
      }

      aha = null;
      aia = new ev();
      aja = new ev();

      try {
         ByteArrayInputStream var2 = new ByteArrayInputStream(fd.aba("V6Group"));
         DataInputStream var3;
         if ((aha = (var3 = new DataInputStream(var2)).readUTF()).equals("")) {
            aha = null;
         }

         byte var4 = var3.readByte();

         int var5;
         for(var5 = 0; var5 < var4; ++var5) {
            aia.addElement(var3.readUTF());
         }

         int var12 = var3.readInt();

         for(var5 = 0; var5 < var12; ++var5) {
            aja.addElement(var3.readUTF());
         }

         var3.close();
         var2.close();
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      try {
         cwa = aca(aia("text.txt"), "\n");
      } catch (Exception var6) {
         var6.printStackTrace();
         cwa = new String[0];
      }

      bca = 0L;
      bda = 0L;
      bea = false;
      bfa = false;
      bga = false;
      bha = 5;
      bia = false;
      bja = 100;
      bka = false;
      bla = 100;
      bma = false;
      bna = 100;
      bua = 10;
      bva = 15;
      bwa = -1;
      bxa = -1;
      bya = -1;
      bza = 50L;
      if ((var0 = fd.aca("chipAutopk")) != null) {
         String[] var11 = aca(var0, ";");

         try {
            bua = Integer.parseInt(var11[0]);
            bva = Integer.parseInt(var11[1]);
            bwa = Integer.parseInt(var11[2]);
            bxa = Integer.parseInt(var11[3]);
            bya = Integer.parseInt(var11[4]);
            bza = Long.parseLong(var11[5]);
            return;
         } catch (NumberFormatException var9) {
         }
      }

   }

   public final void aaa() {
      if (!cga) {
         if (aba != null) {
            aba.b_();
         }

         csa = System.currentTimeMillis();
         cga = true;
         (cha = new Thread(this)).start();
      }

   }

   public static void aba() {
      cga = false;
      if (cha != null) {
         gj.bla();
         cha.interrupt();
      }

   }

   public static void aaa(Auto var0) {
      var0.aoa = aba;
      aba = var0;
   }

   public static void aca() {
      gj.bla();
      aba = aba.aoa;
   }

   public static void aaa(int var0, int var1) {
      cia.aaa(var0, var1, fz.faa ? -1 : gn.ala);
      aaa((Auto)cia);
   }

   private static void aca(int var0, int var1) {
      aca.aaa(var0, var1, fz.faa ? -1 : gn.ala, false, false);
      aaa((Auto)aca);
   }

   private static void aaa(boolean var0, boolean var1) {
      aca.aaa(-1, gn.aoa, gn.ala, var0, var1);
      aca.afa = true;
      aaa((Auto)aca);
   }

   public static void ada() {
      ada.a_();
      aaa((Auto)ada);
   }

   public static void aea() {
      aea.a_();
      aaa((Auto)aea);
   }

   private static void aua() {
      cja.a_();
      aaa((Auto)cja);
   }

   private static void aba(boolean var0, boolean var1) {
      cka.aaa(gn.aoa, gn.ala, var0, var1);
      aaa((Auto)cka);
   }

   private static void ava() {
      afa.a_();
      aaa((Auto)afa);
   }

   public static void afa() {
      cla.a_();
      aaa((Auto)cla);
   }

   public static void aga() {
      gj.bla();
      aba = null;
   }

   private static void awa() {
      cna.aba();
      aaa((Auto)cna);
   }

   public static ev aha() {
      ev var0 = new ev();

      for(int var1 = 0; var1 < aja.size(); ++var1) {
         var0.addElement(var1 + ". " + (String)aja.elementAt(var1));
      }

      return var0;
   }

   private static void aja(String var0) {
      if (!aja.contains(var0)) {
         aja.addElement(var0);
         aya();
      }

   }

   private static void aka(String var0) {
      if (aja.contains(var0)) {
         aja.removeElement(var0);
         aya();
      }

   }

   private static void axa() {
      aja.removeAllElements();
      aya();
   }

   public static boolean aaa(String var0) {
      return aja.contains(var0);
   }

   private static void aya() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeUTF(aha == null ? "" : aha);
         var1.writeByte(aia.size());

         int var2;
         for(var2 = 0; var2 < aia.size(); ++var2) {
            var1.writeUTF((String)aia.elementAt(var2));
         }

         var1.writeInt(aja.size());

         for(var2 = 0; var2 < aja.size(); ++var2) {
            var1.writeUTF((String)aja.elementAt(var2));
         }

         var1.flush();
         var0.flush();
         fd.aaa("V6Group", var0.toByteArray());
      } catch (Exception var3) {
      }

   }

   public static void aaa(byte var0, byte[] var1) {
      if (aba != null) {
         try {
            aba.bea = var0;
            Auto var2;
            (var2 = aba).bfa = new ByteArrayInputStream(var1);
            var2.bga = new DataInputStream(var2.bfa);
            switch((var2 = aba).bea) {
            case 60:
            case 61:
               if (fz.ala().cya != null && fz.ala().asa == var2.bga.readInt() && fz.ala().aza > fz.ala().cya.aja) {
                  fz var3 = fz.ala();
                  var3.aza -= fz.ala().cya.aja;
               }
            default:
               return;
            }
         } catch (IOException var4) {
         }
      }

   }

   public static boolean aba(String var0) {
      if (aha != null && !ada(var0)) {
         String var1;
         if ((var1 = fz.ala().cea).equals(aha)) {
            if (aca(var0)) {
               return true;
            }
         } else if (gf.bfa.size() > 1 && var1.equals(((ep)gf.bfa.firstElement()).ada) && var0.equals(aha)) {
            return true;
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean aca(String var0) {
      for(int var1 = 0; var1 < aia.size(); ++var1) {
         if (var0.equals(aia.elementAt(var1))) {
            return true;
         }
      }

      return false;
   }

   public static boolean ada(String var0) {
      if (var0.equals(fz.ala().cea)) {
         return true;
      } else {
         for(int var1 = 0; var1 < gf.bfa.size(); ++var1) {
            if (((ep)gf.bfa.elementAt(var1)).ada.equals(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean aia() {
      for(int var0 = 0; var0 < fz.fwa - 1; ++var0) {
         if (fz.aka(var0) >= 4) {
            return true;
         }
      }

      return false;
   }

   private static int aga(int var0) {
      int var1 = 0;
      fz var2 = fz.ala();

      for(int var3 = 0; var3 < var2.daa.length; ++var3) {
         gg var4;
         if ((var4 = var2.daa[var3]) != null && var4.aaa.aba == 18 && var4.aaa.afa == var0) {
            ++var1;
         }
      }

      return var1;
   }

   public final void run() {
      while(true) {
         try {
            if (cga) {
               long var1 = System.currentTimeMillis();

               try {
                  dg.aaa();
                  fz var3 = fz.ala();
                  int var4 = fz.bja();
                  int var5;
                  int var6;
                  int var7;
                  if (aba != null) {
                     if (aya && !(aba instanceof cj) && (!(aba instanceof eu) || aca.aaa != 2) && fz.ala().bha * 100L / gf.dta[fz.ala().aya] >= bza) {
                        cj.aaa = aba;
                        awa();
                     }

                     if (aha != null && System.currentTimeMillis() - cqa > 5000L) {
                        if (aha.equals(var3.cea)) {
                           if (!Auto.apa && gf.bfa.size() <= 0) {
                              gm.aaa().asa();
                           }
                        } else if (gf.aaa(aha) != null && gf.bfa.size() == 0) {
                           gm.aaa().aha(aha);
                        }

                        cqa = System.currentTimeMillis();
                     }

                     if (bda > 0L) {
                        long var8;
                        if ((var8 = System.currentTimeMillis()) - bca >= bda) {
                           bda = 0L;
                           gj.bla();
                           aba = null;
                           cs.aaa.ada();
                           Controller.aea().aba();
                           return;
                        }

                        bda -= var8 - bca;
                        bca = var8;
                     }

                     aba.aaa();
                     if (var3.aea == Auto.apa && (var3.cya == null || var3.cya.aaa.aaa != Auto.aqa.aaa.aaa)) {
                        var3.cya = Auto.aqa;
                     }

                     if (fz.fca && Auto.ava) {
                        Auto.ava = false;
                        if (!(aba instanceof fl) && !(aba instanceof ej) && !gn.aea(gn.aoa) && var3.dca[15] == null) {
                           Auto.ala();
                        }
                     }

                     int var19;
                     if (var3.aqa != 14 && var3.aqa != 5 && var3.bba > 0) {
                        if (fz.ega && System.currentTimeMillis() - cra > 500L && fz.ala().aza < fz.ala().baa * fz.fsa / 100) {
                           fz.ala().aea(17);
                           cra = System.currentTimeMillis();
                        }

                        if (fz.efa && System.currentTimeMillis() - var3.gpa > 2000L && fz.ala().bba < fz.ala().bea * fz.fra / 100) {
                           boolean var9 = false;
                           var5 = (int)(System.currentTimeMillis() / 1000L);

                           for(var19 = 0; var19 < fz.ala().cxa.size(); ++var19) {
                              bu var10;
                              if ((var10 = (bu)fz.ala().cxa.elementAt(var19)).aea.aaa == 21 && var10.aca - (var5 - var10.aba) >= 2) {
                                 var9 = true;
                                 break;
                              }
                           }

                           if (!var9) {
                              fz.ala().aea(16);
                              var3.gpa = System.currentTimeMillis();
                           }
                        }
                     }

                     if (var3.bja > 0 && (fz.fka || aba instanceof bt) && Auto.aqa != null && Auto.aqa.aca < Auto.aqa.aaa.aca) {
                        dk var20 = Auto.aqa.aaa;
                        var5 = 0;

                        for(var19 = Auto.aqa.aca + 1; var19 <= var20.aca && var20.aga[var19].ada <= var3.aya && var5 < var3.bja; ++var19) {
                           ++var5;
                        }

                        if (var5 > 0) {
                           gf.aca("Cộng skill " + var20.aba + " " + var5 + " điểm");
                           gm.aaa().afa(var20.aaa, var5);
                           if (gj.ava()) {
                              cs.aba().aea();
                           }
                        }
                     }

                     if (var3.bia > 0 && (fz.fja || aba instanceof bt)) {
                        var6 = var3.aka() ? 3 : 0;
                        if (var3.bia >= 100) {
                           gf.aca("Cộng tiềm năng " + er.jxa[var6] + " 60 điểm, " + er.jxa[2] + " 40 điểm");
                           gm.aaa().aea(2, 40);
                           gm.aaa().aea(var6, 60);
                        } else {
                           gf.aca("Cộng tiềm năng " + er.jxa[var6] + " " + var3.bia + " điểm");
                           gm.aaa().aea(var6, var3.bia);
                        }

                        gj.axa();
                     }

                     gn.bda[138] = new short[]{(short)gh.aja};
                     gg var21;
                     int var22;
                     if (cua.size() > 0) {
                        int[] var11 = new int[]{150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035};
                        byte[] var12 = new byte[]{3, 5, 9, 4, 7, 10, 5, 7, 9};

                        for(var19 = 0; var19 < cua.size(); ++var19) {
                           var5 = (var21 = (gg)cua.elementAt(var19)).aua();
                           if (var21.ava) {
                              if (System.currentTimeMillis() - var21.axa > 60000L || var21.awa < var5) {
                                 var21.ava = false;
                              }
                           } else if (var5 >= 0 && var5 < 9) {
                              ev var13 = fz.aha(var5 < 3 ? 455 : (var5 < 6 ? 456 : 457));
                              var22 = var11[var5];
                              byte var14 = var12[var5];
                              if (var3.csa >= var22 && var13.size() >= var14) {
                                 gg[] var15 = new gg[24];

                                 for(var22 = 0; var22 < var14; ++var22) {
                                    gg var16 = (gg)var13.elementAt(var13.size() - 1);
                                    var15[var22] = var16;
                                    var3.daa[var16.ada] = null;
                                    var13.removeElementAt(var13.size() - 1);
                                 }

                                 gm.aaa().aca(var21, var15);
                                 var21.ava = true;
                                 var21.awa = var5;
                                 var21.axa = System.currentTimeMillis();
                              }
                           } else {
                              cua.removeElementAt(var19--);
                           }
                        }
                     }

                     ev var23;
                     gg[] var26;
                     if (fz.exa && var4 > 0) {
                        var23 = fz.aha(455);

                        while(var23.size() >= 9) {
                           var26 = new gg[24];

                           for(var19 = 0; var19 < 9; ++var19) {
                              var21 = (gg)var23.elementAt(var23.size() - 1);
                              var26[var19] = var21;
                              var3.daa[var21.ada] = null;
                              var23.removeElementAt(var23.size() - 1);
                           }

                           gm.aaa().ada(var26);
                        }

                        var4 = fz.bja();
                     }

                     if (fz.eya && var4 > 0) {
                        var23 = fz.aha(456);

                        while(var23.size() >= 9) {
                           var26 = new gg[24];

                           for(var19 = 0; var19 < 9; ++var19) {
                              var21 = (gg)var23.elementAt(var23.size() - 1);
                              var26[var19] = var21;
                              var3.daa[var21.ada] = null;
                              var23.removeElementAt(var23.size() - 1);
                           }

                           gm.aaa().ada(var26);
                        }

                        var4 = fz.bja();
                     }

                     if (System.currentTimeMillis() - cva > 2000L) {
                        for(var6 = 0; var6 < baa.size(); ++var6) {
                           var5 = (Integer)baa.elementAt(var6);
                           if ((var19 = (Integer)bba.elementAt(var6)) < 5000) {
                              baa.removeElementAt(var6);
                              bba.removeElementAt(var6);
                              --var6;
                           } else if ((var21 = fz.aga(var5)) != null) {
                              gm.aaa().aaa(var21, var19);
                           }
                        }

                        var4 = fz.bja();
                        cva = System.currentTimeMillis();
                     }

                     if (gn.aoa != 138 && gn.aea(gn.aoa) && (!fz.aja(35) && !fz.aja(37) || fz.eha && fz.fba && fz.fta <= 50 && var4 > 1 && aga(fz.fta) == 0)) {
                        gn.aja(0);
                        gn.aga();
                     }

                     if (var4 < 4 && !(aba instanceof ds) && fz.epa && var3.aua > 9 && var4 > 0 && aia()) {
                        Vector var27 = new Vector();

                        label375:
                        for(var19 = 0; var19 < fz.fwa - 1; ++var19) {
                           var27.removeAllElements();

                           gg var29;
                           for(var7 = 0; var7 < var3.daa.length; ++var7) {
                              if ((var29 = var3.daa[var7]) != null && var29.aaa.aaa == var19) {
                                 var27.addElement(var29);
                              }
                           }

                           while(var27.size() >= 4) {
                              var7 = 1;

                              for(var5 = var19; var5 < fz.fwa - 1 && gf.dya[var5] <= var3.csa && var7 << 2 <= var27.size() && var7 < 16; ++var5) {
                                 var7 <<= 2;
                              }

                              if (var7 == 1) {
                                 break label375;
                              }

                              gf.ava().ada((int)12);
                              gf.cwa = new gg[24];

                              for(var22 = 0; var22 < var7; ++var22) {
                                 var29 = (gg)var27.elementAt(0);
                                 gf.cwa[var22] = var29;
                                 var3.daa[var29.ada] = null;
                                 var27.removeElementAt(0);
                              }

                              gm.aaa().aca(gf.cwa);
                              gj.aba();
                              if (gf.cwa[0] != null) {
                                 var3.daa[gf.cwa[0].ada] = gf.cwa[0];
                              }
                           }
                        }

                        gf.ava().ada((int)4);
                        var5 = 0;

                        for(var19 = fz.bka(); var5 < var3.daa.length; ++var5) {
                           if ((var21 = var3.daa[var5]) != null && var21.aaa.aaa == fz.fwa - 1 && var19 > 0) {
                              gm.aaa().ada(var21.ada);
                              --var19;
                           }
                        }

                        gm.aaa().afa();
                        gj.ata();
                        Thread.sleep(1000L);
                        Controller.aea().aba();
                     }

                     if (gn.ada(gn.aoa) || gn.afa(gn.aoa)) {
                        if ((fz.fba || aba instanceof ds) && var4 > 1 && var3.aua > 3 && (var19 = aba instanceof ds ? (var3.aua >= 9 ? 10 : 1) : fz.fta) <= 50 && aga(var19) == 0) {
                           var5 = 2;

                           for(var6 = 0; var6 < var3.cxa.size(); ++var6) {
                              if (((bu)var3.cxa.elementAt(var6)).aea.aba == 0) {
                                 --var5;
                                 break;
                              }
                           }

                           gf.aba(4, 0, 0);
                           if (var19 == 50) {
                              gm.aaa().aba(9, 7, var5);
                           } else {
                              gm.aaa().aba(9, var19 / 10, var5);
                           }

                           gj.aha();
                        }

                        if (gn.aoa == 138 && var4 > 1 && !fz.aja(35) && !fz.aja(37)) {
                           gf.aba(4, 0, 0);
                           gm.aaa().aba(9, 6, 1);
                           gj.aha();
                           ++var4;
                        }
                     }
                  }

                  if (aqa) {
                     var6 = 100;
                     am var28 = null;
                     var7 = 0;

                     while(true) {
                        if (var7 >= gf.bma.size()) {
                           if (var28 != null) {
                              gm.aaa().aoa(var28.aga);
                              Auto.aaa(50L);
                           }
                           break;
                        }

                        am var24 = (am)gf.bma.elementAt(var7);
                        var5 = ci.aaa(var3.ala, var3.ama, var24.aca, var24.ada);
                        if ((var6 == -1 || var5 < var6) && (aaa(var24.aha) || var3.cua.aaa == 1 && var24.aha.aaa == 218) && (var4 > 2 || var24.aha.aba == 19 || var24.aha.aia && fz.aja(var24.aha.aaa))) {
                           var6 = var5;
                           var28 = var24;
                        }

                        ++var7;
                     }
                  }

                  if (aya && var3.bha * 100L / gf.dta[var3.aya] >= 95L) {
                     gj.bla();
                     aba = null;
                     cs.aba().aca();
                     ab.aja.aqa();
                  }

                  if (caa.size() > 0) {
                     ara();
                  }

                  if (System.currentTimeMillis() - csa > 2000L) {
                     var6 = 0;

                     while(true) {
                        if (var6 >= cta.size()) {
                           csa = System.currentTimeMillis();
                           break;
                        }

                        label574: {
                           gh var30 = gi.aaa((short)(var5 = (Integer)cta.elementAt(var6)));
                           if (fz.aja(var5)) {
                              for(var7 = 0; var7 < var3.cxa.size(); ++var7) {
                                 bu var25;
                                 if ((var25 = (bu)var3.cxa.elementAt(var7)) != null && var25.aea.aca == var30.aga) {
                                    break label574;
                                 }
                              }

                              if ((var7 = fz.aia(var5)) >= 0) {
                                 gm.aaa().aea(var7);
                                 break label574;
                              }
                           }

                           cta.removeElementAt(var6);
                           --var6;
                        }

                        ++var6;
                     }
                  }
               } catch (Exception var17) {
               }

               if (fz.ala().aga) {
                  gj.aja();
               }

               Auto.aaa((var1 = System.currentTimeMillis() - var1) < 100L ? 100L - var1 : 0L);
               continue;
            }
         } catch (Exception var18) {
         }

         return;
      }
   }

   public static boolean aaa(int var0) {
      return cta.contains(new Integer(var0));
   }

   public static void aba(int var0) {
      Integer var1 = new Integer(var0);
      if (!cta.contains(var1)) {
         cta.addElement(var1);
      }

   }

   public static void aca(int var0) {
      cta.removeElement(new Integer(var0));
   }

   public static boolean aaa(gg var0) {
      return cua.contains(var0);
   }

   public static void aba(gg var0) {
      if (!cua.contains(var0)) {
         cua.addElement(var0);
      }

   }

   public static void aca(gg var0) {
      cua.removeElement(var0);
   }

   public static boolean ada(int var0) {
      return baa.contains(new Integer(var0));
   }

   public static int aea(int var0) {
      return (var0 = baa.indexOf(new Integer(var0))) >= 0 ? (Integer)bba.elementAt(var0) : 0;
   }

   public static void aba(int var0, int var1) {
      Integer var2 = new Integer(var0);
      if (!baa.contains(var2)) {
         baa.addElement(var2);
         bba.addElement(new Integer(var1));
      }

   }

   public static void afa(int var0) {
      if ((var0 = baa.indexOf(new Integer(var0))) >= 0) {
         baa.removeElementAt(var0);
         bba.removeElementAt(var0);
      }

   }

   public static ev aja() {
      ev var0 = new ev();

      for(int var1 = 0; var1 < baa.size(); ++var1) {
         int var2 = (Integer)baa.elementAt(var1);
         int var3 = (Integer)bba.elementAt(var1);
         gh var4 = gi.aaa((short)var2);
         var0.addElement(var1 + ". " + var4.ada + " id " + var2 + " giá " + var3);
      }

      return var0;
   }

   public static void aka() {
      fz var0 = fz.ala();

      for(int var1 = 0; var1 < cua.size(); ++var1) {
         gg var2;
         if ((var2 = (gg)cua.elementAt(var1)).ada >= 0 && var2.ada < var0.daa.length) {
            if (var0.daa[var2.ada] != null && var0.daa[var2.ada].aua() >= 0 && var0.daa[var2.ada].aua() < 9) {
               cua.setElementAt(var0.daa[var2.ada], var1);
            } else {
               cua.removeElementAt(var1--);
            }
         }
      }

   }

   public static String ala() {
      String var0 = "";

      for(int var1 = 0; var1 < axa.length; ++var1) {
         var0 = var0 + (var1 == axa.length - 1 ? String.valueOf(axa[var1]) : axa[var1] + " ");
      }

      return var0;
   }

   public static void aea(String var0) {
      String[] var1;
      int[] var2 = new int[(var1 = aca(var0, " ")).length];

      for(int var3 = 0; var3 < var1.length; ++var3) {
         try {
            var2[var3] = Integer.parseInt(var1[var3]);
         } catch (Exception var5) {
            var2[var3] = -1;
         }
      }

      axa = var2;
   }

   public static void aaa(short var0) {
      int var1;
      for(var1 = 0; var1 < aka.length; ++var1) {
         if (aka[var1] == var0) {
            return;
         }
      }

      var1 = -1;

      for(int var2 = 0; var2 < aka.length; ++var2) {
         if (aka[var2] < 0) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = aka.length;
         short[] var4;
         System.arraycopy(var4 = new short[aka.length + 10], 0, aka, 0, aka.length);

         for(int var3 = aka.length; var3 < var4.length; ++var3) {
            var4[var3] = -1;
         }

         aka = var4;
      }

      aka[var1] = var0;
   }

   public static void aba(short var0) {
      for(int var1 = 0; var1 < aka.length; ++var1) {
         if (aka[var1] == var0) {
            aka[var1] = -1;
         }
      }

   }

   public static void ama() {
      for(int var0 = 0; var0 < aka.length; ++var0) {
         if (aka[var0] > 0) {
            for(int var1 = 0; var1 <= var0; ++var1) {
               if (aka[var1] == -1) {
                  short[] var2 = aka;
                  var2[var1] = var2[var0];
                  aka[var0] = -1;
                  break;
               }
            }
         }
      }

   }

   public static void aca(short var0) {
      int var1;
      for(var1 = 0; var1 < ala.length; ++var1) {
         if (ala[var1] == var0) {
            return;
         }
      }

      var1 = -1;

      for(int var2 = 0; var2 < ala.length; ++var2) {
         if (ala[var2] < 0) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = ala.length;
         short[] var4;
         System.arraycopy(var4 = new short[ala.length + 10], 0, ala, 0, ala.length);

         for(int var3 = ala.length; var3 < var4.length; ++var3) {
            var4[var3] = -1;
         }

         ala = var4;
      }

      ala[var1] = var0;
   }

   public static void ada(short var0) {
      for(int var1 = 0; var1 < ala.length; ++var1) {
         if (ala[var1] == var0) {
            ala[var1] = -1;
         }
      }

   }

   public static void ana() {
      for(int var0 = 0; var0 < ala.length; ++var0) {
         if (ala[var0] > 0) {
            for(int var1 = 0; var1 <= var0; ++var1) {
               if (ala[var1] == -1) {
                  short[] var2 = ala;
                  var2[var1] = var2[var0];
                  ala[var0] = -1;
                  break;
               }
            }
         }
      }

   }

   public static boolean aaa(gh var0) {
      if (aba instanceof bt) {
         if (var0.aba == 19) {
            return true;
         } else if ((var0.aba == 16 || var0.aba == 17) && var0.afa == 10) {
            return true;
         } else {
            fz var3 = fz.ala();
            if (fz.bja() <= 6) {
               return false;
            } else if ((var3.aua < 13 || var3.aua == 13 && var3.dca[1] != null && var3.dca[1].aia < 2) && var0.aba == 26 && var0.aaa > 0) {
               return true;
            } else {
               int var2 = var3.ata == 1 ? 124 : 125;
               return var3.aua <= 12 && (var0.aaa == 174 && !fz.aja(174) || var0.aaa == var2 && !fz.aja(var2));
            }
         }
      } else if (aba instanceof ds) {
         return var0.aba == 19;
      } else if (var0.aba == 19) {
         return fz.ema;
      } else if (var0.aba != 16 && var0.aba != 17) {
         if (var0.aba == 26) {
            return fz.eoa && var0.aaa >= fz.fva - 1;
         } else if (var0.aaa()) {
            return (fz.eqa || aba instanceof eu) && var0.afa >= fz.fxa;
         } else if (var0.aba()) {
            return fz.esa;
         } else {
            if (var0.aba == 27) {
               if (var0.aea.startsWith("Vật phẩm sự kiện") || var0.aea.startsWith("Vật phẩm Sự kiện")) {
                  return fz.eta;
               }

               if (var0.ada.startsWith("Sách võ công")) {
                  return fz.eva;
               }

               if (gn.aea(gn.aoa) && var0.aaa == 38) {
                  return false;
               }
            }

            for(int var1 = 0; var1 < aka.length; ++var1) {
               if (aka[var1] > 0 && var0.aaa == aka[var1]) {
                  return true;
               }
            }

            return fz.eua;
         }
      } else {
         return fz.ena && var0.afa >= fz.fua;
      }
   }

   public static boolean ada(gg var0) {
      if (aba instanceof ds) {
         return false;
      } else if (var0 == null) {
         return false;
      } else if (var0.aia > 0) {
         var0.aua = true;
         return false;
      } else {
         for(int var1 = 0; var1 < ala.length; ++var1) {
            if (ala[var1] > 0 && var0.aaa.aaa == ala[var1]) {
               return true;
            }
         }

         if (!var0.aua && System.currentTimeMillis() >= 5000L) {
            if (aba instanceof eu && !fz.eqa && var0.aaa.aba < 10 && var0.aaa.afa < 70) {
               return true;
            } else if (aba instanceof ADV && var0.aaa.aba < 10) {
               return var0.aaa.afa < 50 && var0.aaa.aba != 1 && (ADV.aaa == null || var0.aaa.aaa != ADV.aaa.aaa);
            } else if (var0.aaa.aba == 26 && var0.aaa.aaa < (fz.eoa ? fz.fva : fz.fwa) - 1) {
               return true;
            } else {
               if (var0.aaa.aba < 10 || var0.aaa.aba >= 29 && var0.aaa.aba <= 32) {
                  if (var0.aaa.aba < 10 && !fz.eqa) {
                     if (var0.aaa.afa < 50) {
                        return true;
                     }

                     return false;
                  }

                  if (!var0.asa && System.currentTimeMillis() - var0.ata > 5000L) {
                     var0.ata = System.currentTimeMillis();
                     gm.aaa().aca(var0.ana, var0.ada);
                     if (!gj.ata() || !var0.asa) {
                        return false;
                     }
                  }

                  if (var0.aba(85)) {
                     var0.aua = true;
                     return false;
                  }

                  if (var0.aaa.aba >= 29 && var0.aaa.aba <= 32) {
                     if (var0.ama != 0) {
                        var0.aua = true;
                        return false;
                     }

                     return true;
                  }

                  if (var0.ama == 5) {
                     return true;
                  }

                  boolean var5;
                  label190: {
                     gg var2 = var0;
                     if (var0.aba != null) {
                        for(int var3 = 0; var3 < var2.aba.size(); ++var3) {
                           bq var4;
                           if ((var4 = (bq)var2.aba.elementAt(var3)) != null && var4.aca.aca == 2) {
                              var5 = true;
                              break label190;
                           }
                        }
                     }

                     var5 = false;
                  }

                  if (!var5) {
                     return true;
                  }

                  if (var0.aaa.aba == 1) {
                     if (var0.aba(0) && var0.aba(1)) {
                        if (!var0.aba(8) && !var0.aba(9)) {
                           return true;
                        }

                        if (!var0.aba(10)) {
                           return true;
                        }

                        var0.aua = true;
                        return false;
                     }

                     return true;
                  }

                  if (!var0.aba(6) || !var0.aba(7)) {
                     return true;
                  }

                  if (var0.aca(0) < 2) {
                     return true;
                  }

                  if (var0.aaa.aba == 8 && !var0.aba(16)) {
                     return true;
                  }

                  if (fz.era) {
                     if (var0.aca(0) <= 2 && var0.aca(1) <= 2 && var0.aca(2) <= 2 && var0.aca(3) <= 1 && var0.aca(4) <= 1 && var0.aca(5) <= 1 && var0.aca(6) <= 1 && var0.aca(7) <= 1) {
                        return true;
                     }

                     var0.aua = true;
                     return false;
                  }
               }

               var0.aua = true;
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static void aoa() {
      fz var0 = fz.ala();
      if (!fz.aja(37) && !fz.aja(35)) {
         av var1;
         if ((var1 = gf.aia(13)) != null && Math.abs(var1.ala - var0.ala) <= 200 && Math.abs(var1.ama - var0.ama) <= 200) {
            fz.aca(var1.ala > 200 ? var1.ala - 200 : var1.ala + 200, var1.ama);
         }

         gm.aaa().aea();
      } else {
         fz.aca(var0.ala, gn.ada);
      }

   }

   public static boolean afa(String var0) {
      int var1 = 0;
      StringBuffer var2 = new StringBuffer();
      StringBuffer var3 = new StringBuffer();

      int var4;
      label1149:
      for(var4 = 0; var4 < var0.length(); ++var4) {
         char var5;
         if ((var5 = var0.charAt(var4)) >= '0' && var5 <= '9' || var5 == ' ') {
            while(true) {
               if (var4 >= var0.length() || (var5 = var0.charAt(var4)) < '0' || var5 > '9') {
                  break label1149;
               }

               var3.append(var5);
               ++var4;
            }
         }

         var2.append(var5);
      }

      String var26 = var2.toString().toLowerCase();
      if (var3.length() > 0) {
         try {
            var1 = Integer.parseInt(var3.toString());
         } catch (Exception var25) {
         }
      }

      if (var26.equals("ttl")) {
         cfa = var1;
         gf.aca("Vị trí truyền thuyết lệnh: " + cfa);
         return true;
      } else if (var26.equals("akn")) {
         cea.aaa(gn.aoa, gn.ala);
         aaa((Auto)cea);
         return true;
      } else if (var26.equals("uppk")) {
         (new bn()).aaa();
         return true;
      } else if (var26.equals("adpk")) {
         if (aba instanceof eo) {
            gf.aca("Tắt auto đánh ai bật pk");
            aga();
         } else {
            gf.aca("Bật auto đánh ai bật pk");
            cpa.aea();
            aaa((Auto)cpa);
         }

         return true;
      } else if (var26.equals("acpk")) {
         if (aba instanceof ap) {
            gf.aca("Tắt auto chờ pk");
            aga();
         } else {
            gf.aca("Bật auto chờ pk");
            coa.aba();
            aaa((Auto)coa);
         }

         return true;
      } else if (var26.equals("atpk")) {
         if (aba instanceof cj) {
            gf.aca("Tắt auto pk âm kinh nghiệm");
            aga();
         } else {
            gf.aca("Bật auto pk âm kinh nghiệm");
            if (aba != null) {
               cj.aaa = aba;
            }

            aya = true;
            awa();
         }

         return true;
      } else if (var26.equals("s")) {
         if (var1 == 0) {
            gf.aca("Chạy đi đou với tốc độ 0?");
         } else if (var1 > 100) {
            gf.aca("Tốc giày nên để <= 100 để ko bị giật!");
         } else {
            gf.aca("Fake tốc chạy ".concat(String.valueOf(var1)));
            bha = var1;
            bga = true;
         }

         return true;
      } else if (var26.equals("rs")) {
         gf.aca("Reset tốc chạy");
         bga = false;
         return true;
      } else if (var26.equals("n")) {
         if (var1 == 0) {
            var1 = 100;
         }

         gf.aca("Fake tầm ngang ".concat(String.valueOf(var1)));
         bia = true;
         bja = var1;
         return true;
      } else if (var26.equals("c")) {
         if (var1 == 0) {
            var1 = 100;
         }

         gf.aca("Fake tầm cao ".concat(String.valueOf(var1)));
         bka = true;
         bla = var1;
         return true;
      } else if (var26.equals("m")) {
         if (var1 == 0) {
            var1 = 1;
         }

         gf.aca("Fake lan ".concat(String.valueOf(var1)));
         bma = true;
         bna = var1;
         return true;
      } else if (var26.equals("rsk")) {
         gf.aca("Reset fake tầm lan skill");
         bma = false;
         bia = false;
         bka = false;
         return true;
      } else if (var26.equals("zone")) {
         ADV.aca = !ADV.aca;
         gf.aca(ADV.aca ? "Bật TSMT" : "Bật TSMKT");
         return true;
      } else if (var26.equals("show")) {
         cda = !cda;
         gf.aca(cda ? "Bật Show" : "Bật Show");
         return true;
      } else if (var26.equals("set")) {
         (new ge()).aaa();
         return true;
      } else if (var26.equals("check")) {
         gm.aaa().aja(fz.ala().cea);
         return true;
      } else if (!var26.equals("bang") && !var26.equals("fz")) {
         if (!var26.equals("bangb") && !var26.equals("fb")) {
            if (!var26.equals("bangs") && !var26.equals("fs")) {
               if (!var26.equals("pbang") && !var26.equals("wz")) {
                  if (var26.equals("u")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     gf.aca("Khinh kông ".concat(String.valueOf(var1)));
                     fz.aca(fz.ala().ala, fz.ala().ama - var1);
                     return true;
                  } else if (var26.equals("d")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     gf.aca("Độn thổ ".concat(String.valueOf(var1)));
                     fz.aca(fz.ala().ala, fz.ala().ama + var1);
                     return true;
                  } else if (var26.equals("l")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     gf.aca("Dịch trái ".concat(String.valueOf(var1)));
                     fz.aca(fz.ala().ala - var1, fz.ala().ama);
                     return true;
                  } else if (var26.equals("r")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     gf.aca("Dịch phải ".concat(String.valueOf(var1)));
                     fz.aca(fz.ala().ala + var1, fz.ala().ama);
                     return true;
                  } else {
                     fz var6;
                     if (var26.equals("g")) {
                        if ((var6 = fz.ala()).dsa != null) {
                           gf.aca("MoveTo " + var6.dsa.cea);
                           fz.aca(var6.dsa.ala, var6.dsa.ama);
                        } else if (var6.dra != null) {
                           gf.aca("MoveTo " + var6.dra.cea);
                           fz.aca(var6.dra.ala, var6.dra.ama);
                        } else if (var6.dpa != null) {
                           gf.aca("MoveTo " + var6.dpa.ada().aga);
                           fz.aca(var6.dpa.aha, var6.dpa.aia);
                        } else if (var6.dta != null) {
                           gf.aca("MoveTo " + var6.dta.aha.ada);
                           fz.aca(var6.dta.aaa, var6.dta.aba);
                        }

                        return true;
                     } else if (var26.equals("ta")) {
                        gf.ava().ada((int)9);
                        return true;
                     } else if (var26.equals("sw")) {
                        gf.ava().ada((int)36);
                        return true;
                     } else if (var26.equals("up")) {
                        cc.aaa().aba();
                        return true;
                     } else if (var26.equals("aq")) {
                        if ((var6 = fz.ala()).dpa != null) {
                           gf.bna.removeElement(var6.dpa);
                        }

                        return true;
                     } else if (var26.equals("z")) {
                        gf.aca((fz.fea ? "Tắt" : "Bật") + " auto chuyển map");
                        fz.fea = !fz.fea;
                        return true;
                     } else if (var26.equals("rm")) {
                        gf.aca((fz.eza ? "Tắt" : "Bật") + " auto next map");
                        fz.eza = !fz.eza;
                        return true;
                     } else if (var26.equals("x")) {
                        if (var1 == 0) {
                           var1 = -1;
                        }

                        gf.aca("KC Nhặt ".concat(String.valueOf(var1)));
                        ama = var1;
                        return true;
                     } else if (var26.equals("kts")) {
                        if (var1 == 0) {
                           var1 = -1;
                        }

                        gf.aca("KC Tàn sát ".concat(String.valueOf(var1)));
                        aoa = fz.ala().ala;
                        apa = fz.ala().ama;
                        ana = var1;
                        return true;
                     } else {
                        ac var7;
                        if (var26.equals("ts")) {
                           if ((var7 = ac.aba(var1)) == null) {
                              gf.aca("Tàn sát all");
                              aaa(-1, gn.aoa);
                           } else {
                              gf.aca("Tàn sát " + var7.ada().aga + " lv " + var1);
                              aaa(var7.ara, gn.aoa);
                           }

                           return true;
                        } else {
                           fr var8;
                           if (var26.equals("tsx")) {
                              var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                              if (var8 == null) {
                                 gf.aca("Tàn sát all");
                                 aaa(-1, gn.aoa);
                              } else {
                                 gf.aca("Tàn sát " + var8.aga + " id " + var1);
                                 aaa(var8.aea, gn.aoa);
                              }

                              return true;
                           } else if (var26.equals("tsa")) {
                              gf.aca("Tàn sát all");
                              aaa(-1, gn.aoa);
                              return true;
                           } else if (var26.equals("anv")) {
                              if (gn.aoa != 1 && gn.aoa != 27 && gn.aoa != 72) {
                                 gf.aca("Bạn phải đứng ở trường để Auto");
                                 return true;
                              } else {
                                 gf.aca("Auto Nhiệm Vụ Hằng Ngày");
                                 ada();
                                 return true;
                              }
                           } else if (var26.equals("att")) {
                              gf.aca("Auto Tà Thú");
                              aea();
                              return true;
                           } else if (var26.equals("ak")) {
                              if (aba == cja) {
                                 gf.aca("Tắt tự đánh");
                                 aga();
                              } else {
                                 gf.aca("Bật tự đánh");
                                 aua();
                              }

                              return true;
                           } else if (var26.equals("adv")) {
                              gf.aca("Auto Danh Vọng");
                              afa();
                              return true;
                           } else if (var26.equals("ld")) {
                              dba.aaa();
                              return true;
                           } else if (var26.equals("nw")) {
                              if (aba == aga) {
                                 gf.aca("Tắt auto lôi đài win");
                                 gj.bla();
                                 aba = null;
                              } else {
                                 gf.aca("Bật auto lôi đài win");
                                 aga.aea();
                                 aaa((Auto)aga);
                              }

                              return true;
                           } else if (var26.equals("nl")) {
                              if (aba == cma) {
                                 gf.aca("Tắt auto lôi đài lose");
                                 gj.bla();
                                 aba = null;
                              } else {
                                 gf.aca("Bật auto lôi đài lose");
                                 cma.aea();
                                 aaa((Auto)cma);
                              }

                              return true;
                           } else if (!var26.equals("e") && !var26.equals("pe")) {
                              if (var26.equals("k")) {
                                 gf.aca("Chuyển Khu: ".concat(String.valueOf(var1)));
                                 gf.ava();
                                 gf.aja(var1);
                                 return true;
                              } else if (var26.equals("ltd")) {
                                 if (!gn.afa(gn.aoa) && !gn.ada(gn.aoa)) {
                                    gf.aca("Hãy đứng ở làng hoặc trường để lưu tọa độ");
                                 } else {
                                    gf.aha(5);
                                    gm.aaa().aga(5);
                                    gm.aaa().aca(5, 1, 0);
                                 }

                                 return true;
                              } else if (var26.equals("nm")) {
                                 gf.aca("Next map: ".concat(String.valueOf(var1)));
                                 gn.ama(var1);
                                 return true;
                              } else if (var26.equals("gm")) {
                                 if (var1 < gn.ava.length && var1 >= 0) {
                                    gf.aca("Go to: " + gn.ava[var1]);
                                    gn.ala(var1);
                                    return true;
                                 } else {
                                    return true;
                                 }
                              } else if (var26.equals("npc")) {
                                 if (var1 < av.aba.length) {
                                    gf.aca("Act NPC: " + av.aba[var1].aba);
                                    gf.aha(var1);
                                 }

                                 return true;
                              } else if (var26.equals("hs")) {
                                 gf.aca("Next to hirosaki");
                                 (new Thread(new gl(0, 1))).start();
                                 return true;
                              } else if (var26.equals("hr")) {
                                 gf.aca("Next to haruna");
                                 (new Thread(new gl(1, 27))).start();
                                 return true;
                              } else if (var26.equals("oz")) {
                                 gf.aca("Next to Ozawa(Oozaka)");
                                 (new Thread(new gl(2, 72))).start();
                                 return true;
                              } else if (var26.equals("kj")) {
                                 gf.aca("Next to Kojin");
                                 (new Thread(new gl(3, 10))).start();
                                 return true;
                              } else if (var26.equals("sz")) {
                                 gf.aca("Next to Sanzu");
                                 (new Thread(new gl(4, 17))).start();
                                 return true;
                              } else if (var26.equals("tn")) {
                                 gf.aca("Next to Tone");
                                 (new Thread(new gl(5, 22))).start();
                                 return true;
                              } else if (var26.equals("lc")) {
                                 gf.aca("Next to Chài");
                                 (new Thread(new gl(6, 32))).start();
                                 return true;
                              } else if (var26.equals("ck")) {
                                 gf.aca("Next to Chakumi");
                                 (new Thread(new gl(7, 38))).start();
                                 return true;
                              } else if (var26.equals("eg")) {
                                 gf.aca("Next to Echigo");
                                 (new Thread(new gl(8, 43))).start();
                                 return true;
                              } else if (var26.equals("os")) {
                                 gf.aca("Next to Oshin");
                                 (new Thread(new gl(9, 48))).start();
                                 return true;
                              } else if (var26.equals("mnv")) {
                                 gf.aca("Next to Map Nhiệm Vụ");
                                 gn.ala(gf.bma());
                                 return true;
                              } else if (var26.equals("mnvp")) {
                                 gf.aca("Next to Map Nhiệm Vụ Phụ");
                                 aj var27;
                                 if ((var27 = fz.ama(0)) != null) {
                                    gn.ala(var27.aga);
                                 }

                                 return true;
                              } else {
                                 am var10;
                                 if (var26.equals("add")) {
                                    gf.aca("Thêm vật phẩm vào ds nhặt");
                                    if ((var10 = fz.ala().dta) != null) {
                                       aaa(var10.aha.aaa);
                                    }

                                    return true;
                                 } else if (var26.equals("del")) {
                                    gf.aca("Xóa vật phẩm khỏi ds nhặt");
                                    if ((var10 = fz.ala().dta) != null) {
                                       aba(var10.aha.aaa);
                                    }

                                    return true;
                                 } else {
                                    gh var11;
                                    if (var26.equals("ait")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          gf.aca("Thêm " + var11.ada + " vào ds nhặt");
                                          aaa(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("dit")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          gf.aca("Xóa " + var11.ada + " khỏi ds nhặt");
                                          aba(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("ajt")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          gf.aca("Thêm " + var11.ada + " vào ds nhặt");
                                          aca(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("djt")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          gf.aca("Xóa " + var11.ada + " khỏi ds nhặt");
                                          ada(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("cnhat")) {
                                       if (aqa) {
                                          gf.aca("Bật nhặt xa");
                                       } else {
                                          gf.aca("Bật hút VP");
                                       }

                                       aqa = !aqa;
                                       return true;
                                    } else if (var26.equals("ruong")) {
                                       gf.ava().ama();
                                       return true;
                                    } else if (var26.equals("vpnhat")) {
                                       gf.ava().ada((int)46);
                                       return true;
                                    } else if (var26.equals("die")) {
                                       aoa();
                                       return true;
                                    } else if (var26.equals("dcvt")) {
                                       if (ara) {
                                          gf.aca("Tắt đánh chuyển vị trí");
                                       } else {
                                          gf.aca("Bật đánh chuyển vị trí");
                                       }

                                       ara = !ara;
                                       if (fz.fla) {
                                          gm.aaa().aka("dcvt " + (ara ? 1 : 0));
                                       }

                                       return true;
                                    } else if (var26.equals("avt")) {
                                       gf.aca("Thêm vị trí " + ata.size());
                                       ata.addElement(new Integer(fz.ala().ala));
                                       aua.addElement(new Integer(fz.ala().ama));
                                       if (fz.fla) {
                                          gm.aaa().aka("avt " + fz.ala().ala + " " + fz.ala().ama);
                                       }

                                       return true;
                                    } else if (var26.equals("dvt")) {
                                       gf.aca("Xóa hết vị trí");
                                       ata.removeAllElements();
                                       aua.removeAllElements();
                                       if (fz.fla) {
                                          gm.aaa().aka("dvt");
                                       }

                                       return true;
                                    } else if (var26.equals("dvtx")) {
                                       gf.aca("Xóa vị trí ".concat(String.valueOf(var1)));
                                       ata.removeElementAt(var1);
                                       aua.removeElementAt(var1);
                                       if (fz.fla) {
                                          gm.aaa().aka("dtvx ".concat(String.valueOf(var1)));
                                       }

                                       return true;
                                    } else if (var26.equals("dck")) {
                                       if (ava = !ava) {
                                          gf.aca("Tắt đánh chuyển khu");
                                       } else {
                                          gf.aca("Bật đánh chuyển khu");
                                          ab.bka.aaa("Khu", new ca("Đặt", 1100090), 1);
                                          ab.bka.aaa.aaa(ala());
                                       }

                                       return true;
                                    } else if (var26.equals("keeplevel")) {
                                       if (aya) {
                                          gf.aca("Tắt giữ lv");
                                       } else {
                                          gf.aca("Bật giữ lv");
                                       }

                                       aya = !aya;
                                       return true;
                                    } else if (var26.equals("addn")) {
                                       gf.aca("Thêm nhóm");
                                       if ((var6 = fz.ala().dsa) != null) {
                                          if (!aca(var6.cea)) {
                                             aia.addElement(var6.cea);
                                          }

                                          gm.aaa().afa(var6.cea);
                                       }

                                       return true;
                                    } else if (var26.equals("cn")) {
                                       gf.aca("Xóa nhóm");
                                       aha = null;
                                       aia.removeAllElements();
                                       aya();
                                       return true;
                                    } else if (var26.equals("pt")) {
                                       if (!fz.ala().cea.equals(aha)) {
                                          gf.aca("Bạn không là nhóm trưởng");
                                          return true;
                                       } else {
                                          gf.aca("PT nhóm");

                                          for(var4 = 0; var4 < aia.size(); ++var4) {
                                             if (!ada(var0 = (String)aia.elementAt(var4))) {
                                                gm.aaa().afa(var0);
                                             }

                                             if (aba instanceof ej) {
                                                gm.aaa().aaa(var0, "pkm " + aba.aga);
                                                gm.aaa().aaa(var0, "pkk " + aba.aha);
                                             } else if (aba != null) {
                                                gm.aaa().aaa(var0, "map " + aba.aga);
                                                gm.aaa().aaa(var0, "khu " + aba.aha);
                                             }
                                          }

                                          return true;
                                       }
                                    } else if (var26.equals("sn")) {
                                       gf.aca("Lưu nhóm");
                                       aya();
                                       return true;
                                    } else if (var26.equals("tsn")) {
                                       if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                          if ((var7 = ac.aba(var1)) == null) {
                                             gf.aca("Tàn sát nhóm all");
                                             aaa(-1, gn.aoa);
                                          } else {
                                             gf.aca("Tàn sát nhóm " + var7.ada().aga + " lv " + var1);
                                             aaa(var7.ara, gn.aoa);
                                          }

                                          cia.afa = true;
                                          gm.aaa().aka("ts " + cia.aga + " " + cia.aha + " " + cia.aaa);
                                          return true;
                                       } else {
                                          gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("tsnx")) {
                                       if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                          var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                                          if (var8 == null) {
                                             gf.aca("Tàn sát nhóm all");
                                             aaa(-1, gn.aoa);
                                          } else {
                                             gf.aca("Tàn sát nhóm " + var8.aga + " id " + var1);
                                             aaa(var8.aea, gn.aoa);
                                          }

                                          cia.afa = true;
                                          gm.aaa().aka("ts " + cia.aga + " " + cia.aha + " " + cia.aaa);
                                          return true;
                                       } else {
                                          gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("tsan")) {
                                       if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                          gf.aca("Tàn sát nhóm all");
                                          aaa(-1, gn.aoa);
                                          cia.afa = true;
                                          gm.aaa().aka("tsa " + cia.aga + " " + cia.aha);
                                          return true;
                                       } else {
                                          gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("attn")) {
                                       if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                          gf.aca("Auto Tà Thú Nhóm");
                                          aea();
                                          aea.afa = true;
                                          gm.aaa().aka("att " + aea.aga + " " + aea.aha + " " + aea.aaa);
                                          return true;
                                       } else {
                                          gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("buff")) {
                                       gf.aca("Bật Buff HS Xa");
                                       aba(true, true);
                                       return true;
                                    } else if (var26.equals("bux")) {
                                       gf.aca("Bật Buff Xa");
                                       aba(true, false);
                                       return true;
                                    } else if (var26.equals("hsx")) {
                                       gf.aca("Bật HS Xa");
                                       aba(false, true);
                                       return true;
                                    } else {
                                       int var12;
                                       if (var26.equals("cy")) {
                                          if (aba == null) {
                                             gf.aca("Bạn chưa up yên");
                                          } else {
                                             var12 = fz.ala().csa - aba.ala;
                                             var1 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
                                             gf.aca("Up " + var12 + " trong " + ex.aba(var1) + " perh=" + var12 / var1 * 3600);
                                          }

                                          return true;
                                       } else if (var26.equals("clv")) {
                                          if (aba == null) {
                                             gf.aca("Bạn chưa up level");
                                          } else {
                                             long var33;
                                             float var30 = (float)((var33 = fz.ala().aja - aba.ama) * 10000L / gf.dta[fz.ala().aya]) / 100.0F;
                                             var12 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
                                             long var35;
                                             float var18 = (float)((var35 = var33 * 3600L / (long)var12) * 10000L / gf.dta[fz.ala().aya]) / 100.0F;
                                             gf.aca("Up " + var33 + " - " + var30 + "% trong " + ex.aba(var12) + " perh=" + var35 + " - " + var18 + "%");
                                          }

                                          return true;
                                       } else if (var26.equals("st")) {
                                          if ((var7 = ac.aba(var1)) == null) {
                                             gf.aca("Stanima all");
                                             aca(-1, gn.aoa);
                                          } else {
                                             gf.aca("Stanima " + var7.ada().aga + " lv " + var1);
                                             aca(var7.ara, gn.aoa);
                                          }

                                          return true;
                                       } else if (var26.equals("sta")) {
                                          gf.aca("Stanima all");
                                          aca(-1, gn.aoa);
                                          return true;
                                       } else if (var26.equals("stn")) {
                                          if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                             if ((var7 = ac.aba(var1)) == null) {
                                                gf.aca("Stanima nhóm all");
                                                aca(-1, gn.aoa);
                                             } else {
                                                gf.aca("Stanima nhóm " + var7.ada().aga + " lv " + var1);
                                                aca(var7.ara, gn.aoa);
                                             }

                                             aca.afa = true;
                                             gm.aaa().aka("st " + aca.aga + " " + aca.aha + " " + aca.aba);
                                             return true;
                                          } else {
                                             gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var26.equals("stan")) {
                                          if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                             gf.aca("Stanima nhóm all");
                                             aca(-1, gn.aoa);
                                             aca.afa = true;
                                             gm.aaa().aka("sta " + aca.aga + " " + aca.aha);
                                             return true;
                                          } else {
                                             gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var26.equals("stx")) {
                                          var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                                          if (var8 == null) {
                                             gf.aca("Tàn sát all");
                                             aaa(-1, gn.aoa);
                                          } else {
                                             gf.aca("Tàn sát " + var8.aga + " id " + var1);
                                             aca(var8.aea, gn.aoa);
                                          }

                                          return true;
                                       } else if (!var26.equals("stnx")) {
                                          if (var26.equals("sts")) {
                                             gf.aca("Step Stanima");
                                             aca.aea();
                                             if (fz.ala().cea.equals(aha) && gf.bfa.size() > 0) {
                                                gm.aaa().aka("sts");
                                             }

                                             return true;
                                          } else if (var26.equals("stb")) {
                                             if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa != fz.ala().asa) {
                                                if (fz.ala().cua.aaa != 6) {
                                                   gf.aca("Bạn không phải là quạt");
                                                   return true;
                                                } else {
                                                   gf.aca("Stanima Buff HS");
                                                   aaa(true, true);
                                                   return true;
                                                }
                                             } else {
                                                gf.aca("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                return true;
                                             }
                                          } else if (var26.equals("stbx")) {
                                             if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa != fz.ala().asa) {
                                                if (fz.ala().cua.aaa != 6) {
                                                   gf.aca("Bạn không phải là quạt");
                                                   return true;
                                                } else {
                                                   gf.aca("Stanima Buff");
                                                   aaa(true, false);
                                                   return true;
                                                }
                                             } else {
                                                gf.aca("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                return true;
                                             }
                                          } else if (var26.equals("sths")) {
                                             if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa != fz.ala().asa) {
                                                if (fz.ala().cua.aaa != 6) {
                                                   gf.aca("Bạn không phải là quạt");
                                                   return true;
                                                } else {
                                                   gf.aca("Stanima HS");
                                                   aaa(false, true);
                                                   return true;
                                                }
                                             } else {
                                                gf.aca("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                return true;
                                             }
                                          } else if (var26.equals("pkb")) {
                                             gf.aca("PK Thần Thú");
                                             aaa((Auto)(new ej(gn.aoa)));
                                             if (aha != null && fz.ala().cea.equals(aha) && gf.bfa.size() > 1) {
                                                gm.aaa().aka("pkm " + gn.aoa);
                                             }

                                             return true;
                                          } else if (var26.equals("pkk")) {
                                             gf.aca("PK Thần Thú");
                                             ej var32;
                                             (var32 = new ej(gn.aoa)).aha = var1;
                                             aaa((Auto)var32);
                                             if (aha != null && fz.ala().cea.equals(aha) && gf.bfa.size() > 1) {
                                                gm.aaa().aka("pkm " + gn.aoa);
                                                gm.aaa().aka("pkk ".concat(String.valueOf(var1)));
                                             }

                                             return true;
                                          } else if (var26.equals("lb")) {
                                             var0 = "";

                                             for(var1 = 0; var1 < gf.bna.size(); ++var1) {
                                                ac var31;
                                                if ((var31 = (ac)gf.bna.elementAt(var1)).axa) {
                                                   var0 = var0 + var31.ada().aga + " lv: " + var31.awa + ", ";
                                                }
                                             }

                                             gf.aca("Mob: ".concat(String.valueOf(var0)));
                                             return true;
                                          } else if (var26.equals("tb")) {
                                             (new Thread(new an())).start();
                                             return true;
                                          } else if (var26.equals("sell")) {
                                             gf.aca("Auto Sell");
                                             ava();
                                             return true;
                                          } else if (var26.equals("h")) {
                                             Calendar var28 = ci.aca();
                                             gf.aca("Time " + var28.get(11) + ":" + var28.get(12) + ":" + var28.get(13));
                                             return true;
                                          } else if (var26.equals("dt")) {
                                             aaa((Auto)(new cg()));
                                             return true;
                                          } else if (var26.equals("dh")) {
                                             aaa((Auto)(new ax()));
                                             return true;
                                          } else if (var26.equals("nv")) {
                                             aaa((Auto)(new ft()));
                                             return true;
                                          } else if (var26.equals("ld")) {
                                             (new Thread(new az())).start();
                                             return true;
                                          } else if (var26.equals("f")) {
                                             gf.ava().ada(var1);
                                             return true;
                                          } else if (var0.equals("hd9x")) {
                                             gf.aca("Hang động 9x");
                                             aaa((Auto)(new bj()));
                                             if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                                gm.aaa().aka("hd9x");
                                             }

                                             return true;
                                          } else {
                                             if (var0.length() == 4) {
                                                if (var0.equals("as10")) {
                                                   aaa((Auto)(new ds()));
                                                   return true;
                                                }

                                                if (var0.equals("as20")) {
                                                   aaa((Auto)(new bt(0)));
                                                   return true;
                                                }

                                                if (var0.equals("a20k")) {
                                                   aaa((Auto)(new bt(1)));
                                                   return true;
                                                }

                                                if (var0.equals("a20t")) {
                                                   aaa((Auto)(new bt(2)));
                                                   return true;
                                                }

                                                if (var0.equals("a20u")) {
                                                   aaa((Auto)(new bt(3)));
                                                   return true;
                                                }

                                                if (var0.equals("a20c")) {
                                                   aaa((Auto)(new bt(4)));
                                                   return true;
                                                }

                                                if (var0.equals("a20d")) {
                                                   aaa((Auto)(new bt(5)));
                                                   return true;
                                                }

                                                if (var0.equals("a20q")) {
                                                   aaa((Auto)(new bt(6)));
                                                   return true;
                                                }
                                             } else {
                                                if (var26.equals("boss")) {
                                                   gf.aca("Auto Boss ".concat(String.valueOf(var1)));
                                                   aaa((Auto)(new de(var1)));
                                                   return true;
                                                }

                                                if (var26.equals("kpk")) {
                                                   gf.aca("Khu PK ".concat(String.valueOf(var1)));
                                                   Auto.axa = var1;
                                                   return true;
                                                }

                                                if (var26.equals("cpk")) {
                                                   gf.aca("Xóa ds PK");
                                                   ff.aca();
                                                   return true;
                                                }

                                                String[] var13;
                                                if (var0.startsWith("apk")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      gf.aca("Thêm " + var13[1] + " vào ds PK");
                                                      ff.aaa(var13[1]);
                                                   } else if (fz.ala().dsa != null) {
                                                      gf.aca("Thêm " + fz.ala().dsa.cea + " vào ds PK");
                                                      ff.aaa(fz.ala().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("dpk")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      gf.aca("Xóa " + var13[1] + " khỏi ds PK");
                                                      ff.aba(var13[1]);
                                                   } else if (fz.ala().dsa != null) {
                                                      gf.aca("Xóa " + fz.ala().dsa.cea + " khỏi ds PK");
                                                      ff.aba(fz.ala().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var26.equals("chs")) {
                                                   gf.aca("Xóa ds HS");
                                                   axa();
                                                   return true;
                                                }

                                                if (var0.startsWith("ahs")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      gf.aca("Thêm " + var13[1] + " vào ds HS");
                                                      aja(var13[1]);
                                                   } else if (fz.ala().dsa != null) {
                                                      gf.aca("Thêm " + fz.ala().dsa.cea + " vào ds HS");
                                                      aja(fz.ala().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var26.equals("dhs")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      gf.aca("Xóa " + var13[1] + " khỏi ds HS");
                                                      aka(var13[1]);
                                                   } else if (fz.ala().dsa != null) {
                                                      gf.aca("Xóa " + fz.ala().dsa.cea + " khỏi ds PK");
                                                      aka(fz.ala().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("a20s")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      aaa((Auto)(new at(var13[1])));
                                                   }

                                                   return true;
                                                }

                                                gh var14;
                                                if (var0.startsWith("dg")) {
                                                   if ((var1 = (var0 = var0.substring(3)).indexOf(32)) > 0) {
                                                      try {
                                                         aw.aaa(var14 = gi.aaa(Short.parseShort(var0.substring(0, var1))), var0.substring(var1 + 1, var0.length()));
                                                         gf.aca("Đặt giá: " + var14.ada);
                                                      } catch (Exception var19) {
                                                         var19.printStackTrace();
                                                      }
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("asw")) {
                                                   var13 = aca(var0, " ");

                                                   try {
                                                      var1 = Integer.parseInt(var13[1]);
                                                      int var29 = Integer.parseInt(var13[2]);
                                                      gh var34 = gi.aaa((short)var1);
                                                      gf.aca("Thêm: " + var34.ada + " giá: " + var29 + " vào ds bán Shinwa");
                                                      aba(var1, var29);
                                                   } catch (Exception var20) {
                                                      var20.printStackTrace();
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("rsw")) {
                                                   var13 = aca(var0, " ");

                                                   try {
                                                      var14 = gi.aaa((short)(var1 = Integer.parseInt(var13[1])));
                                                      if (ada(var1)) {
                                                         var12 = aea(var1);
                                                         gf.aca("Xóa: " + var14.ada + " giá: " + var12 + " khỏi ds bán Shinwa");
                                                         afa(var1);
                                                      } else {
                                                         gf.aca("Item " + var14.ada + " chưa có trong ds bán Shinwa");
                                                      }
                                                   } catch (Exception var21) {
                                                      var21.printStackTrace();
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("tnx")) {
                                                   if (gn.afa(gn.aoa)) {
                                                      var13 = aca(var0, " ");

                                                      try {
                                                         var1 = Integer.parseInt(var13[1]);
                                                      } catch (Exception var24) {
                                                         return false;
                                                      }

                                                      boolean var15;
                                                      int var16;
                                                      try {
                                                         var16 = Integer.parseInt(var13[2]);
                                                      } catch (Exception var23) {
                                                         var15 = false;
                                                      }

                                                      try {
                                                         var16 = Integer.parseInt(var13[3]);
                                                      } catch (Exception var22) {
                                                         var15 = false;
                                                      }

                                                      gf.aca("Auto làm " + var1 + " tiên nữ");
                                                      return true;
                                                   }

                                                   gf.aca("Hãy đứng Trường để auto làm tiên nữ");
                                                }
                                             }

                                             return false;
                                          }
                                       } else if (gf.bfa.size() > 0 && ((ep)gf.bfa.firstElement()).aaa == fz.ala().asa) {
                                          var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                                          if (var8 == null) {
                                             gf.aca("Stanima nhóm all");
                                             aca(-1, gn.aoa);
                                          } else {
                                             gf.aca("Stanima nhóm " + var8.aga + " id " + var1);
                                             aca(var8.aea, gn.aoa);
                                          }

                                          aca.afa = true;
                                          gm.aaa().aka("st " + aca.aga + " " + aca.aha + " " + aca.aba);
                                          return true;
                                       } else {
                                          gf.aca("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    }
                                 }
                              }
                           } else {
                              gf.aca("End Auto");
                              aga();
                              if (fz.fla) {
                                 gm.aaa().aka("pe");
                              }

                              return true;
                           }
                        }
                     }
                  }
               } else {
                  gf.aca("Phá băng");
                  bea = false;
                  bfa = false;
                  return true;
               }
            } else {
               gf.aca("Băng skill");
               bfa = true;
               return true;
            }
         } else {
            gf.aca("Băng boss");
            bea = true;
            return true;
         }
      } else {
         gf.aca("Đóng băng");
         bea = true;
         bfa = true;
         return true;
      }
   }

   public static void aga(String var0) {
      for(int var1 = 0; var1 < cwa.length; ++var1) {
         aaa(var0, cwa[var1].trim());
      }

   }

   public static void apa() {
      if (System.currentTimeMillis() - daa > 60000L) {
         daa = System.currentTimeMillis();
         ev var0;
         (var0 = new ev()).addElement(fz.ala());
         gm.aaa().aaa((ev)(new ev()), (ev)var0, (int)2);
      }

   }

   public static void aha(String var0) {
      if (System.currentTimeMillis() - cya >= 5000L) {
         cya = System.currentTimeMillis();
         Calendar var1;
         (var1 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
         var0 = "@" + (10 + cza.nextInt(89)) + " " + var0 + " " + var1.get(11) + ":" + var1.get(12) + ":" + var1.get(13);
         gm.aaa().aca(var0);
      }

   }

   public static void aaa(String var0, String var1) {
      dc.ada().aaa(var0, fz.ala().cea, var1);
      gm.aaa().aaa(var0, var1);
      Auto.aaa(20L);
   }

   public static String aia(String var0) {
      InputStream var1 = fd.aaa("/".concat(String.valueOf(var0)));

      try {
         byte[] var2 = new byte[var1.available()];
         var1.read(var2);
         var0 = new String(var2, "UTF-8");
      } catch (Exception var3) {
         var0 = "";
      }

      return var0;
   }

   public static void aba(String var0, String var1) {
      if (fz.fla && aha != null && var0.equals(aha) && !fz.ala().cea.equals(aha)) {
         ada(var0, var1);
      }

      fa var2;
      boolean var3;
      if ((var2 = dc.ada().aaa(var0)) == null) {
         var3 = true;
      } else if (System.currentTimeMillis() - var2.ada > 1000L) {
         var2.ada = System.currentTimeMillis();
         var3 = true;
      } else {
         var3 = false;
      }

      if (var3) {
         fz var4 = fz.ala();
         String[] var5 = aca(bpa, ",");

         int var6;
         for(var6 = 0; var6 < var5.length; ++var6) {
            if (var0.equals(var5[var6])) {
               if (var1.toLowerCase().equals("lodai")) {
                  aga();
                  cma.aea();
                  aaa((Auto)cma);
               }

               if (var1.toLowerCase().equals("cusat")) {
                  aga();
                  aaa((Auto)(new gp()));
               }
            }
         }

         if (var1.toLowerCase().equals("yenxu")) {
            aaa(var0, "Yên: " + var4.csa + " Xu: " + var4.cqa + " Lượng: " + var4.cta);
            if (aba != null) {
               var6 = fz.ala().csa - aba.ala;
               int var7 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
               aaa(var0, "Up " + var6 + " trong " + ex.aba(var7) + " perh=" + var6 / var7 * 3600);
               return;
            }
         } else {
            if (var1.toLowerCase().equals("level")) {
               long var18;
               long var8 = (var18 = (fz.ala().aka > 0L ? fz.ala().aka : fz.ala().bha) * 10000L / gf.dta[fz.ala().aya]) % 100L;
               aaa(var0, "LV: " + var4.aya + " + " + (fz.ala().aka > 0L ? "-" : "") + var18 / 100L + "." + (var8 < 10L ? "0".concat(String.valueOf(var8)) : String.valueOf(var8)) + "%");
               if (aba != null) {
                  long var10;
                  float var12 = (float)((var10 = fz.ala().aja - aba.ama) * 10000L / gf.dta[fz.ala().aya]) / 100.0F;
                  int var13 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
                  long var14;
                  float var16 = (float)((var14 = var10 * 3600L / (long)var13) * 10000L / gf.dta[fz.ala().aya]) / 100.0F;
                  aaa(var0, "Up " + var10 + " - " + var12 + "% trong " + ex.aba(var13) + " perh=" + var14 + " - " + var16 + "%");
                  return;
               }

               return;
            }

            if (aba != null && bda > 0L) {
               if (var1.toLowerCase().equals("time")) {
                  aaa(var0, "Thời gian còn lại: " + ex.aba((int)(bda / 1000L)));
                  return;
               }
            } else {
               if (aba instanceof fv) {
                  afa.aaa(var0, var1);
                  return;
               }

               if (var1.equals(ez.aba)) {
                  gj.bla();
                  aba = null;
                  cs var17 = cs.aba();
                  aba();
                  var17.ada();
               }
            }
         }
      }

   }

   public static String[] aca(String var0, String var1) {
      int var2 = 0;
      int var3 = var1.length();

      int var4;
      for(var4 = var0.indexOf(var1, 0); var4 != -1; ++var2) {
         var4 += var3;
         var4 = var0.indexOf(var1, var4);
      }

      String[] var5 = new String[var2 + 1];
      var4 = var0.indexOf(var1);
      int var6 = 0;

      int var7;
      for(var7 = 0; var4 != -1; ++var7) {
         var5[var7] = var0.substring(var6, var4);
         var6 = var4 + var3;
         var4 = var0.indexOf(var1, var6);
      }

      var5[var7] = var0.substring(var6, var0.length());
      return var5;
   }

   public static void ada(String var0, String var1) {
      if (fz.fla && aha != null && var0.equals(aha) && !fz.ala().cea.equals(aha)) {
         String[] var2 = aca(var1, " ");

         try {
            if (var2[0].equals("dcvt")) {
               ara = Integer.parseInt(var2[1]) == 1;
               return;
            }

            if (var2[0].equals("avt")) {
               gf.aca("Thêm vị trí " + ata.size());
               ata.addElement(Integer.valueOf(var2[1]));
               aua.addElement(Integer.valueOf(var2[2]));
               return;
            }

            if (var2[0].equals("dvt")) {
               gf.aca("Xóa hết vị trí");
               ata.removeAllElements();
               aua.removeAllElements();
               return;
            }

            int var3;
            if (var2[0].equals("dvtx")) {
               var3 = Integer.parseInt(var2[1]);
               gf.aca("Xóa vị trí ".concat(String.valueOf(var3)));
               ata.removeElementAt(var3);
               aua.removeElementAt(var3);
               return;
            }

            if (var2[0].equals("pe")) {
               gf.aca("End Auto");
               gj.bla();
               aba = null;
               return;
            }

            if (var2[0].equals("tsa")) {
               if (aba == cka) {
                  cka.aga = Integer.parseInt(var2[1]);
                  cka.aha = Integer.parseInt(var2[2]);
                  return;
               }

               cia.aaa(-1, Integer.parseInt(var2[1]), Integer.parseInt(var2[2]));
               cia.afa = true;
               aaa((Auto)cia);
               return;
            }

            if (var2[0].equals("ts")) {
               if (aba == cka) {
                  cka.aga = Integer.parseInt(var2[1]);
                  cka.aha = Integer.parseInt(var2[2]);
                  return;
               }

               cia.aaa(Integer.parseInt(var2[3]), Integer.parseInt(var2[1]), Integer.parseInt(var2[2]));
               cia.afa = true;
               aaa((Auto)cia);
               return;
            }

            if (var2[0].equals("att")) {
               if (aba == cka) {
                  cka.aga = Integer.parseInt(var2[1]);
                  cka.aha = Integer.parseInt(var2[2]);
                  return;
               }

               var3 = Integer.parseInt(var2[1]);
               int var8 = Integer.parseInt(var2[3]);
               aj var5;
               if ((var5 = fz.ama(1)) != null && var5.aga == var3) {
                  aea.a_();
               } else {
                  aea.aaa(var3, var8);
               }

               aea.aha = Integer.parseInt(var2[2]);
               aea.afa = true;
               aaa((Auto)aea);
               return;
            }

            if (var2[0].equals("sta")) {
               if (aba == cka) {
                  cka.aga = Integer.parseInt(var2[1]);
                  cka.aha = Integer.parseInt(var2[2]);
                  return;
               }

               aca.aaa(-1, Integer.parseInt(var2[1]), Integer.parseInt(var2[2]), false, false);
               aca.afa = true;
               aaa((Auto)aca);
               return;
            }

            if (var2[0].equals("st")) {
               if (aba == cka) {
                  cka.aga = Integer.parseInt(var2[1]);
                  cka.aha = Integer.parseInt(var2[2]);
                  return;
               }

               aca.aaa(Integer.parseInt(var2[3]), Integer.parseInt(var2[1]), Integer.parseInt(var2[2]), false, false);
               aca.afa = true;
               aaa((Auto)aca);
               return;
            }

            if (var2[0].equals("hd9x")) {
               aaa((Auto)(new bj()));
               return;
            }

            if (var2[0].equals("pkms")) {
               if (aba instanceof dv) {
                  dv var4;
                  (var4 = (dv)aba).aga = Integer.parseInt(var2[1]);
                  var4.aba = Integer.parseInt(var2[2]);
                  var4.aaa = 3;
                  return;
               }
            } else if (var2[0].equals("pkes")) {
               if (aba instanceof dv) {
                  ((dv)aba).aaa = 4;
                  return;
               }
            } else {
               if (var2[0].equals("pkm")) {
                  if (aba == cka) {
                     cka.aga = Integer.parseInt(var2[1]);
                     return;
                  }

                  Auto var7 = aba instanceof ej ? aba.aoa : aba;
                  aaa((Auto)(new ej(Integer.parseInt(var2[1]))));
                  aba.aoa = var7;
                  return;
               }

               if (var2[0].equals("pkk")) {
                  if (aba instanceof ej || aba == cka) {
                     aba.aha = Integer.parseInt(var2[1]);
                     return;
                  }
               } else if (var2[0].equals("pke")) {
                  if (aba instanceof ej) {
                     aca();
                     return;
                  }
               } else if (aba != null) {
                  if (var2[0].equals("map")) {
                     aba.aga = Integer.parseInt(var2[1]);
                     return;
                  }

                  if (var2[0].equals("khu")) {
                     aba.aha = Integer.parseInt(var2[1]);
                     return;
                  }

                  if (aba instanceof fl) {
                     if (var2[0].equals("waitGr")) {
                        fl.aca = System.currentTimeMillis();
                        fl.aba = true;
                        return;
                     }

                     if (var2[0].equals("notifyGr")) {
                        fl.aba = false;
                        return;
                     }
                  } else if (aba instanceof eu && var2[0].equals("sts")) {
                     aca.aea();
                     return;
                  }
               }
            }

            return;
         } catch (Exception var6) {
            var6.printStackTrace();
         }
      }

   }

   public static void aqa() {
      cya = 0L;
      cza = new Random();
      daa = 0L;
      ata();
   }

   public static void ara() {
      for(int var0 = 0; var0 < caa.size(); ++var0) {
         Object var1 = caa.elementAt(var0);
         int var2 = 0;
         int var3 = 0;
         if (((gg)var1).ara()) {
            var2 = gf.dva[((gg)var1).aia] / 2;
            var3 = gf.dza[((gg)var1).aia];
         } else if (((gg)var1).asa()) {
            var2 = gf.dwa[((gg)var1).aia] / 2;
            var3 = gf.eaa[((gg)var1).aia];
         } else if (((gg)var1).ata()) {
            var2 = gf.dxa[((gg)var1).aia] / 2;
            var3 = gf.eba[((gg)var1).aia];
         }

         if (var2 << 1 <= fz.bia() && var3 << 1 <= fz.ala().csa && ((gg)var1).aia < cba) {
            int var4 = ((gg)var1).aia;
            if (cda) {
               gf.ava().ada((int)10);
            }

            gf.dfa = (gg)var1;

            for(int var5 = 0; var5 < 1 && ((gg)var1).aia == var4; ++var5) {
               gf.cxa = new gg[18];
               int var6 = 0;
               int var7 = 0;

               for(int var8 = 0; var8 < fz.ala().daa.length && var7 < var2; ++var8) {
                  gg var9 = fz.ala().daa[var8];
                  if (((gg)var1).aia == 7) {
                     if (fz.aia(242) < 0) {
                        if (fz.ala().cta >= 10) {
                           gm.aaa().aba(14, 23, 1);
                           gj.aha();
                        } else {
                           gf.aca("Hết Lượng Mua BHSC");
                        }
                     } else {
                        gf.cxa[0] = ADV.aea(242);
                     }
                  }

                  if (var9 != null && var9.aaa.aba == 26 && var9.aaa.aaa <= cca - 1) {
                     fz.ala().daa[var8] = null;
                     gf.cxa[var6++] = var9;
                     var7 += gf.dva[var9.aaa.aaa];
                  }
               }

               do {
                  try {
                     Thread.sleep(1500L);
                  } catch (InterruptedException var10) {
                  }

                  gm.aaa().aaa((gg)var1, gf.cxa);
                  gm.aaa().aja(fz.ala().cea);
                  gj.ara();
               } while(gf.cxa[0] != null);
            }

            gf.dfa = null;
         } else if (((gg)var1).aia >= cba) {
            caa.removeElementAt(var0--);
         }
      }

   }

   public static boolean aea(gg var0) {
      return caa.contains(var0);
   }

   public static void afa(gg var0) {
      if (!caa.contains(var0)) {
         caa.addElement(var0);
      }

   }

   public static void aga(gg var0) {
      caa.removeElement(var0);
   }

   public static void asa() {
      aaa = null;
      cga = false;
      cha = null;
      aba = null;
      cia = null;
      aca = null;
      ada = null;
      aea = null;
      cja = null;
      cka = null;
      afa = null;
      cla = null;
      aga = null;
      cma = null;
      cna = null;
      coa = null;
      cpa = null;
      aha = null;
      aia = null;
      aja = null;
      cqa = 0L;
      cra = 0L;
      aka = null;
      ala = null;
      ama = 0;
      ana = 0;
      aoa = 0;
      apa = 0;
      aqa = false;
      ara = false;
      asa = 0;
      ata = null;
      aua = null;
      ava = false;
      awa = 0;
      axa = null;
      aya = false;
      aza = 0;
      csa = 0L;
      cta = null;
      cua = null;
      cva = 0L;
      baa = null;
      bba = null;
      bca = 0L;
      bda = 0L;
      bea = false;
      bfa = false;
      bga = false;
      bha = 0;
      bia = false;
      bja = 0;
      bka = false;
      bla = 0;
      bma = false;
      bna = 0;
      boa = false;
      bpa = null;
      bqa = 0;
      bra = 0;
      bsa = 0;
      bta = 0;
      cwa = null;
      bua = 0;
      bva = 0;
      bwa = 0;
      bxa = 0;
      bya = 0;
      bza = 0L;
      cxa = false;
      cya = 0L;
      cza = null;
      daa = 0L;
      dba = null;
      caa = null;
      cba = 0;
      cca = 0;
      cda = false;
   }
}
