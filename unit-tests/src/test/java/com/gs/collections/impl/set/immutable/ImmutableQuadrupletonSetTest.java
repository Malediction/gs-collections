/*
 * Copyright 2011 Goldman Sachs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gs.collections.impl.set.immutable;

import com.gs.collections.api.set.ImmutableSet;
import com.gs.collections.impl.test.Verify;
import org.junit.Test;

public class ImmutableQuadrupletonSetTest
        extends AbstractImmutableSetTestCase
{
    @Override
    protected ImmutableSet<Integer> classUnderTest()
    {
        return new ImmutableQuadrupletonSet<Integer>(1, 2, 3, 4);
    }

    @Override
    @Test
    public void testNewWithout()
    {
        ImmutableSet<Integer> immutable = this.classUnderTest();
        Verify.assertSize(3, immutable.newWithout(4).castToSet());
        Verify.assertSize(3, immutable.newWithout(3).castToSet());
        Verify.assertSize(3, immutable.newWithout(2).castToSet());
        Verify.assertSize(3, immutable.newWithout(1).castToSet());
        Verify.assertSize(4, immutable.newWithout(0).castToSet());
    }
}
