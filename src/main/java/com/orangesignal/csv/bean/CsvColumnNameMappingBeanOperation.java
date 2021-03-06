/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.orangesignal.csv.bean;

import java.text.Format;
import java.util.Map;

import com.orangesignal.csv.filters.CsvNamedValueFilter;

/**
 * 区切り文字形式データの項目名を基準とする Java プログラム要素と区切り文字形式データアクセス操作のインタフェースを提供します。
 * 
 * @param <H> Java プログラム要素と区切り文字形式データアクセス操作クラスの型
 * @author Koji Sugisawa
 * @since 1.4.0
 */
public interface CsvColumnNameMappingBeanOperation<H> {

	/**
	 * 指定された項目名と Java プログラム要素のフィールド名をマップへ追加します。
	 * 
	 * @param column 項目名
	 * @param field Java プログラム要素のフィールド名
	 * @return このオブジェクトへの参照
	 */
	H column(String column, String field);

	/**
	 * 指定された項目名と Java プログラム要素のフィールド名をマップへ追加します。
	 * 
	 * @param column 項目名
	 * @param field Java プログラム要素のフィールド名
	 * @param format フィールドを処理するフォーマットオブジェクト (オプション)
	 * @return このオブジェクトへの参照
	 */
	H column(String column, String field, Format format);

	/**
	 * 項目名と Java プログラム要素のフィールド名のマップを設定します。
	 * 
	 * @param columnMapping 項目名と Java プログラム要素のフィールド名のマップ
	 * @throws IllegalArgumentException {@code columnMapping} が {@code null} の場合
	 */
	void setColumnMapping(Map<String, String> columnMapping);

	/**
	 * 項目名と Java プログラム要素のフィールド名のマップを設定します。
	 * 
	 * @param columnMapping 項目名と Java プログラム要素のフィールド名のマップ
	 * @return このオブジェクトへの参照
	 * @throws IllegalArgumentException {@code columnMapping} が {@code null} の場合
	 */
	H columnMapping(Map<String, String> columnMapping);

	/**
	 * 区切り文字形式データフィルタを設定します。
	 * 
	 * @param filter 区切り文字形式データフィルタ
	 * @return このオブジェクトへの参照
	 */
	H filter(CsvNamedValueFilter filter);

}