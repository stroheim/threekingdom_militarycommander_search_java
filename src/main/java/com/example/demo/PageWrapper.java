package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;

/**
 *
 * 参考
 *
 * https://qiita.com/KevinFQ/items/ca68a3001bae19f92879
 *
 * @param <T>
 */
public class PageWrapper<T> {
	public static final int MAX_PAGE_ITEM_DISPLAY = 10;
	private Page<T> page;
	private List<PageItem> items;
	private int currentNumber;
	private String url;
	private int start;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public PageWrapper(Page<T> page, String url) {
		this.page = page;
		this.url = url;
		items = new ArrayList<PageItem>();

		currentNumber = page.getNumber() + 1;

		int size;
		if (page.getTotalPages() <= MAX_PAGE_ITEM_DISPLAY) {
			this.start = 1;
			size = page.getTotalPages();
		} else {
			if (currentNumber <= MAX_PAGE_ITEM_DISPLAY - MAX_PAGE_ITEM_DISPLAY / 2) {
				this.start = 1;
				size = MAX_PAGE_ITEM_DISPLAY;
			} else if (currentNumber >= page.getTotalPages() - MAX_PAGE_ITEM_DISPLAY / 2) {
				this.start = page.getTotalPages() - MAX_PAGE_ITEM_DISPLAY + 1;
				size = MAX_PAGE_ITEM_DISPLAY;
			} else {
				this.start = currentNumber - MAX_PAGE_ITEM_DISPLAY / 2;
				size = MAX_PAGE_ITEM_DISPLAY;
			}
		}

		for (int i = 0; i < size; i++) {
			items.add(new PageItem(start + i, (start + i) == currentNumber));
		}
	}

	/**
	 * ○件～△件の○を取得
	 *
	 * @return
	 */
	public int getStart() {
		return page.getNumber() * page.getSize() + 1;
	}

	/**
	 * ○件～△件の△を取得
	 * 
	 * @return
	 */
	public long getLast() {
		long count = page.getTotalElements();
		if (MAX_PAGE_ITEM_DISPLAY > count) {
			return count;
		}
		// ページ番号×pagesize
		long last = this.currentNumber * page.getSize();
		if (last > count) {
			return count;
		}
		return last;
	}

	public List<PageItem> getItems() {
		return items;
	}

	public int getNumber() {
		return currentNumber;
	}

	public List<T> getContent() {
		return page.getContent();
	}

	/**
	 * 1ページごとの件数
	 *
	 * @return
	 */
	public int getSize() {
		return page.getSize();
	}

	/**
	 * 全要素数
	 *
	 * @return
	 */
	public long getTotalElements() {
		return page.getTotalElements();
	}

	/**
	 * 総ページ数
	 *
	 * @return
	 */
	public int getTotalPages() {
		return page.getTotalPages();
	}

	public boolean isFirstPage() {
		return page.isFirst();
	}

	public boolean isLastPage() {
		return page.isLast();
	}

	public boolean isHasPreviousPage() {
		return page.hasPrevious();
	}

	public boolean isHasNextPage() {
		return page.hasNext();
	}

	public class PageItem {
		private int number;
		private boolean current;

		public PageItem(int number, boolean current) {
			this.number = number;
			this.current = current;
		}

		public int getNumber() {
			return this.number;
		}

		public boolean isCurrent() {
			return this.current;
		}
	}
}
