package com.eugenedevv.shoppinglist.ui.shoppinglist

import com.eugenedevv.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}