package net.hyper.weaponry.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.EnchantRandomlyFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.functions.SetItemDamageFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class WeaponryLootTableModifiers {
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
            if(BuiltInLootTables.BURIED_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.17f))
                        .add(LootItem.lootTableItem(WeaponryItems.IRON_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.STRONGHOLD_CORRIDOR.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.12f))
                        .add(LootItem.lootTableItem(WeaponryItems.IRON_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.VILLAGE_WEAPONSMITH.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.23f))
                        .add(LootItem.lootTableItem(WeaponryItems.IRON_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.END_CITY_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.13f))
                        .add(LootItem.lootTableItem(WeaponryItems.IRON_GREATSWORD)
                        .apply(EnchantRandomlyFunction.randomEnchantment()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.BASTION_OTHER.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.19f))
                        .add(LootItem.lootTableItem(WeaponryItems.IRON_GREATSWORD)
                         .apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1f, 0.9f)))
                        .apply(EnchantRandomlyFunction.randomEnchantment()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BuiltInLootTables.RUINED_PORTAL.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.20f))
                        .add(LootItem.lootTableItem(WeaponryItems.GOLDEN_GREATSWORD)
                        .apply(EnchantRandomlyFunction.randomEnchantment()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.NETHER_BRIDGE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.18f))
                        .add(LootItem.lootTableItem(WeaponryItems.GOLDEN_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.BASTION_BRIDGE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.11f))
                        .add(LootItem.lootTableItem(WeaponryItems.GOLDEN_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.BASTION_OTHER.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.10f))
                        .add(LootItem.lootTableItem(WeaponryItems.GOLDEN_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }

            if(BuiltInLootTables.BASTION_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f))
                        .add(LootItem.lootTableItem(WeaponryItems.DIAMOND_GREATSWORD))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.END_CITY_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.12f))
                        .add(LootItem.lootTableItem(WeaponryItems.DIAMOND_GREATSWORD)
                        .apply(EnchantRandomlyFunction.randomEnchantment()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if(BuiltInLootTables.BASTION_TREASURE.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(0.15f))
                        .add(LootItem.lootTableItem(WeaponryItems.DIAMOND_GREATSWORD)
                                .apply(SetItemDamageFunction.setDamage(UniformGenerator.between(0.1f, 0.9f)))
                                .apply(EnchantRandomlyFunction.randomEnchantment()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}