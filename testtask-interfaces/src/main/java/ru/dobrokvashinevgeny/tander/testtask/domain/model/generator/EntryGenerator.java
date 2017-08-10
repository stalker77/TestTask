package ru.dobrokvashinevgeny.tander.testtask.domain.model.generator;

import ru.dobrokvashinevgeny.tander.testtask.domain.model.entry.Entry;

/**
 * Генератор данных для использования в тестовом задании
 */
public interface EntryGenerator {
	/**
	 * Получает новый объект данных
	 * @return объект данных
	 * @throws EntryGeneratorException если произошла ошибка генерации данных
	 */
	Entry getNewEntry() throws EntryGeneratorException;
}
