import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class Controller implements ay {
   private static Controller aaa;
   private fe aba;
   private static String[] aca;
   private static String ada;
   private static String aea;
   private static String afa;
   private static String aga;
   private static String aha;
   private static String aia;

   public static void ada() {
      aca = new String[]{"Bạn chỉ có thể vào lại game sau ", " giây nữa"};
      ada = "Bạn chưa thể đi đến khu vực này.Hãy hoàn thành nhiệm vụ trước.";
      aea = "Cửa này vẫn chưa được mở.";
      afa = "Cửa này chỉ chứa được tối đa 2 người.";
      aga = "Số nhóm của khu vực này";
      aha = "Khu vực này đã đầy.";
      aia = "Thao tác quá nhanh.";
   }

   static {
      aa.aaa(56);
      ada();
   }

   public static Controller aea() {
      if (aaa == null) {
         aaa = new Controller();
      }

      return aaa;
   }

   public final void aca() {
      System.out.println("Connect ok");
   }

   public final void aaa() {
      if (fz.fda && Code.aba != null) {
         cs.aba().aea();
      } else {
         ab.aaa(er.fda, 8884);
      }
   }

   public final void aba() {
      System.out.println("Disconnected");
      Code.aba();
      if (Code.aba instanceof eu && ci.aca().get(11) == 3) {
         eu.ada = true;
      }

      if (fz.fda && Code.aba != null) {
         cs.aba().aea();
      } else {
         ab.aja.aqa();
      }
   }

   private static void aba(fe var0) {
      try {
         int var1 = var0.ada.readUnsignedByte();
         gg var4;
         (var4 = gf.dsa.dca[var1]).afa = var0.ada.readLong();
         var4.ama = var0.ada.readInt();
         var4.aha = var0.ada.readByte();
         var4.aba = new ev();

         try {
            while(true) {
               var4.aba.addElement(new bq(var0.ada.readByte(), var0.ada.readInt()));
            }
         } catch (Exception var2) {
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   private static void aca(fe var0) {
      try {
         gg var1 = null;
         int var2 = var0.ada.readInt();

         for(int var3 = 0; var3 < gf.dca.length; ++var3) {
            if (gf.dca[var3].aaa.aca == var2) {
               var1 = gf.dca[var3].aaa;
               break;
            }
         }

         var1.ana = 37;
         var1.afa = -1L;
         var1.ama = var0.ada.readInt();
         if (var1.aba() || var1.ada()) {
            var1.aba = new ev();

            try {
               var1.aia = var0.ada.readByte();
               var1.aha = var0.ada.readByte();

               while(true) {
                  var1.aba.addElement(new bq(var0.ada.readByte(), var0.ada.readInt()));
               }
            } catch (Exception var4) {
               return;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public final void aaa(fe var1) {
      try {
         byte var2;
         int var3;
         String var4;
         String var133;
         byte var5;
         int var6;
         ac var135;
         int var7;
         int var136;
         fz[] var137;
         String var141;
         fn var142;
         fz var10000;
         am var149;
         am var153;
         String var154;
         gf var159;
         short var93;
         String var94;
         int var95;
         int var96;
         ev var97;
         fz var99;
         String var100;
         gg var101;
         byte var102;
         fz var106;
         boolean var108;
         short var109;
         int var111;
         ac var112;
         gf var113;
         ac var114;
         String var116;
         long var119;
         fz var122;
         av var124;
         byte var127;
         switch(var1.aaa) {
         case -30:
            aga(var1);
            return;
         case -29:
            afa(var1);
            return;
         case -28:
            this.aea(var1);
            break;
         case -27:
         case -17:
         case -9:
         case 12:
         case 24:
         case 28:
         case 29:
         case 32:
         case 35:
         case 41:
         case 44:
         case 56:
         case 73:
         case 74:
         case 80:
         case 81:
         case 105:
         case 110:
         case 111:
         case 113:
         case 115:
         case 120:
         default:
            return;
         case -26:
            ab.aaa(var94 = var1.aaa().readUTF());
            boolean var157 = false;
            var108 = false;
            if (var94.startsWith(aca[0])) {
               var3 = 0;

               try {
                  var3 = Integer.parseInt(var94.substring(aca[0].length(), var94.indexOf(aca[1])).trim());
               } catch (Exception var79) {
                  var79.printStackTrace();
               }

               cs.aba().aca();
               cs.apa = false;
               cs.afa();
               ab.bta = var3;
               ab.bva = ab.bua = System.currentTimeMillis();
               return;
            }

            if (var94.equals(aia)) {
               gj.asa();
               return;
            }

            if (!gn.bga || !var94.equals(ada) && !(var157 = var94.equals(aea)) && !(var108 = var94.equals(afa)) && !var94.equals(aha) && !var94.startsWith(aga)) {
               return;
            }

            if (Code.aba != null && gn.aga(gn.aoa)) {
               if (var157) {
                  if ((var3 = gn.aia(Code.aba.aga)) > 0) {
                     Code.aba.aga = var3;
                  }

                  Code.aba.aja = -1;
               } else if (var108) {
                  if ((var3 = gn.aha(Code.aba.aga)) > 0) {
                     Code.aba.aga = var3;
                  }

                  Code.aba.aja = -1;
               }
            }

            if (gn.bfa) {
               gn.bfa = false;
            } else {
               ab.ama();
            }

            gn.aha();
            return;
         case -25:
            dy.aaa(var94 = var1.aaa().readUTF(), 150, fw.afa);
            dc.ada().aaa(er.pna[0], er.rra, var94);
            if (Code.aba instanceof eu) {
               Code.aca.aaa(var94);
            }

            if (Code.aba instanceof de) {
               ((de)Code.aba).aaa(var94);
            }

            return;
         case -24:
            if ((var154 = var1.aaa().readUTF()).indexOf("đang đứng nhìn bạn") > 0) {
               Code.aga(var154.substring(0, var154.indexOf("đang đứng nhìn bạn")).trim());
            } else if (fz.fca && Code.aba != null && var154.equals("Không đủ MP để sử dụng")) {
               Auto.ava = true;
            } else if (gj.aba && var154.equals("Vật phẩm của người khác")) {
               gj.aea();
               if ((var153 = fz.ala().dta) != null) {
                  var153.aka = true;
               }
            } else if (Code.aba instanceof eu) {
               if (Code.aca.aaa == 2 && var154.equals("Cửa hang động đã được khép lại.")) {
                  eu.ada = true;
               } else if (Code.aca.aaa == 4 && var154.equals("Chiến trường đã khép lại, xem kết quả tại Npc Rikudou.")) {
                  gn.aha();
               }
            } else if (Code.aha != null && !Code.aha.equals(fz.ala().cea) && var154.equals("Đối phương đang ở trong nhóm khác.")) {
               gm.aaa().ata();
            }

            if (Code.aba instanceof ADV) {
               ADV.aba(var154);
            }

            be.aaa(var154, 50, fw.ala);
            return;
         case -23:
            var96 = var1.aaa().readInt();
            var94 = var1.aaa().readUTF();
            if (fz.ala().asa == var96) {
               var99 = fz.ala();
            } else {
               var99 = gf.aea(var96);
            }

            if (var99 == null) {
               return;
            }

            cq.aaa(var94, 100, var99);
            dc.ada().aaa(er.pla[0], var99.cea, var94);
            return;
         case -22:
            var154 = var1.aaa().readUTF();
            var94 = var1.aaa().readUTF();
            dc.ada().aaa(var154, var154, var94);
            if ((!gf.dra || !dc.ada().aea().aba.equals(var154)) && !dc.aea) {
               dc.ada().aca(var154);
            }

            Code var160 = Code.aaa;
            Code.aba(var154, var94);
            return;
         case -21:
            var94 = var1.aaa().readUTF();
            var141 = var1.aaa().readUTF();
            dc.ada().aaa(er.pna[0], var94, var141);
            if (!dc.ada) {
               dy.aaa(var94 + ": " + var141, 80, fw.afa);
            }

            return;
         case -20:
            var100 = var1.aaa().readUTF();
            var4 = var1.aaa().readUTF();
            dc.ada().aaa(er.pma[0], var100, var4);
            if (!gf.dra || dc.ada().aea().aaa != 1) {
               dc.aga = true;
            }

            Code.ada(var100, var4);
            return;
         case -19:
            var100 = var1.aaa().readUTF();
            var94 = var1.aaa().readUTF();
            dc.ada().aaa(er.poa[0], var100, var94);
            if (!gf.dra || dc.ada().aea().aaa != 4) {
               dc.afa = true;
            }

            return;
         case -18:
            ab.aea = true;
            gf.aea();
            gn.aua.removeAllElements();
            System.gc();
            gn.aoa = (short)var1.aaa().readUnsignedByte();
            gn.aea = var1.aaa().readByte();
            gn.ama = var1.aaa().readByte();
            gn.ana = var1.aaa().readByte();
            gn.aka = var1.aaa().readUTF();
            gn.ala = var1.aaa().readByte();
            gn.aka();

            try {
               gn.aia();
            } catch (Exception var82) {
               gm.aaa().ava(gn.aoa);
               this.aba = var1;
               return;
            }

            ada(var1);
            if (fz.ala().dqa != null) {
               fz.ala().dqa.ada = fz.ala().ala;
               fz.ala().dqa.aea = fz.ala().ama - 40;
            }

            return;
         case -16:
            fz.gka = true;
            fz.gja = true;
            gf.ava().ffa = 0;
            gf.ava().fea = 0;
            fz.ala().dpa = null;
            fz.ala().dra = null;
            fz.ala().dsa = null;
            fz.ala().dta = null;
            fz.ala().dua.removeAllElements();
            fz.ala().dya = -9999;
            fz.ala().dza = -9999;
            gf.aea();
            ab.aia();
            if (gf.bfa.size() <= 1) {
               gf.bfa.removeAllElements();
            }

            gf.ava().bca();
            gf.ava().ama = null;
            return;
         case -15:
            var93 = var1.aaa().readShort();

            for(var3 = 0; var3 < gf.bma.size(); ++var3) {
               if (((am)gf.bma.elementAt(var3)).aga == var93) {
                  gf.bma.removeElementAt(var3);
                  return;
               }
            }

            return;
         case -14:
            fz.ala().dta = null;
            var93 = var1.aaa().readShort();

            for(var3 = 0; var3 < gf.bma.size(); ++var3) {
               if ((var149 = (am)gf.bma.elementAt(var3)).aga == var93) {
                  var149.aaa(fz.ala().ala, fz.ala().ama - 10);
                  var149.aka = true;
                  if (var149.aha.aba == 19) {
                     var3 = var1.aaa().readUnsignedShort();
                     var10000 = fz.ala();
                     var10000.csa += var3;
                     if (var149.aha.aaa == 238) {
                        return;
                     }

                     be.aaa(er.loa + " " + var3 + " " + er.lda);
                     return;
                  }

                  if (var149.aha.aba == 25 && var149.aha.aaa != 238) {
                     be.aaa(er.loa + " " + var149.aha.ada, 15, fw.ala);
                     return;
                  }

                  return;
               }
            }

            gj.aea();
            return;
         case -13:
            var93 = var1.aaa().readShort();

            for(var3 = 0; var3 < gf.bma.size(); ++var3) {
               if ((var149 = (am)gf.bma.elementAt(var3)).aga == var93) {
                  if ((var99 = gf.aea(var1.aaa().readInt())) == null) {
                     return;
                  }

                  var149.aaa(var99.ala, var99.ama - 10);
                  if (var149.aaa < var99.ala) {
                     var99.ara = -1;
                  } else if (var149.aaa > var99.ala) {
                     var99.ara = 1;
                  }

                  if (var149 == fz.ala().dta) {
                     var149.aka = true;
                     gj.aea();
                  }

                  return;
               }
            }

            return;
         case -12:
            var127 = var1.aaa().readByte();
            gf.bma.addElement(new am(var1.aaa().readShort(), fz.ala().daa[var127].aaa.aaa, fz.ala().ala, fz.ala().ama, var1.aaa().readShort(), var1.aaa().readShort()));
            fz.ala().daa[var127] = null;
            return;
         case -11:
            fz.ala().dka = var1.aaa().readByte();
            fz.ala().aaa(var1.aaa().readShort(), var1.aaa().readShort());

            try {
               fz.ala().aja = var1.aaa().readLong();
               gf.aaa(fz.ala().aja);
            } catch (Exception var78) {
            }

            fz.ala().eba = 0;
            return;
         case -10:
            if (fz.ala().hea != 0 || fz.ala().hfa != 0) {
               fz.ala().ala = fz.ala().hea;
               fz.ala().ama = fz.ala().hfa;
               fz.ala().hea = fz.ala().hfa = 0;
            }

            fz.ala().bda();
            fz.gka = false;
            return;
         case -8:
            var3 = var1.aaa().readInt();
            var10000 = fz.ala();
            var10000.csa += var3;
            gf.ava().fja = var3;
            gf.aaa(var3 > 0 ? "+".concat(String.valueOf(var3)) : String.valueOf(var3), fz.ala().ala, fz.ala().ama - fz.ala().cja - 10, 1);
            return;
         case -7:
            var3 = var1.aaa().readInt();
            var10000 = fz.ala();
            var10000.cqa += var3;
            var10000 = fz.ala();
            var10000.csa -= var3;
            gf.aaa("+".concat(String.valueOf(var3)), fz.ala().ala, fz.ala().ama - fz.ala().cja - 10, 1);
            return;
         case -6:
            if ((var99 = gf.aea(var1.aaa().readInt())) != null) {
               gf.bma.addElement(new am(var1.aaa().readShort(), var1.aaa().readShort(), var99.ala, var99.ama, var1.aaa().readShort(), var1.aaa().readShort()));
               return;
            }

            return;
         case -5:
            try {
               (var135 = ac.aaa(var1.aaa().readUnsignedByte())).aua = var1.aaa().readByte();
               var135.ava = var1.aaa().readByte();
               var135.ada = var135.aha;
               var135.aea = var135.aia;
               var135.aga = 5;
               var135.bca = false;
               var135.aba = var1.aaa().readInt();
               var135.aca = var135.aba;
               if (var135.ada().aea == 202) {
                  ef.aaa(148, var135.ada, var135.aea, 0);
               } else {
                  ef.aaa(60, var135.ada, var135.aea, 1);
               }

               Auto.aaa(var135);
            } catch (Exception var77) {
               var77.printStackTrace();
            }

            return;
         case -4:
            var135 = null;

            try {
               var135 = ac.aaa(var1.aaa().readUnsignedByte());
            } catch (Exception var76) {
            }

            if (var135 != null && var135.aga != 0 && var135.aga != 0) {
               try {
                  if ((var96 = var1.aaa().readInt()) < 0) {
                     var96 = ci.aea(var96) + 32767;
                  }

                  if (var1.aaa().readBoolean()) {
                     gf.aaa("-".concat(String.valueOf(var96)), var135.ada, var135.aea - var135.aka, 3);
                  } else {
                     gf.aaa("-".concat(String.valueOf(var96)), var135.ada, var135.aea - var135.aka, 5);
                  }

                  am var152 = new am(var1.aaa().readShort(), var1.aaa().readShort(), var135.ada, var135.aea, var1.aaa().readShort(), var1.aaa().readShort());
                  gf.bma.addElement(var152);
                  if (ci.aea(var152.aba - fz.ala().ama) < 24 && ci.aea(var152.aaa - fz.ala().ala) < 24) {
                     fz.ala().dsa = null;
                  }
               } catch (Exception var75) {
               }

               var135.aga();
            }

            return;
         case -3:
            var135 = null;

            try {
               var135 = ac.aaa(var1.aaa().readUnsignedByte());
            } catch (Exception var74) {
               System.out.println("----err null:NPC_ATTACK_ME");
            }

            if (var135 != null) {
               var96 = var1.aaa().readInt();

               try {
                  var95 = var1.aaa().readInt();
               } catch (Exception var73) {
                  var95 = 0;
               }

               if (var135.baa) {
                  fz.ala().aaa(var96, var95, false, -1);
                  var135.aha();
               } else {
                  var135.asa = var96;
                  var135.ata = var95;
                  var135.aaa(fz.ala());
               }

               var109 = var1.aaa().readShort();
               var2 = var1.aaa().readByte();
               var102 = var1.aaa().readByte();
               var135.aaa(var109, var2, var102);
               if (fz.ala().bba < fz.ala().bea / 2) {
                  if (var135.axa) {
                     System.out.println("Bi Quai TG Danh");
                  } else if (var135.ava == 1) {
                     System.out.println("Bi TA Danh");
                  } else if (var135.ava == 2) {
                     System.out.println("Bi TL Danh");
                  }
                  break;
               }
            }

            return;
         case -2:
            var135 = null;

            try {
               var135 = ac.aaa(var1.aaa().readUnsignedByte());
            } catch (Exception var72) {
            }

            if (var135 != null) {
               if ((var99 = gf.aea(var1.aaa().readInt())) == null) {
                  return;
               }

               var95 = var1.aaa().readInt();
               var135.asa = var99.bba - var95;
               var99.bca = var95;

               try {
                  var99.aza = var1.aaa().readInt();
               } catch (Exception var71) {
               }

               if (var135.baa) {
                  var99.aaa(var135.asa, 0, false, -1);
                  var135.aha();
               } else {
                  var135.aaa(var99);
               }

               var109 = var1.aaa().readShort();
               var2 = var1.aaa().readByte();
               var102 = var1.aaa().readByte();
               var135.aaa(var109, var2, var102);
            }

            return;
         case -1:
            var135 = null;

            try {
               var135 = ac.aaa(var1.aaa().readUnsignedByte());
            } catch (Exception var70) {
            }

            if (var135 != null) {
               var135.aba = var1.aaa().readInt();
               if ((var96 = var1.aaa().readInt()) < 0) {
                  var96 = ci.aea(var96) + 32767;
               }

               boolean var151 = var1.aaa().readBoolean();

               try {
                  var135.ava = var1.aaa().readByte();
                  var135.aca = var1.aaa().readInt();
                  Auto.aaa(var135);
               } catch (Exception var69) {
               }

               if (var151) {
                  gf.aaa("-".concat(String.valueOf(var96)), var135.ada, var135.aea - var135.aka, 3);
               } else {
                  gf.aaa("-".concat(String.valueOf(var96)), var135.ada, var135.aea - var135.aka, 5);
               }
               break;
            }

            return;
         case 0:
            if ((var99 = gf.aea(var1.aaa().readInt())) == null) {
               return;
            }

            var99.dka = var1.aaa().readByte();
            if (var99.asa == fz.fya) {
               fz.fqa = true;
            }

            var99.aaa(var1.aaa().readShort(), var1.aaa().readShort());
            if (fz.ala().dsa == var99) {
               fz.ala().dsa = null;
            }

            return;
         case 1:
            var95 = var1.aaa().readInt();

            for(var96 = 0; var96 < gf.bla.size(); ++var96) {
               var106 = null;

               try {
                  var106 = (fz)gf.bla.elementAt(var96);
               } catch (Exception var53) {
                  System.out.println("Char null");
               }

               if (var106 == null) {
                  return;
               }

               if (var106.asa == var95) {
                  var106.gga = var1.aaa().readShort();
                  var106.gha = var1.aaa().readShort();
                  var106.aaa(var106.gga, var106.gha);
                  var106.aha = System.currentTimeMillis();
                  return;
               }
            }

            return;
         case 2:
            var95 = var1.aaa().readInt();

            for(var96 = 0; var96 < gf.bla.size(); ++var96) {
               if ((var106 = (fz)gf.bla.elementAt(var96)) != null && var106.asa == var95) {
                  if (!var106.eea && var106.aea && !var106.afa) {
                     ef.aaa(60, var106.ala, var106.ama, 1);
                  } else if (!var106.eea && var106.bha() && !var106.aea) {
                     ef.aaa(141, var106.ala, var106.ama, 0);
                  }

                  gf.bla.removeElementAt(var96);
                  ep.aaa(var95);
                  if (!var106.bga() && var106.cea.equals(fz.ala().cea)) {
                     fz.ala().aca = null;
                  }

                  return;
               }
            }

            return;
         case 3:
            (var99 = new fz()).asa = var1.aaa().readInt();
            if (aaa(var99, var1)) {
               gf.bla.addElement(var99);
               Auto.aba(var99);
               if (!var99.bga() && var99.cea.equals(fz.ala().cea)) {
                  fz.ala().aca = var99;
                  gj.bea();
               }

               if (var99.asa == -fz.ala().asa) {
                  fz.ala().ada = var99;
               }

               if (Code.aba(var99.cea) && !Code.aca.afa()) {
                  gm.aaa().afa(var99.cea);
                  break;
               }
            }

            return;
         case 4:
            if ((var99 = gf.aea(var1.aaa().readInt())) != null) {
               if ((gn.aaa(var99.ala, var99.ama) & 2) == 2) {
                  var99.aaa((em)gf.aza[var1.aaa().readByte()], 0);
               } else {
                  var99.aaa((em)gf.aza[var1.aaa().readByte()], 1);
               }

               if (var99.coa) {
                  var99.coa = false;
                  var99.gca = System.currentTimeMillis();
                  ef.aaa(60, var99, 1);
               }

               if (var99.cna) {
                  var99.cna = false;
                  var99.cpa = true;
               }

               var2 = var1.aaa().readByte();
               var99.dva = new ac[var2];

               for(var95 = 0; var95 < var99.dva.length; ++var95) {
                  ac var146 = ac.aaa(var1.aaa().readUnsignedByte());
                  var99.dva[var95] = var146;
                  if (var95 == 0) {
                     if (var99.ala <= var146.ada) {
                        var99.ara = 1;
                     } else {
                        var99.ara = -1;
                     }
                  }
               }

               var99.dpa = var99.dva[0];
               var137 = new fz[10];
               var3 = 0;

               try {
                  for(var3 = 0; var3 < 10; ++var3) {
                     fz var148;
                     if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
                        var148 = fz.ala();
                     } else {
                        var148 = gf.aea(var6);
                     }

                     var137[var3] = var148;
                     if (var3 == 0) {
                        if (var99.ala <= var148.ala) {
                           var99.ara = 1;
                        } else {
                           var99.ara = -1;
                        }
                     }
                  }
               } catch (Exception var89) {
               }

               if (var3 <= 0) {
                  return;
               }

               var99.dwa = new fz[var3];

               for(var3 = 0; var3 < var99.dwa.length; ++var3) {
                  var99.dwa[var3] = var137[var3];
               }

               var99.dsa = var99.dwa[0];
               return;
            }

            return;
         case 5:
            var119 = var1.aaa().readLong();
            fz.ala().aka = 0L;
            var10000 = fz.ala();
            var10000.aja += var119;
            var6 = fz.ala().aya;
            gf.aaa(fz.ala().aja);
            if (var6 != fz.ala().aya) {
               ef.aaa(58, fz.ala(), 1);
            }

            gf.aaa("+".concat(String.valueOf(var119)), fz.ala().ala, fz.ala().ama - fz.ala().cja, 2);
            if (var119 >= 1000000L) {
               be.aaa(er.loa + " " + var119 + " " + er.ida, 20, fw.ala);
            }

            return;
         case 6:
            var153 = new am(var1.aaa().readShort(), var1.aaa().readShort(), var1.aaa().readShort(), var1.aaa().readShort());
            byte[] var156;
            if ((var156 = ex.aaa(var1)) != null && var156.length > 0) {
               var153.aja = new cp();
               var153.aja.aaa = aaa(var156);
            }

            gf.bma.addElement(var153);
            return;
         case 7:
            fz.ala().daa[var1.aaa().readByte()].aea = var1.aaa().readShort();
            return;
         case 8:
            var127 = var1.aaa().readByte();
            fz.ala().daa[var127] = new gg();
            fz.ala().daa[var127].ana = 3;
            fz.ala().daa[var127].ada = var127;
            fz.ala().daa[var127].aaa = gi.aaa(var1.aaa().readShort());
            fz.ala().daa[var127].aga = var1.aaa().readBoolean();
            if (fz.ala().daa[var127].aba() || fz.ala().daa[var127].ada()) {
               fz.ala().daa[var127].aia = var1.aaa().readByte();
            }

            fz.ala().daa[var127].aoa = var1.aaa().readBoolean();

            try {
               fz.ala().daa[var127].aea = var1.aaa().readUnsignedShort();
            } catch (Exception var68) {
               fz.ala().daa[var127].aea = 1;
            }

            if (fz.ala().daa[var127].aaa.aba == 16) {
               gf.aya += fz.ala().daa[var127].aea;
            }

            if (fz.ala().daa[var127].aaa.aba == 17) {
               gf.axa += fz.ala().daa[var127].aea;
            }

            if (fz.ala().daa[var127].aaa.aaa == 340) {
               var159 = gf.ava();
               var159.dea += fz.ala().daa[var127].aea;
            }

            if (gf.dpa) {
               if (gf.ava().fda.equals("")) {
                  (var113 = gf.ava()).fda = var113.fda + fz.ala().daa[var127].aaa.ada;
               } else {
                  (var113 = gf.ava()).fda = var113.fda + ", " + fz.ala().daa[var127].aaa.ada;
               }
               break;
            } else {
               if (fz.ala().daa[var127].aaa.aba != 20) {
                  be.aaa(er.loa + " " + fz.ala().daa[var127].aaa.ada);
                  gj.aua();
                  break;
               }

               return;
            }
         case 9:
            var101 = fz.ala().daa[var1.aaa().readUnsignedByte()];

            try {
               var93 = var1.aaa().readShort();
            } catch (Exception var67) {
               var93 = 1;
            }

            var101.aea += var93;
            if (var101.aaa.aba == 16) {
               gf.aya += var93;
            }

            if (var101.aaa.aba == 17) {
               gf.axa += var93;
            }

            if (var101.aaa.aaa == 340) {
               var159 = gf.ava();
               var159.dea += var93;
            }

            ab.ama();
            if (gf.dpa) {
               if (gf.ava().fda.equals("")) {
                  (var113 = gf.ava()).fda = var113.fda + var101.aaa.ada;
               } else {
                  (var113 = gf.ava()).fda = var113.fda + ", " + var101.aaa.ada;
               }
               break;
            } else {
               if (var101.aaa.aba != 20) {
                  be.aaa(er.loa + " " + var101.aaa.ada);
                  break;
               }

               return;
            }
         case 10:
            var127 = var1.aaa().readByte();
            if (fz.ala().daa[var127].aaa.aba == 16) {
               gf.aya -= fz.ala().daa[var127].aea;
            }

            if (fz.ala().daa[var127].aaa.aba == 17) {
               gf.axa -= fz.ala().daa[var127].aea;
            }

            fz.ala().daa[var127] = null;
            if (gf.bia()) {
               gf.ava().ala = gf.ava().ama = null;
            } else {
               gf.ava().bca();
            }

            return;
         case 11:
            var127 = var1.aaa().readByte();
            if (fz.ala().daa[var127].aaa.aba == 24) {
               br.aca();
            }

            fz.ala().aaa(var127);
            fz.ala().aaa(var1);
            fz.ala().bfa = var1.aaa().readShort();
            fz.ala().bga = var1.aaa().readShort();
            gf.ava().bra();
            gj.asa();
            return;
         case 13:
            fz.ala().cqa = var1.aaa().readInt();
            fz.ala().csa = var1.aaa().readInt();
            fz.ala().cta = var1.aaa().readInt();
            gj.aia();
            ab.ama();
            return;
         case 14:
            var101 = fz.ala().daa[var1.aaa().readByte()];
            fz.ala().csa = var1.aaa().readInt();

            try {
               var93 = var1.aaa().readShort();
            } catch (Exception var66) {
               var93 = 1;
            }

            var101.aea -= var93;
            if (var101.aaa.aba == 16) {
               gf.aya -= var93;
            }

            if (var101.aaa.aba == 17) {
               gf.axa -= var93;
            }

            if (var101.aea <= 0) {
               fz.ala().daa[var101.ada] = null;
            }

            if (gf.bia()) {
               gf.ava().ala = gf.ava().ama = null;
               gf.ava().bka();
            }

            ab.ama();
            gj.aua();
            return;
         case 15:
            fz.ala().aca(var1);
            gj.asa();
            return;
         case 16:
            fz.ala().aea(var1);
            return;
         case 17:
            fz.ala().ada(var1);
            return;
         case 18:
            var127 = var1.aaa().readByte();
            var93 = 1;

            try {
               var93 = var1.aaa().readShort();
            } catch (Exception var65) {
            }

            if (fz.ala().daa[var127].aaa.aba == 24) {
               br.aca();
            }

            if (fz.ala().daa[var127].aaa.aba == 16) {
               --gf.aya;
            }

            if (fz.ala().daa[var127].aaa.aba == 17) {
               --gf.axa;
            }

            if (fz.ala().daa[var127].aea > var93) {
               gg var158 = fz.ala().daa[var127];
               var158.aea -= var93;
            } else {
               fz.ala().daa[var127] = null;
            }

            if (gf.doa) {
               gf.ava().bra();
            }

            return;
         case 19:
            fz.ala();
            fz.aaa(var1, true);
            return;
         case 20:
            fz.ala();
            fz.aaa(var1, false);
            return;
         case 21:
            var2 = var1.aaa().readByte();
            fz.ala().cta = var1.aaa().readInt();
            fz.ala().cqa = var1.aaa().readInt();
            fz.ala().csa = var1.aaa().readInt();
            if (gf.dfa != null) {
               gf.dfa.aia = var1.aaa().readByte();
               gf.dfa.aga = true;
               gf.dfa.aga();
               if (var2 == 1) {
                  gf.gma = gf.bca[53];
                  gf.gla = 0;
               }
            }

            if (gf.cxa != null) {
               for(var7 = 0; var7 < gf.cxa.length; ++var7) {
                  gf.cxa[var7] = null;
               }
            }

            if (var2 == 5 || var2 == 6) {
               if (gf.dga != null && var2 == 5) {
                  gf.dga = null;
               }

               if (gf.cya != null) {
                  for(var7 = 0; var7 < gf.cya.length; ++var7) {
                     gf.cya[var7] = null;
                  }
               }
            }

            gf.ava().ala = gf.ava().ama = null;
            gf.ava().bja();
            ab.ama();
            if (var2 == 5) {
               be.aaa(er.lwa[0], 20, fw.aka);
               return;
            } else {
               if (var2 == 6) {
                  be.aaa(er.lwa[1], 20, fw.ana);
               } else if (var2 == 1) {
                  be.aaa(er.lva[0] + gf.dfa.aia, 20, fw.aka);
               } else {
                  be.aaa(er.lva[1] + gf.dfa.aia, 20, fw.ana);
               }
               break;
            }
         case 22:
            var2 = var1.aaa().readByte();
            var100 = er.cla;

            for(var3 = 0; var3 < gf.cya.length; ++var3) {
               gf.cya[var3] = null;
            }

            for(var3 = 0; var3 < var2; ++var3) {
               gg var134;
               (var134 = new gg()).ana = 3;
               var134.ada = var1.aaa().readByte();
               var134.aaa = gi.aaa(var1.aaa().readShort());
               var134.afa = -1L;
               var134.aea = 1;
               var134.aga = gf.dga.aga;
               fz.ala().daa[var134.ada] = var134;
               var100 = var100 + var134.aaa.ada;
               if (var3 < var2 - 1) {
                  var100 = var100 + ", ";
               }
            }

            gf.dga.aia = 0;
            gf.dga.aga();
            gf.ava().ala = gf.ava().ama = null;
            gf.ava().bka();
            ab.ama();
            be.aaa(var100);
            gf.gma = gf.bca[66];
            gf.gla = 0;
            gj.asa();
            return;
         case 23:
            if (Code.aca(var94 = var1.aaa().readUTF())) {
               gm.aaa().aia(var94);
            } else {
               ab.aaa(var94 + " " + er.nca, 8889, var94, 8882, (Object)null);
            }

            return;
         case 25:
            byte var131 = var1.aaa().readByte();

            for(var95 = 0; var95 < var131; ++var95) {
               var111 = var1.aaa().readInt();
               short var155 = var1.aaa().readShort();
               short var145 = var1.aaa().readShort();
               var136 = var1.aaa().readInt();
               if ((var99 = gf.aea(var111)) != null) {
                  var99.ala = var155;
                  var99.ama = var145;
                  var99.bba = var136;
                  var99.aha = System.currentTimeMillis();
               }
            }

            return;
         case 26:
            fz.ala().eba = var1.aaa().readUnsignedShort();
            fz.ala().eca = var1.aaa().readUnsignedShort();
            return;
         case 27:
            var112 = ac.aaa(var1.aaa().readUnsignedByte());
            if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
               var99 = fz.ala();
            } else {
               var99 = gf.aea(var6);
            }

            var99.dxa = new short[3];
            var99.dxa[0] = 0;
            var99.dxa[1] = (short)var112.ada;
            var99.dxa[2] = (short)var112.aea;
            var99.gna = false;
            return;
         case 30:
            gf.ava().ada((int)var1.aaa().readByte());
            gj.asa();
            return;
         case 31:
            fz.ala().cra = var1.aaa().readInt();
            fz.ala().dba = new gg[var1.aaa().readUnsignedByte()];

            for(var3 = 0; var3 < fz.ala().dba.length; ++var3) {
               short var150;
               if ((var150 = var1.aaa().readShort()) != -1) {
                  fz.ala().dba[var3] = new gg();
                  fz.ala().dba[var3].ana = 4;
                  fz.ala().dba[var3].ada = var3;
                  fz.ala().dba[var3].aaa = gi.aaa(var150);
                  fz.ala().dba[var3].aga = var1.aaa().readBoolean();
                  if (fz.ala().dba[var3].aba() || fz.ala().dba[var3].ada()) {
                     fz.ala().dba[var3].aia = var1.aaa().readByte();
                  }

                  fz.ala().dba[var3].aoa = var1.aaa().readBoolean();
                  fz.ala().dba[var3].aea = var1.aaa().readShort();
               }
            }

            gj.aua();
            return;
         case 33:
            var5 = var1.aaa().readByte();
            System.out.println("TypeI=".concat(String.valueOf(var5)));
            gg[] var144 = new gg[var1.aaa().readByte()];

            for(var3 = 0; var3 < var144.length; ++var3) {
               var144[var3] = new gg();
               var144[var3].ana = var5;
               var144[var3].ada = var1.aaa().readUnsignedByte();
               var144[var3].aaa = gi.aaa(var1.aaa().readShort());
            }

            if (var5 == 14) {
               gf.cra = var144;
            } else if (var5 == 15) {
               gf.cua = var144;
            } else if (var5 == 32) {
               gf.cva = var144;
            } else if (var5 == 34) {
               gf.cta = var144;
            } else if (var5 == 35) {
               gf.csa = var144;
            } else if (var5 == 20) {
               gf.bya = var144;
            } else if (var5 == 21) {
               gf.bza = var144;
            } else if (var5 == 22) {
               gf.caa = var144;
            } else if (var5 == 23) {
               gf.cba = var144;
            } else if (var5 == 24) {
               gf.cca = var144;
            } else if (var5 == 25) {
               gf.cda = var144;
            } else if (var5 == 26) {
               gf.cea = var144;
            } else if (var5 == 27) {
               gf.cfa = var144;
            } else if (var5 == 28) {
               gf.cga = var144;
            } else if (var5 == 29) {
               gf.cha = var144;
            } else if (var5 == 16) {
               gf.cia = var144;
            } else if (var5 == 17) {
               gf.cja = var144;
            } else if (var5 == 18) {
               gf.cka = var144;
            } else if (var5 == 19) {
               gf.cla = var144;
            } else if (var5 == 2) {
               gf.cma = var144;
            } else if (var5 == 6) {
               gf.cna = var144;
            } else if (var5 == 7) {
               gf.coa = var144;
            } else if (var5 == 8) {
               gf.cpa = var144;
            } else if (var5 == 9) {
               gf.cqa = var144;
            }

            gj.bga();
            return;
         case 34:
            var97 = new ev();
            if (!(var94 = var1.aaa().readUTF()).equals("")) {
               gf.ava().aaa((String)null, (String)var94, true);
            }

            var2 = var1.aaa().readByte();

            for(var7 = 0; var7 < var2; ++var7) {
               var141 = var1.aaa().readUTF();
               Short var143 = new Short(var1.aaa().readShort());
               var97.addElement(new ca(var141, ab.aja, 88819, var143));
            }

            ab.bea.aaa(var97);
            return;
         case 36:
            gf.ava().aaa(var1);
            gj.aga();
            return;
         case 37:
            gf.ava().fca = var1.aaa().readUTF();
            gf.ava().bba();
            gj.bca();
            return;
         case 38:
            var93 = var1.aaa().readShort();

            for(var3 = 0; var3 < gf.boa.size(); ++var3) {
               if ((var124 = (av)gf.boa.elementAt(var3)).aaa.aaa == var93 && var124.equals(fz.ala().dra)) {
                  cq.aaa(var133 = var1.aaa().readUTF(), var124);
                  if (var124.aaa.aaa == 0) {
                     if (var133.equals("Số lần vào trong hang hôm nay của con đã hết.")) {
                        eu.aea = true;
                        if (Code.aba instanceof eu) {
                           eu.ada = true;
                        }

                        if (Code.aba instanceof bj) {
                           Code.aca();
                        }

                        gn.aha();
                        return;
                     }

                     return;
                  } else {
                     if (var124.aaa.aaa == 5) {
                        if (var133.equals("Tốt lắm, ngươi đã chọn nơi này làm nơi trở về khi bị trọng thương")) {
                           gj.baa();
                           return;
                        }
                     } else if (var124.aaa.aaa == 25) {
                        if (Code.aba == Code.ada) {
                           cv.aaa(var133);
                        } else if (var133.equals("Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau.")) {
                           eu.aca = true;
                           return;
                        }

                        return;
                     }

                     return;
                  }
               }
            }

            return;
         case 39:
            var93 = var1.aaa().readShort();

            for(var3 = 0; var3 < gf.boa.size(); ++var3) {
               if ((var124 = (av)gf.boa.elementAt(var3)).aaa.aaa == var93 && var124.equals(fz.ala().dra)) {
                  cq.aaa(var1.aaa().readUTF(), 1000, var124);
                  String[] var140 = new String[var1.aaa().readByte()];

                  for(var95 = 0; var95 < var140.length; ++var95) {
                     var140[var95] = var1.aaa().readUTF();
                  }

                  gf.ava();
                  gf.aaa(var140, var124);
                  return;
               }
            }

            return;
         case 40:
            br.aca();
            ab.ala();
            ab.aka();
            var97 = new ev();

            try {
               while(true) {
                  var97.addElement(new ca(var1.aaa().readUTF(), ab.aja, 88822, (Object)null));
               }
            } catch (Exception var90) {
               if (fz.ala().dra == null) {
                  return;
               }

               if (fz.ala().dra.asa == 25) {
                  gf.gva = var97.size();
               }

               for(var7 = 0; var7 < fz.ala().dra.aaa.afa.length; ++var7) {
                  String[] var147 = fz.ala().dra.aaa.afa[var7];
                  var97.addElement(new ca(var147[0], ab.aja, 88820, var147));
               }

               ab.bea.aaa(var97);
               return;
            }
         case 42:
            aha(var1);
            return;
         case 43:
            Integer var138;
            if ((var106 = gf.aea(var138 = new Integer(var1.aaa().readInt()))) != null) {
               if (Code.aba instanceof fv) {
                  Code.afa.aaa(var106.cea, var138);
               } else {
                  ab.aaa(var106.cea + " " + er.mwa, 88810, var138, 88811, (Object)null);
               }
               break;
            }

            return;
         case 45:
            gf.ava().ega = 1;
            gf.ava().eia = var1.aaa().readInt();
            gf.daa = new gg[12];
            var102 = var1.aaa().readByte();

            for(var95 = 0; var95 < var102; ++var95) {
               gf.daa[var95] = new gg();
               gf.daa[var95].ana = 3;
               gf.daa[var95].ada = var95;
               gf.daa[var95].aaa = gi.aaa(var1.aaa().readShort());
               gf.daa[var95].aga = false;
               if (gf.daa[var95].aba() || gf.daa[var95].ada()) {
                  gf.daa[var95].aia = var1.aaa().readByte();
               }

               gf.daa[var95].aoa = var1.aaa().readBoolean();
               gf.daa[var95].aea = var1.aaa().readShort();
            }

            if (gf.ava().efa == 1 && gf.ava().ega == 1) {
               gf.ava().eja = (int)(System.currentTimeMillis() / 1000L + 5L);
            }

            return;
         case 46:
            gf.ava().ega = 2;
            if (gf.ava().efa >= 2 && gf.ava().ega >= 2) {
               br.aba();
               gj.bca();
            }

            return;
         case 47:
            ab.ava = 150;
            var1.aaa().readShort();
            var102 = var1.aaa().readByte();
            var154 = var1.aaa().readUTF();
            var100 = var1.aaa().readUTF();
            String[] var139;
            short[] var118 = new short[(var139 = new String[var1.aaa().readByte()]).length];
            var109 = -1;

            for(var136 = 0; var136 < var139.length; ++var136) {
               String var123 = var1.aaa().readUTF();
               var118[var136] = -1;
               if (!var123.equals("")) {
                  var139[var136] = var123;
               }
            }

            try {
               var109 = var1.aaa().readShort();

               for(var136 = 0; var136 < var139.length; ++var136) {
                  var118[var136] = var1.aaa().readShort();
               }
            } catch (Exception var88) {
            }

            fz.ala().cza = new cy(var102, var154, var100, var139, var118, var109);
            fz.ala().aca(21);
            if (fz.ala().dra != null) {
               av.aaa();
            }

            gj.aqa();
            return;
         case 48:
            if (fz.ala().cza != null) {
               ab.ava = 100;
               ++fz.ala().cza.aaa;
               fz.ala().cza.afa = 0;
               if (fz.ala().dra != null && fz.ala().dra.aia != null && fz.ala().cza.aaa >= 2) {
                  fz.ala().dra.aia = null;
               }

               if (fz.ala().cza.aaa >= fz.ala().cza.aea.length - 1) {
                  fz.ala().aca(61);
               } else {
                  fz.ala().aca(21);
               }

               av.aaa();
            }

            gj.aqa();
            return;
         case 49:
            ++fz.ala().aua;
            fz.ala();
            fz.bea();
            return;
         case 50:
            ab.ava = 50;
            fz.ala().cza.afa = var1.aaa().readShort();
            if (fz.ala().dra != null) {
               av.aaa();
            }

            return;
         case 51:
            var135 = null;

            try {
               var135 = ac.aaa(var1.aaa().readUnsignedByte());
            } catch (Exception var64) {
            }

            if (var135 != null) {
               var135.aba = var1.aaa().readInt();
               gf.aaa("", var135.ada, var135.aea - var135.aka, 4);
            }

            return;
         case 52:
            fz.gja = false;
            fz.gka = false;
            fz.ala().ala = var1.aaa().readShort();
            fz.ala().ama = var1.aaa().readShort();
            fz.ala().gea = fz.ala().ala;
            fz.ala().gfa = fz.ala().ama;
            return;
         case 53:
            gf.ava().bca();
            if (!(var94 = var1.aaa().readUTF()).equals("typemoi")) {
               var100 = var1.aaa().readUTF();
               if (Code.aba instanceof ADV) {
                  ADV.aaa(var100);
               } else {
                  gf.ava().aaa(var94, var100, false);
               }
               break;
            } else {
               var100 = var1.aaa().readUTF();
               var93 = var1.aaa().readShort();
               var141 = var1.aaa().readUTF();
               short var120 = var1.aaa().readShort();
               var154 = var1.aaa().readUTF();
               short var115 = var1.aaa().readShort();
               var133 = var1.aaa().readUTF();
               byte var132 = var1.aaa().readByte();
               var116 = var1.aaa().readUTF();
               gf.ava().aaa(var100, var93, var141, var120, var154, var115, var133, var116, var132);
               return;
            }
         case 54:
            ab.aba().aaa(var1.aaa().readUTF(), var1.aaa().readUTF(), var1.aaa().readUTF(), var1.aaa().readUTF());
            return;
         case 55:
            ab.aba().aaa(var1.aaa().readUTF(), var1.aaa().readUTF(), var1.aaa().readShort(), var1.aaa().readUTF(), var1.aaa().readUTF());
            return;
         case 57:
            ab.ama();
            gf.ava().bca();
            fv.aaa = true;
            gj.bca();
            return;
         case 58:
            gf.cza = null;
            gf.daa = null;
            if (gf.ava().eia > 0) {
               (var113 = gf.ava()).fda = var113.fda + ", " + gf.ava().eia + " " + er.lca;
               gf.aaa("+" + gf.ava().eia, fz.ala().ala, fz.ala().ama - fz.ala().cja - 10, 6);
            }

            gf.ava().eha = gf.ava().eia = 0;
            gf.ava().bca();
            fz.ala().cqa = var1.aaa().readInt();
            br.aca();
            if (!gf.ava().fda.equals("")) {
               be.aaa(er.loa + " " + gf.ava().fda);
            }

            gj.bca();
            return;
         case 59:
            var100 = var1.aaa().readUTF();
            aq var9 = new aq(var100, (byte)4);
            gf.bja.addElement(var9);
            be.aaa(var100 + " " + er.jla, 20, fw.aka);
            if (!gf.dma) {
               return;
            }

            var108 = false;

            for(var95 = 0; var95 < gf.bha.size(); ++var95) {
               if (((aq)gf.bha.elementAt(var95)).aaa.equals(var100)) {
                  var108 = true;
                  break;
               }
            }

            if (!var108) {
               gf.bha.addElement(var9);
               gf.ava();
               gf.aca((int)0);
               gf.bsa = 0;
               gf.bxa.aaa();
            }

            return;
         case 60:
            if ((var99 = gf.aea(var1.aaa().readInt())) != null) {
               ac.aya = var99;
            }

            if (var99 != null) {
               if ((gn.aaa(var99.ala, var99.ama) & 2) == 2) {
                  var99.aaa((em)gf.aza[var1.aaa().readByte()], 0);
               } else {
                  var99.aaa((em)gf.aza[var1.aaa().readByte()], 1);
               }

               if (var99.coa && var99.gqa >= 500) {
                  var99.coa = false;
                  var99.gca = System.currentTimeMillis();
                  ef.aaa(60, var99, 1);
               }

               if (var99.cna) {
                  var99.cna = false;
                  var99.cpa = true;
                  if (var99.gqa > 500) {
                     ef.aaa(60, var99, 1);
                  }
               }

               ac[] var107 = new ac[10];
               var3 = 0;

               try {
                  for(var3 = 0; var3 < 10; ++var3) {
                     var114 = ac.aaa(var1.aaa().readUnsignedByte());
                     var107[var3] = var114;
                     if (var3 == 0) {
                        if (var99.ala <= var114.ada) {
                           var99.ara = 1;
                        } else {
                           var99.ara = -1;
                        }
                     }
                  }
               } catch (Exception var87) {
               }

               if (var3 <= 0) {
                  return;
               }

               var99.dva = new ac[var3];

               for(var3 = 0; var3 < var99.dva.length; ++var3) {
                  var99.dva[var3] = var107[var3];
               }

               var99.dpa = var99.dva[0];
               return;
            }

            return;
         case 61:
            if ((var99 = gf.aea(var1.aaa().readInt())) == null) {
               return;
            }

            if ((gn.aaa(var99.ala, var99.ama) & 2) == 2) {
               var99.aaa((em)gf.aza[var1.aaa().readByte()], 0);
            } else {
               var99.aaa((em)gf.aza[var1.aaa().readByte()], 1);
            }

            if (var99.coa) {
               var99.coa = false;
               var99.gca = System.currentTimeMillis();
               if (var99.gqa >= 500) {
                  ef.aaa(60, var99, 1);
               }
            }

            if (var99.cna) {
               var99.cna = false;
               var99.cpa = true;
               ef.aaa(60, var99, 1);
            }

            var137 = new fz[10];
            var3 = 0;

            try {
               for(var3 = 0; var3 < 10; ++var3) {
                  if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
                     var122 = fz.ala();
                  } else {
                     var122 = gf.aea(var6);
                  }

                  var137[var3] = var122;
                  if (var3 == 0) {
                     if (var99.ala <= var122.ala) {
                        var99.ara = 1;
                     } else {
                        var99.ara = -1;
                     }
                  }
               }
            } catch (Exception var86) {
            }

            if (var3 <= 0) {
               return;
            }

            var99.dwa = new fz[var3];

            for(var3 = 0; var3 < var99.dwa.length; ++var3) {
               var99.dwa[var3] = var137[var3];
            }

            var99.dsa = var99.dwa[0];
            return;
         case 62:
            if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
               (var99 = fz.ala()).bba = var1.aaa().readInt();
               var6 = var1.aaa().readInt();
               var7 = 0;

               try {
                  var99.aza = var1.aaa().readInt();
                  var7 = var1.aaa().readInt();
               } catch (Exception var63) {
               }

               if ((var6 += var7) == 0) {
                  gf.aaa("", var99.ala, var99.ama - var99.cja, 7);
               } else if (var6 < 0) {
                  gf.aaa("-" + -var6, var99.ala, var99.ama - var99.cja, 8);
               } else {
                  gf.aaa("-".concat(String.valueOf(var6)), var99.ala, var99.ama - var99.cja, 0);
               }

               if (fz.ala().bba < fz.ala().bea / 2) {
                  System.out.println("Bi PK: ".concat(String.valueOf(var6)));
                  break;
               }

               return;
            } else {
               if ((var99 = gf.aea(var6)) == null) {
                  return;
               }

               var99.bba = var1.aaa().readInt();
               var6 = var1.aaa().readInt();
               var7 = 0;

               try {
                  var99.aza = var1.aaa().readInt();
                  var7 = var1.aaa().readInt();
               } catch (Exception var62) {
               }

               if ((var6 += var7) == 0) {
                  gf.aaa("", var99.ala, var99.ama - var99.cja, 4);
               } else if (var6 < 0) {
                  gf.aaa("-" + -var6, var99.ala, var99.ama - var99.cja, 3);
               } else {
                  gf.aaa("-".concat(String.valueOf(var6)), var99.ala, var99.ama - var99.cja, 5);
               }
               break;
            }
         case 63:
            var97 = new ev();

            while(true) {
               try {
                  var97.addElement(new ca(var1.aaa().readUTF(), ab.aja, 88817, (Object)null));
               } catch (Exception var81) {
                  ab.bea.aaa(var97);
                  return;
               }
            }
         case 64:
            if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
               var106 = fz.ala();
            } else {
               var106 = gf.aea(var6);
            }

            var106.dxa = new short[3];
            var106.dxa[0] = 0;
            var109 = var1.aaa().readShort();
            var93 = var1.aaa().readShort();
            var106.dxa[1] = var109;
            var106.dxa[2] = var93;
            var106.gna = false;

            try {
               if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
                  var106 = fz.ala();
               } else {
                  var106 = gf.aea(var6);
               }

               var106.ala = var109;
               var106.ama = var93;
            } catch (Exception var61) {
               var61.printStackTrace();
            }

            return;
         case 65:
            if ((var106 = gf.aea(var1.aaa().readInt())) != null) {
               ab.aaa(var106.cea + " " + er.mza, 88812, var106, 8882, (Object)null);
            }

            return;
         case 66:
            var3 = var1.aaa().readInt();
            var6 = var1.aaa().readInt();
            if (var3 != fz.ala().asa && var6 != fz.ala().asa) {
               gf.aea(var3).dya = var6;
               gf.aea(var6).dya = var3;
               return;
            }

            if (var3 == fz.ala().asa) {
               fz.ala().dya = var6;
               fz.ala().dra = null;
               fz.ala().dpa = null;
               fz.ala().dta = null;
               fz.ala().dsa = gf.aea(fz.ala().dya);
               fz.ala().dsa.dya = fz.ala().asa;
               gf.ava().ela = gf.ava().eka;
               gf.ava().eka = var6;
               fz.hda = true;
            } else if (var6 == fz.ala().asa) {
               fz.ala().dya = var3;
               fz.ala().dra = null;
               fz.ala().dpa = null;
               fz.ala().dta = null;
               fz.ala().dsa = gf.aea(fz.ala().dya);
               fz.ala().dsa.dya = fz.ala().asa;
               gf.ava().ela = gf.ava().eka;
               gf.ava().eka = var3;
               fz.hda = true;
               break;
            }

            return;
         case 67:
            var3 = var1.aaa().readInt();
            var6 = var1.aaa().readInt();
            var7 = 0;

            try {
               var7 = var1.aaa().readInt();
            } catch (Exception var60) {
            }

            if (var3 == fz.ala().asa) {
               var99 = gf.aea(var6);
               if (var7 > 0) {
                  be.aaa(er.aaa(er.kaa, var99.cea));
                  fz.ala().bba = var7;
                  fz.ala().eaa = 29;
                  if (var99 != null) {
                     var99.eaa = 89;
                  }
               } else {
                  if (var99 != null) {
                     var99.eaa = 59;
                  }

                  fz.ala().eaa = 59;
                  be.aaa(er.aaa(er.kba, var99.cea));
               }

               fz.ala().dya = -9999;
               fz.ala().dsa = null;
               if (gf.ava().ela >= 0) {
                  gf.ava().eka = gf.ava().ela;
                  gf.ava().ela = -1;
               } else {
                  gf.ava().eka = -1;
               }

               if (var99 != null) {
                  var99.dya = -9999;
                  break;
               }

               return;
            } else {
               if (var6 == fz.ala().asa) {
                  var99 = gf.aea(var3);
                  if (var7 > 0) {
                     if (var99 != null) {
                        var99.bba = var7;
                     }

                     if (var99 != null) {
                        var99.eaa = 29;
                     }

                     fz.ala().eaa = 89;
                     be.aaa(er.aaa(er.jza, var99.cea));
                  } else {
                     if (var99 != null) {
                        var99.eaa = 59;
                     }

                     fz.ala().eaa = 59;
                     be.aaa(er.aaa(er.kba, var99.cea));
                  }

                  if (var99 != null) {
                     var99.dya = -9999;
                  }

                  fz.ala().dya = -9999;
                  fz.ala().dsa = null;
                  if (gf.ava().ela >= 0) {
                     gf.ava().eka = gf.ava().ela;
                     gf.ava().ela = -1;
                  } else {
                     gf.ava().eka = -1;
                  }
               } else {
                  var122 = gf.aea(var3);
                  fz var130 = gf.aea(var6);
                  if (var7 > 0) {
                     if (var122 != null) {
                        var122.bba = var7;
                     }

                     if (var122 != null) {
                        var122.eaa = 29;
                     }

                     if (var130 != null) {
                        var130.eaa = 89;
                     }
                  } else {
                     if (var122 != null) {
                        var122.eaa = 59;
                     }

                     if (var130 != null) {
                        var130.eaa = 59;
                     }
                  }

                  if (var122 != null) {
                     var122.dya = -9999;
                  }

                  if (var130 != null) {
                     var130.dya = -9999;
                  }
               }
               break;
            }
         case 68:
            if ((var99 = gf.aea(var1.aaa().readInt())) != null) {
               var99.dza = fz.ala().asa;
               Auto.aba(var99);
               fz.ala().dra = null;
               fz.ala().dpa = null;
               fz.ala().dta = null;
               fz.ala().dsa = var99;
               fz.hda = true;
               be.aaa(var99.cea + er.kda, 20, fw.ana);
            }

            return;
         case 69:
            fz.ala().dza = var1.aaa().readInt();
            fz.ala().dra = null;
            fz.ala().dpa = null;
            fz.ala().dta = null;
            fz.ala().dsa = gf.aea(fz.ala().dza);
            fz.hda = true;
            return;
         case 70:
            var99 = fz.ala();

            try {
               var99 = gf.aea(var1.aaa().readInt());
            } catch (Exception var59) {
            }

            var99.dza = -9999;
            return;
         case 71:
            var119 = var1.aaa().readLong();
            var10000 = fz.ala();
            var10000.aka -= var119;
            gf.aaa("+".concat(String.valueOf(var119)), fz.ala().ala, fz.ala().ama - fz.ala().cja, 2);
            return;
         case 72:
            fz.ala().dka = var1.aaa().readByte();
            fz.ala().aaa(var1.aaa().readShort(), var1.aaa().readShort());
            fz.ala().aja = gf.aba(fz.ala().aya - 1);
            fz.ala().aka = var1.aaa().readLong();
            gf.aaa(fz.ala().aja);
            return;
         case 75:
            var142 = new fn(var1.aaa().readUTF(), var1.aaa().readShort(), var1.aaa().readShort());
            gf.bpa.addElement(var142);
            ef.aaa(60, var142.aaa, var142.aba, 1);
            return;
         case 76:
            if ((var114 = ac.aaa(var1.aaa().readUnsignedByte())) != null) {
               if ((var142 = gf.afa(var1.aaa().readShort())) == null) {
                  return;
               }

               var109 = var1.aaa().readShort();
               var2 = var1.aaa().readByte();
               var102 = var1.aaa().readByte();
               var114.aaa(var142);
               var114.aaa(var109, var2, var102);
            }

            return;
         case 77:
            var142 = (fn)gf.bpa.elementAt(var1.aaa().readShort());
            gf.bpa.removeElement(var142);
            ef.aaa(60, var142.aaa, var142.aba, 1);
            return;
         case 78:
            var135 = null;

            try {
               var135 = ac.aaa(var1.aaa().readUnsignedByte());
            } catch (Exception var58) {
            }

            if (var135 != null && var135.aga != 0 && var135.aga != 0) {
               var135.aga = 0;
               ef.aaa(60, var135.ada, var135.aea, 1);
               am var126 = new am(var1.aaa().readShort(), var1.aaa().readShort(), var135.ada, var135.aea, var1.aaa().readShort(), var1.aaa().readShort());
               gf.bma.addElement(var126);
               if (ci.aea(var126.aba - fz.ala().ama) < 24 && ci.aea(var126.aaa - fz.ala().ala) < 24) {
                  fz.ala().dsa = null;
                  break;
               }
            }

            return;
         case 79:
            var3 = var1.aaa().readInt();
            if (((var4 = var1.aaa().readUTF()).equals(Code.aha) || Code.aca(var4)) && !Code.aca.afa()) {
               gm.aaa().ara(var3);
               return;
            }

            ab.aaa(var4 + " " + er.nba, 8887, var3, 8888, var3);
            return;
         case 82:
            gf.bfa.removeAllElements();
            boolean var10 = var1.aaa().readBoolean();

            try {
               for(var7 = 0; var7 < 6; ++var7) {
                  gf.bfa.addElement(new ep(var1.aaa().readInt(), var1.aaa().readByte(), var1.aaa().readUTF(), var10));
               }
            } catch (Exception var85) {
            }

            gf.ava().baa();
            var116 = ((ep)gf.bfa.firstElement()).ada;
            if (Code.aha == null) {
               Code.aha = var116;
            } else if (!var116.equals(Code.aha)) {
               gm.aaa().ata();
               break;
            }

            return;
         case 83:
            gf.bfa.removeAllElements();
            gf.ava().baa();
            return;
         case 84:
            aq var128 = new aq(var1.aaa().readUTF(), var1.aaa().readByte());
            gf.ava();
            gf.aba(var128.aaa);
            if (var128.aba == 0) {
               be.aaa(er.jma + " " + var128.aaa + " " + er.jna);
               gf.bha.addElement(var128);
            } else if (var128.aba == 1) {
               for(var3 = 0; var3 < gf.bha.size(); ++var3) {
                  if (((aq)gf.bha.elementAt(var3)).aaa.equals(var128.aaa)) {
                     gf.bha.removeElementAt(var3);
                     break;
                  }
               }

               be.aaa(er.joa + " " + var128.aaa + " " + er.fha);
               var128.aba = 3;
               gf.bha.insertElementAt(var128, 0);
            }

            if (gf.dma) {
               gf.ava();
               gf.aca((int)0);
               gf.bsa = 0;
               gf.bxa.aaa();
            }

            return;
         case 85:
            if ((var112 = ac.aaa(var1.aaa().readUnsignedByte())) != null) {
               var112.ama = var1.aaa().readBoolean();
            }

            return;
         case 86:
            if ((var112 = ac.aaa(var1.aaa().readUnsignedByte())) != null) {
               var112.ana = var1.aaa().readBoolean();
            }

            return;
         case 87:
            if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
               var99 = fz.ala();
            } else {
               var99 = gf.aea(var6);
            }

            if (var99 == null) {
               return;
            }

            var3 = var1.aaa().readUnsignedByte();
            var109 = var1.aaa().readShort();
            var2 = var1.aaa().readByte();
            var102 = var1.aaa().readByte();
            byte var8 = 0;
            var96 = -1;

            try {
               if ((var8 = var1.aaa().readByte()) == 1) {
                  var96 = var1.aaa().readInt();
               }
            } catch (Exception var57) {
               var57.printStackTrace();
            }

            if (var99.dqa != null) {
               if (var8 == 0) {
                  var135 = ac.aaa(var3);
                  var99.dqa.aaa(var135);
               } else {
                  var106 = gf.aea(var96);
                  var99.dqa.aba(var106);
               }
            }

            var99.dqa.aaa(var109, var2, var102);
            return;
         case 88:
            if ((var6 = var1.aaa().readInt()) == fz.ala().asa) {
               var99 = fz.ala();
            } else if ((var99 = gf.aea(var6)) == null) {
               return;
            }

            var99.bba = var99.bea;
            var99.aza = var99.baa;
            var99.ala = var1.aaa().readShort();
            var99.ama = var1.aaa().readShort();
            var99.bda();
            return;
         case 89:
            if ((var112 = ac.aaa(var1.aaa().readUnsignedByte())) != null) {
               var112.aoa = var1.aaa().readBoolean();
            }

            return;
         case 90:
            if ((var112 = ac.aaa(var1.aaa().readUnsignedByte())) != null) {
               var112.apa = var1.aaa().readBoolean();
               if (!var112.apa) {
                  ef.aaa(77, var112.ada, var112.aea - 9, 1);
                  break;
               }
            }

            return;
         case 91:
            if ((var112 = ac.aaa(var1.aaa().readUnsignedByte())) != null) {
               var112.aqa = var1.aaa().readBoolean();
            }

            return;
         case 92:
            var94 = var1.aaa().readUTF();
            Short var129 = new Short(var1.aaa().readShort());
            ab.bka.aaa(var94, new ca(er.ega, ab.aja, 88818, var129), 0);
            return;
         case 93:
            var6 = var1.aaa().readInt();
            gf.dsa = new fz();
            if (fz.ala().asa == var6) {
               gf.dsa = fz.ala();
            } else {
               if ((var99 = gf.aea(var6)) == null) {
                  gf.dsa = new fz();
               } else {
                  gf.dsa = var99;
               }

               gf.dsa.asa = var6;
               gf.dsa.aqa = 1;
               gf.ava().bsa();
            }

            gf.dsa.cea = var1.aaa().readUTF();
            gf.dsa.gsa = var1.aaa().readShort();
            gf.dsa.ata = var1.aaa().readByte();
            var2 = var1.aaa().readByte();
            gf.dsa.cua = gf.bqa[var2];
            gf.dsa.dka = var1.aaa().readByte();
            gf.dsa.bba = var1.aaa().readInt();
            gf.dsa.bea = var1.aaa().readInt();
            gf.dsa.aza = var1.aaa().readInt();
            gf.dsa.baa = var1.aaa().readInt();
            gf.dsa.ava = var1.aaa().readByte();
            gf.dsa.dea = var1.aaa().readShort();
            gf.dsa.dfa = var1.aaa().readShort();
            gf.dsa.dga = var1.aaa().readShort();
            gf.dsa.awa = var1.aaa().readInt();
            gf.dsa.axa = var1.aaa().readInt();
            gf.dsa.dia = var1.aaa().readShort();
            gf.dsa.dha = var1.aaa().readShort();
            gf.dsa.dja = var1.aaa().readShort();
            gf.dsa.dma = var1.aaa().readShort();
            gf.dsa.dna = var1.aaa().readShort();
            gf.dsa.doa = var1.aaa().readShort();
            gf.dsa.aya = var1.aaa().readUnsignedByte();
            gf.dsa.bka = var1.aaa().readShort();
            gf.dsa.cfa = var1.aaa().readUTF();
            if (!gf.dsa.cfa.equals("")) {
               gf.dsa.cga = var1.aaa().readByte();
            }

            gf.dsa.bka = var1.aaa().readShort();
            gf.dsa.bla = var1.aaa().readShort();
            gf.dsa.bna = var1.aaa().readShort();
            gf.dsa.bpa = var1.aaa().readShort();
            gf.dsa.bra = var1.aaa().readShort();
            gf.dsa.bta = var1.aaa().readShort();
            gf.dsa.bma = var1.aaa().readShort();
            gf.dsa.boa = var1.aaa().readShort();
            gf.dsa.bqa = var1.aaa().readShort();
            gf.dsa.bsa = var1.aaa().readShort();
            gf.dsa.bua = var1.aaa().readShort();
            gf.dsa.bwa = var1.aaa().readByte();
            gf.dsa.bxa = var1.aaa().readByte();
            gf.dsa.cca = var1.aaa().readByte();
            gf.dsa.bya = var1.aaa().readByte();
            gf.dsa.bza = var1.aaa().readByte();
            gf.dsa.dca = new gg[16];

            try {
               gf.dsa.aqa();

               for(var95 = 0; var95 < gf.dsa.dca.length; ++var95) {
                  gh var125;
                  var127 = (var125 = gi.aaa(var1.aaa().readShort())).aba;
                  gf.dsa.dca[var127] = new gg();
                  gf.dsa.dca[var127].ada = var127;
                  gf.dsa.dca[var127].ana = 5;
                  gf.dsa.dca[var127].aaa = var125;
                  gf.dsa.dca[var127].aga = true;
                  gf.dsa.dca[var127].aia = var1.aaa().readByte();
                  gf.dsa.dca[var127].aha = var1.aaa().readByte();
                  if (var127 == 1) {
                     var10000 = gf.dsa;
                     var10000.gva = var10000.dca[var127].aaa.aha;
                  } else if (var127 == 2) {
                     var10000 = gf.dsa;
                     var10000.gua = var10000.dca[var127].aaa.aha;
                  } else if (var127 == 6) {
                     var10000 = gf.dsa;
                     var10000.gta = var10000.dca[var127].aaa.aha;
                  }
               }

               return;
            } catch (Exception var83) {
               return;
            }
         case 94:
            aba(var1);
            return;
         case 95:
            var95 = var1.aaa().readInt();
            var10000 = fz.ala();
            var10000.cqa += var95;
            gf.aaa(var95 > 0 ? "+".concat(String.valueOf(var95)) : String.valueOf(var95), fz.ala().ala, fz.ala().ama - fz.ala().cja - 10, 1);
            return;
         case 96:
            fz.ala().fza.addElement(new aj(var1.aaa().readByte(), var1.aaa().readInt(), var1.aaa().readInt(), var1.aaa().readUTF(), var1.aaa().readUTF(), var1.aaa().readUnsignedByte(), var1.aaa().readUnsignedByte()));
            fz.ala().aca(21);
            gj.ama();
            return;
         case 97:
            var2 = var1.aaa().readByte();

            for(var3 = 0; var3 < fz.ala().fza.size(); ++var3) {
               aj var121;
               if ((var121 = (aj)fz.ala().fza.elementAt(var3)).aaa == var2) {
                  var121.aba = var1.aaa().readInt();
                  if (var121.aba == var121.aca) {
                     fz.ala().aca(61);
                  }

                  if (var121.aaa == 0) {
                     cv.aaa = true;
                  }

                  return;
               }
            }

            return;
         case 98:
            var2 = var1.aaa().readByte();

            for(var3 = 0; var3 < fz.ala().fza.size(); ++var3) {
               if (((aj)fz.ala().fza.elementAt(var3)).aaa == var2) {
                  fz.ala().fza.removeElementAt(var3);
                  break;
               }
            }

            fz.ala().aca(21);
            gj.aoa();
            return;
         case 99:
            if ((var106 = gf.aea(var1.aaa().readInt())) == null) {
               return;
            }

            if (Code.aba instanceof gk) {
               for(int var12 = 0; var12 < Code.aca(Code.bpa, ",").length; ++var12) {
                  if (var106.cea.equals(Code.aca(Code.bpa, ",")[var12])) {
                     gm.aaa().ala(var106.asa);
                  }
               }

               return;
            }

            ab.aaa(var106.cea + " " + er.naa, 88840, var106, 8882, (Object)null);
            return;
         case 100:
            gf.bia.removeAllElements();
            var2 = var1.aaa().readByte();

            for(var3 = 0; var3 < var2; ++var3) {
               try {
                  dp var117;
                  (var117 = new dp()).aaa = var1.aaa().readByte();
                  var117.aba = var1.aaa().readUTF();
                  var117.aca = var1.aaa().readUTF();
                  gf.bia.addElement(var117);
               } catch (Exception var56) {
               }
            }

            gf.ava().aya();
            return;
         case 101:
            try {
               gf.dsa.bva = var1.aaa().readInt();
               gf.dsa.caa = var1.aaa().readByte();
               gf.dsa.cba = var1.aaa().readByte();
            } catch (Exception var55) {
               var55.printStackTrace();
            }

            return;
         case 102:
            if ((var101 = fz.ala().daa[var1.aaa().readByte()]) != null) {
               gf.dha = var101;
            }

            fz.ala().cqa = var1.aaa().readInt();
            if (gf.dha != null) {
               if (gf.dha.aaa.aba == 16) {
                  gf.aya -= gf.dha.aea;
               }

               if (gf.dha.aaa.aba == 17) {
                  gf.axa -= gf.dha.aea;
               }

               fz.ala().daa[gf.dha.ada] = null;
               gf.dha = null;
               gf.ava().bca();
               be.aaa(er.rha);
            }

            ab.ama();
            return;
         case 103:
            gf.bta = var1.aaa().readByte();
            gf.dca = new ba[var1.aaa().readInt()];

            for(var111 = 0; var111 < gf.dca.length; ++var111) {
               gf.dca[var111] = new ba();
               gf.dca[var111].aaa = new gg();
               gf.dca[var111].aaa.aca = var1.aaa().readInt();
               gf.dca[var111].ada = (int)(System.currentTimeMillis() / 1000L);
               gf.dca[var111].aca = var1.aaa().readInt();
               gf.dca[var111].aaa.aea = var1.aaa().readUnsignedShort();
               gf.dca[var111].aea = var1.aaa().readUTF();
               gf.dca[var111].aba = var1.aaa().readInt();
               gf.dca[var111].aaa.aaa = gi.aaa(var1.aaa().readShort());
            }

            gf.ava().ada((int)37);
            return;
         case 104:
            aca(var1);
            return;
         case 106:
            if ((var106 = gf.aea(var1.aaa().readInt())) != null) {
               ab.aaa(var106.cea + " " + er.rva, 88841, var106, 8882, (Object)null);
            }

            return;
         case 107:
            var102 = var1.aaa().readByte();
            ab.aaa(var1.aaa().readUTF(), 8890, Integer.valueOf(var102), 8882, (Object)null);
            return;
         case 108:
            fz.ala().aba(var1);
            return;
         case 109:
            br.aca();
            ab.ala();
            ab.aka();
            var97 = new ev();

            try {
               var5 = var1.aaa().readByte();

               for(var3 = 0; var3 < var5; ++var3) {
                  String[] var110 = new String[var1.aaa().readByte()];

                  for(var95 = 0; var95 < var110.length; ++var95) {
                     var110[var95] = var1.aaa().readUTF();
                  }

                  var97.addElement(new ca(var110[0], ab.aja, 88820, var110));
               }
            } catch (Exception var80) {
            }

            if (fz.ala().dra == null) {
               return;
            }

            ab.bea.aaa(var97);
            return;
         case 112:
            (var101 = fz.ala().daa[var1.aaa().readByte()]).aia = var1.aaa().readByte();
            var101.afa = 0L;
            return;
         case 114:
            gf.ava().fka = var1.aaa().readByte();
            return;
         case 116:
            if ((var99 = gf.aea(var1.aaa().readInt())) != null) {
               aaa(var99, var1);
            }

            return;
         case 117:
            if (!ab.aaa) {
               try {
                  ac.aza.removeAllElements();
                  gn.axa.clear();
                  gf.fna.removeAllElements();
                  gf.foa.removeAllElements();
                  gf.fma.removeAllElements();
                  var2 = var1.aaa().readByte();

                  for(var3 = 0; var3 < var2; ++var3) {
                     var4 = String.valueOf(var1.aaa().readShort());
                     byte[] var103 = new byte[var1.aaa().readInt()];
                     var1.aaa().read(var103);
                     Image var104 = aaa(var103);
                     gn.axa.put(var4, var104);
                  }

                  var6 = var1.aaa().readUnsignedByte();

                  fu var105;
                  for(var3 = 0; var3 < var6; ++var3) {
                     var7 = var1.aaa().readUnsignedByte();
                     var95 = var1.aaa().readUnsignedByte();
                     var96 = var1.aaa().readUnsignedByte();
                     (var105 = new fu(var95, var96)).aaa = var7;
                     gf.fna.addElement(var105);
                  }

                  var6 = var1.aaa().readUnsignedByte();

                  for(var3 = 0; var3 < var6; ++var3) {
                     var7 = var1.aaa().readUnsignedByte();
                     var95 = var1.aaa().readUnsignedByte();
                     var96 = var1.aaa().readUnsignedByte();
                     (var105 = new fu(var95, var96)).aaa = var7;
                     gf.foa.addElement(var105);
                  }

                  var6 = var1.aaa().readUnsignedByte();

                  for(var3 = 0; var3 < var6; ++var3) {
                     var7 = var1.aaa().readUnsignedByte();
                     var95 = var1.aaa().readUnsignedByte();
                     var96 = var1.aaa().readUnsignedByte();
                     (var105 = new fu(var95, var96)).aaa = var7;
                     gf.fma.addElement(var105);
                  }

                  return;
               } catch (Exception var84) {
                  var84.printStackTrace();
                  return;
               }
            }

            return;
         case 118:
            var94 = var1.aaa().readUTF();
            fd.aaa("acc", var94);
            var100 = var1.aaa().readUTF();
            fd.aaa("pass", var100);
            ez.aaa = var94;
            ez.aba = var100;
            ez.aca = "";
            ez.ada = "";
            if (!var94.startsWith("tmpusr")) {
               gf.ava().aaa();
            }

            cs.afa();
            return;
         case 119:
            if ((var102 = var1.aaa().readByte()) == -1) {
               gf.fua = true;
               gf.aaa(true);
               if ((gf.gqa = var1.aaa().readInt()) > 360) {
                  gf.fva = true;
               } else {
                  gf.fva = false;
                  gf.goa = fz.ala().ala;
                  gf.gpa = fz.ala().ama;
               }
            } else if (var102 == 0) {
               if ((var99 = gf.aea(var1.aaa().readInt())) != null) {
                  ef.aaa(141, var99.ala, var99.ama, 2);
                  var93 = var1.aaa().readShort();
                  var99.gga = var93;
                  var93 = var1.aaa().readShort();
                  var99.gha = var93;
                  ef.aaa(141, var99.ala, var99.ama, 2);
               }
            } else {
               gf.fua = false;
               gf.fza = 0;
            }
            break;
         case 121:
            gf.bia.removeAllElements();
            var6 = var1.aaa().readUnsignedByte();

            for(var3 = 0; var3 < var6; ++var3) {
               try {
                  ei var98;
                  (var98 = new ei()).aba = var1.aaa().readUTF();
                  var98.aaa = var1.aaa().readInt();
                  var98.aca = var1.aaa().readUTF();
                  gf.bia.addElement(var98);
               } catch (Exception var54) {
               }
            }

            gf.ava().axa();
            return;
         case 122:
            if ((var2 = var1.aaa().readByte()) == 0) {
               aia(var1);
               return;
            } else {
               if (var2 == 1) {
                  aja(var1);
               } else if (var2 == 2) {
                  ala(var1);
               } else if (var2 == 3) {
                  aka(var1);
               }
               break;
            }
         case 123:
            if ((var2 = var1.aaa().readByte()) != 0 && var2 != 1) {
            }

            return;
         case 124:
            ama(var1);
            return;
         case 125:
            if ((var2 = var1.aaa().readByte()) == 0) {
               ana(var1);
               return;
            } else {
               if (var2 == 1) {
                  aoa(var1);
               } else if (var2 == 2) {
                  apa(var1);
               }
               break;
            }
         case 126:
            var5 = var1.aaa().readByte();
            ab.ama();
            if (var5 == 0) {
               gf.aaa.bca();
            }

            return;
         }
      } catch (Exception var91) {
         System.out.println("ERROR COMAND: " + var1.aaa);
         var91.printStackTrace();
         return;
      } finally {
         var1.aca();
      }

   }

   private static void aaa(DataInputStream var0) {
      gf.era = var0.readByte();
      gf.bva = new bw[var0.readUnsignedByte()];

      for(int var1 = 0; var1 < gf.bva.length; ++var1) {
         gf.bva[var1] = new bw();
         gf.bva[var1].aaa = var1;
         gf.bva[var1].aba = var0.readUTF();
         gf.bva[var1].aca = var0.readByte();
      }

      short var3 = var0.readShort();

      for(int var2 = 0; var2 < var3; ++var2) {
         gi.aaa(new gh((short)var2, var0.readByte(), var0.readByte(), var0.readUTF(), var0.readUTF(), var0.readByte(), var0.readShort(), var0.readShort(), var0.readBoolean()));
      }

   }

   private static void aba(DataInputStream var0) {
      gf.eqa = var0.readByte();
      gf.bwa = new ao[var0.readByte()];

      int var1;
      for(var1 = 0; var1 < gf.bwa.length; ++var1) {
         gf.bwa[var1] = new ao();
         gf.bwa[var1].aaa = var1;
         gf.bwa[var1].aba = var0.readUTF();
      }

      gf.bqa = new dh[var0.readUnsignedByte()];

      for(var1 = 0; var1 < gf.bqa.length; ++var1) {
         gf.bqa[var1] = new dh();
         gf.bqa[var1].aaa = var1;
         gf.bqa[var1].aba = var0.readUTF();
         gf.bqa[var1].aca = new dk[var0.readByte()];

         for(int var2 = 0; var2 < gf.bqa[var1].aca.length; ++var2) {
            gf.bqa[var1].aca[var2] = new dk();
            gf.bqa[var1].aca[var2].aaa = var0.readByte();
            gf.bqa[var1].aca[var2].aba = var0.readUTF();
            gf.bqa[var1].aca[var2].aca = var0.readByte();
            gf.bqa[var1].aca[var2].ada = var0.readByte();
            gf.bqa[var1].aca[var2].aea = var0.readShort();
            short var3 = 150;
            if (ab.aza == 128 || ab.baa <= 208) {
               var3 = 100;
            }

            gf.bqa[var1].aca[var2].afa = fw.aka.aba(var0.readUTF(), var3);
            gf.bqa[var1].aca[var2].aga = new bc[var0.readByte()];

            for(int var5 = 0; var5 < gf.bqa[var1].aca[var2].aga.length; ++var5) {
               gf.bqa[var1].aca[var2].aga[var5] = new bc();
               gf.bqa[var1].aca[var2].aga[var5].aba = var0.readShort();
               gf.bqa[var1].aca[var2].aga[var5].aaa = gf.bqa[var1].aca[var2];
               gf.bqa[var1].aca[var2].aga[var5].aca = var0.readByte();
               gf.bqa[var1].aca[var2].aga[var5].ada = var0.readByte();
               gf.bqa[var1].aca[var2].aga[var5].aja = var0.readShort();
               gf.bqa[var1].aca[var2].aga[var5].aea = var0.readInt();
               gf.bqa[var1].aca[var2].aga[var5].aga = var0.readShort();
               gf.bqa[var1].aca[var2].aga[var5].aha = var0.readShort();
               gf.bqa[var1].aca[var2].aga[var5].aia = var0.readByte();
               gf.bqa[var1].aca[var2].aga[var5].aka = new fi[var0.readByte()];

               for(int var4 = 0; var4 < gf.bqa[var1].aca[var2].aga[var5].aka.length; ++var4) {
                  gf.bqa[var1].aca[var2].aga[var5].aka[var4] = new fi();
                  gf.bqa[var1].aca[var2].aga[var5].aka[var4].aaa = var0.readShort();
                  gf.bqa[var1].aca[var2].aga[var5].aka[var4].aba = gf.bwa[var0.readByte()];
               }

               bb.aaa(gf.bqa[var1].aca[var2].aga[var5]);
            }
         }
      }

   }

   private static void aca(DataInputStream var0) {
      gf.epa = var0.readByte();
      gn.ava = new String[var0.readUnsignedByte()];

      int var1;
      for(var1 = 0; var1 < gn.ava.length; ++var1) {
         gn.ava[var1] = var0.readUTF();
      }

      av.aba = new cm[var0.readByte()];

      int var2;
      for(byte var4 = 0; var4 < av.aba.length; ++var4) {
         av.aba[var4] = new cm();
         av.aba[var4].aaa = var4;
         av.aba[var4].aba = var0.readUTF();
         av.aba[var4].aca = var0.readShort();
         av.aba[var4].ada = var0.readShort();
         av.aba[var4].aea = var0.readShort();
         av.aba[var4].afa = new String[var0.readByte()][];

         for(var2 = 0; var2 < av.aba[var4].afa.length; ++var2) {
            av.aba[var4].afa[var2] = new String[var0.readByte()];

            for(int var3 = 0; var3 < av.aba[var4].afa[var2].length; ++var3) {
               av.aba[var4].afa[var2][var3] = var0.readUTF();
            }
         }
      }

      ac.aaa = new fr[var1 = var0.readUnsignedByte()];

      for(var2 = 0; var2 < var1; ++var2) {
         ac.aaa[var2] = new fr();
         ac.aaa[var2].aea = (short)var2;
         ac.aaa[var2].aca = var0.readByte();
         ac.aaa[var2].aga = var0.readUTF();
         ac.aaa[var2].afa = var0.readInt();
         ac.aaa[var2].aaa = var0.readByte();
         ac.aaa[var2].aba = var0.readByte();
      }

   }

   private static void ada(DataInputStream var0) {
      gf.eoa = var0.readByte();
      fd.aaa("nj_arrow", ex.aaa(var0));
      fd.aaa("nj_effect", ex.aaa(var0));
      fd.aaa("nj_image", ex.aaa(var0));
      fd.aaa("nj_part", ex.aaa(var0));
      fd.aaa("nj_skill", ex.aaa(var0));
      gf.ena = new byte[(gf.ema = new byte[var0.readByte()][]).length][];

      int var1;
      for(var1 = 0; var1 < gf.ema.length; ++var1) {
         gf.ema[var1] = new byte[var0.readByte()];
         gf.ena[var1] = new byte[gf.ema[var1].length];

         for(int var2 = 0; var2 < gf.ema[var1].length; ++var2) {
            gf.ema[var1][var2] = var0.readByte();
            gf.ena[var1][var2] = var0.readByte();
         }
      }

      gf.dta = new long[var0.readUnsignedByte()];

      for(var1 = 0; var1 < gf.dta.length; ++var1) {
         gf.dta[var1] = var0.readLong();
      }

      gf.dua = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.dua.length; ++var1) {
         gf.dua[var1] = var0.readInt();
      }

      gf.dva = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.dva.length; ++var1) {
         gf.dva[var1] = var0.readInt();
      }

      gf.dwa = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.dwa.length; ++var1) {
         gf.dwa[var1] = var0.readInt();
      }

      gf.dxa = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.dxa.length; ++var1) {
         gf.dxa[var1] = var0.readInt();
      }

      gf.dya = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.dya.length; ++var1) {
         gf.dya[var1] = var0.readInt();
      }

      gf.dza = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.dza.length; ++var1) {
         gf.dza[var1] = var0.readInt();
      }

      gf.eaa = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.eaa.length; ++var1) {
         gf.eaa[var1] = var0.readInt();
      }

      gf.eba = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.eba.length; ++var1) {
         gf.eba[var1] = var0.readInt();
      }

      gf.eda = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.eda.length; ++var1) {
         gf.eda[var1] = var0.readInt();
      }

      gf.eca = new int[var0.readByte()];

      for(var1 = 0; var1 < gf.eca.length; ++var1) {
         gf.eca[var1] = var0.readInt();
      }

      bu.aaa = new bg[var0.readByte()];

      for(var1 = 0; var1 < bu.aaa.length; ++var1) {
         bu.aaa[var1] = new bg();
         bu.aaa[var1].aaa = var0.readByte();
         bu.aaa[var1].aba = var0.readByte();
         var0.readUTF();
         bu.aaa[var1].aca = var0.readShort();
      }

   }

   public static Image aaa(byte[] var0) {
      try {
         return Image.createImage(var0, 0, var0.length);
      } catch (Exception var1) {
         return null;
      }
   }

   private static void ada(fe var0) {
      try {
         Auto.aia();
         Auto.aja();
         Auto.ava = false;
         fz var1;
         (var1 = fz.ala()).ada = null;
         var1.ala = var1.gea = var0.ada.readShort();
         var1.ama = var1.gfa = var0.ada.readShort();
         byte var10 = var0.ada.readByte();

         int var2;
         for(var2 = 0; var2 < var10; ++var2) {
            gn.aua.addElement(new dn(var0.ada.readShort(), var0.ada.readShort(), var0.ada.readShort(), var0.ada.readShort()));
         }

         Auto.aia();
         var10 = var0.ada.readByte();

         byte var11;
         for(var11 = 0; var11 < var10; ++var11) {
            gf.aaa((ac)(new ac(var11, var0.ada.readBoolean(), var0.ada.readBoolean(), var0.ada.readBoolean(), var0.ada.readBoolean(), var0.ada.readBoolean(), var0.ada.readUnsignedByte(), var0.ada.readByte(), var0.ada.readInt(), var0.ada.readUnsignedByte(), var0.ada.readInt(), var0.ada.readShort(), var0.ada.readShort(), var0.ada.readByte(), var0.ada.readByte(), var0.ada.readBoolean(), false)), (int)var11);
         }

         var10 = var0.ada.readByte();

         for(var11 = 0; var11 < var10; ++var11) {
            gf.bpa.addElement(new fn(var0.ada.readUTF(), var0.ada.readShort(), var0.ada.readShort()));
         }

         var10 = var0.ada.readByte();

         for(var2 = 0; var2 < var10; ++var2) {
            gf.boa.addElement(new av(var0.ada.readByte(), var0.ada.readShort(), var0.ada.readShort(), var0.ada.readByte()));
         }

         var10 = var0.ada.readByte();

         for(var2 = 0; var2 < var10; ++var2) {
            am var4 = new am(var0.ada.readShort(), var0.ada.readShort(), var0.ada.readShort(), var0.ada.readShort());
            boolean var5 = false;

            for(int var3 = 0; var3 < gf.bma.size(); ++var3) {
               if (((am)gf.bma.elementAt(var3)).aga == var4.aga) {
                  var5 = true;
                  break;
               }
            }

            if (!var5) {
               gf.bma.addElement(var4);
            }
         }

         gf.aaa(false);

         try {
            gn.aja = null;
            gn.aka = gn.aja = var0.ada.readUTF();
         } catch (Exception var6) {
         }

         try {
            gn.awa.clear();
            var2 = var0.ada.readUnsignedByte();

            for(int var14 = 0; var14 < var2; ++var14) {
               int var15 = var0.ada.readUnsignedByte();
               String var12 = String.valueOf((short)(var0.ada.readUnsignedByte() * gn.aaa + var15));
               gn.awa.put(var12, "location");
            }
         } catch (Exception var7) {
            var7.printStackTrace();
         }

         gn.aaa(gn.aea);
         fz.ala().ana = 0;
         fz.ala().aqa = 4;
         gf var9 = gf.ava();
         if (gf.gga == null) {
            gf.gga = new Image[3];

            for(int var13 = 0; var13 < 3; ++var13) {
               gf.gga[var13] = ab.aca("/e/sp" + var13 + ".png");
            }
         }

         gf.gba = new int[2];
         gf.gca = new int[2];
         gf.gda = new int[2];
         gf.gea = new int[2];
         gf.gfa = new int[2];
         gf.gda[0] = gf.gda[1] = -1;
         var9.bha();
         ci.aba();
         ab.aaa(gn.ama);
         fz.gka = false;
         fz.gja = false;
         ab.ala();
         ab.aka();
         if (!gn.bfa || gn.bea == gn.aoa) {
            gf.ava().aaa();
            br.aca();
            br.aaa(gn.aka, er.nfa + " " + gn.ala, 30);
            ep.aaa();
            ab.ama();
         }

         cs.afa();
         ab.aea = false;
      } catch (Exception var8) {
      }

      gn.aha();
   }

   private void aea(fe var1) {
      try {
         try {
            int var2;
            byte var3;
            short var4;
            fz var34;
            String var35;
            int var36;
            byte[] var47;
            switch(var1.aaa().readByte()) {
            case -126:
               var3 = var1.aaa().readByte();
               ed.aca = false;
               cl var50;
               (var50 = cl.aea()).aga = new String[3];
               var50.aba = new int[3];
               var50.aca = new int[3];
               var50.ada = new int[3];
               var50.aea = new int[3];
               var50.afa = new int[3];
               var50.aha = new String[3];
               var50.aia = new byte[3];
               if (ab.afa) {
                  var50.aaa = -1;
               } else {
                  var50.aaa = 0;
               }

               gf.ava();
               gf.aoa();
               fo.aea();

               for(byte var51 = 0; var51 < var3; ++var51) {
                  cl.aea().aia[var51] = var1.aaa().readByte();
                  cl.aea().aga[var51] = var1.aaa().readUTF();
                  cl.aea().aha[var51] = var1.aaa().readUTF();
                  cl.aea().afa[var51] = var1.aaa().readUnsignedByte();
                  cl.aea().aba[var51] = var1.aaa().readShort();
                  cl.aea().aea[var51] = var1.aaa().readShort();
                  cl.aea().ada[var51] = var1.aaa().readShort();
                  cl.aea().aca[var51] = var1.aaa().readShort();
                  if (cl.aea().aea[var51] == -1) {
                     cl.aea().aea[var51] = 15;
                  }

                  if (cl.aea().ada[var51] == -1) {
                     if (cl.aea().aia[var51] == 0) {
                        cl.aea().ada[var51] = 10;
                     } else {
                        cl.aea().ada[var51] = 1;
                     }
                  }

                  if (cl.aea().aca[var51] == -1) {
                     if (cl.aea().aia[var51] == 0) {
                        cl.aea().aca[var51] = 9;
                     } else {
                        cl.aea().aca[var51] = 0;
                     }
                  }
               }

               cl.aea().aaa();
               ab.ama();
               cs.afa();
               return;
            case -125:
            case -124:
            case -118:
            case -110:
            case -107:
            case -105:
            case -104:
            case -103:
            case -102:
            case -101:
            case -100:
            case -94:
            case -92:
            case -91:
            case -89:
            case -87:
            case -85:
            case -82:
            case -79:
            case -78:
            case -76:
            case -75:
            case -74:
            case -73:
            case -71:
            case -69:
            case -68:
            case -65:
            case -64:
            case -63:
            default:
               return;
            case -123:
               gf.esa = var1.aaa().readByte();
               gf.eta = var1.aaa().readByte();
               gf.eua = var1.aaa().readByte();
               gf.eva = var1.aaa().readByte();
               System.out.println("****** DATA VERSION: Server " + gf.esa + " Client " + gf.eoa);
               System.out.println("****** MAP VERSION: Server " + gf.eta + " Client " + gf.epa);
               System.out.println("****** SKILL VERSION: Server " + gf.eua + " Client " + gf.eqa);
               System.out.println("****** ITEM VERSION: Server " + gf.eva + " Client " + gf.era);
               if (gf.esa != gf.eoa) {
                  gm.aaa().ama();
               } else {
                  try {
                     ada(new DataInputStream(new ByteArrayInputStream(fd.aba("data"))));
                  } catch (Exception var30) {
                     gf.eoa = -1;
                     gm.aaa().ama();
                  }
               }

               if (gf.eta != gf.epa) {
                  gm.aaa().ana();
               } else {
                  try {
                     aca(new DataInputStream(new ByteArrayInputStream(fd.aba("map"))));
                  } catch (Exception var29) {
                     gf.epa = -1;
                     gm.aaa().ana();
                  }
               }

               if (gf.eua != gf.eqa) {
                  gm.aaa().aoa();
               } else {
                  try {
                     aba(new DataInputStream(new ByteArrayInputStream(fd.aba("skill"))));
                  } catch (Exception var28) {
                     gf.eqa = -1;
                     gm.aaa().aoa();
                  }
               }

               if (gf.eva != gf.era) {
                  gm.aaa().apa();
               } else {
                  try {
                     aaa(new DataInputStream(new ByteArrayInputStream(fd.aba("item"))));
                  } catch (Exception var27) {
                     gf.era = -1;
                     gm.aaa().apa();
                  }
               }

               if (gf.esa == gf.eoa && gf.eta == gf.epa && gf.eua == gf.eqa && gf.eva == gf.era) {
                  gf.ava();
                  gf.apa();
                  gf.ava();
                  gf.aqa();
                  gf.ava();
                  gf.ara();
                  gm.aaa().aqa();
               }

               return;
            case -122:
               System.out.println("GET UPDATE_DATA " + var1.aaa().available() + " bytes");
               var1.aaa().mark(100000);
               ada(var1.aaa());
               var1.aaa().reset();
               var47 = new byte[var1.aaa().available()];
               var1.aaa().readFully(var47);
               fd.aaa("data", var47);
               var47 = new byte[]{gf.eoa};
               fd.aaa("dataVersion", var47);
               if (gf.esa != gf.eoa || gf.eta != gf.epa || gf.eua != gf.eqa || gf.eva != gf.era) {
                  return;
               }

               gf.ava();
               gf.apa();
               gf.ava();
               gf.aqa();
               gf.ava();
               gf.ara();
               gm.aaa().aqa();
               return;
            case -121:
               System.out.println("GET UPDATE_MAP " + var1.aaa().available() + " bytes");
               var1.aaa().mark(100000);
               aca(var1.aaa());
               var1.aaa().reset();
               var47 = new byte[var1.aaa().available()];
               var1.aaa().readFully(var47);
               fd.aaa("map", var47);
               var47 = new byte[]{gf.epa};
               fd.aaa("mapVersion", var47);
               if (gf.esa != gf.eoa || gf.eta != gf.epa || gf.eua != gf.eqa || gf.eva != gf.era) {
                  return;
               }

               gf.apa();
               gf.aqa();
               gf.ara();
               gm.aaa().aqa();
               return;
            case -120:
               System.out.println("GET UPDATE_SKILL " + var1.aaa().available() + " bytes");
               var1.aaa().mark(100000);
               aba(var1.aaa());
               var1.aaa().reset();
               var47 = new byte[var1.aaa().available()];
               var1.aaa().readFully(var47);
               if (fz.ala().aea) {
                  fd.aaa("skill", var47);
               } else {
                  fd.aaa("skillnhanban", var47);
               }

               var47 = new byte[]{gf.eqa};
               fd.aaa("skillVersion", var47);
               if (gf.esa != gf.eoa || gf.eta != gf.epa || gf.eua != gf.eqa || gf.eva != gf.era) {
                  return;
               }

               gf.apa();
               gf.aqa();
               gf.ara();
               gm.aaa().aqa();
               return;
            case -119:
               System.out.println("GET UPDATE_ITEM " + var1.aaa().available() + " bytes");
               var1.aaa().mark(100000);
               aaa(var1.aaa());
               var1.aaa().reset();
               var47 = new byte[var1.aaa().available()];
               var1.aaa().readFully(var47);
               fd.aaa("item", var47);
               var47 = new byte[]{gf.era};
               fd.aaa("itemVersion", var47);
               if (gf.esa == gf.eoa && gf.eta == gf.epa && gf.eua == gf.eqa && gf.eva == gf.era) {
                  gf.apa();
                  gf.aqa();
                  gf.ara();
                  gm.aaa().aqa();
                  return;
               }
            case -117:
               fz.ala().dka = var1.aaa().readByte();
               dy.aaa(er.jha + " " + fz.ala().dka, 15, fw.ala);
               fz.ala().aca(21);
               return;
            case -116:
               fz.ala().cqa = var1.aaa().readInt();
               fz.cha.aga = var1.aaa().readInt();
               return;
            case -115:
               var2 = var1.aaa().readInt();
               byte[] var39 = ex.aba(var1);
               fo.aaa(var2, var39);
               return;
            case -114:
               if (fz.cha == null) {
                  fz.cha = new dj();
               }

               fz.cha.aaa(var1.aaa().readUTF());
               return;
            case -113:
               if (fz.cha == null) {
                  fz.cha = new dj();
               }

               fz.cha.aaa = var1.aaa().readUTF();
               fz.cha.aja = var1.aaa().readUTF();
               var1.aaa().readUTF();
               fz.cha.ana = var1.aaa().readShort();
               fz.cha.afa = var1.aaa().readByte();
               fz.cha.ada = var1.aaa().readByte();
               fz.cha.aba = var1.aaa().readInt();
               fz.cha.aca = var1.aaa().readInt();
               fz.cha.aga = var1.aaa().readInt();
               fz.cha.aha = var1.aaa().readInt();
               fz.cha.aia = var1.aaa().readInt();
               fz.cha.aka = var1.aaa().readUTF();
               fz.cha.ama = var1.aaa().readUTF();
               fz.cha.aoa = var1.aaa().readInt();
               fz.cha.aea = var1.aaa().readByte();
               return;
            case -112:
               gf.bea.removeAllElements();
               var4 = var1.aaa().readShort();

               for(var36 = 0; var36 < var4; ++var36) {
                  gf.bea.addElement(new cn(var1.aaa().readByte(), var1.aaa().readByte(), var1.aaa().readByte(), var1.aaa().readUTF(), var1.aaa().readInt(), var1.aaa().readBoolean()));
               }

               try {
                  for(var36 = 0; var36 < var4; ++var36) {
                     ((cn)gf.bea.elementAt(var36)).aga = var1.aaa().readInt();
                  }
               } catch (Exception var31) {
               }

               gf.ava();
               gf.bfa();
               return;
            case -111:
               fz.cha.apa = new gg[30];
               var3 = var1.aaa().readByte();

               for(var2 = 0; var2 < var3; ++var2) {
                  fz.cha.apa[var2] = new gg();
                  fz.cha.apa[var2].ana = 39;
                  fz.cha.apa[var2].ada = var2;
                  fz.cha.apa[var2].aea = var1.aaa().readShort();
                  fz.cha.apa[var2].aaa = gi.aaa(var1.aaa().readShort());
               }

               gf.ava().bva();
               byte var5 = var1.aaa().readByte();

               for(var36 = 0; var36 < var5; ++var36) {
                  String var40 = var1.aaa().readUTF();
                  var4 = var1.aaa().readShort();
                  short var38 = var1.aaa().readShort();
                  int var42 = var1.aaa().readInt();
                  var35 = "";
                  ev var43 = new ev();
                  int var44 = -1;
                  int var46 = -1;
                  byte var48 = var1.aaa().readByte();
                  if (var42 >= 0) {
                     var35 = var1.aaa().readUTF();
                  } else {
                     for(int var13 = 0; var13 < var48; ++var13) {
                        String var45 = var1.aaa().readUTF();
                        var43.addElement(var45);
                     }

                     var44 = var1.aaa().readInt();
                     var46 = var1.aaa().readInt();
                  }

                  byte var49 = var1.aaa().readByte();
                  gf.ava().aaa(new db(var40, var49, var4, var38, var42, var35, var43, var44, var46));
               }

               return;
            case -109:
               try {
                  ab.aea = true;
                  gn.afa = null;
                  gn.aga = null;
                  System.gc();
                  gn.aaa(gn.aoa, var1.aaa());
                  gn.aia();
                  ada(this.aba);
               } catch (Exception var26) {
                  var26.printStackTrace();
               }

               var1.aca();
               this.aba.aca();
               var1 = this.aba = null;
               return;
            case -108:
               var4 = var1.aaa().readShort();

               try {
                  var3 = var1.aaa().readByte();
                  ac.aaa[var4].ada = var3;
               } catch (Exception var25) {
               }

               var3 = var1.aaa().readByte();
               ac.aaa[var4].aha = new Image[var3];
               if (var4 != 98 && var4 != 99) {
                  for(var36 = 0; var36 < ac.aaa[var4].aha.length; ++var36) {
                     ac.aaa[var4].aha[var36] = aaa(ex.aba(var1));
                  }

                  if (var4 == 219) {
                     gf.ava().aaa(ac.aaa[var4].aha[0]);
                  }
               } else {
                  ac.aaa[var4].aha = new Image[3];
                  Image var6 = aaa(ex.aba(var1));

                  for(var2 = 0; var2 < ac.aaa[var4].aha.length; ++var2) {
                     ac.aaa[var4].aha[var2] = var6;
                  }
               }

               int var37;
               if (var1.aaa().readBoolean()) {
                  var3 = var1.aaa().readByte();
                  ac.aaa[var4].aka = new byte[var3];

                  for(var2 = 0; var2 < var3; ++var2) {
                     ac.aaa[var4].aka[var2] = var1.aaa().readByte();
                  }

                  var3 = var1.aaa().readByte();
                  ac.aaa[var4].ala = new byte[var3][];

                  for(var2 = 0; var2 < var3; ++var2) {
                     ac.aaa[var4].ala[var2] = new byte[var1.aaa().readByte()];

                     for(var37 = 0; var37 < ac.aaa[var4].ala[var2].length; ++var37) {
                        ac.aaa[var4].ala[var2][var37] = var1.aaa().readByte();
                     }
                  }
               }

               if (var1.aaa().readInt() > 0) {
                  ac.aaa[var4].aia = new fh[var1.aaa().readByte()];

                  for(var37 = 0; var37 < ac.aaa[var4].aia.length; ++var37) {
                     ac.aaa[var4].aia[var37] = new fh();
                     var1.aaa().readByte();
                     ac.aaa[var4].aia[var37].aaa = var1.aaa().readUnsignedByte();
                     ac.aaa[var4].aia[var37].aba = var1.aaa().readUnsignedByte();
                     ac.aaa[var4].aia[var37].aca = var1.aaa().readUnsignedByte();
                     ac.aaa[var4].aia[var37].ada = var1.aaa().readUnsignedByte();
                  }

                  ac.aaa[var4].aja = new ah[var1.aaa().readShort()];

                  for(var37 = 0; var37 < ac.aaa[var4].aja.length; ++var37) {
                     ac.aaa[var4].aja[var37] = new ah();
                     var3 = var1.aaa().readByte();
                     ac.aaa[var4].aja[var37].aaa = new short[var3];
                     ac.aaa[var4].aja[var37].aba = new short[var3];
                     ac.aaa[var4].aja[var37].aca = new byte[var3];

                     for(var2 = 0; var2 < var3; ++var2) {
                        ac.aaa[var4].aja[var37].aaa[var2] = var1.aaa().readShort();
                        ac.aaa[var4].aja[var37].aba[var2] = var1.aaa().readShort();
                        ac.aaa[var4].aja[var37].aca[var2] = var1.aaa().readByte();
                     }
                  }

                  var4 = var1.aaa().readShort();

                  for(var36 = 0; var36 < var4; ++var36) {
                     var1.aaa().readShort();
                  }
               }

               return;
            case -106:
               gf.fga = var1.aaa().readByte();
               return;
            case -99:
               ab.bla.aaa(er.bta, er.bua);
               var35 = var1.aaa().readUTF();
               ab.bla.aaa(var35, new ca(er.bma, ab.aja, 8882, (Object)null), new ca(er.bya, ab.aja, 88816, (Object)null), 0, 1);
               return;
            case -98:
               fz.ala();
               fz.bea();
               return;
            case -97:
               ab.aea = false;
               ab.ama();
               Integer var7 = new Integer(var1.aaa().readInt());
               ab.bka.aaa(er.fca, new ca(er.dca, ab.aja, 88829, var7), 0);
               return;
            case -96:
               fz.ala().cfa = var1.aaa().readUTF();
               fz.ala().cga = 4;
               fz.ala().cta = var1.aaa().readInt();
               fz.ala().aca(21);
               return;
            case -95:
               if (fz.cha != null) {
                  fz.cha.ama = var1.aaa().readUTF();
               }

               return;
            case -93:
               if ((var2 = var1.aaa().readInt()) == fz.ala().asa) {
                  gf.bea.removeAllElements();
                  fz.ala().cfa = "";
                  fz.ala().cga = -1;
                  fz.cha = null;
               } else {
                  gf.bea.removeAllElements();
                  fz var41;
                  (var41 = gf.aea(var2)).cfa = "";
                  var41.cga = -1;
               }

               return;
            case -90:
               fz.ala().cqa = var1.aaa().readInt();
               gf.ava().bca();
               return;
            case -88:
               gf.ava().bca();
               gg var8;
               (var8 = fz.ala().daa[var1.aaa().readByte()]).aga();
               var8.aga = true;
               var8.aia = var1.aaa().readByte();
               (var8 = fz.ala().daa[var1.aaa().readByte()]).aga();
               var8.aga = true;
               var8.aia = var1.aaa().readByte();
               dy.aaa(er.nda, 20, fw.afa);
               return;
            case -86:
               ab.ama();
               gf.ava().bca();
               be.aaa(var1.aaa().readUTF(), 20, fw.ala);
               return;
            case -84:
               fz.gaa = var1.aaa().readShort();
               return;
            case -83:
               short var9 = var1.aaa().readShort();
               var4 = var1.aaa().readShort();
               byte var10 = var1.aaa().readByte();
               short var11 = var1.aaa().readShort();
               if (var9 == 0) {
                  gf.ava().aaa(er.eya, "          " + er.ora, false);
               } else {
                  var35 = er.ema + ": " + var9 + "\n\n";
                  if (var4 == 0) {
                     var35 = var35 + er.eqa + "\n\n";
                  } else {
                     var35 = var35 + er.era + ": " + ex.aba(var4) + "\n\n";
                  }

                  var35 = var35 + er.esa + ": " + var10 + "\n\n";
                  var35 = var35 + er.fka + ": " + var11 + " " + er.fla + "\n\n";
                  gf.ava().aaa(er.eya, var35, false);
                  if (var11 > 0) {
                     gf.ava().ala = new ca(er.fka, 1000);
                     return;
                  }
               }

               return;
            case -81:
               fz.gba = var1.aaa().readShort();
               return;
            case -80:
               gf.ava().aaa(er.exa, var1.aaa().readUTF(), false);
               if (var1.aaa().readBoolean()) {
                  gf.ava().ala = new ca(er.fka, 2000);
                  gj.baa();
               }

               return;
            case -77:
               ab.aaa(gn.ama = var1.aaa().readByte());
               return;
            case -72:
               gf.ava().fla = new String[9];
               gf.dda = new short[9];
               if (gf.bra < 0 || gf.bra > 8) {
                  gf.bua = 0;
                  gf.bra = 0;
               }

               for(var2 = 0; var2 < 9; ++var2) {
                  gf.dda[var2] = var1.aaa().readShort();
                  gf.ava().fla[var2] = gf.ava().fia[ex.aaa(9)];
               }

               gf.ava().ala = new ca(er.cda, (ag)null, 1506, (Object)null);
               gf.ava().fha = System.currentTimeMillis();
               --gf.ava().dea;
               ab.ama();
               return;
            case -70:
               var35 = var1.aaa().readUTF();
               ab.aaa(ex.aaa(er.rza, "#", var35), new ca(er.cma, ab.aja, 88842, (Object)null), new ca(er.cza, ab.aja, 8882, (Object)null));
               return;
            case -67:
               ac var12 = null;

               try {
                  var12 = ac.aaa(var1.aaa().readUnsignedByte());
               } catch (Exception var24) {
               }

               if (var12 != null) {
                  if ((var2 = var1.aaa().readInt()) == fz.ala().asa) {
                     gf.bda.addElement(new cd(var12.ada, var12.aea, fz.ala()));
                  } else if ((var34 = gf.aea(var2)) != null) {
                     gf.bda.addElement(new cd(var12.ada, var12.aea, var34));
                     return;
                  }

                  return;
               }

               return;
            case -66:
               var2 = var1.aaa().readInt();
               if (fz.ala().asa == var2) {
                  gf.bda.addElement(new cd(fz.ala().ala, fz.ala().ama));
               } else if ((var34 = gf.aea(var2)) != null) {
                  gf.bda.addElement(new cd(var34.ala, var34.ama));
                  return;
               }

               return;
            case -62:
               fz.cha.aea = var1.aaa().readByte();
            }
         } catch (Exception var32) {
         }

      } finally {
         if (var1 != null) {
            var1.aca();
         }

      }
   }

   private static void afa(fe var0) {
      try {
         byte var1 = var0.ada.readByte();
         System.out.println("subcmd Notlogin: ".concat(String.valueOf(var1)));
         switch(var1) {
         case -124:
            System.out.println("SEND SMS");
            String var6 = var0.ada.readUTF();
            df.aaa(var0.ada.readUTF(), "sms://".concat(String.valueOf(var6)), new ca("", ab.aba(), 88825, (Object)null), new ca("", ab.aba(), 88826, (Object)null));
            break;
         case 2:
            fd.aaa();
         }
      } catch (Exception var4) {
      } finally {
         if (var0 != null) {
            var0.aca();
         }

      }

   }

   private static void aga(fe var0) {
      try {
         byte var1;
         bc var2;
         byte var3;
         int var4;
         gf var10000;
         int var30;
         byte var32;
         fz var33;
         Integer var35;
         short var37;
         short var40;
         bu var43;
         bg var44;
         int var45;
         String var47;
         gm var48;
         bu var51;
         fz var55;
         switch(var0.aaa().readByte()) {
         case -128:
            if ((var33 = gf.aea(var0.aaa().readInt())) != null) {
               var33.bba = var0.aaa().readInt();
               var33.bea = var0.aaa().readInt();
               var33.aya = var0.aaa().readUnsignedByte();
               return;
            }

            return;
         case -127:
            gf.bla.removeAllElements();
            gf.bma.removeAllElements();
            gf.bla();
            gf.dsa = fz.ala();
            fz.ala().asa = var0.aaa().readInt();
            fz.ala().cfa = var0.aaa().readUTF();
            if (!fz.ala().cfa.equals("")) {
               fz.ala().cga = var0.aaa().readByte();
            }

            fz.ala().aua = var0.aaa().readByte();
            fz.ala().ata = var0.aaa().readByte();
            fz.ala().gsa = var0.aaa().readShort();
            fz.ala().ava = var0.aaa().readByte();
            fz.ala().cea = var0.aaa().readUTF();
            fz.ala().dka = var0.aaa().readByte();
            fz.ala().dla = var0.aaa().readByte();
            fz.ala().bea = var0.aaa().readInt();
            fz.ala().bba = var0.aaa().readInt();
            fz.ala().baa = var0.aaa().readInt();
            fz.ala().aza = var0.aaa().readInt();
            fz.ala().aja = var0.aaa().readLong();
            fz.ala().aka = var0.aaa().readLong();
            gf.aaa(fz.ala().aja);
            fz.ala().bfa = var0.aaa().readShort();
            fz.ala().bga = var0.aaa().readShort();
            fz.ala().cua = gf.bqa[var0.aaa().readByte()];
            fz.ala().bia = var0.aaa().readShort();
            fz.ala().cda[0] = var0.aaa().readShort();
            fz.ala().cda[1] = var0.aaa().readShort();
            fz.ala().cda[2] = var0.aaa().readInt();
            fz.ala().cda[3] = var0.aaa().readInt();
            fz.ala().bja = var0.aaa().readShort();
            fz.ala().cva.removeAllElements();
            fz.ala().cwa.removeAllElements();
            var1 = var0.aaa().readByte();

            for(var3 = 0; var3 < var1; ++var3) {
               var2 = bb.aaa(var0.aaa().readShort());
               if (fz.ala().cya == null) {
                  fz.ala().cya = var2;
               }

               if (Code.aba != null && Auto.aqa != null && var2.aaa.aaa == Auto.aqa.aaa.aaa) {
                  Auto.aqa = var2;
               }

               fz.ala().cva.addElement(var2);
               if ((var2.aaa.ada == 1 || var2.aaa.ada == 4 || var2.aaa.ada == 2 || var2.aaa.ada == 3) && (var2.aaa.aca == 0 || var2.aaa.aca > 0 && var2.aca > 0)) {
                  if (var2.aaa.aaa == 0) {
                     gm.aaa().afa(0);
                  }

                  fz.ala().cwa.addElement(var2);
               }
            }

            gf.bga();
            fz.ala().cqa = var0.aaa().readInt();
            fz.ala().csa = var0.aaa().readInt();
            fz.ala().cta = var0.aaa().readInt();
            fz.ala().daa = new gg[var0.aaa().readUnsignedByte()];
            gf.axa = 0;
            gf.aya = 0;

            short var52;
            for(var4 = 0; var4 < fz.ala().daa.length; ++var4) {
               if ((var52 = var0.aaa().readShort()) != -1) {
                  fz.ala().daa[var4] = new gg();
                  fz.ala().daa[var4].ana = 3;
                  fz.ala().daa[var4].ada = var4;
                  fz.ala().daa[var4].aaa = gi.aaa(var52);
                  fz.ala().daa[var4].aga = var0.aaa().readBoolean();
                  if (fz.ala().daa[var4].aba() || fz.ala().daa[var4].aca() || fz.ala().daa[var4].ada()) {
                     fz.ala().daa[var4].aia = var0.aaa().readByte();
                  }

                  fz.ala().daa[var4].aoa = var0.aaa().readBoolean();
                  fz.ala().daa[var4].aea = var0.aaa().readUnsignedShort();
                  if (fz.ala().daa[var4].aaa.aba == 16) {
                     gf.aya += fz.ala().daa[var4].aea;
                  }

                  if (fz.ala().daa[var4].aaa.aba == 17) {
                     gf.axa += fz.ala().daa[var4].aea;
                  }

                  if (fz.ala().daa[var4].aaa.aaa == 340) {
                     var10000 = gf.ava();
                     var10000.dea += fz.ala().daa[var4].aea;
                  }
               }
            }

            Code.aka();
            fz.ala().dca = new gg[16];

            try {
               fz.ala().aqa();

               for(var4 = 0; var4 < fz.ala().dca.length; ++var4) {
                  if ((var52 = var0.aaa().readShort()) != -1) {
                     gh var53;
                     var1 = (var53 = gi.aaa(var52)).aba;
                     fz.ala().dca[var1] = new gg();
                     fz.ala().dca[var1].ada = var1;
                     fz.ala().dca[var1].ana = 5;
                     fz.ala().dca[var1].aaa = var53;
                     fz.ala().dca[var1].aga = true;
                     fz.ala().dca[var1].aia = var0.aaa().readByte();
                     fz.ala().dca[var1].aha = var0.aaa().readByte();
                     if (var1 == 1) {
                        fz.ala().gva = fz.ala().dca[var1].aaa.aha;
                     } else if (var1 == 2) {
                        fz.ala().gua = fz.ala().dca[var1].aaa.aha;
                     } else if (var1 == 6) {
                        fz.ala().gta = fz.ala().dca[var1].aaa.aha;
                     }
                  }
               }
            } catch (Exception var27) {
               var27.printStackTrace();
            }

            fz.ala().aea = var0.aaa().readBoolean();
            fz.ala().afa = var0.aaa().readBoolean();
            short[] var54;
            if ((var54 = new short[]{var0.aaa().readShort(), var0.aaa().readShort(), var0.aaa().readShort(), var0.aaa().readShort()})[0] >= 0) {
               fz.ala().gsa = var54[0];
            }

            if (var54[1] >= 0) {
               fz.ala().gva = var54[1];
            }

            if (var54[2] >= 0) {
               fz.ala().gua = var54[2];
            }

            if (var54[3] >= 0) {
               fz.ala().gta = var54[3];
            }

            if (fz.ala().aea) {
               gf.aga();
            } else if (fz.ala().afa) {
               gf.aha();
            }

            fz.ala().aqa = 4;
            gf.dia = fd.ada(fz.ala().cea + "vci") > 0;
            return;
         case -126:
            fz.ala().aaa(var0);
            fz.ala().cda[0] = var0.aaa().readShort();
            fz.ala().cda[1] = var0.aaa().readShort();
            fz.ala().cda[2] = var0.aaa().readInt();
            fz.ala().cda[3] = var0.aaa().readInt();
            fz.ala().aca(61);
            fz.ala().cua = gf.bqa[var0.aaa().readByte()];
            fz.ala().bja = var0.aaa().readShort();
            fz.ala().bia = var0.aaa().readShort();
            fz.ala().cva.removeAllElements();
            fz.ala().cwa.removeAllElements();
            fz.ala().cya = null;
            return;
         case -125:
            fz.ala().aaa(var0);
            if (fz.ala().aqa != 14 && fz.ala().aqa != 5) {
               fz.ala().bba = fz.ala().bea;
               fz.ala().aza = fz.ala().baa;
            }

            try {
               fz.ala().bja = var0.aaa().readShort();
               fz.ala().cva.removeAllElements();
               fz.ala().cwa.removeAllElements();
               var1 = var0.aaa().readByte();

               for(var32 = 0; var32 < var1; ++var32) {
                  bc var49 = bb.aaa(var0.aaa().readShort());
                  if (fz.ala().cya == null) {
                     fz.ala().cya = var49;
                  } else if (var49.aaa.equals(fz.ala().cya.aaa)) {
                     fz.ala().cya = var49;
                  }

                  if (Code.aba != null && Auto.aqa != null && var49.aaa.aaa == Auto.aqa.aaa.aaa) {
                     Auto.aqa = var49;
                  }

                  fz.ala().cva.addElement(var49);
                  if ((var49.aaa.ada == 1 || var49.aaa.ada == 4 || var49.aaa.ada == 2 || var49.aaa.ada == 3) && (var49.aaa.aca == 0 || var49.aaa.aca > 0 && var49.aca > 0)) {
                     fz.ala();
                     if (var49.aaa.aaa == 0) {
                        var48 = gm.aaa();
                        fz.ala();
                        var48.afa(0);
                     }

                     fz.ala().cwa.addElement(var49);
                  }
               }

               gf.bga();
               if (gf.doa) {
                  gf.bsa = -1;
                  gf.ava().bra();
               }

               System.out.println("LOAD XONG ME LOAD SKILL " + fz.ala().cva.size());
            } catch (Exception var26) {
               var26.printStackTrace();
            }

            gj.awa();
            return;
         case -124:
            fz.ala().aaa(var0);
            fz.ala().aja = var0.aaa().readLong();
            gf.aaa(fz.ala().aja);
            fz.ala().bja = var0.aaa().readShort();
            fz.ala().bia = var0.aaa().readShort();
            fz.ala().cda[0] = var0.aaa().readShort();
            fz.ala().cda[1] = var0.aaa().readShort();
            fz.ala().cda[2] = var0.aaa().readInt();
            fz.ala().cda[3] = var0.aaa().readInt();
            return;
         case -123:
            fz.ala().cqa = var0.aaa().readInt();
            fz.ala().csa = var0.aaa().readInt();
            fz.ala().cta = var0.aaa().readInt();
            fz.ala().bba = var0.aaa().readInt();
            fz.ala().aza = var0.aaa().readInt();
            if (var0.aaa().readByte() == 1) {
               gf.ava().bua();
               fz.ala().aga = true;
            } else {
               fz.ala().aga = false;
               gj.aka();
            }

            return;
         case -122:
            fz.ala().bba = var0.aaa().readInt();
            return;
         case -121:
            fz.ala().aza = var0.aaa().readInt();
            return;
         case -120:
            System.out.println("PLAYER LOAD ALL");
            if ((var33 = gf.aea(var0.aaa().readInt())) != null) {
               aaa(var33, var0);
            }

            return;
         case -119:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            return;
         case -117:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            var33.bfa = var0.aaa().readShort();
            var33.bga = var0.aaa().readShort();
            var33.gva = var0.aaa().readShort();
            if (var33.gva == -1) {
               var33.ara();
            }

            return;
         case -116:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            var33.bfa = var0.aaa().readShort();
            var33.bga = var0.aaa().readShort();
            var33.gua = var0.aaa().readShort();
            if (var33.gua == -1) {
               var33.asa();
            }

            return;
         case -113:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            var33.bfa = var0.aaa().readShort();
            var33.bga = var0.aaa().readShort();
            var33.gta = var0.aaa().readShort();
            if (var33.gta == -1) {
               var33.ata();
            }

            return;
         case -112:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            var33.bfa = var0.aaa().readShort();
            var33.bga = var0.aaa().readShort();
            return;
         case -111:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            return;
         case -110:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            var33.ala = var33.gga = var0.aaa().readShort();
            var33.ama = var33.gha = var0.aaa().readShort();
            var33.aqa = 1;
            ef.aaa(20, var33, 2);
            return;
         case -109:
            fz.ala().aaa(var0);
            if (fz.ala().aqa != 14 && fz.ala().aqa != 5) {
               fz.ala().bba = fz.ala().bea;
               fz.ala().aza = fz.ala().baa;
            }

            fz.ala().bia = var0.aaa().readShort();
            fz.ala().cda[0] = var0.aaa().readShort();
            fz.ala().cda[1] = var0.aaa().readShort();
            fz.ala().cda[2] = var0.aaa().readInt();
            fz.ala().cda[3] = var0.aaa().readInt();
            gj.aya();
            return;
         case -107:
            fz.ala().ana();
            return;
         case -106:
            fz.ala().aoa();
            return;
         case -105:
            var45 = var0.aaa().readInt();
            var55 = fz.ala();
            var55.cqa -= var45;
            var55 = fz.ala();
            var55.cra += var45;
            return;
         case -104:
            var30 = var0.aaa().readInt();
            var55 = fz.ala();
            var55.cra -= var30;
            var55 = fz.ala();
            var55.cqa += var30;
            return;
         case -102:
            fz.ala().daa[var0.aaa().readByte()] = null;
            var2 = bb.aaa(var0.aaa().readShort());
            fz.ala().cva.addElement(var2);
            if ((var2.aaa.ada == 1 || var2.aaa.ada == 4 || var2.aaa.ada == 2 || var2.aaa.ada == 3) && (var2.aaa.aca == 0 || var2.aaa.aca > 0 && var2.aca > 0)) {
               fz.ala();
               if (var2.aaa.aaa == 0) {
                  var48 = gm.aaa();
                  fz.ala();
                  var48.afa(0);
               }

               fz.ala().cwa.addElement(var2);
            }

            gf.bga();
            gf.ava();
            gf.aaa(var2);
            gf.ava().bra();
            be.aaa(er.qia + " " + var2.aaa.aba);
            return;
         case -101:
            var51 = new bu(var0.aaa().readByte(), (int)(System.currentTimeMillis() / 1000L) - var0.aaa().readInt(), var0.aaa().readInt(), var0.aaa().readShort());
            fz.ala().cxa.addElement(var51);
            if (var51.aea.aba == 7) {
               var55 = fz.ala();
               var55.dha += var51.ada;
               return;
            }

            if (var51.aea.aba != 12 && var51.aea.aba != 11) {
               if (var51.aea.aba == 14) {
                  ab.aka();
                  ab.ala();
                  fz.ala().ala = var0.aaa().readShort();
                  fz.ala().ama = var0.aaa().readShort();
                  fz.ala().aqa = 1;
                  fz.ala().gla = true;
                  ef.aba(76, fz.ala(), var51.aca);
                  return;
               } else if (var51.aea.aba == 1) {
                  ef.aba(48, fz.ala(), var51.aca);
                  return;
               } else {
                  if (var51.aea.aba == 2) {
                     ab.aka();
                     ab.ala();
                     fz.ala().ala = var0.aaa().readShort();
                     fz.ala().ama = var0.aaa().readShort();
                     fz.ala().aqa = 1;
                     fz.ala().gla = true;
                     fz.ala().gma = true;
                  } else if (var51.aea.aba == 3) {
                     ab.aka();
                     ab.ala();
                     fz.ala().ala = var0.aaa().readShort();
                     fz.ala().ama = var0.aaa().readShort();
                     fz.ala().aqa = 1;
                     fz.gka = true;
                     ef.aba(43, fz.ala(), var51.aca);
                     return;
                  }

                  return;
               }
            }

            fz.ala().eea = true;
            ef.aaa(60, fz.ala().ala, fz.ala().ama, 1);
            return;
         case -100:
            var44 = bu.aaa[var0.aaa().readByte()];

            for(var30 = 0; var30 < fz.ala().cxa.size(); ++var30) {
               if ((var43 = (bu)fz.ala().cxa.elementAt(var30)).aea.aba == var44.aba) {
                  if (var43.aea.aba == 7) {
                     var55 = fz.ala();
                     var55.dha -= var43.ada;
                  }

                  var43.aea = var44;
                  var43.aba = (int)(System.currentTimeMillis() / 1000L) - var0.aaa().readInt();
                  var43.aca = var0.aaa().readInt() / 1000;
                  var43.ada = var0.aaa().readShort();
                  if (var43.aea.aba == 7) {
                     var55 = fz.ala();
                     var55.dha += var43.ada;
                  }
                  break;
               }
            }

            if (!gf.doa) {
               gf.ava().bca();
            }

            return;
         case -99:
            var3 = var0.aaa().readByte();
            var43 = null;

            for(var30 = 0; var30 < fz.ala().cxa.size(); ++var30) {
               if ((var43 = (bu)fz.ala().cxa.elementAt(var30)).aea.aaa == var3) {
                  if (var43.aea.aba == 7) {
                     var55 = fz.ala();
                     var55.dha -= var43.ada;
                  }

                  fz.ala().cxa.removeElementAt(var30);
                  break;
               }
            }

            if (var43.aea.aba != 0 && var43.aea.aba != 12) {
               if (var43.aea.aba != 4 && var43.aea.aba != 13 && var43.aea.aba != 17) {
                  if (var43.aea.aba == 23) {
                     fz.ala().bba = var0.aaa().readInt();
                     fz.ala().bea = var0.aaa().readInt();
                     return;
                  } else if (var43.aea.aba == 11) {
                     fz.ala().eea = false;
                     ef.aaa(60, fz.ala().ala, fz.ala().ama, 1);
                     return;
                  } else if (var43.aea.aba == 14) {
                     fz.ala().gla = false;
                     return;
                  } else {
                     if (var43.aea.aba == 2) {
                        fz.ala().gla = false;
                        fz.ala().gma = false;
                        ef.aaa(77, fz.ala().ala, fz.ala().ama - 9, 1);
                     } else if (var43.aea.aba == 3) {
                        fz.gka = false;
                        return;
                     }

                     return;
                  }
               }

               fz.ala().bba = var0.aaa().readInt();
               return;
            }

            fz.ala().bba = var0.aaa().readInt();
            fz.ala().aza = var0.aaa().readInt();
            if (var43.aea.aba == 0) {
               be.aaa(er.oaa);
            } else if (var43.aea.aba == 12) {
               fz.ala().eea = false;
               ef.aaa(60, fz.ala().ala, fz.ala().ama, 1);
               return;
            }

            return;
         case -98:
            try {
               if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
                  return;
               }

               var51 = new bu(var0.aaa().readByte(), (int)(System.currentTimeMillis() / 1000L) - var0.aaa().readInt(), var0.aaa().readInt(), var0.aaa().readShort());
               var33.cxa.addElement(var51);
               if (var51.aea.aba != 12 && var51.aea.aba != 11) {
                  if (var51.aea.aba == 14) {
                     var33.ala = var33.gga = var0.aaa().readShort();
                     var33.ama = var33.gha = var0.aaa().readShort();
                     var33.aqa = 1;
                     ef.aba(76, var33, var51.aca);
                     return;
                  } else if (var51.aea.aba == 1) {
                     ef.aba(48, var33, var51.aca);
                     return;
                  } else {
                     if (var51.aea.aba == 2) {
                        var33.ala = var33.gga = var0.aaa().readShort();
                        var33.ama = var33.gha = var0.aaa().readShort();
                        var33.aqa = 1;
                        var33.gma = true;
                     } else if (var51.aea.aba == 3) {
                        var33.ala = var33.gga = var0.aaa().readShort();
                        var33.ama = var33.gha = var0.aaa().readShort();
                        var33.aqa = 1;
                        ef.aba(43, var33, var51.aca);
                        return;
                     }

                     return;
                  }
               }

               var33.eea = true;
               ef.aaa(60, var33.ala, var33.ama, 1);
            } catch (Exception var24) {
            }

            return;
         case -97:
            try {
               if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
                  return;
               }

               var44 = bu.aaa[var0.aaa().readByte()];

               for(var30 = 0; var30 < var33.cxa.size(); ++var30) {
                  var43 = (bu)var33.cxa.elementAt(var30);
                  if (var44.aba == var44.aba) {
                     var43.aea = var44;
                     var43.aba = (int)(System.currentTimeMillis() / 1000L) - var0.aaa().readInt();
                     var43.aca = var0.aaa().readInt() / 1000;
                     var43.ada = var0.aaa().readShort();
                     return;
                  }
               }

               return;
            } catch (Exception var23) {
               return;
            }
         case -96:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var3 = var0.aaa().readByte();
            var51 = null;

            for(var4 = 0; var4 < var33.cxa.size(); ++var4) {
               if ((var51 = (bu)var33.cxa.elementAt(var4)).aea.aaa == var3) {
                  var33.cxa.removeElementAt(var4);
                  break;
               }
            }

            if (var51 == null) {
               return;
            }

            if (var51.aea.aba == 0) {
               var33.bba = var0.aaa().readInt();
               var33.aza = var0.aaa().readInt();
               return;
            }

            if (var51.aea.aba == 11) {
               var33.ala = var33.gga = var0.aaa().readUnsignedShort();
               var33.ama = var33.gha = var0.aaa().readUnsignedShort();
               var33.eea = false;
               ef.aaa(60, var33.ala, var33.ama, 1);
               return;
            }

            if (var51.aea.aba == 12) {
               var33.bba = var0.aaa().readInt();
               var33.aza = var0.aaa().readInt();
               var33.eea = false;
               ef.aaa(60, var33.ala, var33.ama, 1);
               return;
            }

            if (var51.aea.aba != 4 && var51.aea.aba != 13 && var51.aea.aba != 17) {
               if (var51.aea.aba == 23) {
                  fz.ala().bba = var0.aaa().readInt();
                  fz.ala().bea = var0.aaa().readInt();
               } else if (var51.aea.aba == 2) {
                  var33.gma = false;
                  ef.aaa(77, var33.ala, var33.ama - 9, 1);
                  return;
               }

               return;
            }

            var33.bba = var0.aaa().readInt();
            return;
         case -95:
            gf.ava().fea = var0.aaa().readInt();
            gf.ava().ffa = (int)(System.currentTimeMillis() / 1000L);
            return;
         case -94:
            var3 = var0.aaa().readByte();
            av var39;
            (var39 = (av)gf.boa.elementAt(var3)).aqa = var0.aaa().readByte();
            if (var39.aaa.aaa == 31 && var39.aqa == 15) {
               gf.aaa(var39.ala, var39.ama);
            }

            return;
         case -92:
            if ((var30 = var0.aaa().readInt()) == fz.ala().asa) {
               var33 = fz.ala();
            } else {
               var33 = gf.aea(var30);
            }

            if (var33 != null) {
               var33.dla = var0.aaa().readByte();
               Auto.aba(var33);
               if (var33 == fz.ala()) {
                  if (var33.dla == 4) {
                     gf.gwa = true;
                  } else if (var33.dla == 5) {
                     gf.gwa = false;
                     return;
                  }

                  return;
               }
            }

            return;
         case -91:
            gg[] var50 = new gg[var0.aaa().readUnsignedByte()];

            for(var30 = 0; var30 < fz.ala().daa.length; ++var30) {
               var50[var30] = fz.ala().daa[var30];
            }

            fz.ala().daa = var50;
            fz.ala().daa[var0.aaa().readUnsignedByte()] = null;
            be.aaa(er.fma + " " + fz.ala().daa.length + " " + er.gga);
            return;
         case -90:
            for(var30 = 0; var30 < gf.boa.size(); ++var30) {
               av var42;
               if ((var42 = (av)gf.boa.elementAt(var30)).aqa == 15) {
                  var42.aqa = 1;
                  break;
               }
            }

            if ((var1 = var0.aaa().readByte()) == 1) {
               be.aaa(er.fna, 20, fw.ala);
            } else if (var1 == 2) {
               be.aaa(er.foa, 20, fw.ala);
               return;
            }

            return;
         case -89:
            ab.aea = false;

            try {
               be.aaa(var0.aaa().readUTF(), 20, fw.ala);
            } catch (Exception var19) {
            }

            br.aca();
            ab.ama();
            return;
         case -87:
            var32 = var0.aaa().readByte();
            ep var41 = (ep)gf.bfa.elementAt(var32);
            ev var56 = gf.bfa;
            var56.setElementAt(var56.elementAt(0), var32);
            gf.bfa.setElementAt(var41, 0);
            gf.ava().baa();
            be.aaa(var41.ada + er.pba, 20, fw.ala);
            return;
         case -86:
            gf.bfa.removeAllElements();
            gf.ava().baa();
            be.aaa(er.pca, 20, fw.ala);
            Code.aha = null;
            return;
         case -85:
            gf.bha.removeAllElements();

            try {
               while(true) {
                  gf.bha.addElement(new aq(var0.aaa().readUTF(), var0.aaa().readByte()));
               }
            } catch (Exception var22) {
               for(var30 = 0; var30 < gf.bja.size(); ++var30) {
                  gf.bha.addElement(gf.bja.elementAt(var30));
               }

               gf.ava();
               gf.aca((int)0);
               return;
            }
         case -84:
            gf.bka.removeAllElements();

            try {
               while(true) {
                  gf.bka.addElement(new aq(var0.aaa().readUTF(), var0.aaa().readByte()));
               }
            } catch (Exception var21) {
               gf.ava();
               gf.aca((int)1);
               return;
            }
         case -83:
            var47 = var0.aaa().readUTF();

            for(var45 = 0; var45 < gf.bha.size(); ++var45) {
               if (((aq)gf.bha.elementAt(var45)).aaa.equals(var47)) {
                  gf.bsa = 0;
                  gf.bha.removeElementAt(var45);
                  gf.ava();
                  gf.aba(var47);
                  break;
               }
            }

            if (gf.dma) {
               gf.ava();
               gf.aca((int)0);
               gf.bsa = 0;
               gf.bxa.aaa();
            }

            return;
         case -82:
            var47 = var0.aaa().readUTF();

            for(var45 = 0; var45 < gf.bka.size(); ++var45) {
               if (((aq)gf.bka.elementAt(var45)).aaa.equals(var47)) {
                  gf.bsa = 0;
                  gf.bka.removeElementAt(var45);
                  break;
               }
            }

            gf.ava();
            gf.aca((int)1);
            return;
         case -81:
            fz.ala().dka = var0.aaa().readByte();
            fz.ala().dsa = null;
            return;
         case -80:
            fz.ala().dca[var0.aaa().readByte()] = null;
            return;
         case -78:
            ef.aaa(var0.aaa().readShort(), fz.ala().ala, fz.ala().ama, 1);
            return;
         case -77:
            try {
               gf.bga.removeAllElements();

               while(true) {
                  gf.bga.addElement(new ep(var0.aaa().readByte(), var0.aaa().readUnsignedByte(), var0.aaa().readUTF(), var0.aaa().readByte()));
               }
            } catch (Exception var20) {
               gf.ava().aza();
               return;
            }
         case -76:
            ((ep)gf.bfa.firstElement()).aea = var0.aaa().readBoolean();
            return;
         case -75:
            fz.ala().dba[var0.aaa().readByte()] = null;
            return;
         case -74:
            br.aaa(var0.aaa().readUTF());
            return;
         case -73:
            ac var46 = ac.aaa(var0.aaa().readUnsignedByte());
            ef.aaa(67, var46.ada, var46.aea, 1);
            return;
         case -72:
            fz.ala().cta = var0.aaa().readInt();
            return;
         case -71:
            var30 = var0.aaa().readInt();
            var55 = fz.ala();
            var55.cta += var30;
            gf.aaa("+".concat(String.valueOf(var30)), fz.ala().ala, fz.ala().ama - fz.ala().cja - 10, 6);
            be.aaa(er.loa + " " + var30 + " " + er.ira, 20, fw.ala);
            return;
         case -69:
            var4 = var0.aaa().readUnsignedByte();
            var1 = var0.aaa().readByte();
            if (var4 > 0) {
               var40 = (short)fz.ala().ala;
               var37 = (short)(fz.ala().ama - 40);
               fz.ala().dqa = new ac((short)-1, false, false, false, false, false, var4, 1, 0, 0, 0, var40, var37, (byte)4, (byte)0, var1 != 0, false);
               fz.ala().dqa.aga = 5;
            } else {
               fz.ala().dqa = null;
            }

            return;
         case -68:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var4 = var0.aaa().readUnsignedByte();
            var1 = var0.aaa().readByte();
            if (var4 > 0) {
               var37 = (short)var33.ala;
               var40 = (short)(var33.ama - 40);
               var33.dqa = new ac((short)-1, false, false, false, false, false, var4, 1, 0, 0, 0, var37, var40, (byte)4, (byte)0, var1 != 0, false);
               var33.dqa.aga = 5;
            } else {
               var33.dqa = null;
            }

            return;
         case -65:
            String var5 = var0.aaa().readUTF();
            byte[] var38 = new byte[var0.aaa().readInt()];
            var0.aaa().read(var38);
            if (var38.length == 0) {
               var38 = null;
            }

            try {
               var0.aaa().readByte();
            } catch (Exception var18) {
               var18.printStackTrace();
            }

            if (var5.equals("KSkill")) {
               gf.ava();
               gf.aba(var38);
               return;
            } else {
               if (var5.equals("OSkill")) {
                  gf.ava();
                  gf.aaa(var38);
               } else if (var5.equals("CSkill")) {
                  gf.ava();
                  gf.aca(var38);
                  return;
               }

               return;
            }
         case -64:
            if ((var33 = gf.aea(var0.aaa().readInt())) == null) {
               return;
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            var33.bfa = var0.aaa().readShort();
            var33.bga = var0.aaa().readShort();
            var33.gsa = var0.aaa().readShort();
            return;
         case -63:
            if ((var33 = gf.aea(var35 = new Integer(var0.aaa().readInt()))) != null) {
               ab.aaa(var33.cea + " " + er.aaa(er.mxa, var0.aaa().readUTF()), 88830, var35, 88811, (Object)null);
            }

            return;
         case -62:
            var30 = var0.aaa().readInt();
            if (fz.ala().asa == var30) {
               fz.ala().cfa = var0.aaa().readUTF();
               fz.ala().cga = var0.aaa().readByte();
               fz.ala().aca(21);
            } else {
               (var33 = gf.aea(var30)).cfa = var0.aaa().readUTF();
               var33.cga = var0.aaa().readByte();
            }

            return;
         case -61:
            if (gf.dia && (var33 = gf.aea(var35 = new Integer(var0.aaa().readInt()))) != null) {
               ab.aaa(var33.cea + " " + er.mya, 88831, var35, 88811, (Object)null);
            }

            return;
         case -59:
            if ((var30 = var0.aaa().readInt()) == fz.ala().asa) {
               var33 = fz.ala();
            } else {
               var33 = gf.aea(var30);
            }

            var33.bba = var0.aaa().readInt();
            var33.bea = var0.aaa().readInt();
            return;
         case -58:
            gf.ava().bca();
            ab.bma = 70;
            ab.ada = true;
            ef.aaa(119, gf.ada + gf.aia, gf.afa + gf.aja, 1);
            return;
         case -57:
            ab.bma = 40;
            ab.ada = true;
            return;
         case -56:
            if ((var33 = gf.aea(var0.aaa().readInt())) != null) {
               var33.bba = var0.aaa().readInt();
               var33.bea = var0.aaa().readInt();
               var33.gwa = (short)var0.aaa().readUnsignedShort();
            }

            return;
         case -55:
            if ((var33 = gf.aea(var0.aaa().readInt())) != null) {
               var33.bba = var0.aaa().readInt();
               var33.bea = var0.aaa().readInt();
               var33.gxa = (short)var0.aaa().readUnsignedShort();
            }

            return;
         case -54:
            var30 = var0.aaa().readInt();
            if (fz.ala().asa == var30) {
               var33 = fz.ala();
            } else {
               var33 = gf.aea(var30);
            }

            if (var33 == null) {
               return;
            }

            var33.dda = new gg[5];
            var33.coa = var33.cna = var33.cpa = false;

            for(var30 = 0; var30 < var33.dda.length; ++var30) {
               if ((var37 = var0.aaa().readShort()) != -1) {
                  var33.dda[var30] = new gg();
                  var33.dda[var30].ana = 41;
                  var33.dda[var30].ada = var30;
                  var33.dda[var30].aaa = gi.aaa(var37);
                  var33.dda[var30].aia = var0.aaa().readByte();
                  var33.dda[var30].afa = var0.aaa().readLong();
                  var33.dda[var30].aha = var0.aaa().readByte();
                  var33.dda[var30].aga = true;
                  if (var30 == 4) {
                     if (var33.dda[var30].aaa.aaa != 485 && var33.dda[var30].aaa.aaa != 524) {
                        if (var33.dda[var30].aaa.aaa == 443 || var33.dda[var30].aaa.aaa == 523) {
                           var33.coa = true;
                        }
                     } else {
                        var33.cpa = true;
                     }
                  }

                  var3 = var0.aaa().readByte();
                  var33.dda[var30].aba = new ev();

                  for(var4 = 0; var4 < var3; ++var4) {
                     var33.dda[var30].aba.addElement(new bq(var0.aaa().readByte(), var0.aaa().readInt()));
                  }
               }
            }

            return;
         case 115:
            System.out.println("UPDATE INFO ME");
            gf.dsa = fz.ala();
            fz.ala().hha = null;
            fz.ala().asa = var0.aaa().readInt();
            fz.ala().cfa = var0.aaa().readUTF();
            if (!fz.ala().cfa.equals("")) {
               fz.ala().cga = var0.aaa().readByte();
            }

            fz.ala().aua = var0.aaa().readByte();
            fz.ala().ata = var0.aaa().readByte();
            fz.ala().gsa = var0.aaa().readShort();
            fz.ala().ava = var0.aaa().readByte();
            fz.ala().cea = var0.aaa().readUTF();
            fz.ala().dka = var0.aaa().readByte();
            fz.ala().dla = var0.aaa().readByte();
            fz.ala().bea = var0.aaa().readInt();
            fz.ala().bba = var0.aaa().readInt();
            fz.ala().baa = var0.aaa().readInt();
            fz.ala().aza = var0.aaa().readInt();
            fz.ala().aja = var0.aaa().readLong();
            fz.ala().aka = var0.aaa().readLong();
            gf.aaa(fz.ala().aja);
            fz.ala().bfa = var0.aaa().readShort();
            fz.ala().bga = var0.aaa().readShort();
            fz.ala().cua = gf.bqa[var0.aaa().readByte()];
            fz.ala().bia = var0.aaa().readShort();
            fz.ala().cda[0] = var0.aaa().readShort();
            fz.ala().cda[1] = var0.aaa().readShort();
            fz.ala().cda[2] = var0.aaa().readInt();
            fz.ala().cda[3] = var0.aaa().readInt();
            fz.ala().bja = var0.aaa().readShort();
            fz.ala().cva.removeAllElements();
            fz.ala().cwa.removeAllElements();
            var1 = var0.aaa().readByte();

            for(var3 = 0; var3 < var1; ++var3) {
               var2 = bb.aaa(var0.aaa().readShort());
               if (fz.ala().cya == null) {
                  fz.ala().cya = var2;
               }

               if (Code.aba != null && Auto.aqa != null && var2.aaa.aaa == Auto.aqa.aaa.aaa) {
                  Auto.aqa = var2;
               }

               fz.ala().cva.addElement(var2);
               if ((var2.aaa.ada == 1 || var2.aaa.ada == 4 || var2.aaa.ada == 2 || var2.aaa.ada == 3) && (var2.aaa.aca == 0 || var2.aaa.aca > 0 && var2.aca > 0)) {
                  if (var2.aaa.aaa == 0) {
                     gm.aaa().afa(0);
                  }

                  fz.ala().cwa.addElement(var2);
               }
            }

            gf.bga();
            fz.ala().cqa = var0.aaa().readInt();
            fz.ala().csa = var0.aaa().readInt();
            fz.ala().cta = var0.aaa().readInt();
            fz.ala().daa = new gg[var0.aaa().readUnsignedByte()];
            gf.axa = 0;
            gf.aya = 0;

            short var31;
            for(var30 = 0; var30 < fz.ala().daa.length; ++var30) {
               if ((var31 = var0.aaa().readShort()) != -1) {
                  fz.ala().daa[var30] = new gg();
                  fz.ala().daa[var30].ana = 3;
                  fz.ala().daa[var30].ada = var30;
                  fz.ala().daa[var30].aaa = gi.aaa(var31);
                  fz.ala().daa[var30].aga = var0.aaa().readBoolean();
                  if (fz.ala().daa[var30].aba() || fz.ala().daa[var30].aca() || fz.ala().daa[var30].ada()) {
                     fz.ala().daa[var30].aia = var0.aaa().readByte();
                  }

                  fz.ala().daa[var30].aoa = var0.aaa().readBoolean();
                  fz.ala().daa[var30].aea = var0.aaa().readUnsignedShort();
                  if (fz.ala().daa[var30].aaa.aba == 16) {
                     gf.aya += fz.ala().daa[var30].aea;
                  }

                  if (fz.ala().daa[var30].aaa.aba == 17) {
                     gf.axa += fz.ala().daa[var30].aea;
                  }

                  if (fz.ala().daa[var30].aaa.aaa == 340) {
                     var10000 = gf.ava();
                     var10000.dea += fz.ala().daa[var30].aea;
                  }
               }
            }

            Code.aka();
            fz.ala().dca = new gg[16];

            try {
               fz.ala().aqa();

               for(var30 = 0; var30 < fz.ala().dca.length; ++var30) {
                  if ((var31 = var0.aaa().readShort()) != -1) {
                     gh var34;
                     var32 = (var34 = gi.aaa(var31)).aba;
                     fz.ala().dca[var32] = new gg();
                     fz.ala().dca[var32].ada = var32;
                     fz.ala().dca[var32].ana = 5;
                     fz.ala().dca[var32].aaa = var34;
                     fz.ala().dca[var32].aga = true;
                     fz.ala().dca[var32].aia = var0.aaa().readByte();
                     fz.ala().dca[var32].aha = var0.aaa().readByte();
                     if (var32 == 1) {
                        fz.ala().gva = fz.ala().dca[var32].aaa.aha;
                     } else if (var32 == 2) {
                        fz.ala().gua = fz.ala().dca[var32].aaa.aha;
                     } else if (var32 == 6) {
                        fz.ala().gta = fz.ala().dca[var32].aaa.aha;
                     }
                  }
               }
            } catch (Exception var25) {
               var25.printStackTrace();
            }

            fz.ala().aea = var0.aaa().readBoolean();
            fz.ala().afa = var0.aaa().readBoolean();
            short[] var36;
            if ((var36 = new short[]{var0.aaa().readShort(), var0.aaa().readShort(), var0.aaa().readShort(), var0.aaa().readShort()})[0] >= 0) {
               fz.ala().gsa = var36[0];
            }

            if (var36[1] >= 0) {
               fz.ala().gva = var36[1];
            }

            if (var36[2] >= 0) {
               fz.ala().gua = var36[2];
            }

            if (var36[3] >= 0) {
               fz.ala().gta = var36[3];
            }

            gf.ava();
            gf.bga();
            if (fz.ala().aea) {
               gf.ava();
               gf.aga();
            } else if (fz.ala().afa) {
               gf.ava();
               gf.aha();
            }

            fz.ala().aqa = 4;
            gf.dia = fd.ada(fz.ala().cea + "vci") > 0;
            return;
         default:
            return;
         }
      } catch (Exception var28) {
      } finally {
         if (var0 != null) {
            var0.aca();
         }

      }

   }

   private static boolean aaa(fz var0, fe var1) {
      try {
         var0.cfa = var1.ada.readUTF();
         if (!var0.cfa.equals("")) {
            var0.cga = var1.ada.readByte();
         }

         var0.eea = var1.ada.readBoolean();
         var0.dla = var1.ada.readByte();
         var0.cua = gf.bqa[var1.ada.readByte()];
         var0.ata = var1.ada.readByte();
         var0.gsa = var1.ada.readShort();
         var0.cea = var1.ada.readUTF();
         var0.bba = var1.ada.readInt();
         var0.bea = var1.ada.readInt();
         var0.aya = var1.ada.readUnsignedByte();
         var0.gva = var1.ada.readShort();
         var0.gua = var1.ada.readShort();
         var0.gta = var1.ada.readShort();
         byte var2 = var1.ada.readByte();
         if (var0.gva == -1) {
            var0.gva = 15;
         }

         if (var0.gua == -1) {
            var0.asa();
         }

         if (var0.gta == -1) {
            var0.ata();
         }

         if (var2 == -1) {
            var0.dqa = null;
         } else {
            short var3 = (short)var0.ala;
            short var4 = (short)(var0.ama - 40);
            var0.dqa = new ac((short)-1, false, false, false, false, false, var2, 1, 0, 0, 0, var3, var4, (byte)4, (byte)0, false, false);
            var0.dqa.aga = 5;
         }

         var0.ala = var0.gga = var1.ada.readShort();
         var0.ama = var0.gha = var1.ada.readShort();
         var0.bfa = var1.ada.readShort();
         var0.bga = var1.ada.readShort();
         byte var10 = var1.ada.readByte();

         int var12;
         for(var12 = 0; var12 < var10; ++var12) {
            bu var7 = new bu(var1.ada.readByte(), var1.ada.readInt(), var1.ada.readInt(), var1.ada.readShort());
            var0.cxa.addElement(var7);
            if (var7.aea.aba == 12 || var7.aea.aba == 11) {
               var0.eea = true;
            }
         }

         if (!var0.eea) {
            ef.aaa(60, var0, 1);
         }

         if (var0.bba == 0) {
            var0.aqa = 14;
            if (fz.ala().asa == var0.asa) {
               gf.ava().bca();
            }
         }

         if (var0.asa == -fz.ala().asa) {
            for(var12 = 0; var12 < gf.boa.size(); ++var12) {
               av var8;
               if ((var8 = (av)gf.boa.elementAt(var12)).aaa.aba.equals(var0.cea)) {
                  var8.aqa = 15;
                  var8.aia = null;
                  break;
               }
            }
         }

         var0.aea = var1.ada.readBoolean();
         var0.afa = var1.ada.readBoolean();
         if (var0.afa) {
            ef.aaa(141, var0.ala, var0.ama, 0);
         }

         short[] var9;
         if ((var9 = new short[]{var1.ada.readShort(), var1.ada.readShort(), var1.ada.readShort(), var1.ada.readShort()})[0] >= 0) {
            var0.gsa = var9[0];
         }

         if (var9[1] >= 0) {
            var0.gva = var9[1];
         }

         if (var9[2] >= 0) {
            var0.gua = var9[2];
         }

         if (var9[3] >= 0) {
            var0.gta = var9[3];
         }

         for(int var6 = 0; var6 < gf.bfa.size(); ++var6) {
            ep var11;
            if ((var11 = (ep)gf.bfa.elementAt(var6)).aaa == var0.asa) {
               var11.afa = var0;
               break;
            }
         }

         return true;
      } catch (Exception var5) {
         return false;
      }
   }

   private static void aha(fe var0) {
      try {
         byte var1;
         gg var3;
         var1 = var0.ada.readByte();
         int var2 = var0.ada.readUnsignedByte();
         var3 = null;
         label186:
         switch(var1) {
         case 2:
            var3 = gf.cma[var2];
            break;
         case 3:
            if ((var3 = fz.ala().daa[var2]) != null) {
               break;
            }

            if (gf.dga != null && gf.dga.ada == var2) {
               var3 = gf.dga;
            }

            if (gf.dfa != null && gf.dfa.ada == var2) {
               var3 = gf.dfa;
            }

            if (gf.dha != null && gf.dha.ada == var2) {
               var3 = gf.dha;
            }

            int var4;
            if (var3 == null && gf.cxa != null) {
               for(var4 = 0; var4 < gf.cxa.length; ++var4) {
                  if (gf.cxa[var4] != null && gf.cxa[var4].ada == var2) {
                     var3 = gf.cxa[var4];
                     break;
                  }
               }
            }

            if (var3 == null && gf.dba != null) {
               for(var4 = 0; var4 < gf.dba.length; ++var4) {
                  if (gf.dba[var4] != null && gf.dba[var4].ada == var2) {
                     var3 = gf.dba[var4];
                     break;
                  }
               }
            }

            if (var3 == null && gf.cwa != null) {
               for(var4 = 0; var4 < gf.cwa.length; ++var4) {
                  if (gf.cwa[var4] != null && gf.cwa[var4].ada == var2) {
                     var3 = gf.cwa[var4];
                     break;
                  }
               }
            }

            if (var3 == null && gf.cza != null) {
               for(var4 = 0; var4 < gf.cza.length; ++var4) {
                  if (gf.cza[var4] != null && gf.cza[var4].ada == var2) {
                     var3 = gf.cza[var4];
                     break;
                  }
               }
            }

            if (var3 != null || gf.cya == null) {
               break;
            }

            var4 = 0;

            while(true) {
               if (var4 >= gf.cya.length) {
                  break label186;
               }

               if (gf.cya[var4] != null && gf.cya[var4].ada == var2) {
                  var3 = gf.cya[var4];
                  break label186;
               }

               ++var4;
            }
         case 4:
            var3 = fz.ala().dba[var2];
            break;
         case 5:
            var3 = fz.ala().dca[var2];
            break;
         case 6:
            var3 = gf.cna[var2];
            break;
         case 7:
            var3 = gf.coa[var2];
            break;
         case 8:
            var3 = gf.cpa[var2];
            break;
         case 9:
            var3 = gf.cqa[var2];
         case 10:
         case 11:
         case 12:
         case 13:
         case 31:
         case 33:
         case 36:
         case 37:
         case 38:
         default:
            break;
         case 14:
            var3 = gf.cra[var2];
            break;
         case 15:
            var3 = gf.cua[var2];
            break;
         case 16:
            var3 = gf.cia[var2];
            break;
         case 17:
            var3 = gf.cja[var2];
            break;
         case 18:
            var3 = gf.cka[var2];
            break;
         case 19:
            var3 = gf.cla[var2];
            break;
         case 20:
            var3 = gf.bya[var2];
            break;
         case 21:
            var3 = gf.bza[var2];
            break;
         case 22:
            var3 = gf.caa[var2];
            break;
         case 23:
            var3 = gf.cba[var2];
            break;
         case 24:
            var3 = gf.cca[var2];
            break;
         case 25:
            var3 = gf.cda[var2];
            break;
         case 26:
            var3 = gf.cea[var2];
            break;
         case 27:
            var3 = gf.cfa[var2];
            break;
         case 28:
            var3 = gf.cga[var2];
            break;
         case 29:
            var3 = gf.cha[var2];
            break;
         case 30:
            var3 = gf.daa[var2];
            break;
         case 32:
            var3 = gf.cva[var2];
            break;
         case 34:
            var3 = gf.cta[var2];
            break;
         case 35:
            var3 = gf.csa[var2];
            break;
         case 39:
            var3 = fz.cha.apa[gf.bra];
         }

         var3.afa = var0.ada.readLong();
         if (var3.aha()) {
            var3.ama = var0.ada.readInt();
         } else if (var3.aja() || var3.aka() || var3.ala() || var3.ama() || var3.ana() || var3.aoa()) {
            var3.aja = var0.ada.readInt();
            var3.aka = var0.ada.readInt();
            var3.ala = var0.ada.readInt();
         }

         if (!var3.aba() && !var3.aca() && !var3.ada()) {
            if (var3.aaa.aaa == 233) {
               var3.ara = aaa(ex.aba(var0));
            } else if (var3.aaa.aaa == 234) {
               var3.ara = aaa(ex.aba(var0));
            } else if (var3.aaa.aaa == 235) {
               var3.ara = aaa(ex.aba(var0));
            }
         } else {
            var3.aha = var0.ada.readByte();
            var3.aba = new ev();

            try {
               while(true) {
                  var3.aba.addElement(new bq(var0.ada.readByte(), var0.ada.readInt()));
               }
            } catch (Exception var5) {
            }
         }

         var3.asa = true;
         if (var1 == 5) {
            fz.ala().bca();
            return;
         }
      } catch (Exception var6) {
         var6.printStackTrace();
         System.out.println("Controller.requestItemInfo()");
      }

      gj.aua();
   }

   private static void aia(fe var0) {
      try {
         byte var1 = var0.ada.readByte();

         for(byte var2 = 0; var2 < var1; ++var2) {
            short var3 = (short)var0.ada.readUnsignedByte();
            boolean var4 = var0.ada.readBoolean();
            boolean var5 = var0.ada.readBoolean();
            boolean var6 = var0.ada.readBoolean();
            boolean var7 = var0.ada.readBoolean();
            boolean var8 = var0.ada.readBoolean();
            int var9 = var0.ada.readUnsignedByte();
            byte var10 = var0.ada.readByte();
            int var11 = var0.ada.readInt();
            int var12 = var0.ada.readUnsignedByte();
            int var13 = var0.ada.readInt();
            short var14 = var0.ada.readShort();
            short var15 = var0.ada.readShort();
            byte var16 = var0.ada.readByte();
            byte var17 = var0.ada.readByte();
            boolean var18 = var0.ada.readBoolean();
            gf.aaa((ac)(new ac(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, true)), (int)var2);
         }

      } catch (Exception var19) {
         var19.printStackTrace();
         System.out.println("err addMob");
      }
   }

   private static void aja(fe var0) {
      try {
         short var1 = (short)var0.ada.readUnsignedByte();
         short var2 = var0.ada.readShort();
         short var3 = var0.ada.readShort();
         byte var4 = var0.ada.readByte();
         short var6 = var0.ada.readShort();
         ek.aaa(var1, var2, var3, var4, var6, 1);
      } catch (Exception var5) {
         var5.printStackTrace();
         System.out.println("err add effAuto");
      }
   }

   private static void aka(fe var0) {
      try {
         short var1 = (short)var0.ada.readUnsignedByte();
         short var2 = var0.ada.readShort();
         byte[] var3 = null;
         if (var2 > 0) {
            var3 = new byte[var2];
            var0.ada.read(var3);
         }

         ek.aaa(var1, var3);
      } catch (Exception var4) {
         var4.printStackTrace();
         System.out.println("err add effAuto");
      }
   }

   private static void ala(fe var0) {
      try {
         byte var1 = (byte)var0.ada.readUnsignedByte();
         byte[] var3 = ex.aaa(var0);
         ek.aaa(var1, var3);
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("err getImgEffAuto");
      }
   }

   private static void ama(fe var0) {
      try {
         byte var1 = var0.ada.readByte();
         fz.ala().cta = var0.ada.readInt();
         fz.ala().cqa = var0.ada.readInt();
         fz.ala().csa = var0.ada.readInt();
         int var3;
         if (var1 == 0) {
            if (gf.dga != null) {
               gf.dga = null;
            }

            if (gf.cya != null) {
               for(var3 = 0; var3 < gf.cya.length; ++var3) {
                  gf.cya[var3] = null;
               }
            }
         } else if (var1 == 1) {
            if (gf.dga != null) {
               gf.dga.aga = true;
               gf.dga.aia = var0.ada.readByte();
               gf.gma = gf.bca[53];
               gf.gla = 0;
            }

            if (gf.cya != null) {
               for(var3 = 0; var3 < gf.cya.length; ++var3) {
                  gf.cya[var3] = null;
               }
            }
         } else if ((var1 == 2 || var1 == 3) && gf.cya != null) {
            for(var3 = 0; var3 < gf.cya.length; ++var3) {
               gf.cya[var3] = null;
            }
         }

         gf.ava().ala = gf.ava().ama = null;
         gf.ava().bja();
         ab.ama();
      } catch (Exception var2) {
         var2.printStackTrace();
         System.out.println("err getImgEffAuto");
      }
   }

   private static void ana(fe var0) {
      try {
         Object var1;
         int var2;
         if (var0.ada.readByte() == 1) {
            var1 = ac.aaa(var0.ada.readUnsignedByte());
         } else if ((var2 = var0.ada.readInt()) == fz.ala().asa) {
            var1 = fz.ala();
         } else {
            var1 = gf.aea(var2);
         }

         if (var1 != null) {
            short var3 = var0.ada.readShort();
            int var4 = var0.ada.readInt();
            byte var10 = var0.ada.readByte();
            long var5 = (long)var4 + System.currentTimeMillis();
            var2 = var10 * 1000;
            short var11 = var3;

            fy var12;
            for(var4 = 0; var4 < ((dz)var1).bda.size(); ++var4) {
               if ((var12 = (fy)((dz)var1).bda.elementAt(var4)) != null && var12.aea == var11) {
                  var12.aga = var5;
                  var12.aha = var2;
                  return;
               }
            }

            var12 = new fy(var11, var5, var2);
            ((dz)var1).bda.addElement(var12);
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }
   }

   private static void aoa(fe var0) {
      try {
         short var1 = (short)var0.ada.readUnsignedByte();
         byte[] var4 = ex.aaa(var0);
         bf.aaa(var1, var4);
         eh var2;
         if ((var2 = (eh)bf.aaa.get(String.valueOf(var1))) == null) {
            var2 = new eh();
            bf.aaa.put(String.valueOf(var1), var2);
         }

         var2.aaa = aaa(var4);
         if (Class_ab.aea != 1) {
            fd.aaa("ImgEffect ".concat(String.valueOf(var1)), var4);
            return;
         }
      } catch (Exception var3) {
         var3.printStackTrace();
         System.out.println("err getImgEffect");
      }

   }

   private static void apa(fe var0) {
      try {
         short var1 = (short)var0.ada.readUnsignedByte();
         short var2 = var0.ada.readShort();
         byte[] var3 = null;
         if (var2 > 0) {
            var3 = new byte[var2];
            var0.ada.read(var3);
         }

         fs var5;
         if ((var5 = (fs)bf.aba.get(String.valueOf(var1))) != null) {
            if (!var5.aha) {
               fy var6;
               (var6 = new fy()).aaa(var3);
               var5.aaa = var6.aaa;
               var5.aba = var6.aba;
               var5.aea = var6.aja;
               var5.afa = var6.aka;
               var5.ada = var6.ada;
               var5.aga = var6.afa;
               var5.aca = var6.aca;
               var5.aha = true;
            }

            return;
         }
      } catch (Exception var4) {
         var4.printStackTrace();
         System.out.println("err getDataEffect ");
      }

   }

   public static void afa() {
      aaa = null;
      aca = null;
      ada = null;
      aea = null;
      afa = null;
      aga = null;
      aha = null;
      aia = null;
   }
}
