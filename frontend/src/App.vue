

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                        grocery delivery service
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
                    ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>


                    <v-list-item
                        class="px-2"
                        key="customers"
                        to="/customers"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        Customer
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="deliveryDrivers"
                        to="/deliveryDrivers"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        DeliveryDriver
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="groceryItems"
                        to="/groceryItems"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        GroceryItem
                    </v-list-item>



                    <v-list-item
                        class="px-2"
                        key="deliveryDriverProfiles"
                        to="/deliveryDriverProfiles"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        DeliveryDriverProfile
                    </v-list-item>



                    <v-list-item
                        class="px-2"
                        key="deliveryDrivers"
                        to="/deliveryDrivers"
                        @click="changeUrl()"
                        color="deep-purple lighten-2"
                        style="font-weight:700;"
                    >
                        DeliveryDriver
                    </v-list-item>




                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container v-if="urlPath" class="py-8 px-6 mt-10" fluid>
                <router-view></router-view>
            </v-container>
            <v-container v-else class="py-8 px-6 mt-10" fluid>
                <v-row>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
				><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">account_circle</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="customers"
                                            to="/customers"
                                            @click="changeUrl()"
                                            color="deep-purple lighten-2"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            Customer
                                        </v-btn>
                                    </template>
                                    <span>Customer</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
				><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">drive_eta</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="deliveryDrivers"
                                            to="/deliveryDrivers"
                                            @click="changeUrl()"
                                            color="deep-purple lighten-2"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            DeliveryDriver
                                        </v-btn>
                                    </template>
                                    <span>DeliveryDriver</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>
                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
				><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">local_grocery_store</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="groceryItems"
                                            to="/groceryItems"
                                            @click="changeUrl()"
                                            color="deep-purple lighten-2"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            GroceryItem
                                        </v-btn>
                                    </template>
                                    <span>GroceryItem</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
				><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">person</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="deliveryDriverProfiles"
                                            to="/deliveryDriverProfiles"
                                            @click="changeUrl()"
                                            color="deep-purple lighten-2"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            DeliveryDriverProfile
                                        </v-btn>
                                    </template>
                                    <span>DeliveryDriverProfile</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                        <v-card
                            class="mx-auto"
                            style="height:300px; width:300px; margin-bottom:20px;"
                            outlined
                        >
                            <v-list-item>
                                <v-list-item-avatar 
                                    class="mx-auto"
                                    size="80"
                                    style="margin-top:80px;"
				><span class="material-symbols-outlined" style="font-size:60px; color:#9575CD;">drive_eta</span>
                                </v-list-item-avatar>
                            </v-list-item>

                            <v-card-actions>
                                <v-tooltip bottom>
                                    <template v-slot:activator="{ on }">
                                        <v-btn 
                                            v-on="on"
                                            class="mx-auto"
                                            outlined
                                            rounded
                                            key="deliveryDrivers"
                                            to="/deliveryDrivers"
                                            @click="changeUrl()"
                                            color="deep-purple lighten-2"
                                            style="font-weight:500; font-size:20px; padding:15px; border:solid 2px; max-width:250px; overflow:hidden"
                                        >
                                            DeliveryDriver
                                        </v-btn>
                                    </template>
                                    <span>DeliveryDriver</span>
                                </v-tooltip>
                            </v-card-actions>
                        </v-card>

                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",

    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
        },
        goHome() {
            this.urlPath = null;
        },
    }
};
</script>
<style>
</style>
