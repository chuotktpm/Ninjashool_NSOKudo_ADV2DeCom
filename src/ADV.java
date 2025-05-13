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
            bma = Char.getMyChar().dca[bma.aaa.aba];
         } else if (bma.ana == 3) {
            bma = Char.getMyChar().arrItemBag[bma.ada];
         } else if (bma.ana == 4) {
            bma = Char.getMyChar().dba[bma.ada];
         } else {
            System.out.println("Loi reset itemNV");
         }
      }

      if (bla != null) {
         if (bla.ana == 5) {
            bla = Char.getMyChar().dca[bla.aaa.aba];
            return;
         }

         if (bla.ana == 3) {
            bla = Char.getMyChar().arrItemBag[bla.ada];
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
            LockGame.bga();
         }
      } else {
         if (ada == -2) {
            System.out.println("B1");
            if (var0.startsWith("- Có thể nhận thêm ")) {
               System.out.println("B2");
               aaa = null;
               ada = -1;
               LockGame.bga();
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
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               var3 = Char.getMyChar().arrItemBag[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                  Service.aaa().aha(var3.ada, 1);
               }
            }

            ada = 1;
         } else if (var1[0].equals("Tiêu diệt tinh anh") && Char.fha && ge.aba == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               var3 = Char.getMyChar().arrItemBag[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                  Service.aaa().aha(var3.ada, 1);
               }
            }

            ada = 2;
         } else if (var1[0].equals("Tiêu diệt thủ lĩnh") && Char.fia && ge.aca == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               var3 = Char.getMyChar().arrItemBag[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                  Service.aaa().aha(var3.ada, 1);
               }
            }

            ada = 3;
         } else if (var1[0].equals("Nâng cấp vật phẩm") && ge.ada == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               var3 = Char.getMyChar().arrItemBag[var2];
               if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 3) {
                  Service.aaa().aha(var3.ada, 1);
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

               for(var14 = 0; var14 < Char.getMyChar().arrItemBag.length; ++var14) {
                  gg var4 = Char.getMyChar().arrItemBag[var14];
                  if (var4 != null && var4.aaa.aba == 26 && var4.aaa.aaa <= 4) {
                     Service.aaa().aha(var4.ada, 1);
                  }
               }

               ada = 5;
            } else if (var1[0].equals("Nông dân chăm chỉ") && ge.aia == 0) {
               for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
                  var3 = Char.getMyChar().arrItemBag[var2];
                  if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                     Service.aaa().aha(var3.ada, 1);
                  }
               }

               ada = 6;
            } else if (!var1[0].equals("Cừu sát người khác")) {
               ada = 0;
            } else {
               for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
                  var3 = Char.getMyChar().arrItemBag[var2];
                  if (var3 != null && var3.aaa.aba == 26 && var3.aaa.aaa <= 4) {
                     Service.aaa().aha(var3.ada, 1);
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
                  Char.eoa = false;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(12).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + Char.getMyChar().ata);
                     if ((aaa = gi.aaa(var16, (byte)Char.getMyChar().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var11) {
                     GameScr.chatPopup("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  GameScr.chatPopup("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 4) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Nâng cấp ")) {
                  Char.eoa = true;
                  Char.fva = 4;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(11).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + Char.getMyChar().ata);
                     if ((aaa = gi.aaa(var16, (byte)Char.getMyChar().ata)) == null) {
                        throw new Exception();
                     }

                     if ((aba = gi.aaa("Giày Thô Ma", (byte)Char.getMyChar().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var10) {
                     GameScr.chatPopup("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  GameScr.chatPopup("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 5) {
               label258: {
                  Char.eoa = false;
                  if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Chiến thắng ")) {
                     var16 = var1[1].substring(10, var1[1].length());
                     var15 = (var17 = var1[2].substring(14).trim()).indexOf(47);
                     var5 = var17.substring(0, var15);
                     var6 = var17.substring(var15 + 1, var17.indexOf(32));

                     try {
                        bia = Integer.parseInt(var5);
                        bja = Integer.parseInt(var6);
                        System.out.println("TB=" + var16 + " gender=" + Char.getMyChar().ata);
                        if ((aaa = gi.aaa(var16, (byte)Char.getMyChar().ata)) == null) {
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

                  GameScr.chatPopup("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 6) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Kiếm ")) {
                  Char.eoa = false;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(6).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + Char.getMyChar().ata);
                     if ((aaa = gi.aaa(var16, (byte)Char.getMyChar().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var9) {
                     GameScr.chatPopup("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  GameScr.chatPopup("Dừng Auto!");
                  boa = true;
               }
            } else if (ada == 7) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Cừu sát ")) {
                  Char.eoa = false;
                  var16 = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(9).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + var16 + " gender=" + Char.getMyChar().ata);
                     if ((aaa = gi.aaa(var16, (byte)Char.getMyChar().ata)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + aaa.aaa + " type=" + aaa.aba + " name=" + aaa.ada + " mumb: " + var5 + " max: " + var6);
                     if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                        bna = true;
                     }
                  } catch (Exception var8) {
                     GameScr.chatPopup("Dừng Auto!");
                     boa = true;
                  }
               } else {
                  GameScr.chatPopup("Dừng Auto!");
                  boa = true;
               }
            }

            if (aaa != null && aaa.afa > Char.getMyChar().aya) {
               ada = 0;
            }
         }

         LockGame.bga();
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
                  Service.aaa().aja(Char.getMyChar().cea);
                  LockGame.ara();

                  for(int var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
                     gg var2 = Char.getMyChar().arrItemBag[var1];
                     if (var2 != null && var2.aia == 8 && (Char.getMyChar().arrItemBag[var1].aaa.aaa == 126 || Char.getMyChar().arrItemBag[var1].aaa.aaa == 127)) {
                        Service.aaa().aaa(var2);
                        LockGame.ara();
                        Service.aaa().aja(Char.getMyChar().cea);
                        LockGame.ara();
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
            GameScr.chatPopup("Yên: " + var0 + " / " + bja);

            try {
               bia = Integer.parseInt(var0);
            } catch (NumberFormatException var6) {
            }
         }

         if (var0.indexOf("- Cừu sát ") != -1 && ada == 7) {
            var0 = var0.substring(var0.indexOf("- Cừu sát ") + 9, var0.indexOf(47));
            GameScr.chatPopup("Cừu Sát: " + var0 + " / " + bja);

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
            GameScr.chatPopup("Chiến Thắng : " + var0 + " / " + bja + " trận");

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
            return GameScr.bya;
         }

         return GameScr.bza;
      case 1:
         return GameScr.cma;
      case 2:
         if (var1 == 1) {
            return GameScr.caa;
         }

         return GameScr.cba;
      case 3:
         return GameScr.cia;
      case 4:
         if (var1 == 1) {
            return GameScr.cca;
         }

         return GameScr.cda;
      case 5:
         return GameScr.cja;
      case 6:
         if (var1 == 1) {
            return GameScr.cea;
         }

         return GameScr.cfa;
      case 7:
         return GameScr.cka;
      case 8:
         if (var1 == 1) {
            return GameScr.cga;
         }

         return GameScr.cha;
      case 9:
         return GameScr.cla;
      default:
         return null;
      }
   }

   private boolean aha() {
      if (aaa.afa >= 50) {
         return true;
      } else if (!TileMap.afa(TileMap.mapID)) {
         this.goMap(Code.bqa, -2, -1, -1);
         return false;
      } else {
         System.out.println("Buy " + aaa.ada);
         gg[] var1 = aaa(aaa.aba, Char.getMyChar().ata);
         if (aaa.aba == 1) {
            GameScr.PickNpc(0, 0, 0);
         } else if (aaa.aba == 8) {
            GameScr.PickNpc(1, 0, 4);
         } else if (aaa.aba == 6) {
            GameScr.PickNpc(1, 0, 3);
         } else if (aaa.aba == 4) {
            GameScr.PickNpc(1, 0, 2);
         } else if (aaa.aba == 2) {
            GameScr.PickNpc(1, 0, 1);
         } else if (aaa.aba == 0) {
            GameScr.PickNpc(1, 0, 0);
         } else if (aaa.aba == 9) {
            GameScr.PickNpc(2, 0, 3);
         } else if (aaa.aba == 7) {
            GameScr.PickNpc(2, 0, 2);
         } else if (aaa.aba == 5) {
            GameScr.PickNpc(2, 0, 1);
         } else if (aaa.aba == 3) {
            GameScr.PickNpc(2, 0, 0);
         }

         if (var1 == null) {
            LockGame.bfa();
            var1 = aaa(aaa.aba, Char.getMyChar().ata);
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
               Service.aaa().aba(var2.ana, var2.ada, 1);
               LockGame.aha();
            }
         } else {
            System.out.println("BuyER: " + aaa.aba);
         }

         return false;
      }
   }

   private boolean ara() {
      if (!TileMap.afa(TileMap.mapID)) {
         this.goMap(Code.bqa, -2, -1, -1);
         return false;
      } else {
         System.out.println("Buy Item Up" + aba.ada);
         gg[] var1 = aaa(aba.aba, Char.getMyChar().ata);
         if (aba.aba == 8) {
            GameScr.PickNpc(1, 0, 4);
         }

         if (var1 == null) {
            LockGame.bfa();
            var1 = aaa(aba.aba, Char.getMyChar().ata);
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
               Service.aaa().aba(var2.ana, var2.ada, 1);
               LockGame.aha();
            }
         } else {
            System.out.println("BuyER: " + aba.aba);
         }

         return false;
      }
   }

   private boolean asa() {
      if (bma == null) {
         if ((bma = Char.afa(aaa.aaa)) == null) {
            if ((bma = Char.ala(aaa.aaa)) == null) {
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
            GameScr.PickNpc(5, 0, 0);
            if (Char.bja() > 0) {
               Service.aaa().aca(bma.ada);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var2) {
               }
            }
         } else {
            if (bla == null) {
               bla = Char.getMyChar().dca[aaa.aba];
            }

            if (bla != null) {
               System.out.println("ItemBody type=" + bla.ana + " index=" + bla.ada);
            }

            Service.aaa().aea(bma.ada);
            LockGame.ara();
         }

         return false;
      }
   }

   protected final void aaa() {
      if (Auto.aka()) {
         Auto.aaa(false);
      } else if (bra) {
         GameScr.chatPopup("Xong");
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
               if (Char.getMyChar().dca[aaa.aba] != null && Char.getMyChar().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                  var19 = Code.bsa > 0 ? (var1 = Code.bsa) : ((var18 = Char.ama(0)) != null ? (var1 = var18.aga) : (var1 = -1));
                  var20 = (short)var1;
                  if (var19 <= 0) {
                     GameScr.chatPopup("Chưa đặt map hoặc k có nvhn");
                     boa = true;
                     return;
                  }

                  if (TileMap.mapID != var20) {
                     this.goMap(var20, Code.bta, -1, -1);
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
                  GameScr.chatPopup("Thiếu item: " + aaa.ada);
                  boa = true;
               }
            } else {
               Char var2;
               gg var3;
               if (ada == 4 && ge.ada == 0) {
                  if (Char.getMyChar().dca[aaa.aba] != null && Char.getMyChar().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                     if ((var1 = Char.aia(aba.aaa)) < 0) {
                        if (this.ara()) {
                           GameScr.chatPopup("Thiếu item: " + aba.ada);
                           boa = true;
                        }
                     } else if (bia < bja) {
                        var3 = (var2 = Char.getMyChar()).arrItemBag[var1];
                        if (var3.aia == 8) {
                           Service.aaa().aaa(var3);
                           LockGame.ara();
                           Service.aaa().aja(Char.getMyChar().cea);
                           LockGame.ara();
                        }

                        int var4 = 0;
                        int var5 = 0;
                        if (var3.ara()) {
                           var4 = GameScr.dva[var3.aia] / 3;
                           var5 = GameScr.dza[var3.aia];
                        } else if (var3.asa()) {
                           var4 = GameScr.dwa[var3.aia] / 3;
                           var5 = GameScr.eaa[var3.aia];
                        } else if (var3.ata()) {
                           var4 = GameScr.dxa[var3.aia] / 3;
                           var5 = GameScr.eba[var3.aia];
                        }

                        int var6;
                        for(var6 = 0; var6 < Char.getMyChar().arrItemBag.length; ++var6) {
                           gg var7 = Char.getMyChar().arrItemBag[var6];
                           if (var7 != null && var7.aaa.aba == 26 && (var7.aaa.aaa <= 2 || var7.aaa.aaa == 5)) {
                              Service.aaa().aha(var7.ada, 1);
                           }
                        }

                        int var8;
                        if (var4 << 1 <= Char.bia() && var5 << 1 <= var2.csa) {
                           if (TileMap.mapID != 22) {
                              if (!TileMap.ana(TileMap.mapID) && Char.getMyChar().aua < 42) {
                                 Auto.ala();
                              }

                              this.goMap(22, -2, -1, -1);
                              return;
                           }

                           var6 = var3.aia;
                           GameScr.PickNpc(6, 0, 0);
                           LockGame.ara();
                           GameScr.dfa = var3;

                           for(int var22 = 0; var22 < 1 && var3.aia == var6; ++var22) {
                              GameScr.cxa = new gg[18];
                              var8 = 0;
                              int var23 = 0;

                              for(int var10 = 0; var10 < var2.arrItemBag.length && var23 < var4; ++var10) {
                                 gg var11 = var2.arrItemBag[var10];
                                 if (var3.aia == 6 && ge.aga == 0) {
                                    if (Char.aia(242) < 0) {
                                       if (Char.getMyChar().cta >= 10) {
                                          Service.aaa().aba(14, 23, 1);
                                          LockGame.aha();
                                       } else {
                                          GameScr.chatPopup("Hết Lượng Mua BHSC");
                                       }
                                    } else {
                                       GameScr.cxa[2] = aea(242);
                                    }
                                 }

                                 if (var3.aia == 7 && ge.aha == 0) {
                                    if (Char.aia(242) < 0) {
                                       if (Char.getMyChar().cta >= 10) {
                                          Service.aaa().aba(14, 23, 1);
                                          LockGame.aha();
                                       } else {
                                          GameScr.chatPopup("Hết Lượng Mua BHSC");
                                       }
                                    } else {
                                       GameScr.cxa[6] = aea(242);
                                    }
                                 }

                                 if (var11 != null && var11.aaa.aba == 26 && var11.aaa.aaa == 4) {
                                    var2.arrItemBag[var10] = null;
                                    GameScr.cxa[var8++] = var11;
                                    var23 += GameScr.dva[var11.aaa.aaa];
                                 }
                              }

                              do {
                                 try {
                                    Thread.sleep(2000L);
                                 } catch (InterruptedException var14) {
                                 }

                                 Service.aaa().aaa(var3, GameScr.cxa);
                                 Service.aaa().aja(Char.getMyChar().cea);
                                 LockGame.ara();
                              } while(GameScr.cxa[0] != null);
                           }

                           GameScr.dfa = null;
                        } else {
                           aj var21;
                           var8 = Code.bsa > 0 ? (var6 = Code.bsa) : ((var21 = Char.ama(0)) != null ? (var6 = var21.aga) : (var6 = -1));
                           short var9 = (short)var6;
                           if (var8 <= 0) {
                              GameScr.chatPopup("Chưa đặt map hoặc k có nvhn");
                              boa = true;
                              return;
                           }

                           if (TileMap.mapID == var9) {
                              gb.aba();
                              this.ada(-2);
                              this.aca(-1, 1);
                              return;
                           }

                           this.goMap(var9, Code.bta, -1, -1);
                        }
                     }
                  } else if (this.asa()) {
                     GameScr.chatPopup("Thiếu item: " + aaa.ada);
                     boa = true;
                  }
               }

               if (ada == 5 && ge.aea == 0) {
                  String[] var17 = Code.aca(Code.bpa, ",");

                  for(int var16 = 0; var16 < var17.length; ++var16) {
                     if (var17[var16] == null || var17[var16].length() == 0) {
                        GameScr.chatPopup("Hãy chat ld để set thông tin");
                        boa = true;
                        return;
                     }

                     if (Char.getMyChar().dca[aaa.aba] != null && Char.getMyChar().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                        if (bia < bja) {
                           Code.aga.aaa();
                        }
                     } else if (this.asa()) {
                        GameScr.chatPopup("Thiếu item: " + aaa.ada);
                        boa = true;
                     }
                  }
               }

               if (ada == 6 && ge.aia == 0) {
                  if (Char.getMyChar().dca[aaa.aba] != null && Char.getMyChar().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                     var19 = Code.bsa > 0 ? (var1 = Code.bsa) : ((var18 = Char.ama(0)) != null ? (var1 = var18.aga) : (var1 = -1));
                     var20 = (short)var1;
                     if (var19 <= 0) {
                        GameScr.chatPopup("Chưa đặt map hoặc k có nvhn");
                        boa = true;
                        return;
                     }

                     if (TileMap.mapID != var20) {
                        this.goMap(var20, Code.bta, -1, -1);
                        return;
                     }

                     if (bia < bja) {
                        this.aca(-1, this.aaa(Char.fga, Char.fha, Char.fia));
                        this.ada(-1);
                        return;
                     }

                     bna = true;
                     Auto.ala();
                  } else if (this.asa()) {
                     GameScr.chatPopup("Thiếu item: " + aaa.ada);
                     boa = true;
                  }
               }

               if (ada == 7) {
                  if (ge.afa == 0) {
                     if (Char.getMyChar().dca[aaa.aba] != null && Char.getMyChar().dca[aaa.aba].aaa.aaa == aaa.aaa) {
                        if (TileMap.mapID != dm.aba) {
                           this.goMap(dm.aba, dm.aca, -1, -1);
                           return;
                        }

                        if (bia < bja) {
                           for(var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
                              var2 = (Char)GameScr.vCharInMap.elementAt(var1);
                              if (Char.getMyChar().aya - 10 <= var2.aya && var2.aya <= Char.getMyChar().aya + 10 && var2.bba > 0) {
                                 if (System.currentTimeMillis() - this.bva >= 1500L) {
                                    Char.charMove(var2.cx, var2.cy);
                                    this.bva = System.currentTimeMillis();
                                 }

                                 if (Char.getMyChar().dla != 3) {
                                    Service.aaa().awa(3);
                                 }

                                 if (Char.getMyChar().dka >= 5 && (var3 = Char.afa(257)) != null && var3.aaa.aaa == 257) {
                                    Service.aaa().aea(var3.ada);
                                 }

                                 Auto.aya.removeAllElements();
                                 Auto.aza.removeAllElements();
                                 Auto.aza.addElement(var2);
                                 Service.aaa().afa(aqa.aaa.aaa);
                                 Service.aaa().aaa((ev)Auto.aya, (ev)Auto.aza, (int)2);
                                 if (System.currentTimeMillis() - aqa.afa >= (long)aqa.aea + 50L) {
                                    aqa.afa = System.currentTimeMillis();
                                    aqa.ala = true;
                                    if (!Code.bfa) {
                                       Char.getMyChar().aba(GameScr.aza[aqa.aaa.aaa], 0);
                                    }
                                 }
                              }
                           }

                           return;
                        }

                        bna = true;
                        Auto.ala();
                     } else if (this.asa()) {
                        GameScr.chatPopup("Thiếu item: " + aaa.ada);
                        boa = true;
                     }
                  } else {
                     ada = 0;
                  }
               }
            }
         } else {
            if (!TileMap.afa(TileMap.mapID)) {
               this.goMap(Code.bqa, -2, -1, -1);
               return;
            }

            if (ada == -2) {
               System.out.println("InfoNV");
               GameScr.chatPopup("Xem Info NVDV " + (aea + 1));
               aea();
               if (Char.aia(705) > 0 && !bta) {
                  for(var1 = 0; var1 < 5; ++var1) {
                     Service.aaa().aea(Char.aia(705));
                  }
               }

               if (Char.aia(35) < 0 && Char.aia(37) < 0) {
                  if (Char.getMyChar().cta >= 20) {
                     Service.aaa().aba(14, 1, 1);
                  } else {
                     Service.aaa().aba(9, 6, 1);
                  }
               }

               GameScr.PickNpc(2, 1, 6);
               LockGame.bfa();
               return;
            }

            if (ada == -1) {
               System.out.println("NhanNV");
               GameScr.chatPopup("Nhận NVDV " + (aea + 1));
               if (Char.aia(705) > 0 && !bta) {
                  for(var1 = 0; var1 < 5; ++var1) {
                     Service.aaa().aea(Char.aia(705));
                  }
               }

               if (Char.aia(35) < 0 && Char.aia(37) < 0) {
                  if (Char.getMyChar().cta >= 20) {
                     Service.aaa().aba(14, 1, 1);
                  } else {
                     Service.aaa().aba(9, 6, 1);
                  }
               }

               GameScr.PickNpc(2, 1, 0);
               aea();
               LockGame.bfa();
               return;
            }

            if (ada == 0) {
               System.out.println("HuyNV");
               GameScr.chatPopup("Hủy NVDV " + (aea + 1));
               GameScr.PickNpc(2, 1, 2);
               GameScr.aha(2);
               Service.aaa().ana(4);
               LockGame.bfa();
               ++aea;
               return;
            }

            if (boa || bna) {
               if (bla != null) {
                  if (bla.ana != 5) {
                     System.out.println("Mac TB: " + bla.aaa.ada + " index=" + bla.ada);
                     Service.aaa().aea(bla.ada);
                     LockGame.ara();
                     bla = null;
                     return;
                  }

                  if (Char.getMyChar().dca[bla.aaa.aba].aia < 12) {
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
                     GameScr.PickNpc(5, 0, 0);
                     if (Char.bka() > 0) {
                        Service.aaa().ada(bma.ana);

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
                  if (Char.bja() <= 0) {
                     GameScr.chatPopup("Hành trang đầy");
                     return;
                  }

                  System.out.println("HoanThanhNV");
                  if (Char.getMyChar().dla == 3) {
                     Service.aaa().awa(0);
                  }

                  GameScr.chatPopup("Hoàn thành NVDV " + (aea + 1));
                  GameScr.PickNpc(2, 1, 1);
                  LockGame.bfa();
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
      for(int var0 = 0; var0 < Char.getMyChar().arrItemBag.length; ++var0) {
         gg var1 = Char.getMyChar().arrItemBag[var0];
         if (var1 != null && var1.aaa.afa < 50 && var1.aaa.aba < 10 && var1.aia == 0) {
            Service.aaa().aha(var1.ada, 1);
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
      for(int var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
         gg var2 = Char.getMyChar().arrItemBag[var1];
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
