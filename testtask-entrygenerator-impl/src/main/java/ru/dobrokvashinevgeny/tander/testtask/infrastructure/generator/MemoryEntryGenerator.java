/*
* Copyright (c) 2017 Eugeny Dobrokvashin, All Rights Reserved.
*/

package ru.dobrokvashinevgeny.tander.testtask.infrastructure.generator;

import ru.dobrokvashinevgeny.tander.testtask.domain.model.entry.*;
import ru.dobrokvashinevgeny.tander.testtask.domain.model.generator.EntryGenerator;

/**
 * Реализация генератора Entries в памяти
 */
public class MemoryEntryGenerator implements EntryGenerator {
	private Long priorValue = 0L;

	@Override
	public Entry getNewEntry() {
		return new EntryImpl(getNewValue());
	}

	private long getNewValue() {
		return ++priorValue;
	}
}