<template>

    <v-card outlined>
        <v-card-title>
            ScheduleDriver
        </v-card-title>

        <v-card-text>
            <String label="Email" v-model="value.email" :editMode="editMode"/>
            <String label="DayOfWeek" v-model="value.dayOfWeek" :editMode="editMode"/>
            <String label="StartTime" v-model="value.startTime" :editMode="editMode"/>
            <String label="EndTime" v-model="value.endTime" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="scheduleDriver"
            >
                ScheduleDriver
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
        name: 'ScheduleDriverCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.email = '';
            this.value.dayOfWeek = '';
            this.value.startTime = '';
            this.value.endTime = '';
        },
        watch: {
        },
        methods: {
            scheduleDriver() {
                this.$emit('scheduleDriver', this.value);
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

