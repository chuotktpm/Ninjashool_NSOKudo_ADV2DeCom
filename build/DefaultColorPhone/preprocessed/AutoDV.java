
public final class AutoDV extends Auto {
   private static int ada;
   private static int aea;
   private static int bha;
   private static int bia;
   private static int bja;
   private static boolean bka;
   public static ItemTemplate itemTemplate;
   public static ItemTemplate itemTemplate2;
   private static Item item1;
   private static Item item2;
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

   public AutoDV() {
   }

   public final void init() {
      super.a();
      ada = -2;
      aea = 0;
      bha = 0;
      item1 = null;
      item2 = null;
      bna = false;
      boa = false;
      bra = false;
   }

   public final void b_() {
      super.b();
      if (item2 != null) {
         if (item2.typeUI == 5) {
            item2 = Char.getMyChar().arrItemBody[item2.template.type];
         } else if (item2.typeUI == 3) {
            item2 = Char.getMyChar().arrItemBag[item2.indexUI];
         } else if (item2.typeUI == 4) {
            item2 = Char.getMyChar().arrItemBox[item2.indexUI];
         } else {
            System.out.println("Loi reset itemNV");
         }
      }

      if (item1 != null) {
         if (item1.typeUI == 5) {
            item1 = Char.getMyChar().arrItemBody[item1.template.type];
            return;
         }

         if (item1.typeUI == 3) {
            item1 = Char.getMyChar().arrItemBag[item1.indexUI];
            return;
         }

         System.out.println("Loi reset itemBody");
      }

   }

   public static void aaa(String var0) {
      System.out.println("Text: ".concat(String.valueOf(var0)));
      if (ada >= 0) {
         System.out.println("A1");
         if (StringUtils.contains(var0, "-") || StringUtils.contains(var0, "Đã hủy nhiệm vụ ")) {
            System.out.println("A2");
            itemTemplate = null;
            bna = false;
            ada = -1;
            LockGame.notifyDV();
         }
      } else {
         if (ada == -2) {
            System.out.println("B1");
            if (var0.startsWith("- Có thể nhận thêm ")) {
               System.out.println("B2");
               itemTemplate = null;
               ada = -1;
               LockGame.notifyDV();
               return;
            }
         }

         System.out.println("C1");
         bna = false;
         String[] var1 = Code.c(var0, "\n");
         System.out.println("Nhiệm vụ: " + var1[0]);
         int var2;
         Item item;
         if (var1[0].equals("Tiêu diệt quái") && SettingADV.aaa == 0 && SettingADV.aaa == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               item = Char.getMyChar().arrItemBag[var2];
               if (item != null && item.template.type == 26 && item.template.id <= 4) {
                  Service.getInstance().saleItem1(item.indexUI, 1);
               }
            }

            ada = 1;
         } else if (var1[0].equals("Tiêu diệt tinh anh") && Char.tickDanhQuaiThuong && SettingADV.aba == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               item = Char.getMyChar().arrItemBag[var2];
               if (item != null && item.template.type == 26 && item.template.id <= 4) {
                  Service.getInstance().saleItem1(item.indexUI, 1);
               }
            }

            ada = 2;
         } else if (var1[0].equals("Tiêu diệt thủ lĩnh") && Char.tickDanhTinhAnh && SettingADV.aca == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               item = Char.getMyChar().arrItemBag[var2];
               if (item != null && item.template.type == 26 && item.template.id <= 4) {
                  Service.getInstance().saleItem1(item.indexUI, 1);
               }
            }

