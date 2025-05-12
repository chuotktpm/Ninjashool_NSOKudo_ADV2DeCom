public final class ADV extends Auto {
   private static int ada;
   private static int aea;
   private static int bha;
   private static int bia;
   private static int bja;
   private static boolean bka;
   public static gh aaa;
   public static gh aba;
   private static gg bla;
   private static gg bma;
   private static boolean bna;
   private static boolean boa;
   private static String bpa;
   private static String bqa;
   private static boolean bra;
   private static int bsa;
   private static boolean bta;
   private static int bua;
   public static boolean aca;
   private long bva;
   private static int bwa;

   public final void a_() {
      super.a_();
      ada = -2;
      aea = 0;
      bha = 0;
      bla = null;
      bma = null;
      bna = false;
      boa = false;
      bra = false;
   }

   public final void b_() {
      super.b_();
      if (bma != null) {
         if (bma.ana == 5) {
            bma = fz.ala().dca[bma.aaa.aba];
         } else if (bma.ana == 3) {
            bma = fz.ala().daa[bma.ada];
         } else if (bma.ana == 4) {
            bma = fz.ala().dba[bma.ada];
         } else {
            System.out.println("Loi reset itemNV");
         }
      }

      if (bla != null) {
         if (bla.ana == 5) {
            bla = fz.ala().dca[bla.aaa.aba];
            return;
         }

         if (bla.ana == 3) {
            bla = fz.ala().daa[bla.ada];
            return;
         }

         System.out.println("Loi reset itemBody");
      }

   }

   public static void aaa(String var0) {
      System.out.println("Text: ".concat(String.valueOf(var0)));
      if (ada >= 0) {
         System.out.println("A1");
         if (var0.contains("-") || var0.contains("Đã hủy nhiệm vụ ")) {
            System.out.println("A2");
            aaa = null;
            bna = false;
            ada = -1;
            gj.bga();
         }
      } else {
         if (ada == -2) {
            System.out.println("B1");
            if (var0.startsWith("- Có thể nhận thêm ")) {
               System.out.println("B2");
               aaa = null;
               ada = -1;
               gj.bga();
               return;
            }
         }

         System.out.println("C1");
         bna = false;
         String[] var1 = Code.aca(var0, "\n");
         System.out.println("Nhiệm vụ: " + var1[0]);
         int var2;
         gg var3;
         if (var1[0].equals("Tiêu diệt quái") && ge.aaa == 0 && ge.aaa == 0) {
            for(var2 = 0; var2 < fz.ala().daa.length; ++var2) {
               var3 = fz.ala().daa[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                  gm.aaa().aha(var3.ada, 1);
               }
            }

            ada = 1;
         } else if (var1[0].equals("Tiêu diệt tinh anh") && fz.fha && ge.aba == 0) {
            for(var2 = 0; var2 < fz.ala().daa.length; ++var2) {
               var3 = fz.ala().daa[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                  gm.aaa().aha(var3.ada, 1);
               }
            }

            ada = 2;
         } else if (var1[0].equals("Tiêu diệt thủ lĩnh") && fz.fia && ge.aca == 0) {
            for(var2 = 0; var2 < fz.ala().daa.length; ++var2) {
               var3 = fz.ala().daa[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                  gm.aaa().aha(var3.ada, 1);
               }
            }

            ada = 3;
         } else if (var1[0].equals("Nâng cấp vật phẩm") && ge.ada == 0) {
            for(var2 = 0; var2 < fz.ala().daa.length; ++var2) {
               var3 = fz.ala().daa[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 3) {
                  gm.aaa().aha(var3.ada, 1);
               }
            }

            ada = 4;
         } else {
            String[] var13;
            int var14;
            if (var1[0].equals("Chiến thắng lôi đài") && ge.aea == 0) {
               var13 = Code.aca(Code.bpa, ",");

               for(var14 = 0; var14 < var13.length; ++var14) {
                  Code.aaa(var13[var14], "lodai");
               }

               for(var14 = 0; var14 < fz.ala().daa.length; ++var14) {
                  gg var4 = fz.ala().daa[var14];
                  if (var4 != null && var4.aaa.aba == 26 && var4.aaa.aaa <= 4) {
                     gm.aaa().aha(var4.ada, 1);
                  }
               }

               ada = 5;
            } else if (var1[0].equals("Nông dân chăm chỉ") && ge.aia == 0) {
               for(var2 = 0; var2 < fz.ala().daa.length; ++var2) {
                  var3 = fz.ala().daa[var2];
                  if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                     gm.aaa().aha(var3.ada, 1);
                  }
               }

               ada = 6;
            } else if (!var1[0].equals("Cừu sát người khác")) {
               ada = 0;
            } else {
               for(var2 = 0; var2 < fz.ala().daa.length; ++var2) {
                  var3 = fz.ala().daa[var2];
                  if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                     gm.aaa().aha(var3.ada, 1);
                  }
               }

               if (ge.afa != 0) {
                  if (ge.afa == 2) {
                     Code.aga();
                  } else {
                     ada = 0;
                  }
               } else {
                  var13 = Code.aca(Code.bpa, ",");

                  for(var14 = 0; var14 < var13.length; ++var14) {
                     Code.aaa(var13[var14], "cusat");
                  }

                  ada = 7;
               }
            }
         }

         if (ada != 0) {
            String var16;
            String var17;
            String var5;
            String var6;
            int var15;
            if (ada < 4) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Tiêu diệt ")) {
                  fz.eoa = false;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(12).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + fz.ala().ata);
                     if ((aaa = gi.aaa(var16, (byte)fz.ala().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var11) {
                     gf.aca("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  gf.aca("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 4) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Nâng cấp ")) {
                  fz.eoa = true;
                  fz.fva = 4;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(11).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + fz.ala().ata);
                     if ((aaa = gi.aaa(var16, (byte)fz.ala().ata)) == null) {
                        throw new Exception();
                     }

                     if ((aba = gi.aaa("Giày Thô Ma", (byte)fz.ala().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var10) {
                     gf.aca("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  gf.aca("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 5) {
               label258: {
                  fz.eoa = false;
                  if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Chiến thắng ")) {
                     var16 = var1[1].substring(10, var1[1].length());
                     var15 = (var17 = var1[2].substring(14).trim()).indexOf(47);
                     var5 = var17.substring(0, var15);
                     var6 = var17.substring(var15 + 1, var17.indexOf(32));

                     try {
                        bia = Integer.parseInt(var5);
                        bja = Integer.parseInt(var6);
                        System.out.println("TB=" + var16 + " gender=" + fz.ala().ata);
                        if ((aaa = gi.aaa(var16, (byte)fz.ala().ata)) == null) {
                           throw new Exception();
                        }

                        System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                        if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                           bna = true;
                        } else {
                           Code.aga.aea();
                        }
                        break label258;
                     } catch (Exception var12) {
                     }
                  }

                  gf.aca("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 6) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Kiếm ")) {
                  fz.eoa = false;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(6).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + fz.ala().ata);
                     if ((aaa = gi.aaa(var16, (byte)fz.ala().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var9) {
                     gf.aca("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  gf.aca("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 7) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Cừu sát ")) {
                  fz.eoa = false;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(9).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + fz.ala().ata);
                     if ((aaa = gi.aaa(var16, (byte)fz.ala().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var8) {
                     gf.aca("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  gf.aca("Dừng Auto!");
                  boa = true;
               }
            }

            if (aaa != null && aaa.afa > fz.ala().aya) {
               ada = 0;
            }
         }

         gj.bga();
      }

   }

   public static boolean aba(String var0) {
      if (var0.equals(bqa)) {
         bra = true;
         return true;
      } else {
         if (var0.contains(bpa)) {
            if (ada >= 4 && ada != 6) {
               if (ada == 4) {
                  gm.aaa().aja(fz.ala().cea);
                  gj.ara();

                  for(int var1 = 0; var1 < fz.ala().daa.length; ++var1) {
                     gg var2 = fz.ala().daa[var1];
                     if (var2 != null && var2.aia == 8 && (fz.ala().daa[var1].aaa.aaa == 126 || fz.ala().daa[var1].aaa.aaa == 127)) {
                        gm.aaa().aaa(var2);
                        gj.ara();
                        gm.aaa().aja(fz.ala().cea);
                        gj.ara();
                        break;
                     }
                  }

                  bna = true;
               } else {
                  bna = true;
               }
            } else {
               bia = bja;
            }
         }

         if (var0.contains("Đã hết số lần dùng trong ngày hôm nay rồi.")) {
            bta = true;
         }

         if (var0.indexOf("- Kiếm") != -1 && ada == 6) {
            var0 = var0.substring(var0.indexOf("- Kiếm ") + 6, var0.indexOf(47));
            gf.aca("Yên: " + var0 + " / " + bja);

            try {
               bia = Integer.parseInt(var0);
            } catch (NumberFormatException var6) {
            }
         }

         if (var0.indexOf("- Cừu sát ") != -1 && ada == 7) {
            var0 = var0.substring(var0.indexOf("- Cừu sát ") + 9, var0.indexOf(47));
            gf.aca("Cừu Sát: " + var0 + " / " + bja);

            try {
               bia = Integer.parseInt(var0);
            } catch (NumberFormatException var5) {
            }

            if (bia < bja) {
               cs.aaa.ada();
               Controller.aea().aba();
            }
         }

         if (var0.indexOf("- Chiến thắng ") != -1 && ada == 5) {
            var0 = var0.substring(var0.indexOf("- Chiến thắng ") + 14, var0.indexOf(47));
            gf.aca("Chiến Thắng : " + var0 + " / " + bja + " trận");

            try {
               bia = Integer.parseInt(var0);
            } catch (NumberFormatException var4) {
            }
         }

         if (var0.indexOf("- Sử dụng ") != -1 && ada < 4) {
            var0 = var0.substring(var0.indexOf("Tiêu diệt") + 10, var0.indexOf(47));

            try {
               bsa = Integer.parseInt(var0);
            } catch (NumberFormatException var3) {
            }
         }

         return true;
      }
   }

   private static gg[] aaa(int var0, int var1) {
      switch(var0) {
      case 0:
         if (var1 == 1) {
            return gf.bya;
         }

         return gf.bza;
      case 1:
         return gf.cma;
      case 2:
         if (var1 == 1) {
            return gf.caa;
         }

         return gf.cba;
      case 3:
         return gf.cia;
      case 4:
         if (var1 == 1) {
            return gf.cca;
         }

         return gf.cda;
      case 5:
         return gf.cja;
      case 6:
         if (var1 == 1) {
            return gf.cea;
         }

         return gf.cfa;
      case 7:
         return gf.cka;
      case 8:
         if (var1 == 1) {
            return gf.cga;
         }

         return gf.cha;
      case 9:
         return gf.cla;
      default:
         return null;
      }
   }

   private boolean aha() {
      if (aaa.afa >= 50) {
         return true;
      } else if (!gn.afa(gn.aoa)) {
         this.aaa(Code.bqa, -2, -1, -1);
         return false;
      } else {
         System.out.println("Buy " + aaa.ada);
         gg[] var1 = aaa(aaa.aba, fz.ala().ata);
         if (aaa.aba == 1) {
            gf.aba(0, 0, 0);
         } else if (aaa.aba == 8) {
            gf.aba(1, 0, 4);
         } else if (aaa.aba == 6) {
            gf.aba(1, 0, 3);
         } else if (aaa.aba == 4) {
            gf.aba(1, 0, 2);
         } else if (aaa.aba == 2) {
            gf.aba(1, 0, 1);
         } else if (aaa.aba == 0) {
            gf.aba(1, 0, 0);
         } else if (aaa.aba == 9) {
            gf.aba(2, 0, 3);
         } else if (aaa.aba == 7) {
            gf.aba(2, 0, 2);
         } else if (aaa.aba == 5) {
            gf.aba(2, 0, 1);
         } else if (aaa.aba == 3) {
            gf.aba(2, 0, 0);
         }

         if (var1 == null) {
            gj.bfa();
            var1 = aaa(aaa.aba, fz.ala().ata);
         }

         if (var1 != null) {
            gg var2 = null;

            for(int var3 = 0; var3 < var1.length; ++var3) {
               if (var1[var3].aaa.aaa == aaa.aaa) {
                  var2 = var1[var3];
                  break;
               }
            }

            if (var2 != null) {
               gm.aaa().aba(var2.ana, var2.ada, 1);
               gj.aha();
            }
         } else {
            System.out.println("BuyER: " + aaa.aba);
         }

         return false;
      }
   }

   private boolean ara() {
      if (!gn.afa(gn.aoa)) {
         this.aaa(Code.bqa, -2, -1, -1);
         return false;
      } else {
         System.out.println("Buy Item Up" + aba.ada);
         gg[] var1 = aaa(aba.aba, fz.ala().ata);
         if (aba.aba == 8) {
            gf.aba(1, 0, 4);
         }

         if (var1 == null) {
            gj.bfa();
            var1 = aaa(aba.aba, fz.ala().ata);
         }

         if (var1 != null) {
            gg var2 = null;

            for(int var3 = 0; var3 < var1.length; ++var3) {
               if (var1[var3].aaa.aaa == aba.aaa) {
                  var2 = var1[var3];
                  break;
               }
            }

            if (var2 != null) {
               gm.aaa().aba(var2.ana, var2.ada, 1);
               gj.aha();
            }
         } else {
            System.out.println("BuyER: " + aba.aba);
         }

         return false;
      }
   }

   private boolean asa() {
      if (bma == null) {
         if ((bma = fz.afa(aaa.aaa)) == null) {
            if ((bma = fz.ala(aaa.aaa)) == null) {
               return this.aha();
            }

            System.out.println("ItemNV box type=" + bma.ana + " index=" + bma.ada);
            bka = true;
         } else {
            System.out.println("ItemNV bag type=" + bma.ana + " index=" + bma.ada);
         }

         return false;
      } else {
         if (bma.ana == 4) {
            gf.aba(5, 0, 0);
            if (fz.bja() > 0) {
               gm.aaa().aca(bma.ada);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var2) {
               }
            }
         } else {
            if (bla == null) {
               bla = fz.ala().dca[aaa.aba];
            }

            if (bla != null) {
               System.out.println("ItemBody type=" + bla.ana + " index=" + bla.ada);
            }

            gm.aaa().aea(bma.ada);
            gj.ara();
         }

         return false;
      }
   }

   protected final void aaa() {
      if (Auto.aka()) {
         Auto.aaa(false);
      } else if (bra) {
         gf.aca("Xong");
         if (super.aoa != null && !(super.aoa instanceof ADV)) {
            try {
               Thread.sleep(5000L);
            } catch (InterruptedException var15) {
            }

            Code.aca();
         } else {
            Code.aga();
         }
      } else {
         int var1;
         if (ada > 0 && !bna && !boa) {
            aj var18;
            int var19;
            short var20;
            if (ada < 4) {
               if (fz.ala().dca[aaa.aba] != null && fz.ala().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                  var19 = Code.bsa > 0 ? (var1 = Code.bsa) : ((var18 = fz.ama(0)) != null ? (var1 = var18.aga) : (var1 = -1));
                  var20 = (short)var1;
                  if (var19 <= 0) {
                     gf.aca("Chưa đặt map hoặc k có nvhn");
                     boa = true;
                     return;
                  }

                  if (gn.aoa != var20) {
                     this.aaa(var20, Code.bta, -1, -1);
                     return;
                  }

                  if (bia < bja) {
                     this.aca(-1, ada == 2 ? 3 : (ada == 3 ? 5 : 1));
                     this.ada(-1);
                     return;
                  }

                  bna = true;
                  Auto.ala();
               } else if (this.asa()) {
                  gf.aca("Thiếu item: " + aaa.ada);
                  boa = true;
               }
            } else {
               fz var2;
               gg var3;
               if (ada == 4 && ge.ada == 0) {
                  if (fz.ala().dca[aaa.aba] != null && fz.ala().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                     if ((var1 = fz.aia(aba.aaa)) < 0) {
                        if (this.ara()) {
                           gf.aca("Thiếu item: " + aba.ada);
                           boa = true;
                        }
                     } else if (bia < bja) {
                        var3 = (var2 = fz.ala()).daa[var1];
                        if (var3.aia == 8) {
                           gm.aaa().aaa(var3);
                           gj.ara();
                           gm.aaa().aja(fz.ala().cea);
                           gj.ara();
                        }

                        int var4 = 0;
                        int var5 = 0;
                        if (var3.ara()) {
                           var4 = gf.dva[var3.aia] / 3;
                           var5 = gf.dza[var3.aia];
                        } else if (var3.asa()) {
                           var4 = gf.dwa[var3.aia] / 3;
                           var5 = gf.eaa[var3.aia];
                        } else if (var3.ata()) {
                           var4 = gf.dxa[var3.aia] / 3;
                           var5 = gf.eba[var3.aia];
                        }

                        int var6;
                        for(var6 = 0; var6 < fz.ala().daa.length; ++var6) {
                           gg var7 = fz.ala().daa[var6];
                           if (var7 != null && var7.aaa.aba == 26 && (var7.aaa.aaa <= 2 || var7.aaa.aaa == 5)) {
                              gm.aaa().aha(var7.ada, 1);
                           }
                        }

                        int var8;
                        if (var4 << 1 <= fz.bia() && var5 << 1 <= var2.csa) {
                           if (gn.aoa != 22) {
                              if (!gn.ana(gn.aoa) && fz.ala().aua < 42) {
                                 Auto.ala();
                              }

                              this.aaa(22, -2, -1, -1);
                              return;
                           }

                           var6 = var3.aia;
                           gf.aba(6, 0, 0);
                           gj.ara();
                           gf.dfa = var3;

                           for(int var22 = 0; var22 < 1 && var3.aia == var6; ++var22) {
                              gf.cxa = new gg[18];
                              var8 = 0;
                              int var23 = 0;

                              for(int var10 = 0; var10 < var2.daa.length && var23 < var4; ++var10) {
                                 gg var11 = var2.daa[var10];
                                 if (var3.aia == 6 && ge.aga == 0) {
                                    if (fz.aia(242) < 0) {
                                       if (fz.ala().cta >= 10) {
                                          gm.aaa().aba(14, 23, 1);
                                          gj.aha();
                                       } else {
                                          gf.aca("Hết Lượng Mua BHSC");
                                       }
                                    } else {
                                       gf.cxa[2] = aea(242);
                                    }
                                 }

                                 if (var3.aia == 7 && ge.aha == 0) {
                                    if (fz.aia(242) < 0) {
                                       if (fz.ala().cta >= 10) {
                                          gm.aaa().aba(14, 23, 1);
                                          gj.aha();
                                       } else {
                                          gf.aca("Hết Lượng Mua BHSC");
                                       }
                                    } else {
                                       gf.cxa[6] = aea(242);
                                    }
                                 }

                                 if (var11 != null && var11.aaa.aba == 26 && var11.aaa.aaa == 4) {
                                    var2.daa[var10] = null;
                                    gf.cxa[var8++] = var11;
                                    var23 += gf.dva[var11.aaa.aaa];
                                 }
                              }

                              do {
                                 try {
                                    Thread.sleep(2000L);
                                 } catch (InterruptedException var14) {
                                 }

                                 gm.aaa().aaa(var3, gf.cxa);
                                 gm.aaa().aja(fz.ala().cea);
                                 gj.ara();
                              } while(gf.cxa[0] != null);
                           }

                           gf.dfa = null;
                        } else {
                           aj var21;
                           var8 = Code.bsa > 0 ? (var6 = Code.bsa) : ((var21 = fz.ama(0)) != null ? (var6 = var21.aga) : (var6 = -1));
                           short var9 = (short)var6;
                           if (var8 <= 0) {
                              gf.aca("Chưa đặt map hoặc k có nvhn");
                              boa = true;
                              return;
                           }

                           if (gn.aoa == var9) {
                              gb.aba();
                              this.ada(-2);
                              this.aca(-1, 1);
                              return;
                           }

                           this.aaa(var9, Code.bta, -1, -1);
                        }
                     }
                  } else if (this.asa()) {
                     gf.aca("Thiếu item: " + aaa.ada);
                     boa = true;
                  }
               }

               if (ada == 5 && ge.aea == 0) {
                  String[] var17 = Code.aca(Code.bpa, ",");

                  for(int var16 = 0; var16 < var17.length; ++var16) {
                     if (var17[var16] == null || var17[var16].length() == 0) {
                        gf.aca("Hãy chat ld để set thông tin");
                        boa = true;
                        return;
                     }

                     if (fz.ala().dca[aaa.aba] != null && fz.ala().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                        if (bia < bja) {
                           Code.aga.aaa();
                        }
                     } else if (this.asa()) {
                        gf.aca("Thiếu item: " + aaa.ada);
                        boa = true;
                     }
                  }
               }

               if (ada == 6 && ge.aia == 0) {
                  if (fz.ala().dca[aaa.aba] != null && fz.ala().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                     var19 = Code.bsa > 0 ? (var1 = Code.bsa) : ((var18 = fz.ama(0)) != null ? (var1 = var18.aga) : (var1 = -1));
                     var20 = (short)var1;
                     if (var19 <= 0) {
                        gf.aca("Chưa đặt map hoặc k có nvhn");
                        boa = true;
                        return;
                     }

                     if (gn.aoa != var20) {
                        this.aaa(var20, Code.bta, -1, -1);
                        return;
                     }

                     if (bia < bja) {
                        this.aca(-1, this.aaa(fz.fga, fz.fha, fz.fia));
                        this.ada(-1);
                        return;
                     }

                     bna = true;
                     Auto.ala();
                  } else if (this.asa()) {
                     gf.aca("Thiếu item: " + aaa.ada);
                     boa = true;
                  }
               }

               if (ada == 7) {
                  if (ge.afa == 0) {
                     if (fz.ala().dca[aaa.aba] != null && fz.ala().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                        if (gn.aoa != dm.aba) {
                           this.aaa(dm.aba, dm.aca, -1, -1);
                           return;
                        }

                        if (bia < bja) {
                           for(var1 = 0; var1 < gf.bla.size(); ++var1) {
                              var2 = (fz)gf.bla.elementAt(var1);
                              if (fz.ala().aya - 10 <= var2.aya && var2.aya <= fz.ala().aya + 10 && var2.bba > 0) {
                                 if (System.currentTimeMillis() - this.bva >= 1500L) {
                                    fz.aca(var2.ala, var2.ama);
                                    this.bva = System.currentTimeMillis();
                                 }

                                 if (fz.ala().dla != 3) {
                                    gm.aaa().awa(3);
                                 }

                                 if (fz.ala().dka >= 5 && (var3 = fz.afa(257)) != null && var3.aaa.aaa == 257) {
                                    gm.aaa().aea(var3.ada);
                                 }

                                 Auto.aya.removeAllElements();
                                 Auto.aza.removeAllElements();
                                 Auto.aza.addElement(var2);
                                 gm.aaa().afa(aqa.aaa.aaa);
                                 gm.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
                                 if (System.currentTimeMillis() - aqa.afa >= (long)aqa.aea + 50L) {
                                    aqa.afa = System.currentTimeMillis();
                                    aqa.ala = true;
                                    if (!Code.bfa) {
                                       fz.ala().aba(gf.aza[aqa.aaa.aaa], 0);
                                    }
                                 }
                              }
                           }

                           return;
                        }

                        bna = true;
                        Auto.ala();
                     } else if (this.asa()) {
                        gf.aca("Thiếu item: " + aaa.ada);
                        boa = true;
                     }
                  } else {
                     ada = 0;
                  }
               }
            }
         } else {
            if (!gn.afa(gn.aoa)) {
               this.aaa(Code.bqa, -2, -1, -1);
               return;
            }

            if (ada == -2) {
               System.out.println("InfoNV");
               gf.aca("Xem Info NVDV " + (aea + 1));
               aea();
               if (fz.aia(705) > 0 && !bta) {
                  for(var1 = 0; var1 < 5; ++var1) {
                     gm.aaa().aea(fz.aia(705));
                  }
               }

               if (fz.aia(35) < 0 && fz.aia(37) < 0) {
                  if (fz.ala().cta >= 20) {
                     gm.aaa().aba(14, 1, 1);
                  } else {
                     gm.aaa().aba(9, 6, 1);
                  }
               }

               gf.aba(2, 1, 6);
               gj.bfa();
               return;
            }

            if (ada == -1) {
               System.out.println("NhanNV");
               gf.aca("Nhận NVDV " + (aea + 1));
               if (fz.aia(705) > 0 && !bta) {
                  for(var1 = 0; var1 < 5; ++var1) {
                     gm.aaa().aea(fz.aia(705));
                  }
               }

               if (fz.aia(35) < 0 && fz.aia(37) < 0) {
                  if (fz.ala().cta >= 20) {
                     gm.aaa().aba(14, 1, 1);
                  } else {
                     gm.aaa().aba(9, 6, 1);
                  }
               }

               gf.aba(2, 1, 0);
               aea();
               gj.bfa();
               return;
            }

            if (ada == 0) {
               System.out.println("HuyNV");
               gf.aca("Hủy NVDV " + (aea + 1));
               gf.aba(2, 1, 2);
               gf.aha(2);
               gm.aaa().ana(4);
               gj.bfa();
               ++aea;
               return;
            }

            if (boa || bna) {
               if (bla != null) {
                  if (bla.ana != 5) {
                     System.out.println("Mac TB: " + bla.aaa.ada + " index=" + bla.ada);
                     gm.aaa().aea(bla.ada);
                     gj.ara();
                     bla = null;
                     return;
                  }

                  if (fz.ala().dca[bla.aaa.aba].aia < 12) {
                     System.out.println("Loi item: " + bla.aaa.aba);
                  }

                  bla = null;
               } else if (bma != null) {
                  if (!bka) {
                     bma = null;
                     return;
                  }

                  if (bma.ana == 3) {
                     System.out.println("Cat item " + bma.aaa.ada + " vao ruong");
                     gf.aba(5, 0, 0);
                     if (fz.bka() > 0) {
                        gm.aaa().ada(bma.ana);

                        try {
                           Thread.sleep(1000L);
                           return;
                        } catch (InterruptedException var12) {
                           return;
                        }
                     }

                     bma = null;
                     return;
                  }

                  bma = null;
               } else if (bna) {
                  if (fz.bja() <= 0) {
                     gf.aca("Hành trang đầy");
                     return;
                  }

                  System.out.println("HoanThanhNV");
                  if (fz.ala().dla == 3) {
                     gm.aaa().awa(0);
                  }

                  gf.aca("Hoàn thành NVDV " + (aea + 1));
                  gf.aba(2, 1, 1);
                  gj.bfa();
                  ++aea;
                  ++bha;
                  ++bwa;
               } else if (super.aoa != null && !(super.aoa instanceof ADV)) {
                  try {
                     Thread.sleep(5000L);
                  } catch (InterruptedException var13) {
                  }

                  Code.aca();
               }
            }
         }

      }
   }

   public static void aea() {
      for(int var0 = 0; var0 < fz.ala().daa.length; ++var0) {
         gg var1 = fz.ala().daa[var0];
         if (var1 != null && var1.aaa.afa < 50 && var1.aaa.aba < 10 && var1.aia == 0) {
            gm.aaa().aha(var1.ada, 1);
         }
      }

   }

   public final String toString() {
      if (ada == 1) {
         return " - Đánh quái thường: " + bsa + "/" + bua + " | Đã làm được: " + bwa + " NV";
      } else if (ada == 2) {
         return " - Đánh tinh anh: " + bsa + "/" + bua + " | Đã làm được: " + bwa + " NV";
      } else if (ada == 3) {
         return " - Đánh thủ lĩnh: " + bsa + "/" + bua + " | Đã làm được: " + bwa + " NV";
      } else if (ada == 4) {
         return " - Nâng cấp: " + bsa + "/" + bua + " | Đã làm được: " + bwa + " NV";
      } else if (ada == 5) {
         return " - Lôi đài | Đã làm được: " + bwa + " NV";
      } else if (ada == 6) {
         return " - Kiếm: " + bua + " Yên | Đã làm được: " + bwa + " NV";
      } else {
         return ada == 7 ? " - Cừu sát: " + bsa + "/" + bua + " người | Đã làm được: " + bwa + " NV" : "NVDV ";
      }
   }

   public static gg aea(int var0) {
      for(int var1 = 0; var1 < fz.ala().daa.length; ++var1) {
         gg var2 = fz.ala().daa[var1];
         if (var2 != null && var2.aaa.aba == 28 && var2.aaa.aaa == var0) {
            return var2;
         }
      }

      return null;
   }

   public static void afa() {
      bsa = 0;
      bua = 0;
      ada = -2;
      aea = -1;
      bha = -1;
      bia = -1;
      bja = -1;
      bka = false;
      bna = false;
      boa = false;
      bra = false;
      bpa = "Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ";
      bqa = "Con đã hoàn thành đủ số nhiệm vụ cho ngày hôm nay rồi";
   }

   static {
      aa.aaa(64);
      afa();
   }

   public static void aga() {
      ada = 0;
      aea = 0;
      bha = 0;
      bia = 0;
      bja = 0;
      bka = false;
      aaa = null;
      aba = null;
      bla = null;
      bma = null;
      bna = false;
      boa = false;
      bpa = null;
      bqa = null;
      bra = false;
      bsa = 0;
      bta = false;
      bua = 0;
      aca = false;
      bwa = 0;
   }
}
