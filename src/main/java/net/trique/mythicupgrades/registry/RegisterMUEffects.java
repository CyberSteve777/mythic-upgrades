package net.trique.mythicupgrades.registry;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MUEffects;

public class RegisterMUEffects {
    public static void registerEffect(StatusEffect effect, String name) {
        Registry.register(Registries.STATUS_EFFECT, new Identifier(MythicUpgrades.MOD_ID, name), effect);
    }
    public static void registerEffects() {
        registerEffect(MUEffects.OCEAN_SHIELD, "ocean_shield");
        registerEffect(MUEffects.HINDERING, "hindering");
        registerEffect(MUEffects.POISONOUS_THORNS, "poisonous_thorns");
        registerEffect(MUEffects.ICE_SHIELD, "ice_shield");
        registerEffect(MUEffects.FREEZE, "freeze");
        registerEffect(MUEffects.DAMAGE_DEFLECTION, "damage_deflection");
        registerEffect(MUEffects.ITEM_MASTERY, "item_mastery");
        registerEffect(MUEffects.ARCANE_AURA, "arcane_aura");
    }
}