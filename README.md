# Fragment-Lifecycle

## Lifecycle
### Activity
- onCreate
- onStart
- onResume
- onAttach(replace onActivityCreated)
- onPause
- onStop
- onRestart
- onDestroy

### Fragment
- onAttach
- onCreate
- onCreateView
- onStart
- onResume
- onPause
- onStop
- onDestroyView
- onDestroy
- onDetach

## Fragment
1.  將 Fragment Class 與 Fragment XML 串連
onCreateView(inflater: LayoutInflater, container: ViewGroup?, saveInstanceState: Bundle?): View?
return inflater.inflate(R.Layout.XXX, container, false)


## ViewPager
1. 建立 adapter ： FragmentStateAdapter
2. getItemCount():Int
3. createFragment(position: Int): Fragment
