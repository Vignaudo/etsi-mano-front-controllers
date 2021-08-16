/**
 *     Copyright (C) 2019-2020 Ubiqube.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
/**
 * This copy of Woodstox XML processor is licensed under the
 * Apache (Software) License, version 2.0 ("the License").
 * See the License for details about distribution rights, and the
 * specific rights regarding derivate works.
 *
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/
 *
 * A copy is also included in the downloadable source code package
 * containing Woodstox, in file "ASL2.0", under the same directory
 * as this file.
 */
package com.ubiqube.etsi.mano.controller.nslcm;

import java.util.UUID;
import java.util.function.Consumer;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public interface VnfLcmOpOccGenericFrontController {

	<U> ResponseEntity<String> search(MultiValueMap<String, String> requestParams, Class<U> class1, Consumer<U> makeLinks);

	ResponseEntity<Void> lcmOpOccRollback(UUID id);

	ResponseEntity<Void> lcmOpOccRetry(UUID id);

	<U> U lcmOpOccFindById(UUID id);

	<U> ResponseEntity<U> lcmOpOccFail(UUID id);

	<U> ResponseEntity<U> lcmOpOccCancel(UUID id);

}