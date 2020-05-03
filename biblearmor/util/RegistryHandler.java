package com.jonzoeproject.biblearmor.util;

import com.jonzoeproject.biblearmor.BibleArmor;
import com.jonzoeproject.biblearmor.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, BibleArmor.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> SHEILDOFFAITH = ITEMS.register("shield_of_faith", ItemBase::new);
    public static final RegistryObject<Item> BREASTPLATEOFRIGHTEOUSNESS = ITEMS.register("breastplate_of_righteousness", ItemBase::new);
    public static final RegistryObject<Item> SHOESOFPEACE = ITEMS.register("shoes_of_peace", ItemBase::new);
}
