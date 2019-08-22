# Android Paging Library

The Paging Library helps you load and display small chunks of data at a time. Loading partial data on demand reduces usage of network bandwidth and system resources.

PagedList
The Paging Library's key component is the PagedList class, which loads chunks of your app's data, or pages. As more data is needed, it's paged into the existing PagedList object. If any loaded data changes, a new instance of PagedList is emitted to the observable data holder from a LiveData or RxJava2-based object. As PagedList objects are generated, your app's UI presents their contents, all while respecting your UI controllers' lifecycles.

Loading Data
All data in a PagedList is loaded from its DataSource. Creating a PagedList loads the first chunk of data from the DataSource immediately, and should for this reason be done on a background thread. The constructed PagedList may then be passed to and used on the UI thread. This is done to prevent passing a list with no loaded content to the UI thread, which should generally not be presented to the user.

A PagedList initially presents this first partial load as its content, and expands over time as content is loaded in. When loadAround(int) is called, items will be loaded in near the passed list index. If placeholder nulls are present in the list, they will be replaced as content is loaded. If not, newly loaded items will be inserted at the beginning or end of the list.

PagedList can present data for an unbounded, infinite scrolling list, or a very large but countable list. Use PagedList.Config to control how many items a PagedList loads, and when.

If you use LivePagedListBuilder to get a LiveData<PagedList>, it will initialize PagedLists on a background thread for you.