            ada = 3;
         } else if (var1[0].equals("Nâng cấp vật phẩm") && SettingADV.ada == 0) {
            for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
               item = Char.getMyChar().arrItemBag[var2];
               if (item != null && item.template.type == 26 && item.template.id <= 3) {
                  Service.getInstance().saleItem1(item.indexUI, 1);
               }
            }

            ada = 4;
         } else {
            String[] var13;
            int var14;
            if (var1[0].equals("Chiến thắng lôi đài") && SettingADV.aea == 0) {
               var13 = Code.c(Code.nameCharLoiDai, ",");

               for(var14 = 0; var14 < var13.length; ++var14) {
                  Code.a(var13[var14], "lodai");
               }

               for(var14 = 0; var14 < Char.getMyChar().arrItemBag.length; ++var14) {
                  Item item1 = Char.getMyChar().arrItemBag[var14];
                  if (item1 != null && item1.template.type == 26 && item1.template.id <= 4) {
                     Service.getInstance().saleItem1(item1.indexUI, 1);
                  }
               }

               ada = 5;
            } else if (var1[0].equals("Nông dân chăm chỉ") && SettingADV.aia == 0) {
               for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
                  Item item2 = Char.getMyChar().arrItemBag[var2];
                  if (item2 != null && item2.template.type == 26 && item2.template.id <= 4) {
                     Service.getInstance().saleItem1(item2.indexUI, 1);
                  }
               }

               ada = 6;
            } else if (!var1[0].equals("Cừu sát người khác")) {
               ada = 0;
            } else {
               for(var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
                  item = Char.getMyChar().arrItemBag[var2];
                  if (item != null && item.template.type == 26 && item.template.id <= 4) {
                     Service.getInstance().saleItem1(item.indexUI, 1);
                  }
               }

               if (SettingADV.afa != 0) {
                  if (SettingADV.afa == 2) {
                     Code.f();
                  } else {
                     ada = 0;
                  }
               } else {
                  var13 = Code.c(Code.nameCharLoiDai, ",");

                  for(var14 = 0; var14 < var13.length; ++var14) {
                     Code.a(var13[var14], "cusat");
                  }

                  ada = 7;
               }
            }
         }

         if (ada != 0) {
            String nameEquip;
            String var17;
            String var5;
            String var6;
            int var15;
            if (ada < 4) {
               if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Tiêu diệt ")) {
                  Char.dp = false;
                  nameEquip = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(12).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + nameEquip + " gender=" + Char.getMyChar().cgender);
                     if ((itemTemplate = ItemTemplateManager.findByNameAndGender(nameEquip, (byte)Char.getMyChar().cgender)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + itemTemplate.id + " type=" + itemTemplate.type + " name=" + itemTemplate.name + " mumb: " + var5 + " max: " + var6);
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
                  Char.dp = true;
                  Char.ew = 4;
                  nameEquip = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(11).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + nameEquip + " gender=" + Char.getMyChar().cgender);
                     if ((itemTemplate = ItemTemplateManager.findByNameAndGender(nameEquip, (byte)Char.getMyChar().cgender)) == null) {
                        throw new Exception();
                     }

                     if ((itemTemplate2 = ItemTemplateManager.findByNameAndGender("Giày Thô Ma", (byte)Char.getMyChar().cgender)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + itemTemplate.id + " type=" + itemTemplate.type + " name=" + itemTemplate.name + " mumb: " + var5 + " max: " + var6);
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
                  Char.dp = false;
                  if (var1[1].startsWith("- Sử dụng ") && var1[2].startsWith("- Chiến thắng ")) {
                     nameEquip = var1[1].substring(10, var1[1].length());
                     var15 = (var17 = var1[2].substring(14).trim()).indexOf(47);
                     var5 = var17.substring(0, var15);
                     var6 = var17.substring(var15 + 1, var17.indexOf(32));

                     try {
                        bia = Integer.parseInt(var5);
                        bja = Integer.parseInt(var6);
                        System.out.println("TB=" + nameEquip + " gender=" + Char.getMyChar().cgender);
                        if ((itemTemplate = ItemTemplateManager.findByNameAndGender(nameEquip, (byte)Char.getMyChar().cgender)) == null) {
                           throw new Exception();
                        }

                        System.out.println("Equip=" + itemTemplate.id + " type=" + itemTemplate.type + " name=" + itemTemplate.name + " mumb: " + var5 + " max: " + var6);
                        if (var1.length >= 4 && var1[3].equals("- Hoàn thành nhiệm vụ. Hãy gặp Ameji để trả nhiệm vụ")) {
                           bna = true;
                        } else {
//                           Code.aga.aea();
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
                  Char.dp = false;
                  nameEquip = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(6).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + nameEquip + " gender=" + Char.getMyChar().cgender);
                     if ((itemTemplate = ItemTemplateManager.findByNameAndGender(nameEquip, (byte)Char.getMyChar().cgender)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + itemTemplate.id + " type=" + itemTemplate.type + " name=" + itemTemplate.name + " mumb: " + var5 + " max: " + var6);
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
                  Char.dp = false;
                  nameEquip = var1[1].substring(10, var1[1].length());
                  var15 = (var17 = var1[2].substring(9).trim()).indexOf(47);
                  var5 = var17.substring(0, var15);
                  var6 = var17.substring(var15 + 1, var17.indexOf(32));

                  try {
                     bsa = bia = Integer.parseInt(var5);
                     bua = bja = Integer.parseInt(var6);
                     System.out.println("TB=" + nameEquip + " gender=" + Char.getMyChar().cgender);
                     if ((itemTemplate = ItemTemplateManager.findByNameAndGender(nameEquip, (byte)Char.getMyChar().cgender)) == null) {
                        throw new Exception();
                     }

                     System.out.println("Equip=" + itemTemplate.id + " type=" + itemTemplate.type + " name=" + itemTemplate.name + " mumb: " + var5 + " max: " + var6);
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

            if (itemTemplate != null && itemTemplate.level > Char.getMyChar().cLevel) {
               ada = 0;
            }
         }

         LockGame.notifyDV();
      }

   }

   public static boolean aba(String var0) {
      if (var0.equals(bqa)) {
         bra = true;
         return true;
      } else {
         if (StringUtils.contains(var0, bpa)) {
            if (ada >= 4 && ada != 6) {
               if (ada == 4) {
                  Service.getInstance().viewInfo(Char.getMyChar().charName);
                  LockGame.i();

                  for(int var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
                     Item item = Char.getMyChar().arrItemBag[var1];
                     if (item != null && item.upgrade == 8 && (Char.getMyChar().arrItemBag[var1].template.id == 126 || Char.getMyChar().arrItemBag[var1].template.id == 127)) {
                        Service.getInstance().splitItem(item);
                        LockGame.i();
                        Service.getInstance().viewInfo(Char.getMyChar().charName);
                        LockGame.i();
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

         if (StringUtils.contains(var0, "Đã hết số lần dùng trong ngày hôm nay rồi.")) {
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
               Session_ME.getInstance().c();
               Controller.getInstance().d();
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

   private static Item[] getListItemByTypeAndGender(int type, int gender) {
      switch (type) {
         case 0:
            if (gender == 1) {
               return GameScr.arrItemNonNam;
            }

            return GameScr.arrItemNonNu;
         case 1:
            return GameScr.arrItemWeapon;
         case 2:
            if (gender == 1) {
               return GameScr.arrItemAoNam;
            }

            return GameScr.arrItemAoNu;
         case 3:
            return GameScr.arrItemLien;
         case 4:
            if (gender == 1) {
               return GameScr.arrItemGangTayNam;
            }

            return GameScr.arrItemGangTayNu;
         case 5:
            return GameScr.arrItemNhan;
         case 6:
            if (gender == 1) {
               return GameScr.arrItemQuanNam;
            }

            return GameScr.arrItemQuanNu;
         case 7:
            return GameScr.arrItemNgocBoi;
         case 8:
            if (gender == 1) {
               return GameScr.arrItemGiayNam;
            }

            return GameScr.arrItemGiayNu;
         case 9:
            return GameScr.arrItemPhu;
         default:
            return null;
      }
   }

   private boolean aha() {
      if (itemTemplate.level >= 50) {
         return true;
      } else if (!TileMap.f(TileMap.mapID)) {
         this.a(Code.mapLoiDai, -2, -1, -1);
         return false;
      } else {
         System.out.println("Buy " + itemTemplate.name);
         Item[] var1 = getListItemByTypeAndGender(itemTemplate.type, Char.getMyChar().cgender);
         if (itemTemplate.type == 1) {
            GameScr.PickNpc(0, 0, 0);
         } else if (itemTemplate.type == 8) {
            GameScr.PickNpc(1, 0, 4);
         } else if (itemTemplate.type == 6) {
            GameScr.PickNpc(1, 0, 3);
         } else if (itemTemplate.type == 4) {
            GameScr.PickNpc(1, 0, 2);
         } else if (itemTemplate.type == 2) {
            GameScr.PickNpc(1, 0, 1);
         } else if (itemTemplate.type == 0) {
            GameScr.PickNpc(1, 0, 0);
         } else if (itemTemplate.type == 9) {
            GameScr.PickNpc(2, 0, 3);
         } else if (itemTemplate.type == 7) {
            GameScr.PickNpc(2, 0, 2);
         } else if (itemTemplate.type == 5) {
            GameScr.PickNpc(2, 0, 1);
         } else if (itemTemplate.type == 3) {
            GameScr.PickNpc(2, 0, 0);
         }

         if (var1 == null) {
            LockGame.waitDV();
            var1 = getListItemByTypeAndGender(itemTemplate.type, Char.getMyChar().cgender);
         }

         if (var1 != null) {
            Item item = null;

            for(int var3 = 0; var3 < var1.length; ++var3) {
               if (var1[var3].template.id == itemTemplate.id) {
                  item = var1[var3];
                  break;
               }
            }

            if (item != null) {
               Service.getInstance().buyItem1(item.typeUI, item.indexUI, 1);
               LockGame.g();
            }
         } else {
            System.out.println("BuyER: " + itemTemplate.type);
         }

         return false;
      }
   }

   private boolean ara() {
      if (!TileMap.f(TileMap.mapID)) {
         this.a(Code.mapLoiDai, -2, -1, -1);
         return false;
      } else {
         System.out.println("Buy Item Up" + itemTemplate2.name);
         Item[] var1 = getListItemByTypeAndGender(itemTemplate2.type, Char.getMyChar().cgender);
         if (itemTemplate2.type == 8) {
            GameScr.PickNpc(1, 0, 4);
         }

         if (var1 == null) {
            LockGame.waitDV();
            var1 = getListItemByTypeAndGender(itemTemplate2.type, Char.getMyChar().cgender);
         }

         if (var1 != null) {
            Item item = null;

            for(int var3 = 0; var3 < var1.length; ++var3) {
               if (var1[var3].template.id == itemTemplate2.id) {
                  item = var1[var3];
                  break;
               }
            }

            if (item != null) {
               Service.getInstance().buyItem1(item.typeUI, item.indexUI, 1);
               LockGame.g();
            }
         } else {
            System.out.println("BuyER: " + itemTemplate2.type);
         }

         return false;
      }
   }

   private boolean asa() {
      if (item2 == null) {
         if ((item2 = Char.f(itemTemplate.id)) == null) {
            if ((item2 = Char.ala(itemTemplate.id)) == null) {
               return this.aha();
            }

            System.out.println("ItemNV box type=" + item2.typeUI + " index=" + item2.indexUI);
            bka = true;
         } else {
            System.out.println("ItemNV bag type=" + item2.typeUI + " index=" + item2.indexUI);
         }

         return false;
      } else {
         if (item2.typeUI == 4) {
            GameScr.PickNpc(5, 0, 0);
            if (Char.countNullSlot() > 0) {
               Service.getInstance().d(item2.indexUI);

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var2) {
               }
            }
         } else {
            if (item1 == null) {
               item1 = Char.getMyChar().arrItemBody[itemTemplate.type];
            }

            if (item1 != null) {
               System.out.println("ItemBody type=" + item1.typeUI + " index=" + item1.indexUI);
            }

            Service.getInstance().useItem(item2.indexUI);
            LockGame.i();
         }

         return false;
      }
   }

   protected final void aaa() {
      if (this.i()) {
         Auto.a(false);
      } else if (bra) {
         GameScr.chatPopup("Xong");
         if (super.instance != null && !(super.instance instanceof AutoDV)) {
            try {
               Thread.sleep(5000L);
            } catch (InterruptedException var15) {
            }

            Code.c();
         } else {
            Code.f();
         }
      } else {
         int var1;
         if (ada > 0 && !bna && !boa) {
            TaskOrder var18;
            int var19;
            short var20;
            if (ada < 4) {
               if (Char.getMyChar().arrItemBody[itemTemplate.type] != null && Char.getMyChar().arrItemBody[itemTemplate.type].template.id == itemTemplate.id) {
                  var19 = Code.mapDanhVong > 0 ? (var1 = Code.mapDanhVong) : ((var18 = Char.l(0)) != null ? (var1 = var18.mapId) : (var1 = -1));
                  var20 = (short)var1;
                  if (var19 <= 0) {
                     GameScr.chatPopup("Chưa đặt map hoặc k có nvhn");
                     boa = true;
                     return;
                  }

                  if (TileMap.mapID != var20) {
                     this.a(var20, Code.khuDanhVong, -1, -1);
                     return;
                  }

                  if (bia < bja) {
                     this.c(-1, ada == 2 ? 3 : (ada == 3 ? 5 : 1));
                     this.c(-1);
                     return;
                  }

                  bna = true;
                  Auto.tuSat();
               } else if (this.asa()) {
                  GameScr.chatPopup("Thiếu item: " + itemTemplate.name);
                  boa = true;
               }
            } else {
               Char var2;
               Item item;
               if (ada == 4 && SettingADV.ada == 0) {
                  if (Char.getMyChar().arrItemBody[itemTemplate.type] != null && Char.getMyChar().arrItemBody[itemTemplate.type].template.id == itemTemplate.id) {
                     if ((var1 = Char.getIndexItemById(itemTemplate2.id)) < 0) {
                        if (this.ara()) {
                           GameScr.chatPopup("Thiếu item: " + itemTemplate2.name);
                           boa = true;
                        }
                     } else if (bia < bja) {
                        item = (var2 = Char.getMyChar()).arrItemBag[var1];
                        if (item.upgrade == 8) {
                           Service.getInstance().splitItem(item);
                           LockGame.i();
                           Service.getInstance().viewInfo(Char.getMyChar().charName);
                           LockGame.i();
                        }

                        int var4 = 0;
                        int var5 = 0;
                        if (item.isTypeClothe()) {
                           var4 = GameScr.upClothe[item.upgrade] / 3;
                           var5 = GameScr.coinUpClothes[item.upgrade];
                        } else if (item.isTypeAdorn()) {
                           var4 = GameScr.upAdorn[item.upgrade] / 3;
                           var5 = GameScr.coinUpAdorns[item.upgrade];
                        } else if (item.isTypeWeapon()) {
                           var4 = GameScr.upWeapon[item.upgrade] / 3;
                           var5 = GameScr.coinUpWeapons[item.upgrade];
                        }

                        int var6;
                        for(var6 = 0; var6 < Char.getMyChar().arrItemBag.length; ++var6) {
                           Item item2 = Char.getMyChar().arrItemBag[var6];
                           if (item2 != null && item2.template.type == 26 && (item2.template.id <= 2 || item2.template.id == 5)) {
                              Service.getInstance().saleItem1(item2.indexUI, 1);
                           }
                        }

                        int var8;
                        int var9;
                        if (var4 << 1 <= Char.af() && var5 << 1 <= var2.yen) {
                           if (TileMap.mapID != 22) {
                              if (!TileMap.ana(TileMap.mapID) && Char.getMyChar().ctaskId < 42) {
                                 Auto.tuSat();
                              }

                              this.a(22, -2, -1, -1);
                              return;
                           }

                           var6 = item.upgrade;
                           GameScr.PickNpc(6, 0, 0);
                           LockGame.i();
                           GameScr.itemUpGrade = item;

                           for(int var22 = 0; var22 < 1 && item.upgrade == var6; ++var22) {
                              GameScr.arrItemUpGrade = new Item[18];
                              var8 = 0;
                              var9 = 0;

                              for(int var10 = 0; var10 < var2.arrItemBag.length && var9 < var4; ++var10) {
                                 Item item3 = var2.arrItemBag[var10];
                                 if (item3.upgrade == 6 && SettingADV.aga == 0) {
                                    if (Char.getIndexItemById(242) < 0) {
                                       if (Char.getMyChar().luong >= 10) {
                                          Service.getInstance().buyItem1(14, 23, 1);
                                          LockGame.g();
                                       } else {
                                          GameScr.chatPopup("Hết Lượng Mua BHSC");
                                       }
                                    } else {
                                       GameScr.arrItemUpGrade[2] = aea(242);
                                    }
                                 }

                                 if (item3.upgrade == 7 && SettingADV.aha == 0) {
                                    if (Char.getIndexItemById(242) < 0) {
                                       if (Char.getMyChar().luong >= 10) {
                                          Service.getInstance().buyItem1(14, 23, 1);
                                          LockGame.g();
                                       } else {
                                          GameScr.chatPopup("Hết Lượng Mua BHSC");
                                       }
                                    } else {
                                       GameScr.arrItemUpGrade[6] = aea(242);
                                    }
                                 }

                                 if (item3 != null && item3.template.type == 26 && item3.template.id == 4) {
                                    var2.arrItemBag[var10] = null;
                                    GameScr.arrItemUpGrade[var8++] = item3;
                                    var9 += GameScr.upClothe[item3.template.id];
                                 }
                              }

                              do {
                                 try {
                                    Thread.sleep(2000L);
                                 } catch (InterruptedException var14) {
                                 }

                                 Service.getInstance().upgradeItem1(item, GameScr.arrItemUpGrade, false);
                                 Service.getInstance().viewInfo(Char.getMyChar().charName);
                                 LockGame.i();
                              } while(GameScr.arrItemUpGrade[0] != null);
                           }

                           GameScr.itemUpGrade = null;
                        } else {
                           TaskOrder var21;
                           var8 = Code.mapDanhVong > 0 ? (var6 = Code.mapDanhVong) : ((var21 = Char.l(0)) != null ? (var6 = var21.mapId) : (var6 = -1));
                           var9 = (short)var6;
                           if (var8 <= 0) {
                              GameScr.chatPopup("Chưa đặt map hoặc k có nvhn");
                              boa = true;
                              return;
                           }

                           if (TileMap.mapID == var9) {
//                              gb.mapCuuSat(); TODO
                              this.c(-2);
                              this.c(-1, 1);
                              return;
                           }

                           this.a(var9, Code.khuDanhVong, -1, -1);
                        }
                     }
                  } else if (this.asa()) {
                     GameScr.chatPopup("Thiếu item: " + itemTemplate.name);
                     boa = true;
                  }
               }

               if (ada == 5 && SettingADV.aea == 0) {
                  String[] var17 = Code.c(Code.nameCharLoiDai, ",");

                  for(int var16 = 0; var16 < var17.length; ++var16) {
                     if (var17[var16] == null || var17[var16].length() == 0) {
                        GameScr.chatPopup("Hãy chat ld để set thông tin");
                        boa = true;
                        return;
                     }

                     if (Char.getMyChar().arrItemBody[itemTemplate.type] != null && Char.getMyChar().arrItemBody[itemTemplate.type].template.id == itemTemplate.id) {
                        if (bia < bja) {
//                           Code.aga.xuCuocLoiDai(); TODO
                        }
                     } else if (this.asa()) {
                        GameScr.chatPopup("Thiếu item: " + itemTemplate.name);
                        boa = true;
                     }
                  }
               }

               if (ada == 6 && SettingADV.aia == 0) {
                  if (Char.getMyChar().arrItemBody[itemTemplate.type] != null && Char.getMyChar().arrItemBody[itemTemplate.type].template.id == itemTemplate.id) {
                     var19 = Code.mapDanhVong > 0 ? (var1 = Code.mapDanhVong) : ((var18 = Char.l(0)) != null ? (var1 = var18.mapId) : (var1 = -1));
                     var20 = (short)var1;
                     if (var19 <= 0) {
                        GameScr.chatPopup("Chưa đặt map hoặc k có nvhn");
                        boa = true;
                        return;
                     }

                     if (TileMap.mapID != var20) {
                        this.a(var20, Code.khuDanhVong, -1, -1);
                        return;
                     }

                     if (bia < bja) {
                        this.c(-1, this.a(Char.tickDanhQuaiThuong, Char.tickDanhTinhAnh, Char.tickDanhThuLinh, false));
                        this.c(-1);
                        return;
                     }

                     bna = true;
                     Auto.tuSat();
                  } else if (this.asa()) {
                     GameScr.chatPopup("Thiếu item: " + itemTemplate.name);
                     boa = true;
                  }
               }

               if (ada == 7) {
                  if (SettingADV.afa == 0) {
                     if (Char.getMyChar().arrItemBody[itemTemplate.type] != null && Char.getMyChar().arrItemBody[itemTemplate.type].template.id == itemTemplate.id) {
                        if (TileMap.mapID != MenuADV.mapCuuSat) {
                           this.a(MenuADV.mapCuuSat, MenuADV.khuCuuSat, -1, -1);
                           return;
                        }

                        if (bia < bja) {
                           for(var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
                              var2 = (Char)GameScr.vCharInMap.elementAt(var1);
                              if (Char.getMyChar().cLevel - 10 <= var2.cLevel && var2.cLevel <= Char.getMyChar().cLevel + 10 && var2.cHP > 0) {
                                 if (System.currentTimeMillis() - this.bva >= 1500L) {
                                    Char.c(var2.cx, var2.cy);
                                    this.bva = System.currentTimeMillis();
                                 }

                                 if (Char.getMyChar().cm != 3) {
                                    Service.getInstance().y(3);
                                 }

                                 if (Char.getMyChar().hieuChien >= 5 && (item = Char.f(257)) != null && item.template.id == 257) {
                                    Service.getInstance().useItem(item.indexUI);
                                 }

                                 Auto.v.removeAllElements();
                                 Auto.w.removeAllElements();
                                 Auto.w.addElement(var2);
                                 Service.getInstance().g(selectSkill.template.id);
                                 Service.getInstance().a(Auto.v, Auto.w, 2);
                                 if (System.currentTimeMillis() - selectSkill.lastTimeUseThisSkill >= (long)selectSkill.coolDown + 50L) {
                                    selectSkill.lastTimeUseThisSkill = System.currentTimeMillis();
                                    selectSkill.paintCanNotUseSkill = true;
                                    if (!Code.ae) {
                                       Char.getMyChar().b(GameScr.skillPaints[selectSkill.template.id], 0);
                                    }
                                 }
                              }
                           }

                           return;
                        }

                        bna = true;
                        Auto.tuSat();
                     } else if (this.asa()) {
                        GameScr.chatPopup("Thiếu item: " + itemTemplate.name);
                        boa = true;
                     }
                  } else {
                     ada = 0;
                  }
               }
            }
         } else {
            if (!TileMap.f(TileMap.mapID)) {
               this.a(Code.mapLoiDai, -2, -1, -1);
               return;
            }

            if (ada == -2) {
               System.out.println("InfoNV");
               GameScr.chatPopup("Xem Info NVDV " + (aea + 1));
               aea();
               if (Char.getIndexItemById(705) > 0 && !bta) {
                  for(var1 = 0; var1 < 5; ++var1) {
                     Service.getInstance().useItem(Char.getIndexItemById(705));
                  }
               }

               if (Char.getIndexItemById(35) < 0 && Char.getIndexItemById(37) < 0) {
                  if (Char.getMyChar().luong >= 20) {
                     Service.getInstance().buyItem1(14, 1, 1);
                  } else {
                     Service.getInstance().buyItem1(9, 6, 1);
                  }
               }

               GameScr.PickNpc(2, 1, 6);
               LockGame.waitDV();
               return;
            }

            if (ada == -1) {
               System.out.println("NhanNV");
               GameScr.chatPopup("Nhận NVDV " + (aea + 1));
               if (Char.getIndexItemById(705) > 0 && !bta) {
                  for(var1 = 0; var1 < 5; ++var1) {
                     Service.getInstance().useItem(Char.getIndexItemById(705));
                  }
               }

               if (Char.getIndexItemById(35) < 0 && Char.getIndexItemById(37) < 0) {
                  if (Char.getMyChar().luong >= 20) {
                     Service.getInstance().buyItem1(14, 1, 1);
                  } else {
                     Service.getInstance().buyItem1(9, 6, 1);
                  }
               }

               GameScr.PickNpc(2, 1, 0);
               aea();
               LockGame.waitDV();
               return;
            }

            if (ada == 0) {
               System.out.println("HuyNV");
               GameScr.chatPopup("Hủy NVDV " + (aea + 1));
               GameScr.PickNpc(2, 1, 2);
               GameScr.h(2);
               Service.getInstance().o(4);
               LockGame.waitDV();
               ++aea;
               return;
            }

            if (boa || bna) {
               if (item1 != null) {
                  if (item1.typeUI != 5) {
                     System.out.println("Mac TB: " + item1.template.name + " index=" + item1.indexUI);
                     Service.getInstance().useItem(item1.indexUI);
                     LockGame.i();
                     item1 = null;
                     return;
                  }

                  if (Char.getMyChar().arrItemBody[item1.template.type].upgrade < 12) {
                     System.out.println("Loi item: " + item1.template.type);
                  }

                  item1 = null;
               } else if (item2 != null) {
                  if (!bka) {
                     item2 = null;
                     return;
                  }

                  if (item2.typeUI == 3) {
                     System.out.println("Cat item " + item2.template.name + " vao ruong");
                     GameScr.PickNpc(5, 0, 0);
                     if (Char.countNullSlotBox() > 0) {
                        Service.getInstance().e(item2.typeUI);

                        try {
                           Thread.sleep(1000L);
                           return;
                        } catch (InterruptedException var12) {
                           return;
                        }
                     }

                     item2 = null;
                     return;
                  }

                  item2 = null;
               } else if (bna) {
                  if (Char.countNullSlot() <= 0) {
                     GameScr.chatPopup("Hành trang đầy");
                     return;
                  }

                  System.out.println("HoanThanhNV");
                  if (Char.getMyChar().cm == 3) {
                     Service.getInstance().z(0);
                  }

                  GameScr.chatPopup("Hoàn thành NVDV " + (aea + 1));
                  GameScr.PickNpc(2, 1, 1);
                  LockGame.waitDV();
                  ++aea;
                  ++bha;
                  ++bwa;
               } else if (super.instance != null && !(super.instance instanceof AutoDV)) {
                  try {
                     Thread.sleep(5000L);
                  } catch (InterruptedException var13) {
                  }

                  Code.c();
               }
            }
         }

      }
   }

   public static void aea() {
      for(int var0 = 0; var0 < Char.getMyChar().arrItemBag.length; ++var0) {
         Item item = Char.getMyChar().arrItemBag[var0];
         if (item != null && item.template.level < 50 && item.template.type < 10 && item.upgrade == 0) {
            Service.getInstance().saleItem1(item.indexUI, 1);
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
         return ada == 7 ? " - Cừ sát: " + bsa + "/" + bua + " người | Đã làm được: " + bwa + " NV" : "NVDV ";
      }
   }

   public static Item aea(int var0) {
      for(int var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
         Item item = Char.getMyChar().arrItemBag[var1];
         if (item != null && item.template.type == 28 && item.template.id == var0) {
            return item;
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
      afa();
   }

   public static void aga() {
      ada = 0;
      aea = 0;
      bha = 0;
      bia = 0;
      bja = 0;
      bka = false;
      itemTemplate = null;
      itemTemplate2 = null;
      item1 = null;
      item2 = null;
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

    protected void c() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
