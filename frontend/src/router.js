
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerManager from "./components/listers/CustomerCards"
import CustomerDetail from "./components/listers/CustomerDetail"
import DeliveryDriverManager from "./components/listers/DeliveryDriverCards"
import DeliveryDriverDetail from "./components/listers/DeliveryDriverDetail"
import GroceryItemManager from "./components/listers/GroceryItemList"
import GroceryItemDetail from "./components/listers/GroceryItemDetail"

import DeliveryDriverProfileManager from "./components/listers/DeliveryDriverProfileCards"
import DeliveryDriverProfileDetail from "./components/listers/DeliveryDriverProfileDetail"

import DeliveryDriverManager from "./components/listers/DeliveryDriverCards"
import DeliveryDriverDetail from "./components/listers/DeliveryDriverDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers',
                name: 'CustomerManager',
                component: CustomerManager
            },
            {
                path: '/customers/:id',
                name: 'CustomerDetail',
                component: CustomerDetail
            },
            {
                path: '/deliveryDrivers',
                name: 'DeliveryDriverManager',
                component: DeliveryDriverManager
            },
            {
                path: '/deliveryDrivers/:id',
                name: 'DeliveryDriverDetail',
                component: DeliveryDriverDetail
            },
            {
                path: '/groceryItems',
                name: 'GroceryItemManager',
                component: GroceryItemManager
            },
            {
                path: '/groceryItems/:id',
                name: 'GroceryItemDetail',
                component: GroceryItemDetail
            },

            {
                path: '/deliveryDriverProfiles',
                name: 'DeliveryDriverProfileManager',
                component: DeliveryDriverProfileManager
            },
            {
                path: '/deliveryDriverProfiles/:id',
                name: 'DeliveryDriverProfileDetail',
                component: DeliveryDriverProfileDetail
            },

            {
                path: '/deliveryDrivers',
                name: 'DeliveryDriverManager',
                component: DeliveryDriverManager
            },
            {
                path: '/deliveryDrivers/:id',
                name: 'DeliveryDriverDetail',
                component: DeliveryDriverDetail
            },



    ]
})
