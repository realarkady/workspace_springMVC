/*
 * Copyright (C) Denis Pavlov 2013 www.inspire-software.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dp.example.shoppingcart.service;

import java.util.List;

import dp.example.shoppingcart.dto.Item;

/**
 * Cart service.
 * 
 * @author DPavlov
 */
public interface CartService {
	
	List<Item> getItemsInCart(final long pk);
	
	void addToCart(final long pk, String item);
	
	void removeFromCart(final long pk, String item);

}
