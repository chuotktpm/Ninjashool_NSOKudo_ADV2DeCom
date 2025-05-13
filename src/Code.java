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
   public static AutoLoiDai aga;
   private static AutoLoseLoiDai cma;
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
      aga = new AutoLoiDai();
      cma = new AutoLoseLoiDai();
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
         LockGame.bla();
         cha.interrupt();
      }

   }

   public static void aaa(Auto var0) {
      var0.aoa = aba;
      aba = var0;
   }

   public static void aca() {
      LockGame.bla();
      aba = aba.aoa;
   }

   public static void aaa(int var0, int var1) {
      cia.aaa(var0, var1, Char.faa ? -1 : TileMap.zoneID);
      aaa((Auto)cia);
   }

   private static void aca(int var0, int var1) {
      aca.aaa(var0, var1, Char.faa ? -1 : TileMap.zoneID, false, false);
      aaa((Auto)aca);
   }

   private static void aaa(boolean var0, boolean var1) {
      aca.aaa(-1, TileMap.mapID, TileMap.zoneID, var0, var1);
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
      cka.aaa(TileMap.mapID, TileMap.zoneID, var0, var1);
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
      LockGame.bla();
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
               if (Char.getMyChar().cya != null && Char.getMyChar().asa == var2.bga.readInt() && Char.getMyChar().aza > Char.getMyChar().cya.aja) {
                  Char var3 = Char.getMyChar();
                  var3.aza -= Char.getMyChar().cya.aja;
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
         if ((var1 = Char.getMyChar().cea).equals(aha)) {
            if (aca(var0)) {
               return true;
            }
         } else if (GameScr.bfa.size() > 1 && var1.equals(((ep)GameScr.bfa.firstElement()).ada) && var0.equals(aha)) {
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
      if (var0.equals(Char.getMyChar().cea)) {
         return true;
      } else {
         for(int var1 = 0; var1 < GameScr.bfa.size(); ++var1) {
            if (((ep)GameScr.bfa.elementAt(var1)).ada.equals(var0)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean aia() {
      for(int var0 = 0; var0 < Char.fwa - 1; ++var0) {
         if (Char.aka(var0) >= 4) {
            return true;
         }
      }

      return false;
   }

   private static int aga(int var0) {
      int var1 = 0;
      Char var2 = Char.getMyChar();

      for(int var3 = 0; var3 < var2.arrItemBag.length; ++var3) {
         gg var4;
         if ((var4 = var2.arrItemBag[var3]) != null && var4.aaa.aba == 18 && var4.aaa.afa == var0) {
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
                  Char var3 = Char.getMyChar();
                  int var4 = Char.bja();
                  int var5;
                  int var6;
                  int var7;
                  if (aba != null) {
                     if (aya && !(aba instanceof cj) && (!(aba instanceof eu) || aca.aaa != 2) && Char.getMyChar().bha * 100L / GameScr.dta[Char.getMyChar().aya] >= bza) {
                        cj.aaa = aba;
                        awa();
                     }

                     if (aha != null && System.currentTimeMillis() - cqa > 5000L) {
                        if (aha.equals(var3.cea)) {
                           if (!Auto.apa && GameScr.bfa.size() <= 0) {
                              Service.aaa().asa();
                           }
                        } else if (GameScr.aaa(aha) != null && GameScr.bfa.size() == 0) {
                           Service.aaa().aha(aha);
                        }

                        cqa = System.currentTimeMillis();
                     }

                     if (bda > 0L) {
                        long var8;
                        if ((var8 = System.currentTimeMillis()) - bca >= bda) {
                           bda = 0L;
                           LockGame.bla();
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

                     if (Char.fca && Auto.ava) {
                        Auto.ava = false;
                        if (!(aba instanceof fl) && !(aba instanceof ej) && !TileMap.aea(TileMap.mapID) && var3.dca[15] == null) {
                           Auto.ala();
                        }
                     }

                     int var19;
                     if (var3.aqa != 14 && var3.aqa != 5 && var3.bba > 0) {
                        if (Char.ega && System.currentTimeMillis() - cra > 500L && Char.getMyChar().aza < Char.getMyChar().baa * Char.fsa / 100) {
                           Char.getMyChar().aea(17);
                           cra = System.currentTimeMillis();
                        }

                        if (Char.efa && System.currentTimeMillis() - var3.gpa > 2000L && Char.getMyChar().bba < Char.getMyChar().bea * Char.fra / 100) {
                           boolean var9 = false;
                           var5 = (int)(System.currentTimeMillis() / 1000L);

                           for(var19 = 0; var19 < Char.getMyChar().cxa.size(); ++var19) {
                              bu var10;
                              if ((var10 = (bu)Char.getMyChar().cxa.elementAt(var19)).aea.aaa == 21 && var10.aca - (var5 - var10.aba) >= 2) {
                                 var9 = true;
                                 break;
                              }
                           }

                           if (!var9) {
                              Char.getMyChar().aea(16);
                              var3.gpa = System.currentTimeMillis();
                           }
                        }
                     }

                     if (var3.bja > 0 && (Char.fka || aba instanceof bt) && Auto.aqa != null && Auto.aqa.aca < Auto.aqa.aaa.aca) {
                        dk var20 = Auto.aqa.aaa;
                        var5 = 0;

                        for(var19 = Auto.aqa.aca + 1; var19 <= var20.aca && var20.aga[var19].ada <= var3.aya && var5 < var3.bja; ++var19) {
                           ++var5;
                        }

                        if (var5 > 0) {
                           GameScr.chatPopup("Cộng skill " + var20.aba + " " + var5 + " điểm");
                           Service.aaa().afa(var20.aaa, var5);
                           if (LockGame.ava()) {
                              cs.aba().aea();
                           }
                        }
                     }

                     if (var3.bia > 0 && (Char.fja || aba instanceof bt)) {
                        var6 = var3.aka() ? 3 : 0;
                        if (var3.bia >= 100) {
                           GameScr.chatPopup("Cộng tiềm năng " + er.jxa[var6] + " 60 điểm, " + er.jxa[2] + " 40 điểm");
                           Service.aaa().aea(2, 40);
                           Service.aaa().aea(var6, 60);
                        } else {
                           GameScr.chatPopup("Cộng tiềm năng " + er.jxa[var6] + " " + var3.bia + " điểm");
                           Service.aaa().aea(var6, var3.bia);
                        }

                        LockGame.axa();
                     }

                     TileMap.bda[138] = new short[]{(short)gh.aja};
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
                              ev var13 = Char.aha(var5 < 3 ? 455 : (var5 < 6 ? 456 : 457));
                              var22 = var11[var5];
                              byte var14 = var12[var5];
                              if (var3.csa >= var22 && var13.size() >= var14) {
                                 gg[] var15 = new gg[24];

                                 for(var22 = 0; var22 < var14; ++var22) {
                                    gg var16 = (gg)var13.elementAt(var13.size() - 1);
                                    var15[var22] = var16;
                                    var3.arrItemBag[var16.ada] = null;
                                    var13.removeElementAt(var13.size() - 1);
                                 }

                                 Service.aaa().aca(var21, var15);
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
                     if (Char.exa && var4 > 0) {
                        var23 = Char.aha(455);

                        while(var23.size() >= 9) {
                           var26 = new gg[24];

                           for(var19 = 0; var19 < 9; ++var19) {
                              var21 = (gg)var23.elementAt(var23.size() - 1);
                              var26[var19] = var21;
                              var3.arrItemBag[var21.ada] = null;
                              var23.removeElementAt(var23.size() - 1);
                           }

                           Service.aaa().ada(var26);
                        }

                        var4 = Char.bja();
                     }

                     if (Char.eya && var4 > 0) {
                        var23 = Char.aha(456);

                        while(var23.size() >= 9) {
                           var26 = new gg[24];

                           for(var19 = 0; var19 < 9; ++var19) {
                              var21 = (gg)var23.elementAt(var23.size() - 1);
                              var26[var19] = var21;
                              var3.arrItemBag[var21.ada] = null;
                              var23.removeElementAt(var23.size() - 1);
                           }

                           Service.aaa().ada(var26);
                        }

                        var4 = Char.bja();
                     }

                     if (System.currentTimeMillis() - cva > 2000L) {
                        for(var6 = 0; var6 < baa.size(); ++var6) {
                           var5 = (Integer)baa.elementAt(var6);
                           if ((var19 = (Integer)bba.elementAt(var6)) < 5000) {
                              baa.removeElementAt(var6);
                              bba.removeElementAt(var6);
                              --var6;
                           } else if ((var21 = Char.aga(var5)) != null) {
                              Service.aaa().aaa(var21, var19);
                           }
                        }

                        var4 = Char.bja();
                        cva = System.currentTimeMillis();
                     }

                     if (TileMap.mapID != 138 && TileMap.aea(TileMap.mapID) && (!Char.aja(35) && !Char.aja(37) || Char.eha && Char.fba && Char.fta <= 50 && var4 > 1 && aga(Char.fta) == 0)) {
                        TileMap.aja(0);
                        TileMap.aga();
                     }

                     if (var4 < 4 && !(aba instanceof ds) && Char.epa && var3.aua > 9 && var4 > 0 && aia()) {
                        Vector var27 = new Vector();

                        label375:
                        for(var19 = 0; var19 < Char.fwa - 1; ++var19) {
                           var27.removeAllElements();

                           gg var29;
                           for(var7 = 0; var7 < var3.arrItemBag.length; ++var7) {
                              if ((var29 = var3.arrItemBag[var7]) != null && var29.aaa.aaa == var19) {
                                 var27.addElement(var29);
                              }
                           }

                           while(var27.size() >= 4) {
                              var7 = 1;

                              for(var5 = var19; var5 < Char.fwa - 1 && GameScr.dya[var5] <= var3.csa && var7 << 2 <= var27.size() && var7 < 16; ++var5) {
                                 var7 <<= 2;
                              }

                              if (var7 == 1) {
                                 break label375;
                              }

                              GameScr.ava().ada((int)12);
                              GameScr.cwa = new gg[24];

                              for(var22 = 0; var22 < var7; ++var22) {
                                 var29 = (gg)var27.elementAt(0);
                                 GameScr.cwa[var22] = var29;
                                 var3.arrItemBag[var29.ada] = null;
                                 var27.removeElementAt(0);
                              }

                              Service.aaa().aca(GameScr.cwa);
                              LockGame.aba();
                              if (GameScr.cwa[0] != null) {
                                 var3.arrItemBag[GameScr.cwa[0].ada] = GameScr.cwa[0];
                              }
                           }
                        }

                        GameScr.ava().ada((int)4);
                        var5 = 0;

                        for(var19 = Char.bka(); var5 < var3.arrItemBag.length; ++var5) {
                           if ((var21 = var3.arrItemBag[var5]) != null && var21.aaa.aaa == Char.fwa - 1 && var19 > 0) {
                              Service.aaa().ada(var21.ada);
                              --var19;
                           }
                        }

                        Service.aaa().afa();
                        LockGame.ata();
                        Thread.sleep(1000L);
                        Controller.aea().aba();
                     }

                     if (TileMap.ada(TileMap.mapID) || TileMap.afa(TileMap.mapID)) {
                        if ((Char.fba || aba instanceof ds) && var4 > 1 && var3.aua > 3 && (var19 = aba instanceof ds ? (var3.aua >= 9 ? 10 : 1) : Char.fta) <= 50 && aga(var19) == 0) {
                           var5 = 2;

                           for(var6 = 0; var6 < var3.cxa.size(); ++var6) {
                              if (((bu)var3.cxa.elementAt(var6)).aea.aba == 0) {
                                 --var5;
                                 break;
                              }
                           }

                           GameScr.PickNpc(4, 0, 0);
                           if (var19 == 50) {
                              Service.aaa().aba(9, 7, var5);
                           } else {
                              Service.aaa().aba(9, var19 / 10, var5);
                           }

                           LockGame.aha();
                        }

                        if (TileMap.mapID == 138 && var4 > 1 && !Char.aja(35) && !Char.aja(37)) {
                           GameScr.PickNpc(4, 0, 0);
                           Service.aaa().aba(9, 6, 1);
                           LockGame.aha();
                           ++var4;
                        }
                     }
                  }

                  if (aqa) {
                     var6 = 100;
                     am var28 = null;
                     var7 = 0;

                     while(true) {
                        if (var7 >= GameScr.bma.size()) {
                           if (var28 != null) {
                              Service.aaa().aoa(var28.aga);
                              Auto.aaa(50L);
                           }
                           break;
                        }

                        am var24 = (am)GameScr.bma.elementAt(var7);
                        var5 = ci.aaa(var3.cx, var3.cy, var24.aca, var24.ada);
                        if ((var6 == -1 || var5 < var6) && (aaa(var24.aha) || var3.cua.aaa == 1 && var24.aha.aaa == 218) && (var4 > 2 || var24.aha.aba == 19 || var24.aha.aia && Char.aja(var24.aha.aaa))) {
                           var6 = var5;
                           var28 = var24;
                        }

                        ++var7;
                     }
                  }

                  if (aya && var3.bha * 100L / GameScr.dta[var3.aya] >= 95L) {
                     LockGame.bla();
                     aba = null;
                     cs.aba().aca();
                     GameCanvas.aja.aqa();
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
                           if (Char.aja(var5)) {
                              for(var7 = 0; var7 < var3.cxa.size(); ++var7) {
                                 bu var25;
                                 if ((var25 = (bu)var3.cxa.elementAt(var7)) != null && var25.aea.aca == var30.aga) {
                                    break label574;
                                 }
                              }

                              if ((var7 = Char.aia(var5)) >= 0) {
                                 Service.aaa().aea(var7);
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

               if (Char.getMyChar().aga) {
                  LockGame.aja();
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
      Char var0 = Char.getMyChar();

      for(int var1 = 0; var1 < cua.size(); ++var1) {
         gg var2;
         if ((var2 = (gg)cua.elementAt(var1)).ada >= 0 && var2.ada < var0.arrItemBag.length) {
            if (var0.arrItemBag[var2.ada] != null && var0.arrItemBag[var2.ada].aua() >= 0 && var0.arrItemBag[var2.ada].aua() < 9) {
               cua.setElementAt(var0.arrItemBag[var2.ada], var1);
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
            Char var3 = Char.getMyChar();
            if (Char.bja() <= 6) {
               return false;
            } else if ((var3.aua < 13 || var3.aua == 13 && var3.dca[1] != null && var3.dca[1].aia < 2) && var0.aba == 26 && var0.aaa > 0) {
               return true;
            } else {
               int var2 = var3.ata == 1 ? 124 : 125;
               return var3.aua <= 12 && (var0.aaa == 174 && !Char.aja(174) || var0.aaa == var2 && !Char.aja(var2));
            }
         }
      } else if (aba instanceof ds) {
         return var0.aba == 19;
      } else if (var0.aba == 19) {
         return Char.ema;
      } else if (var0.aba != 16 && var0.aba != 17) {
         if (var0.aba == 26) {
            return Char.eoa && var0.aaa >= Char.fva - 1;
         } else if (var0.aaa()) {
            return (Char.eqa || aba instanceof eu) && var0.afa >= Char.fxa;
         } else if (var0.aba()) {
            return Char.esa;
         } else {
            if (var0.aba == 27) {
               if (var0.aea.startsWith("Vật phẩm sự kiện") || var0.aea.startsWith("Vật phẩm Sự kiện")) {
                  return Char.eta;
               }

               if (var0.ada.startsWith("Sách võ công")) {
                  return Char.eva;
               }

               if (TileMap.aea(TileMap.mapID) && var0.aaa == 38) {
                  return false;
               }
            }

            for(int var1 = 0; var1 < aka.length; ++var1) {
               if (aka[var1] > 0 && var0.aaa == aka[var1]) {
                  return true;
               }
            }

            return Char.eua;
         }
      } else {
         return Char.ena && var0.afa >= Char.fua;
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
            if (aba instanceof eu && !Char.eqa && var0.aaa.aba < 10 && var0.aaa.afa < 70) {
               return true;
            } else if (aba instanceof ADV && var0.aaa.aba < 10) {
               return var0.aaa.afa < 50 && var0.aaa.aba != 1 && (ADV.aaa == null || var0.aaa.aaa != ADV.aaa.aaa);
            } else if (var0.aaa.aba == 26 && var0.aaa.aaa < (Char.eoa ? Char.fva : Char.fwa) - 1) {
               return true;
            } else {
               if (var0.aaa.aba < 10 || var0.aaa.aba >= 29 && var0.aaa.aba <= 32) {
                  if (var0.aaa.aba < 10 && !Char.eqa) {
                     if (var0.aaa.afa < 50) {
                        return true;
                     }

                     return false;
                  }

                  if (!var0.asa && System.currentTimeMillis() - var0.ata > 5000L) {
                     var0.ata = System.currentTimeMillis();
                     Service.aaa().aca(var0.ana, var0.ada);
                     if (!LockGame.ata() || !var0.asa) {
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

                  if (Char.era) {
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
      Char var0 = Char.getMyChar();
      if (!Char.aja(37) && !Char.aja(35)) {
         Npc var1;
         if ((var1 = GameScr.findNpc(13)) != null && Math.abs(var1.cx - var0.cx) <= 200 && Math.abs(var1.cy - var0.cy) <= 200) {
            Char.charMove(var1.cx > 200 ? var1.cx - 200 : var1.cx + 200, var1.cy);
         }

         Service.aaa().aea();
      } else {
         Char.charMove(var0.cx, TileMap.ada);
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
         GameScr.chatPopup("Vị trí truyền thuyết lệnh: " + cfa);
         return true;
      } else if (var26.equals("akn")) {
         cea.aaa(TileMap.mapID, TileMap.zoneID);
         aaa((Auto)cea);
         return true;
      } else if (var26.equals("uppk")) {
         (new bn()).aaa();
         return true;
      } else if (var26.equals("adpk")) {
         if (aba instanceof eo) {
            GameScr.chatPopup("Tắt auto đánh ai bật pk");
            aga();
         } else {
            GameScr.chatPopup("Bật auto đánh ai bật pk");
            cpa.aea();
            aaa((Auto)cpa);
         }

         return true;
      } else if (var26.equals("acpk")) {
         if (aba instanceof ap) {
            GameScr.chatPopup("Tắt auto chờ pk");
            aga();
         } else {
            GameScr.chatPopup("Bật auto chờ pk");
            coa.aba();
            aaa((Auto)coa);
         }

         return true;
      } else if (var26.equals("atpk")) {
         if (aba instanceof cj) {
            GameScr.chatPopup("Tắt auto pk âm kinh nghiệm");
            aga();
         } else {
            GameScr.chatPopup("Bật auto pk âm kinh nghiệm");
            if (aba != null) {
               cj.aaa = aba;
            }

            aya = true;
            awa();
         }

         return true;
      } else if (var26.equals("s")) {
         if (var1 == 0) {
            GameScr.chatPopup("Chạy đi đou với tốc độ 0?");
         } else if (var1 > 100) {
            GameScr.chatPopup("Tốc giày nên để <= 100 để ko bị giật!");
         } else {
            GameScr.chatPopup("Fake tốc chạy ".concat(String.valueOf(var1)));
            bha = var1;
            bga = true;
         }

         return true;
      } else if (var26.equals("rs")) {
         GameScr.chatPopup("Reset tốc chạy");
         bga = false;
         return true;
      } else if (var26.equals("n")) {
         if (var1 == 0) {
            var1 = 100;
         }

         GameScr.chatPopup("Fake tầm ngang ".concat(String.valueOf(var1)));
         bia = true;
         bja = var1;
         return true;
      } else if (var26.equals("c")) {
         if (var1 == 0) {
            var1 = 100;
         }

         GameScr.chatPopup("Fake tầm cao ".concat(String.valueOf(var1)));
         bka = true;
         bla = var1;
         return true;
      } else if (var26.equals("m")) {
         if (var1 == 0) {
            var1 = 1;
         }

         GameScr.chatPopup("Fake lan ".concat(String.valueOf(var1)));
         bma = true;
         bna = var1;
         return true;
      } else if (var26.equals("rsk")) {
         GameScr.chatPopup("Reset fake tầm lan skill");
         bma = false;
         bia = false;
         bka = false;
         return true;
      } else if (var26.equals("zone")) {
         ADV.aca = !ADV.aca;
         GameScr.chatPopup(ADV.aca ? "Bật TSMT" : "Bật TSMKT");
         return true;
      } else if (var26.equals("show")) {
         cda = !cda;
         GameScr.chatPopup(cda ? "Bật Show" : "Bật Show");
         return true;
      } else if (var26.equals("set")) {
         (new ge()).aaa();
         return true;
      } else if (var26.equals("check")) {
         Service.aaa().aja(Char.getMyChar().cea);
         return true;
      } else if (!var26.equals("bang") && !var26.equals("fz")) {
         if (!var26.equals("bangb") && !var26.equals("fb")) {
            if (!var26.equals("bangs") && !var26.equals("fs")) {
               if (!var26.equals("pbang") && !var26.equals("wz")) {
                  if (var26.equals("u")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     GameScr.chatPopup("Khinh kông ".concat(String.valueOf(var1)));
                     Char.charMove(Char.getMyChar().cx, Char.getMyChar().cy - var1);
                     return true;
                  } else if (var26.equals("d")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     GameScr.chatPopup("Độn thổ ".concat(String.valueOf(var1)));
                     Char.charMove(Char.getMyChar().cx, Char.getMyChar().cy + var1);
                     return true;
                  } else if (var26.equals("l")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     GameScr.chatPopup("Dịch trái ".concat(String.valueOf(var1)));
                     Char.charMove(Char.getMyChar().cx - var1, Char.getMyChar().cy);
                     return true;
                  } else if (var26.equals("r")) {
                     if (var1 == 0) {
                        var1 = 50;
                     }

                     GameScr.chatPopup("Dịch phải ".concat(String.valueOf(var1)));
                     Char.charMove(Char.getMyChar().cx + var1, Char.getMyChar().cy);
                     return true;
                  } else {
                     Char var6;
                     if (var26.equals("g")) {
                        if ((var6 = Char.getMyChar()).dsa != null) {
                           GameScr.chatPopup("MoveTo " + var6.dsa.cea);
                           Char.charMove(var6.dsa.cx, var6.dsa.cy);
                        } else if (var6.dra != null) {
                           GameScr.chatPopup("MoveTo " + var6.dra.cea);
                           Char.charMove(var6.dra.cx, var6.dra.cy);
                        } else if (var6.dpa != null) {
                           GameScr.chatPopup("MoveTo " + var6.dpa.ada().aga);
                           Char.charMove(var6.dpa.aha, var6.dpa.aia);
                        } else if (var6.dta != null) {
                           GameScr.chatPopup("MoveTo " + var6.dta.aha.ada);
                           Char.charMove(var6.dta.aaa, var6.dta.aba);
                        }

                        return true;
                     } else if (var26.equals("ta")) {
                        GameScr.ava().ada((int)9);
                        return true;
                     } else if (var26.equals("sw")) {
                        GameScr.ava().ada((int)36);
                        return true;
                     } else if (var26.equals("up")) {
                        cc.aaa().aba();
                        return true;
                     } else if (var26.equals("aq")) {
                        if ((var6 = Char.getMyChar()).dpa != null) {
                           GameScr.bna.removeElement(var6.dpa);
                        }

                        return true;
                     } else if (var26.equals("z")) {
                        GameScr.chatPopup((Char.fea ? "Tắt" : "Bật") + " auto chuyển map");
                        Char.fea = !Char.fea;
                        return true;
                     } else if (var26.equals("rm")) {
                        GameScr.chatPopup((Char.eza ? "Tắt" : "Bật") + " auto next map");
                        Char.eza = !Char.eza;
                        return true;
                     } else if (var26.equals("x")) {
                        if (var1 == 0) {
                           var1 = -1;
                        }

                        GameScr.chatPopup("KC Nhặt ".concat(String.valueOf(var1)));
                        ama = var1;
                        return true;
                     } else if (var26.equals("kts")) {
                        if (var1 == 0) {
                           var1 = -1;
                        }

                        GameScr.chatPopup("KC Tàn sát ".concat(String.valueOf(var1)));
                        aoa = Char.getMyChar().cx;
                        apa = Char.getMyChar().cy;
                        ana = var1;
                        return true;
                     } else {
                        ac var7;
                        if (var26.equals("ts")) {
                           if ((var7 = ac.aba(var1)) == null) {
                              GameScr.chatPopup("Tàn sát all");
                              aaa(-1, TileMap.mapID);
                           } else {
                              GameScr.chatPopup("Tàn sát " + var7.ada().aga + " lv " + var1);
                              aaa(var7.ara, TileMap.mapID);
                           }

                           return true;
                        } else {
                           fr var8;
                           if (var26.equals("tsx")) {
                              var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                              if (var8 == null) {
                                 GameScr.chatPopup("Tàn sát all");
                                 aaa(-1, TileMap.mapID);
                              } else {
                                 GameScr.chatPopup("Tàn sát " + var8.aga + " id " + var1);
                                 aaa(var8.aea, TileMap.mapID);
                              }

                              return true;
                           } else if (var26.equals("tsa")) {
                              GameScr.chatPopup("Tàn sát all");
                              aaa(-1, TileMap.mapID);
                              return true;
                           } else if (var26.equals("anv")) {
                              if (TileMap.mapID != 1 && TileMap.mapID != 27 && TileMap.mapID != 72) {
                                 GameScr.chatPopup("Bạn phải đứng ở trường để Auto");
                                 return true;
                              } else {
                                 GameScr.chatPopup("Auto Nhiệm Vụ Hằng Ngày");
                                 ada();
                                 return true;
                              }
                           } else if (var26.equals("att")) {
                              GameScr.chatPopup("Auto Tà Thú");
                              aea();
                              return true;
                           } else if (var26.equals("ak")) {
                              if (aba == cja) {
                                 GameScr.chatPopup("Tắt tự đánh");
                                 aga();
                              } else {
                                 GameScr.chatPopup("Bật tự đánh");
                                 aua();
                              }

                              return true;
                           } else if (var26.equals("adv")) {
                              GameScr.chatPopup("Auto Danh Vọng");
                              afa();
                              return true;
                           } else if (var26.equals("ld")) {
                              dba.aaa();
                              return true;
                           } else if (var26.equals("nw")) {
                              if (aba == aga) {
                                 GameScr.chatPopup("Tắt auto lôi đài win");
                                 LockGame.bla();
                                 aba = null;
                              } else {
                                 GameScr.chatPopup("Bật auto lôi đài win");
                                 aga.aea();
                                 aaa((Auto)aga);
                              }

                              return true;
                           } else if (var26.equals("nl")) {
                              if (aba == cma) {
                                 GameScr.chatPopup("Tắt auto lôi đài lose");
                                 LockGame.bla();
                                 aba = null;
                              } else {
                                 GameScr.chatPopup("Bật auto lôi đài lose");
                                 cma.aea();
                                 aaa((Auto)cma);
                              }

                              return true;
                           } else if (!var26.equals("e") && !var26.equals("pe")) {
                              if (var26.equals("k")) {
                                 GameScr.chatPopup("Chuyển Khu: ".concat(String.valueOf(var1)));
                                 GameScr.ava();
                                 GameScr.aja(var1);
                                 return true;
                              } else if (var26.equals("ltd")) {
                                 if (!TileMap.afa(TileMap.mapID) && !TileMap.ada(TileMap.mapID)) {
                                    GameScr.chatPopup("Hãy đứng ở làng hoặc trường để lưu tọa độ");
                                 } else {
                                    GameScr.aha(5);
                                    Service.aaa().aga(5);
                                    Service.aaa().aca(5, 1, 0);
                                 }

                                 return true;
                              } else if (var26.equals("nm")) {
                                 GameScr.chatPopup("Next map: ".concat(String.valueOf(var1)));
                                 TileMap.ama(var1);
                                 return true;
                              } else if (var26.equals("gm")) {
                                 if (var1 < TileMap.ava.length && var1 >= 0) {
                                    GameScr.chatPopup("Go to: " + TileMap.ava[var1]);
                                    TileMap.ala(var1);
                                    return true;
                                 } else {
                                    return true;
                                 }
                              } else if (var26.equals("npc")) {
                                 if (var1 < Npc.arrNpcTemplate.length) {
                                    GameScr.chatPopup("Act NPC: " + Npc.arrNpcTemplate[var1].aba);
                                    GameScr.aha(var1);
                                 }

                                 return true;
                              } else if (var26.equals("hs")) {
                                 GameScr.chatPopup("Next to hirosaki");
                                 (new Thread(new gl(0, 1))).start();
                                 return true;
                              } else if (var26.equals("hr")) {
                                 GameScr.chatPopup("Next to haruna");
                                 (new Thread(new gl(1, 27))).start();
                                 return true;
                              } else if (var26.equals("oz")) {
                                 GameScr.chatPopup("Next to Ozawa(Oozaka)");
                                 (new Thread(new gl(2, 72))).start();
                                 return true;
                              } else if (var26.equals("kj")) {
                                 GameScr.chatPopup("Next to Kojin");
                                 (new Thread(new gl(3, 10))).start();
                                 return true;
                              } else if (var26.equals("sz")) {
                                 GameScr.chatPopup("Next to Sanzu");
                                 (new Thread(new gl(4, 17))).start();
                                 return true;
                              } else if (var26.equals("tn")) {
                                 GameScr.chatPopup("Next to Tone");
                                 (new Thread(new gl(5, 22))).start();
                                 return true;
                              } else if (var26.equals("lc")) {
                                 GameScr.chatPopup("Next to Chài");
                                 (new Thread(new gl(6, 32))).start();
                                 return true;
                              } else if (var26.equals("ck")) {
                                 GameScr.chatPopup("Next to Chakumi");
                                 (new Thread(new gl(7, 38))).start();
                                 return true;
                              } else if (var26.equals("eg")) {
                                 GameScr.chatPopup("Next to Echigo");
                                 (new Thread(new gl(8, 43))).start();
                                 return true;
                              } else if (var26.equals("os")) {
                                 GameScr.chatPopup("Next to Oshin");
                                 (new Thread(new gl(9, 48))).start();
                                 return true;
                              } else if (var26.equals("mnv")) {
                                 GameScr.chatPopup("Next to Map Nhiệm Vụ");
                                 TileMap.ala(GameScr.bma());
                                 return true;
                              } else if (var26.equals("mnvp")) {
                                 GameScr.chatPopup("Next to Map Nhiệm Vụ Phụ");
                                 aj var27;
                                 if ((var27 = Char.ama(0)) != null) {
                                    TileMap.ala(var27.aga);
                                 }

                                 return true;
                              } else {
                                 am var10;
                                 if (var26.equals("add")) {
                                    GameScr.chatPopup("Thêm vật phẩm vào ds nhặt");
                                    if ((var10 = Char.getMyChar().dta) != null) {
                                       aaa(var10.aha.aaa);
                                    }

                                    return true;
                                 } else if (var26.equals("del")) {
                                    GameScr.chatPopup("Xóa vật phẩm khỏi ds nhặt");
                                    if ((var10 = Char.getMyChar().dta) != null) {
                                       aba(var10.aha.aaa);
                                    }

                                    return true;
                                 } else {
                                    gh var11;
                                    if (var26.equals("ait")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          GameScr.chatPopup("Thêm " + var11.ada + " vào ds nhặt");
                                          aaa(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("dit")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          GameScr.chatPopup("Xóa " + var11.ada + " khỏi ds nhặt");
                                          aba(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("ajt")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          GameScr.chatPopup("Thêm " + var11.ada + " vào ds nhặt");
                                          aca(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("djt")) {
                                       if ((var11 = gi.aaa((short)var1)) != null) {
                                          GameScr.chatPopup("Xóa " + var11.ada + " khỏi ds nhặt");
                                          ada(var11.aaa);
                                       }

                                       return true;
                                    } else if (var26.equals("cnhat")) {
                                       if (aqa) {
                                          GameScr.chatPopup("Bật nhặt xa");
                                       } else {
                                          GameScr.chatPopup("Bật hút VP");
                                       }

                                       aqa = !aqa;
                                       return true;
                                    } else if (var26.equals("ruong")) {
                                       GameScr.ava().ama();
                                       return true;
                                    } else if (var26.equals("vpnhat")) {
                                       GameScr.ava().ada((int)46);
                                       return true;
                                    } else if (var26.equals("die")) {
                                       aoa();
                                       return true;
                                    } else if (var26.equals("dcvt")) {
                                       if (ara) {
                                          GameScr.chatPopup("Tắt đánh chuyển vị trí");
                                       } else {
                                          GameScr.chatPopup("Bật đánh chuyển vị trí");
                                       }

                                       ara = !ara;
                                       if (Char.fla) {
                                          Service.aaa().aka("dcvt " + (ara ? 1 : 0));
                                       }

                                       return true;
                                    } else if (var26.equals("avt")) {
                                       GameScr.chatPopup("Thêm vị trí " + ata.size());
                                       ata.addElement(new Integer(Char.getMyChar().cx));
                                       aua.addElement(new Integer(Char.getMyChar().cy));
                                       if (Char.fla) {
                                          Service.aaa().aka("avt " + Char.getMyChar().cx + " " + Char.getMyChar().cy);
                                       }

                                       return true;
                                    } else if (var26.equals("dvt")) {
                                       GameScr.chatPopup("Xóa hết vị trí");
                                       ata.removeAllElements();
                                       aua.removeAllElements();
                                       if (Char.fla) {
                                          Service.aaa().aka("dvt");
                                       }

                                       return true;
                                    } else if (var26.equals("dvtx")) {
                                       GameScr.chatPopup("Xóa vị trí ".concat(String.valueOf(var1)));
                                       ata.removeElementAt(var1);
                                       aua.removeElementAt(var1);
                                       if (Char.fla) {
                                          Service.aaa().aka("dtvx ".concat(String.valueOf(var1)));
                                       }

                                       return true;
                                    } else if (var26.equals("dck")) {
                                       if (ava = !ava) {
                                          GameScr.chatPopup("Tắt đánh chuyển khu");
                                       } else {
                                          GameScr.chatPopup("Bật đánh chuyển khu");
                                          GameCanvas.bka.aaa("Khu", new ca("Đặt", 1100090), 1);
                                          GameCanvas.bka.aaa.aaa(ala());
                                       }

                                       return true;
                                    } else if (var26.equals("keeplevel")) {
                                       if (aya) {
                                          GameScr.chatPopup("Tắt giữ lv");
                                       } else {
                                          GameScr.chatPopup("Bật giữ lv");
                                       }

                                       aya = !aya;
                                       return true;
                                    } else if (var26.equals("addn")) {
                                       GameScr.chatPopup("Thêm nhóm");
                                       if ((var6 = Char.getMyChar().dsa) != null) {
                                          if (!aca(var6.cea)) {
                                             aia.addElement(var6.cea);
                                          }

                                          Service.aaa().afa(var6.cea);
                                       }

                                       return true;
                                    } else if (var26.equals("cn")) {
                                       GameScr.chatPopup("Xóa nhóm");
                                       aha = null;
                                       aia.removeAllElements();
                                       aya();
                                       return true;
                                    } else if (var26.equals("pt")) {
                                       if (!Char.getMyChar().cea.equals(aha)) {
                                          GameScr.chatPopup("Bạn không là nhóm trưởng");
                                          return true;
                                       } else {
                                          GameScr.chatPopup("PT nhóm");

                                          for(var4 = 0; var4 < aia.size(); ++var4) {
                                             if (!ada(var0 = (String)aia.elementAt(var4))) {
                                                Service.aaa().afa(var0);
                                             }

                                             if (aba instanceof ej) {
                                                Service.aaa().aaa(var0, "pkm " + aba.aga);
                                                Service.aaa().aaa(var0, "pkk " + aba.aha);
                                             } else if (aba != null) {
                                                Service.aaa().aaa(var0, "map " + aba.aga);
                                                Service.aaa().aaa(var0, "khu " + aba.aha);
                                             }
                                          }

                                          return true;
                                       }
                                    } else if (var26.equals("sn")) {
                                       GameScr.chatPopup("Lưu nhóm");
                                       aya();
                                       return true;
                                    } else if (var26.equals("tsn")) {
                                       if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                          if ((var7 = ac.aba(var1)) == null) {
                                             GameScr.chatPopup("Tàn sát nhóm all");
                                             aaa(-1, TileMap.mapID);
                                          } else {
                                             GameScr.chatPopup("Tàn sát nhóm " + var7.ada().aga + " lv " + var1);
                                             aaa(var7.ara, TileMap.mapID);
                                          }

                                          cia.afa = true;
                                          Service.aaa().aka("ts " + cia.aga + " " + cia.aha + " " + cia.aaa);
                                          return true;
                                       } else {
                                          GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("tsnx")) {
                                       if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                          var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                                          if (var8 == null) {
                                             GameScr.chatPopup("Tàn sát nhóm all");
                                             aaa(-1, TileMap.mapID);
                                          } else {
                                             GameScr.chatPopup("Tàn sát nhóm " + var8.aga + " id " + var1);
                                             aaa(var8.aea, TileMap.mapID);
                                          }

                                          cia.afa = true;
                                          Service.aaa().aka("ts " + cia.aga + " " + cia.aha + " " + cia.aaa);
                                          return true;
                                       } else {
                                          GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("tsan")) {
                                       if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                          GameScr.chatPopup("Tàn sát nhóm all");
                                          aaa(-1, TileMap.mapID);
                                          cia.afa = true;
                                          Service.aaa().aka("tsa " + cia.aga + " " + cia.aha);
                                          return true;
                                       } else {
                                          GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("attn")) {
                                       if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                          GameScr.chatPopup("Auto Tà Thú Nhóm");
                                          aea();
                                          aea.afa = true;
                                          Service.aaa().aka("att " + aea.aga + " " + aea.aha + " " + aea.aaa);
                                          return true;
                                       } else {
                                          GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    } else if (var26.equals("buff")) {
                                       GameScr.chatPopup("Bật Buff HS Xa");
                                       aba(true, true);
                                       return true;
                                    } else if (var26.equals("bux")) {
                                       GameScr.chatPopup("Bật Buff Xa");
                                       aba(true, false);
                                       return true;
                                    } else if (var26.equals("hsx")) {
                                       GameScr.chatPopup("Bật HS Xa");
                                       aba(false, true);
                                       return true;
                                    } else {
                                       int var12;
                                       if (var26.equals("cy")) {
                                          if (aba == null) {
                                             GameScr.chatPopup("Bạn chưa up yên");
                                          } else {
                                             var12 = Char.getMyChar().csa - aba.ala;
                                             var1 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
                                             GameScr.chatPopup("Up " + var12 + " trong " + ex.aba(var1) + " perh=" + var12 / var1 * 3600);
                                          }

                                          return true;
                                       } else if (var26.equals("clv")) {
                                          if (aba == null) {
                                             GameScr.chatPopup("Bạn chưa up level");
                                          } else {
                                             long var33;
                                             float var30 = (float)((var33 = Char.getMyChar().aja - aba.ama) * 10000L / GameScr.dta[Char.getMyChar().aya]) / 100.0F;
                                             var12 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
                                             long var35;
                                             float var18 = (float)((var35 = var33 * 3600L / (long)var12) * 10000L / GameScr.dta[Char.getMyChar().aya]) / 100.0F;
                                             GameScr.chatPopup("Up " + var33 + " - " + var30 + "% trong " + ex.aba(var12) + " perh=" + var35 + " - " + var18 + "%");
                                          }

                                          return true;
                                       } else if (var26.equals("st")) {
                                          if ((var7 = ac.aba(var1)) == null) {
                                             GameScr.chatPopup("Stanima all");
                                             aca(-1, TileMap.mapID);
                                          } else {
                                             GameScr.chatPopup("Stanima " + var7.ada().aga + " lv " + var1);
                                             aca(var7.ara, TileMap.mapID);
                                          }

                                          return true;
                                       } else if (var26.equals("sta")) {
                                          GameScr.chatPopup("Stanima all");
                                          aca(-1, TileMap.mapID);
                                          return true;
                                       } else if (var26.equals("stn")) {
                                          if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                             if ((var7 = ac.aba(var1)) == null) {
                                                GameScr.chatPopup("Stanima nhóm all");
                                                aca(-1, TileMap.mapID);
                                             } else {
                                                GameScr.chatPopup("Stanima nhóm " + var7.ada().aga + " lv " + var1);
                                                aca(var7.ara, TileMap.mapID);
                                             }

                                             aca.afa = true;
                                             Service.aaa().aka("st " + aca.aga + " " + aca.aha + " " + aca.aba);
                                             return true;
                                          } else {
                                             GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var26.equals("stan")) {
                                          if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                             GameScr.chatPopup("Stanima nhóm all");
                                             aca(-1, TileMap.mapID);
                                             aca.afa = true;
                                             Service.aaa().aka("sta " + aca.aga + " " + aca.aha);
                                             return true;
                                          } else {
                                             GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                             return true;
                                          }
                                       } else if (var26.equals("stx")) {
                                          var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                                          if (var8 == null) {
                                             GameScr.chatPopup("Tàn sát all");
                                             aaa(-1, TileMap.mapID);
                                          } else {
                                             GameScr.chatPopup("Tàn sát " + var8.aga + " id " + var1);
                                             aca(var8.aea, TileMap.mapID);
                                          }

                                          return true;
                                       } else if (!var26.equals("stnx")) {
                                          if (var26.equals("sts")) {
                                             GameScr.chatPopup("Step Stanima");
                                             aca.aea();
                                             if (Char.getMyChar().cea.equals(aha) && GameScr.bfa.size() > 0) {
                                                Service.aaa().aka("sts");
                                             }

                                             return true;
                                          } else if (var26.equals("stb")) {
                                             if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa != Char.getMyChar().asa) {
                                                if (Char.getMyChar().cua.aaa != 6) {
                                                   GameScr.chatPopup("Bạn không phải là quạt");
                                                   return true;
                                                } else {
                                                   GameScr.chatPopup("Stanima Buff HS");
                                                   aaa(true, true);
                                                   return true;
                                                }
                                             } else {
                                                GameScr.chatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                return true;
                                             }
                                          } else if (var26.equals("stbx")) {
                                             if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa != Char.getMyChar().asa) {
                                                if (Char.getMyChar().cua.aaa != 6) {
                                                   GameScr.chatPopup("Bạn không phải là quạt");
                                                   return true;
                                                } else {
                                                   GameScr.chatPopup("Stanima Buff");
                                                   aaa(true, false);
                                                   return true;
                                                }
                                             } else {
                                                GameScr.chatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                return true;
                                             }
                                          } else if (var26.equals("sths")) {
                                             if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa != Char.getMyChar().asa) {
                                                if (Char.getMyChar().cua.aaa != 6) {
                                                   GameScr.chatPopup("Bạn không phải là quạt");
                                                   return true;
                                                } else {
                                                   GameScr.chatPopup("Stanima HS");
                                                   aaa(false, true);
                                                   return true;
                                                }
                                             } else {
                                                GameScr.chatPopup("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                return true;
                                             }
                                          } else if (var26.equals("pkb")) {
                                             GameScr.chatPopup("PK Thần Thú");
                                             aaa((Auto)(new ej(TileMap.mapID)));
                                             if (aha != null && Char.getMyChar().cea.equals(aha) && GameScr.bfa.size() > 1) {
                                                Service.aaa().aka("pkm " + TileMap.mapID);
                                             }

                                             return true;
                                          } else if (var26.equals("pkk")) {
                                             GameScr.chatPopup("PK Thần Thú");
                                             ej var32;
                                             (var32 = new ej(TileMap.mapID)).aha = var1;
                                             aaa((Auto)var32);
                                             if (aha != null && Char.getMyChar().cea.equals(aha) && GameScr.bfa.size() > 1) {
                                                Service.aaa().aka("pkm " + TileMap.mapID);
                                                Service.aaa().aka("pkk ".concat(String.valueOf(var1)));
                                             }

                                             return true;
                                          } else if (var26.equals("lb")) {
                                             var0 = "";

                                             for(var1 = 0; var1 < GameScr.bna.size(); ++var1) {
                                                ac var31;
                                                if ((var31 = (ac)GameScr.bna.elementAt(var1)).axa) {
                                                   var0 = var0 + var31.ada().aga + " lv: " + var31.awa + ", ";
                                                }
                                             }

                                             GameScr.chatPopup("Mob: ".concat(String.valueOf(var0)));
                                             return true;
                                          } else if (var26.equals("tb")) {
                                             (new Thread(new an())).start();
                                             return true;
                                          } else if (var26.equals("sell")) {
                                             GameScr.chatPopup("Auto Sell");
                                             ava();
                                             return true;
                                          } else if (var26.equals("h")) {
                                             Calendar var28 = ci.aca();
                                             GameScr.chatPopup("Time " + var28.get(11) + ":" + var28.get(12) + ":" + var28.get(13));
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
                                             GameScr.ava().ada(var1);
                                             return true;
                                          } else if (var0.equals("hd9x")) {
                                             GameScr.chatPopup("Hang động 9x");
                                             aaa((Auto)(new bj()));
                                             if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                                Service.aaa().aka("hd9x");
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
                                                   GameScr.chatPopup("Auto Boss ".concat(String.valueOf(var1)));
                                                   aaa((Auto)(new de(var1)));
                                                   return true;
                                                }

                                                if (var26.equals("kpk")) {
                                                   GameScr.chatPopup("Khu PK ".concat(String.valueOf(var1)));
                                                   Auto.axa = var1;
                                                   return true;
                                                }

                                                if (var26.equals("cpk")) {
                                                   GameScr.chatPopup("Xóa ds PK");
                                                   ff.aca();
                                                   return true;
                                                }

                                                String[] var13;
                                                if (var0.startsWith("apk")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      GameScr.chatPopup("Thêm " + var13[1] + " vào ds PK");
                                                      ff.aaa(var13[1]);
                                                   } else if (Char.getMyChar().dsa != null) {
                                                      GameScr.chatPopup("Thêm " + Char.getMyChar().dsa.cea + " vào ds PK");
                                                      ff.aaa(Char.getMyChar().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("dpk")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      GameScr.chatPopup("Xóa " + var13[1] + " khỏi ds PK");
                                                      ff.aba(var13[1]);
                                                   } else if (Char.getMyChar().dsa != null) {
                                                      GameScr.chatPopup("Xóa " + Char.getMyChar().dsa.cea + " khỏi ds PK");
                                                      ff.aba(Char.getMyChar().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var26.equals("chs")) {
                                                   GameScr.chatPopup("Xóa ds HS");
                                                   axa();
                                                   return true;
                                                }

                                                if (var0.startsWith("ahs")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      GameScr.chatPopup("Thêm " + var13[1] + " vào ds HS");
                                                      aja(var13[1]);
                                                   } else if (Char.getMyChar().dsa != null) {
                                                      GameScr.chatPopup("Thêm " + Char.getMyChar().dsa.cea + " vào ds HS");
                                                      aja(Char.getMyChar().dsa.cea);
                                                   }

                                                   return true;
                                                }

                                                if (var26.equals("dhs")) {
                                                   if ((var13 = aca(var0, " ")).length > 1) {
                                                      GameScr.chatPopup("Xóa " + var13[1] + " khỏi ds HS");
                                                      aka(var13[1]);
                                                   } else if (Char.getMyChar().dsa != null) {
                                                      GameScr.chatPopup("Xóa " + Char.getMyChar().dsa.cea + " khỏi ds PK");
                                                      aka(Char.getMyChar().dsa.cea);
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
                                                         GameScr.chatPopup("Đặt giá: " + var14.ada);
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
                                                      GameScr.chatPopup("Thêm: " + var34.ada + " giá: " + var29 + " vào ds bán Shinwa");
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
                                                         GameScr.chatPopup("Xóa: " + var14.ada + " giá: " + var12 + " khỏi ds bán Shinwa");
                                                         afa(var1);
                                                      } else {
                                                         GameScr.chatPopup("Item " + var14.ada + " chưa có trong ds bán Shinwa");
                                                      }
                                                   } catch (Exception var21) {
                                                      var21.printStackTrace();
                                                   }

                                                   return true;
                                                }

                                                if (var0.startsWith("tnx")) {
                                                   if (TileMap.afa(TileMap.mapID)) {
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

                                                      GameScr.chatPopup("Auto làm " + var1 + " tiên nữ");
                                                      return true;
                                                   }

                                                   GameScr.chatPopup("Hãy đứng Trường để auto làm tiên nữ");
                                                }
                                             }

                                             return false;
                                          }
                                       } else if (GameScr.bfa.size() > 0 && ((ep)GameScr.bfa.firstElement()).aaa == Char.getMyChar().asa) {
                                          var8 = var1 >= 0 && var1 < ac.aaa.length ? ac.aaa[var1] : null;
                                          if (var8 == null) {
                                             GameScr.chatPopup("Stanima nhóm all");
                                             aca(-1, TileMap.mapID);
                                          } else {
                                             GameScr.chatPopup("Stanima nhóm " + var8.aga + " id " + var1);
                                             aca(var8.aea, TileMap.mapID);
                                          }

                                          aca.afa = true;
                                          Service.aaa().aka("st " + aca.aga + " " + aca.aha + " " + aca.aba);
                                          return true;
                                       } else {
                                          GameScr.chatPopup("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                          return true;
                                       }
                                    }
                                 }
                              }
                           } else {
                              GameScr.chatPopup("End Auto");
                              aga();
                              if (Char.fla) {
                                 Service.aaa().aka("pe");
                              }

                              return true;
                           }
                        }
                     }
                  }
               } else {
                  GameScr.chatPopup("Phá băng");
                  bea = false;
                  bfa = false;
                  return true;
               }
            } else {
               GameScr.chatPopup("Băng skill");
               bfa = true;
               return true;
            }
         } else {
            GameScr.chatPopup("Băng boss");
            bea = true;
            return true;
         }
      } else {
         GameScr.chatPopup("Đóng băng");
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
         (var0 = new ev()).addElement(Char.getMyChar());
         Service.aaa().aaa((ev)(new ev()), (ev)var0, (int)2);
      }

   }

   public static void aha(String var0) {
      if (System.currentTimeMillis() - cya >= 5000L) {
         cya = System.currentTimeMillis();
         Calendar var1;
         (var1 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
         var0 = "@" + (10 + cza.nextInt(89)) + " " + var0 + " " + var1.get(11) + ":" + var1.get(12) + ":" + var1.get(13);
         Service.aaa().aca(var0);
      }

   }

   public static void aaa(String var0, String var1) {
      dc.ada().aaa(var0, Char.getMyChar().cea, var1);
      Service.aaa().aaa(var0, var1);
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
      if (Char.fla && aha != null && var0.equals(aha) && !Char.getMyChar().cea.equals(aha)) {
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
         Char var4 = Char.getMyChar();
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
               var6 = Char.getMyChar().csa - aba.ala;
               int var7 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
               aaa(var0, "Up " + var6 + " trong " + ex.aba(var7) + " perh=" + var6 / var7 * 3600);
               return;
            }
         } else {
            if (var1.toLowerCase().equals("level")) {
               long var18;
               long var8 = (var18 = (Char.getMyChar().aka > 0L ? Char.getMyChar().aka : Char.getMyChar().bha) * 10000L / GameScr.dta[Char.getMyChar().aya]) % 100L;
               aaa(var0, "LV: " + var4.aya + " + " + (Char.getMyChar().aka > 0L ? "-" : "") + var18 / 100L + "." + (var8 < 10L ? "0".concat(String.valueOf(var8)) : String.valueOf(var8)) + "%");
               if (aba != null) {
                  long var10;
                  float var12 = (float)((var10 = Char.getMyChar().aja - aba.ama) * 10000L / GameScr.dta[Char.getMyChar().aya]) / 100.0F;
                  int var13 = (int)((System.currentTimeMillis() - aba.ana) / 1000L);
                  long var14;
                  float var16 = (float)((var14 = var10 * 3600L / (long)var13) * 10000L / GameScr.dta[Char.getMyChar().aya]) / 100.0F;
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
                  LockGame.bla();
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
      if (Char.fla && aha != null && var0.equals(aha) && !Char.getMyChar().cea.equals(aha)) {
         String[] var2 = aca(var1, " ");

         try {
            if (var2[0].equals("dcvt")) {
               ara = Integer.parseInt(var2[1]) == 1;
               return;
            }

            if (var2[0].equals("avt")) {
               GameScr.chatPopup("Thêm vị trí " + ata.size());
               ata.addElement(Integer.valueOf(var2[1]));
               aua.addElement(Integer.valueOf(var2[2]));
               return;
            }

            if (var2[0].equals("dvt")) {
               GameScr.chatPopup("Xóa hết vị trí");
               ata.removeAllElements();
               aua.removeAllElements();
               return;
            }

            int var3;
            if (var2[0].equals("dvtx")) {
               var3 = Integer.parseInt(var2[1]);
               GameScr.chatPopup("Xóa vị trí ".concat(String.valueOf(var3)));
               ata.removeElementAt(var3);
               aua.removeElementAt(var3);
               return;
            }

            if (var2[0].equals("pe")) {
               GameScr.chatPopup("End Auto");
               LockGame.bla();
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
               if ((var5 = Char.ama(1)) != null && var5.aga == var3) {
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
            var2 = GameScr.dva[((gg)var1).aia] / 2;
            var3 = GameScr.dza[((gg)var1).aia];
         } else if (((gg)var1).asa()) {
            var2 = GameScr.dwa[((gg)var1).aia] / 2;
            var3 = GameScr.eaa[((gg)var1).aia];
         } else if (((gg)var1).ata()) {
            var2 = GameScr.dxa[((gg)var1).aia] / 2;
            var3 = GameScr.eba[((gg)var1).aia];
         }

         if (var2 << 1 <= Char.bia() && var3 << 1 <= Char.getMyChar().csa && ((gg)var1).aia < cba) {
            int var4 = ((gg)var1).aia;
            if (cda) {
               GameScr.ava().ada((int)10);
            }

            GameScr.dfa = (gg)var1;

            for(int var5 = 0; var5 < 1 && ((gg)var1).aia == var4; ++var5) {
               GameScr.cxa = new gg[18];
               int var6 = 0;
               int var7 = 0;

               for(int var8 = 0; var8 < Char.getMyChar().arrItemBag.length && var7 < var2; ++var8) {
                  gg var9 = Char.getMyChar().arrItemBag[var8];
                  if (((gg)var1).aia == 7) {
                     if (Char.aia(242) < 0) {
                        if (Char.getMyChar().cta >= 10) {
                           Service.aaa().aba(14, 23, 1);
                           LockGame.aha();
                        } else {
                           GameScr.chatPopup("Hết Lượng Mua BHSC");
                        }
                     } else {
                        GameScr.cxa[0] = ADV.aea(242);
                     }
                  }

                  if (var9 != null && var9.aaa.aba == 26 && var9.aaa.aaa <= cca - 1) {
                     Char.getMyChar().arrItemBag[var8] = null;
                     GameScr.cxa[var6++] = var9;
                     var7 += GameScr.dva[var9.aaa.aaa];
                  }
               }

               do {
                  try {
                     Thread.sleep(1500L);
                  } catch (InterruptedException var10) {
                  }

                  Service.aaa().aaa((gg)var1, GameScr.cxa);
                  Service.aaa().aja(Char.getMyChar().cea);
                  LockGame.ara();
               } while(GameScr.cxa[0] != null);
            }

            GameScr.dfa = null;
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
