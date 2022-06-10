/*
 * This file is part of Mixin, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * Mixin module declaration
 */
module org.spongepowered.mixin {

    //
    // Actual modules we depend on
    //
    requires transitive java.compiler;
    requires transitive java.instrument;
    requires transitive org.objectweb.asm;
    requires transitive org.objectweb.asm.commons;
    requires transitive org.objectweb.asm.tree;
    requires transitive org.objectweb.asm.tree.analysis;
    requires transitive org.objectweb.asm.util;
    requires java.logging;
    
    //
    // Modules we require for compilation but don't necessarily need at runtime
    //
    requires static org.apache.logging.log4j.core;
    requires static transitive cpw.mods.modlauncher;
    requires static cpw.mods.securejarhandler;
    requires static transitive org.apache.logging.log4j;
    
    //
    // Automatic modules we depend on, using static to avoid the forward compatibility mess
    //
    requires static jopt.simple;
    
    // Guava, by file name and official module
    requires static com.google.common;
    requires static guava;
    
    // Gson, by file name and official module
    requires static com.google.gson;
    requires static gson;

}
