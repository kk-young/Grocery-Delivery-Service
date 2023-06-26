<template>

    <v-card outlined>
        <v-card-title>
            SpecifyDeliveryTime
        </v-card-title>

        <v-card-text>
            <String label="Time" v-model="value.time" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="specifyDeliveryTime"
            >
                SpecifyDeliveryTime
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'SpecifyDeliveryTimeCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.time = '';
        },
        watch: {
        },
        methods: {
            specifyDeliveryTime() {
                this.$emit('specifyDeliveryTime', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

