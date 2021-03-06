/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2018 the original author or authors.
 */
package org.assertj.swing.driver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.swing.core.TestRobots.singletonRobotMock;

import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link JTreeDriver#replaceSeparator(String)}.
 * 
 * @author Alex Ruiz
 */
public class JTreeDriver_separator_Test {
  private JTreeDriver driver;

  @Before
  public void setUp() {
    driver = new JTreeDriver(singletonRobotMock());
  }

  @Test(expected = NullPointerException.class)
  public void shouldThrowErrorIfSeparatorIsNull() {
    driver.replaceSeparator(null);
  }

  @Test
  public void shouldSetPathSeparator() {
    driver.replaceSeparator("|");
    assertThat(driver.separator()).isEqualTo("|");
  }
}
